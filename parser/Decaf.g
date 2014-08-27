parser grammar Decaf;

options {
	tokenVocab=DecafLexer;
	
}

@parser::header {
	package compiler.parser;
	import java.util.LinkedList;

}

@parser::members {
	public LinkedList lista = new LinkedList();
	

	
	public void emitErrorMessage(String msg)
	{
		lista.add(msg);
	}
}

program		: CLASS VAR OPENBRACE (field_decli)*   (method_decli)* body CLOSEBRACE { System.out.

println("START");}; 

field_decli  : type ( (VAR| (VAR OPENBRACKET INTLITERAL CLOSEBRACKET))+ COMA)* ;

method_decli : (type|VOID) VAR  OPENAREN ((type VAR)+ COMA)* CLOSEPAREN block;

block : OPENBRACE var_decl* body CLOSEBRACKET;

var_decl : type VAR+ COMA SEMICOLON;


type		: (BOOLEAN |INT);
body    	: (STRINGLITERAL | CHARLIT)*;