grammar sample;

options 
{
  language = Java;
}
@header 
{
  package Compilers;
}


@lexer::header 
{
  package Compilers;
}




main: function*;

function: rtType 'func' name '(' params ')' 
		'{' (dt ID(','ID)*)* 
		st_list '}';

name: 'main'|ID;
rtType: 'void'|'int';
st_list: st+;
st: sim_st | con_st | ite_st| com_st ;
sim_st: exp+|assi_expr;
assi_expr: ID '=' var;

con_st: 'if' '(' con ')' com_st ('else' com_st)?;
ite_st: 'for' '(' ini ';' con ';' modif ')' com_st;
com_st: '{' st_list '}';
exp : simpleExp (RELOP simpleExp)?;
term: factor (MULTIPLYING_OPERATOR factor)*; 
factor : (NUM | ID | '(' EXP ')');
con: var RELOP var;

simpleExp: term (ADDING_OPERATOR term)*;
dt: 'int'|'bool';
params: ((dt ID)? (',' dt ID)*);
ini: ID '=' var; 
ADDING_OPERATOR: ('+' | '-');
MULTIPLYING_OPERATOR: ('*' | '/');
BOOL: 'true' | 'false';
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;


modif: ID '=' (var (ADDING_OPERATOR|MULTIPLYING_OPERATOR) var);
NUM: '-'? ('0'..'9')+;
var: ID | NUM;
RELOP: '<' | '>' | '<=' | '>=' | '!='| '=='|'=';
WS: (' '| '\t' | '\n' | '\r' | ' \f')+ {$channel = HIDDEN;};

