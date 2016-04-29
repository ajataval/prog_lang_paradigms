__author__ = 'Tharun'
import numbers
from collections import defaultdict
from Operators import ALOperator
from Function import Function
import sys
class Runtime(object):
    def __init__(self, int_file_path):
        self.int_file = int_file_path
        self.value_stack = []
        self.main_symbol_table = defaultdict(float)
        self.function_map = defaultdict()

    def run(self):
        with open(self.int_file, 'r') as codefile:
            lines = codefile.readlines()
        self.interpret(lines)

    def interpret(self, lines):
        # try:
        count = 1
        MAX_RECURSION_DEPTH = 1000
        operators = ALOperator()
        activation_record = []
        skip = False
        line_num = 0
        call_line_num = 0
        env_pointer = self.main_symbol_table
        runAlready = False
        total_lines = len(lines)
        while line_num < total_lines:
            skip = False
            skip_num = 0
            cmd, param = None, None
            line = lines[line_num].split(' ')
            if len(line) == 2:
                cmd, param = line
                cmd = cmd.strip()
                param = param.strip()
            elif len(line) == 1:
                cmd = line[0].strip()
            elif len(line) > 2:
                cmd = line[0].strip()
                param = [token.strip() for token in line[1:]]
            if cmd == "PUSH":
                value = self.to_int(param)
                if isinstance(value, numbers.Number):
                    self.value_stack.append(value)
                else:
                    self.value_stack.append(param)
            elif cmd in operators.arithoperators or cmd in operators.logicaloperators:
                num2 = self.value_stack.pop()
                num1 = self.value_stack.pop()
                value1 = num1
                value2 = num2
                if not isinstance(value1, numbers.Number):
                    value1 = env_pointer[value1]
                if not isinstance(value2, numbers.Number):
                    value2 = env_pointer[value2]
                self.value_stack.append(operators.dispatch[cmd](value1,value2))
            elif cmd == "ASSIGN":
                num1 = self.value_stack.pop()
                num2 = self.value_stack.pop()
                if isinstance(num1, numbers.Number):
                    env_pointer[num2] = num1
                else:
                    env_pointer[num2] = env_pointer[num1]
            elif cmd == "FSTART":
                func_name = param[0]
                func_env_table = defaultdict()
                args = [arg.strip() for arg in param[1].split(',')]
                func_start_line = line_num + 1
                func_code = []
                while line_num <= len(lines):
                    if "FEND" in lines[line_num]:
                        break
                    else:
                        func_code.append(lines[line_num].strip())
                    line_num += 1
                for arg in args:
                    func_env_table[arg] = env_pointer[arg]
                self.function_map[func_name] = Function(func_name, args, func_env_table, func_code, func_start_line)
            elif cmd == "FAILGOTO":
                popped = self.value_stack.pop()
                if type(popped) == bool:
                    if not popped:
                        skip = True
                        skip_num = int(param)
                else:
                    if self.isFalse(popped):
                        skip = True
                        skip_num = int(param)
            elif cmd  == "FEND":
                runAlready = True
                skip = True
                if activation_record:
                    skip_num = activation_record.pop() + 1
                env_pointer = self.main_symbol_table
                pass
            elif cmd == "CALL":
                func_name = param[0]
                args = [arg.strip() for arg in param[1].split(',')]
                for key, value in zip(self.function_map[func_name].params,args):
                    value = self.to_int(value)
                    if isinstance(value, numbers.Number):
                        self.main_symbol_table[key] = value
                        self.function_map[func_name].env_table[key] = value
                    else:
                        self.function_map[func_name].env_table[key] = env_pointer[value]
                for key, value in self.main_symbol_table.items():
                    if key not in self.function_map[func_name].env_table.keys() and not isinstance(key, numbers.Number):
                        self.function_map[func_name].env_table[key] = value

                # for key in self.main_symbol_table.keys():
                #     self.function_map[func_name].env_table[key] = self.main_symbol_table[key]
                #     print "{}, {}".format(key, env_table[value])
                # print "FUNCTIOn ENV"
                # print self.function_map[func_name].env_pointer.items()
                env_pointer = self.function_map[func_name].env_table
                activation_record.append(self.function_map[func_name])
                call_line_num = line_num
                activation_record.append(call_line_num)
                skip = True
                skip_num = self.function_map[func_name].start_line_num
            elif cmd == "PRINT":
                if param is None:
                    value = self.value_stack.pop()
                    if isinstance(value, numbers.Number):
                        print value
                    else:
                        print env_pointer[value]
                elif "\"" in param:
                    print param.replace("\"",''),
                elif isinstance(param, numbers.Number):
                    print param
                else:
                    print env_pointer[param]
            elif cmd == "RETURN":
                param = self.to_int(param)
                if activation_record:
                    skip = True
                    skip_num = activation_record.pop() + 1
                    tmp_table = activation_record.pop()
                    # print "Function ENV: {}".format(tmp_table.env_table.items())
                    for key in tmp_table.env_table.keys():
                        self.main_symbol_table[key] = tmp_table.env_table[key]
                    if isinstance(param, numbers.Number):
                        self.value_stack.append(param)
                    else:
                        self.value_stack.append(self.main_symbol_table[param])
            elif cmd == "READ":
                readX = int(raw_input("Enter value:"))
                self.value_stack.append(readX)
            elif cmd == "STACK":
                self.main_symbol_table[param] = []
                env_pointer[param] = []
            elif cmd == "SPUSH":
                stackid, data = param.split(',')
                value = self.to_int(data)
                if isinstance(value, numbers.Number):
                    self.main_symbol_table[stackid].append(value)
                else:
                    self.main_symbol_table[stackid].append(env_pointer[value])
                print "Pushed value: " + data
            elif cmd == "SPOP":
                stackid = param
                try:
                    popped = self.main_symbol_table[stackid].pop()
                    print "Popped value: {}".format(popped)
                    self.value_stack.append(popped)
                except:
                    print "Failed: Stack is empty"
            elif cmd == "SPEEK":
                stackid = param
                top = self.main_symbol_table[stackid][-1]
                print "Top value: {}".format(top)
                self.value_stack.append(top)
            elif cmd == "SEMPTY":
                stackid = param
                stack_size = len(self.main_symbol_table[stackid])
                self.value_stack.append(stack_size == 0)

            if skip:
                line_num = skip_num
            else:
                 line_num += 1
            # print cmd
            # print self.value_stack
            # print env_table.items()
            # count += 1
            if count > MAX_RECURSION_DEPTH:
                print "Breaking: MAX RECURSION DEPTH Reached"
                break
        # except Exception as e:
        #     print e

    def to_int(self, value):
        try:
            return int(value)
        except:
            return value

    def isTrue(self, value):
        return "True".lower() == value.lower()

    def isFalse(self, value):
        return "False".lower() == value.lower()

# runtime = Runtime('../Code/Intermediate/ScopingExample.in'
runtime = Runtime(sys.argv[1])
runtime.run()