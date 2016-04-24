/**
 * Define a grammar called Hello
 */
grammar SATLanguage;


/* 
 r  : 'hello' ID ;         // match keyword hello followed by an identifier

ID : [a-z]+ ;             // match lower-case identifiers

WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
 
 */


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
factor : (NUM | ID | '(' exp ')');
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
WS: (' '| '\t' | '\n' | '\r' | ' \f')+ -> skip ;