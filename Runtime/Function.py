from collections import defaultdict

class Function(object):
    def __init__(self, name, params, env_table, code, start_line_num):
        self.name = name
        self.params = params
        self.env_table = defaultdict(float)
        self.start_line_num = start_line_num
        self.code = code

    def __repr__(self):
        return "Function: {}, Params: {}, ENV: {}, START_LINE : {}, CODE: {}".format(self.name, self.params, self.env_table.items(),
                                                                                   self.start_line_num, self.code)

    def getParams(self):
        return ','.join(self.params)
