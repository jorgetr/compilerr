lexer grammar DecafLexer;

@lexer::header{
  package compiler.scanner;
  import java.util.LinkedList;
;}





@lexer::members {
	
	
	public String token = "";
	
	public void LisToken(int number, String name){
			token = number+" "+name;
		
	;}


	public LinkedList error = new LinkedList();
	
	public void emitErrorMessage(String name )
	{
		error.add(name);
	;}
;}

//AUX
fragment DIGIT		:   '0'..'9' ;
fragment HEX 		:   ('A'|'a')|('B'|'b')|('C'|'c')|('D'|'d')|('E'|'e')|('F'|'f');
fragment LETTER		:   ('a'..'z'|'A'..'Z');
fragment SIGNO		:   '-'|'+';
fragment ESC 		:	'\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'); 


//Operadores
ADD			:	'+'  {LisToken(getLine(),getText());};
SUB			: 	'-'  {LisToken(getLine(),getText());};
MULT		: 	'*'  {LisToken(getLine(),getText());};
DIV			: 	'/'  {LisToken(getLine(),getText());};
PORC		: 	'%'  {LisToken(getLine(),getText());};
LESSTHAT	: 	'<'  {LisToken(getLine(),getText());};
GREATTHAT	: 	'>'  {LisToken(getLine(),getText());};
LESSEQ		: 	'<=' {LisToken(getLine(),getText());};
GREATEQ		: 	'>=' {LisToken(getLine(),getText());};
AND 		:   '&&' {LisToken(getLine(),getText());};
OR			:   '||' {LisToken(getLine(),getText());};
NOT 		:	'!'  {LisToken(getLine(),getText());};
XOR 		:   '^'  {LisToken(getLine(),getText());};
EQUAL		:	'==' {LisToken(getLine(),getText());};
NOTEQUAL	:   '!=' {LisToken(getLine(),getText());};
ASSIGN 		: 	'='  {LisToken(getLine(),getText());};
PLUSASSIGN 	: 	'+=' {LisToken(getLine(),getText());};
MINUSASSIGN :	'-=' {LisToken(getLine(),getText());};

//Signos
COMA		:	 ',' {LisToken(getLine(),getText());};
SEMICOLON	:    ';' {LisToken(getLine(),getText());};
OPENAREN	:    '(' {LisToken(getLine(),getText());};
CLOSEPAREN	: 	 ')' {LisToken(getLine(),getText());};
OPENBRACKET	:  	 '[' {LisToken(getLine(),getText());};
CLOSEBRACKET: 	 ']' {LisToken(getLine(),getText());};
OPENBRACE : 	 '{' {LisToken(getLine(),getText());};
CLOSEBRACE 	: 	 '}' {LisToken(getLine(),getText());};

//LITERALES
STRINGLITERAL :	 '"'(ESC|~('\''|'\\'|'"'))*'"' 				{LisToken(getLine(),getText());};
CHARLIT 	  :	 '\''(ESC|~('\''|'\\'|'"'|'\n'|'\t'))'\''   {LisToken(getLine(),getText());};
BOOLEANLITERAL:  ('true'|'false') 							{LisToken(getLine(),getText());};
HEXLIT 		  :	 '0'('x'|'X')(DIGIT|HEX)(DIGIT|HEX)* 		{LisToken(getLine(),getText());};
INTLITERAL 	  :  (DIGIT+|'0'('x'|'X')HEX+) 					{LisToken(getLine(),getText());};
DECIMALIT 	  :  (DIGIT)(DIGIT)*        			    	{LisToken(getLine(),getText());};

//RESERVADAS
VAR 		  :  (LETTER|'_')(LETTER|'_'|DIGIT)* 	{LisToken(getLine(),getText());};
CLASS		  :  ('class') 							{LisToken(getLine(),getText());};
INT 		  :  ('int') 							{LisToken(getLine(),getText());};
BOOLEAN       :  ('boolean') 						{LisToken(getLine(),getText());};
VOID 		  :  ('void') 							{LisToken(getLine(),getText());};
IF			  :  ('if') 							{LisToken(getLine(),getText());};
FOR			  :  ('for') 							{LisToken(getLine(),getText());};
RETURN		  :  ('return')						 	{LisToken(getLine(),getText());};
BREAK		  :  ('break') 							{LisToken(getLine(),getText());};
CONTINUE	  :  ('continue') 						{LisToken(getLine(),getText());};
CALLOUT		  :  ('callout') 						{LisToken(getLine(),getText());};
ELSE		  :  ('else') 							{LisToken(getLine(),getText());};
PROGRAM		  :  ('Program') 							{LisToken(getLine(),getText());};

//SKIP
ESPACIOS	  :   ( '\t' | ' ' | '\r' | '\n')+ { skip() ;} ;
COMENT 	 	  :   '//' (~('\n'|'\r'))* {skip();};