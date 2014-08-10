lexer grammar Decaf;

@lexer::header{
  package compiler.scanner;
}


@lexer::members {
	public LinkedList error = new LinkedList();
	public String cadena = "";
	
	public void format(int linea, String nombre, String valor){
		if(nombre.equals("")){
			cadena = linea+" "+valor;
		}else{
			cadena = linea+" "+nombre+" "+valor;
		}
	}
	
	@Override
	public void emitErrorMessage(String msg)
	{
		error.add(msg);
	}
}

//AUX
fragment DIGIT		:   '0'..'9' ;
fragment HEX 		:   ('A'|'a')|('B'|'b')|('C'|'c')|('D'|'d')|('E'|'e')|('F'|'f');
fragment LETTER		:   ('a'..'z'|'A'..'Z');
fragment SIGNO		:   '-'|'+';
fragment ESC 		:	'\\'('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\'); 


//Operadores
ADD			:	'+'  {};
SUB			: 	'-'  {};
MULT		: 	'*'  {};
DIV			: 	'/'  {};
PORC		: 	'%'  {};
LESSTHAT	: 	'<'  {};
GREATTHAT	: 	'>'  {};
LESSEQ		: 	'<=' {};
GREATEQ		: 	'>=' {};
AND 		:   '&&' {};
OR			:   '||' {};
NOT 		:	'!'  {};
XOR 		:   '^'  {};
EQUAL		:	'==' {};
NOTEQUAL	:   '!=' {};
ASSIGN 		: 	'='  {};
PLUSASSIGN 	: 	'+=' {};
MINUSASSIGN :	'-=' {};

//Signos
COMA		:	 ',' {};
SEMICOLON	:    ';' {};
OPENAREN	:    '(' {};
CLOSEPAREN	: 	 ')' {};
OPENBRACKET	:  	 '[' {};
CLOSEBRACKET: 	 ']' {};
OPENBRACE : 	 '{' {};
CLOSEBRACE 	: 	 '}' {};

//LITERALES
STRINGLITERAL: '"'(ESC|~('\''|'\\'|'"'))*'"' {format(getLine(), "STRINGLITERAL", getText());};
CHARLIT	:'\''(ESC|~('\''|'\\'|'"'|'\n'|'\t'))'\'' {format(getLine(), "CHARLITERAL", getText());};
BOOLEANLITERAL: ('true'|'false') {format(getLine(), "BOOLEANLITERAL", getText());};
HEXLIT:		 '0'('x'|'X')(DIGIT|HEX)(DIGIT|HEX)* {format(getLine(), "HEXLIT", getText());};
INTLITERAL: (DIGIT+|'0'('x'|'X')HEX+) {format(getLine(), "INTLITERAL", getText());};
DECIMALIT:  (DIGIT)(DIGIT)*           {format(getLine(), "DECIMALIT", getText());};

//SKIP
ESPACIOS	: 	( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;
COMENT 	 	:   '//' (~('\n'|'\r'))* {skip();};
