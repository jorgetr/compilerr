lexer grammar DecafLexer;

@lexer::header{
  package compiler.scanner;
  import java.util.LinkedList;

;}





@lexer::members {
	
	
	public String token = "";
	
	public void LisToken(int number, String name,String lexema){
			token = number+" "+lexema+" "+name;
		
	}


public LinkedList error = new LinkedList();
	
	public void reportError(java.lang.String s)
	{
		error.add(s);
	}
}

//AUX
fragment DIGIT		:   '0'..'9' ;
fragment HEX 		:   ('A'|'a')|('B'|'b')|('C'|'c')|('D'|'d')|('E'|'e')|('F'|'f');
fragment LETTER		:   ('a'..'z'|'A'..'Z');
fragment SIGNO		:   '-'|'+';
fragment ESC 		:	'\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'); 


//Operadores
ADD			:	'+'  {LisToken(getLine(),getText(),"ADD");};
SUB			: 	'-'  {LisToken(getLine(),getText(),"SUB");};
MULT		: 	'*'  {LisToken(getLine(),getText(),"MULT");};
DIV			: 	'/'  {LisToken(getLine(),getText(),"DIV");};
PORC		: 	'%'  {LisToken(getLine(),getText(),"MOD");};
LESSTHAT	: 	'<'  {LisToken(getLine(),getText(),"LESSTHAT");};
GREATTHAT	: 	'>'  {LisToken(getLine(),getText(),"GREATTHAT");};
LESSEQ		: 	'<=' {LisToken(getLine(),getText(),"LESSEQ");};
GREATEQ		: 	'>=' {LisToken(getLine(),getText(),"GREATEQ");};
AND 		:   '&&' {LisToken(getLine(),getText(),"AND");};
OR			:   '||' {LisToken(getLine(),getText(),"OR");};
NOT 		:	'!'  {LisToken(getLine(),getText(),"NOT");};
XOR 		:   '^'  {LisToken(getLine(),getText(),"XOR");};
EQUAL		:	'==' {LisToken(getLine(),getText(),"EQUAL");};
NOTEQUAL	:   '!=' {LisToken(getLine(),getText(),"NOTEQUAL");};
ASSIGN 		: 	'='  {LisToken(getLine(),getText(),"ASSIGN");};
PLUSASSIGN 	: 	'+=' {LisToken(getLine(),getText(),"PLUSASSIGN");};
MINUSASSIGN :	'-=' {LisToken(getLine(),getText(),"MINUSASSIGN");};

//Signos
COMA		:	 ',' {LisToken(getLine(),getText(),"COMA");};
SEMICOLON	:    ';' {LisToken(getLine(),getText(),"SEMICOLON");};
OPENAREN	:    '(' {LisToken(getLine(),getText(),"OPENAREN");};
CLOSEPAREN	: 	 ')' {LisToken(getLine(),getText(),"CLOSEPAREN");};
OPENBRACKET	:  	 '[' {LisToken(getLine(),getText(),"OPENBRACKET");};
CLOSEBRACKET: 	 ']' {LisToken(getLine(),getText(),"CLOSEBRACKET");};
OPENBRACE : 	 '{' {LisToken(getLine(),getText(),"OPENBRACE");};
CLOSEBRACE 	: 	 '}' {LisToken(getLine(),getText(),"CLOSEBRACE");};

//LITERALES
STRINGLITERAL :	 '"'(ESC|~('\''|'\\'|'"'))*'"' 				{LisToken(getLine(),getText(),"STRINGLITERAL");};
CHARLIT 	  :	 '\''(ESC|~('\''|'\\'|'"'|'\n'|'\t'))'\''   {LisToken(getLine(),getText(),"CHARLIT");};
BOOLEANLITERAL:  ('true'|'false') 							{LisToken(getLine(),getText(),"BOOLEANLITERAL");};
HEXLIT 		  :	 '0'('x'|'X')(DIGIT|HEX)(DIGIT|HEX)* 		{LisToken(getLine(),getText(),"HEXLIT");};
INTLITERAL 	  :  (DIGIT+|'0'('x'|'X')HEX+) 					{LisToken(getLine(),getText(),"INTLITERAL");};
DECIMALIT 	  :  (DIGIT)(DIGIT)*        			    	{LisToken(getLine(),getText(),"DECIMALIT");};

//RESERVADAS

CLASS		  :  'class' 							{LisToken(getLine(),getText(),"CLASS");};
INT 		  :  ('int') 							{LisToken(getLine(),getText(),"INT");};
BOOLEAN       :  ('boolean') 						{LisToken(getLine(),getText(),"BOOLEAN");};
VOID 		  :  ('void') 							{LisToken(getLine(),getText(),"VOID");};
IF			  :  ('if') 							{LisToken(getLine(),getText(),"IF");};
FOR			  :  ('for') 							{LisToken(getLine(),getText(),"FOR");};
RETURN		  :  ('return')						 	{LisToken(getLine(),getText(),"RETURN");};
BREAK		  :  ('break') 							{LisToken(getLine(),getText(),"BREAK");};
CONTINUE	  :  ('continue') 						{LisToken(getLine(),getText(),"CONTINUE");};
CALLOUT		  :  ('callout') 						{LisToken(getLine(),getText(),"CALLOUT");};
ELSE		  :  ('else') 							{LisToken(getLine(),getText(),"ELSE");};
PROGRAM		  :  ('Program') 						{LisToken(getLine(),getText(),"PROGRAM");};
VAR 		  :  (LETTER|'_')(LETTER|'_'|DIGIT)* 	{LisToken(getLine(),getText(),"VAR");};
//SKIP
ESPACIOS	  :   ( '\t' | ' ' | '\r' | '\n')+ { skip() ;} ;
COMENT 	 	  :   '//' (~('\n'|'\r'))* {skip();};