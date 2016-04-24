__author__ = 'Tharun'

class ALOperator(object):
    def __init__(self):
        self.arithoperators = ['ADD', 'SUB', 'MUL', 'DIV', 'MOD']
        self.logicaloperators = ['EQUAL', 'NEQUAL', 'GREATER','GEQ', 'LESSER','LEQ']
        self.dispatch = {"ADD": self.add, "SUB": self.sub, "MUL": self.mul, "DIV": self.mul, "MOD":self.mod, "GREATER":self.greater,
                         "GEQ": self.geq, "LESSER": self.lesser, "LEQ": self.leq, "EQUAL": self.equal}

    def add(self, num1, num2):
        return num1 + num2

    def sub(self, num1, num2):
        return num1 - num2

    def mul(self, num1, num2):
        return num1*num2

    def div(self, num1, num2):
        return num1/num2

    def greater(self, num1, num2):
        return num1 > num2

    def geq(self, num1, num2):
        return num1 >= num2

    def lesser(self, num1, num2):
        return num2 < num2

    def leq(self, num1, num2):
        return num1 <= num2

    def mod(self, num1, num2):
        return num1%num2

    def equal(self, num1, num2):
        return num1 == num2
