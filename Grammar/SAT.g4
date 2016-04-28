

grammar SAT;

main: function*;

function: rtType 'func' name '(' params ')' 
		'{' (dt ID(','ID)*)* 
		st_list '}';

funcCall : ID '(' params1 ')' ;

returna: 'return' var ;

name: 'main'|ID;
print: 'print' var ;
rtType: 'void'|'int';
st_list: st+;
st: funcCall|sim_st | con_st | ite_st| com_st;
sim_st: (exp+ |assi_expr|returna |print) ';' ;

assi_expr: ID '=' simpleExp | funcCall ;

con_st: 'if' '(' con ')' com_st ('else' com_st)?;
ite_st: 'for' '(' ini ';' con ';' modif ')' com_st;
com_st: '{' st_list '}';
exp : simpleExp (RELOP simpleExp)?;
term: factor (OP factor)*; 
factor : (NUM | ID | '(' exp ')') |funcCall;
con: var RELOP var;

simpleExp: term (OP term)*;
dt: 'int'|'bool';
params: ((dt ID)? (',' dt ID)*);
params1: var (','var)*;
ini: ID '=' var; 
OP: ('+' | '-' | '*' | '/');
//ADDING_OPERATOR: ('+' | '-');
//MULTIPLYING_OPERATOR: ('*' | '/');
BOOL: 'true' | 'false';
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;


modif: ID '=' (var OP var);
NUM: '-'? ('0'..'9')+;
var: ID | NUM;
RELOP: '<' | '>' | '<=' | '>=' | '!='| '=='|'=';
WS: (' '| '\t' | '\n' | '\r' | ' \f')+ -> skip;