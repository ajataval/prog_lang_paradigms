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




main: 'void' 'func' 'main()'
		'{' 'int' ID(','ID)*
		ST* '}'
		function*;

function: 'void' 'func' ID '(' PARAMS ')' 
		'{' 'int' ID(','ID)* 
		ST* '}';

WS: (' '| '\t' | '\n' | '\r' | ' \f')+ {$channel = HIDDEN;};
ST: SIM_ST | CON_ST | ITE_ST|COM_ST ;
SIM_ST: EXP+;
CON_ST: 'if' '(' CON|BOOL ')' ST ('else' ST)?;
ITE_ST: 'for' '(' INI ',' CON ',' MODIF ')' ST;
COM_ST: '{' ST  '}';
DT: 'int'|'bool';
PARAMS: ('int' ID (',' 'int' ID)*);
INI: ID '=' VAR; 
ID: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')*;
MODIF: ID '=' (VAR OP VAR);
NUM: '-'? ('0'..'9')+;
VAR: ID | NUM;
RELOP: '<' | '>' | '<=' | '>=' | '!='| '==';
CON: VAR RELOP VAR;
OP: '+'|'-'|'*'|'/'|'=';
EXP : TERM;
TERM: VAR (OP EXP)* | '(' EXP ')';
BOOL: 'true' | 'false';
