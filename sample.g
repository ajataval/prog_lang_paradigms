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




main: rtType 'func' 'main()'
		'{' dt ID(','ID)*
		st_list '}'
		function*;

function: rtType 'func' ID '(' params ')' 
		'{' dt ID(','ID)* 
		st_list '}';

rtType: 'void'|'int';
st_list: st+;
st: sim_st | con_st | ite_st| com_st ;
sim_st: exp+;

con_st: 'if' '(' con|BOOL ')' com_st ('else' com_st)?;
ite_st: 'for' '(' ini ',' con ',' modif ')' com_st;
com_st: '{' st_list '}';
exp : simpleExp (RELOP simpleExp)?;
term: factor (MULTIPLYING_OPERATOR factor)*; 
factor : (NUM | ID | '(' EXP ')');
con: var RELOP var;

simpleExp: term (ADDING_OPERATOR term)*;
dt: 'int'|'bool';
params: ((dt ID)? (',' dt ID)*);
ini: ID '=' VAR; 
ADDING_OPERATOR: ('+' | '-');
MULTIPLYING_OPERATOR: ('*' | '/');
BOOL: 'true' | 'false';
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
modif: ID '=' (var OP var);
NUM: '-'? ('0'..'9')+;
var: ID | NUM;
RELOP: '<' | '>' | '<=' | '>=' | '!='| '==';
WS: (' '| '\t' | '\n' | '\r' | ' \f')+ {$channel = HIDDEN;};

