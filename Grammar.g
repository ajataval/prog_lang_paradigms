grammar Grammar;

options 
{
  language = Java;
}
@header {
  package Compilers;
}


@lexer::header {
  package Compilers;
}


main: 'void' 'func' 'main()'
		'{' 'int' ID(','ID)*
		ST* '}'
		function*;

function: 'void' 'func' ID '(' params ')' 
		'{' 'int' ID(','ID)* 
		ST* '}';
		
ST: SIM_ST | COM_ST | CON_ST | ITE_ST;
SIM_ST: EXP+ ;
COM_ST: '{' ST | ST_LIST '}';
ST_LIST: ST | ST_LIST ST;
CON_ST: 'if' '(' CON|BOOL ')' ST ('else' ST)?;
ITE_ST: 'for' '(' INI ',' CON ',' MODIF ')' ;
DT: 'int'|'bool';
params: ('int' ID (',' 'int' ID)*);
INI: ID '=' VAR; 
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
MODIF: ID '=' VAR OP VAR;
NUM: '-'? ('0'..'9')+;
VAR: ID | NUM;
RELOP: '<' | '>' | '<=' | '>=' | '!='| '==';
CON: VAR RELOP VAR;
OP: '+'|'-'|'*'|'/'|'=';
EXP :  EXP OP EXP | '(' EXP ')'|VAR;
BOOL: 'true' | 'false';

