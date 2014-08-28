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

program		: CLASS VAR OPENBRACE (field_decli)*   (method_decli)*  CLOSEBRACE { System.out.

println("START");}; 

field_decli  : type ( (VAR| (VAR OPENBRACKET INTLITERAL CLOSEBRACKET))+ COMA)* SEMICOLON;

method_decli : (type|VOID) VAR  OPENAREN ((type VAR)+ COMA)* CLOSEPAREN block;

block : OPENBRACE var_decl* statement*  CLOSEBRACKET;

var_decl : type VAR+ COMA SEMICOLON;

statement: (location asig_op expr SEMICOLON)
		   |(method_call) SEMICOLON
		   |IF  (expr)  block (ELSE block)*
		   |FOR  (VAR)  ASSIGN  (expr)   COMA  expr block
		   |RETURN (expr)+ SEMICOLON
		   |BREAK SEMICOLON
		   |CONTINUE SEMICOLON
		   |block;


asig_op: ASSIGN | PLUSASSIGN | MINUSASSIGN;

location: body;

expr: body ;
method_call: body ;

type		: (BOOLEAN |INT);
body    	: (STRINGLITERAL | CHARLIT)*;