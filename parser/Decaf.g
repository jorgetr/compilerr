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

program		: CLASS PROGRAM OPENBRACE (field_decli)*   (method_decli)*  CLOSEBRACE { System.out.

println("START");}; 

field_decli  : type (((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) ) )+
					|((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) COMA) ))*
					   SEMICOLON;

method_decli : (type|VOID) VAR  OPENAREN 
								(((type VAR)+ COMA)+ |((type VAR)+ COMA))* 
								CLOSEPAREN 
								block;

block : OPENBRACE var_decl* statement*  CLOSEBRACKET;

var_decl : type (VAR+|VAR COMA)* SEMICOLON;

type		: (BOOLEAN |INT);

statement: ((location asig_op expr SEMICOLON)
		   |((method_call) SEMICOLON)
		   |(IF  OPENAREN (expr) CLOSEPAREN block (ELSE block)+)
		   |(FOR  (VAR)  ASSIGN  (expr)   COMA  expr block)
		   |(BREAK SEMICOLON)
		   |(CONTINUE SEMICOLON)
		   |(block)
		   
		   |(RETURN (expr)+ SEMICOLON)

		   )
		   ;


asig_op: ASSIGN | PLUSASSIGN | MINUSASSIGN;

method_call: (method_name OPENAREN (expr|expr COMA) CLOSEPAREN )
			|CALLOUT STRINGLITERAL (COMA (callout_args|callout_args COMA )* )+ 
			;

method_name: VAR ;

location: VAR | VAR OPENBRACKET expr CLOSEBRACKET;

expr: location
	 |method_call
	 |literal
	 |expr bin_op expr 
	 |SUB expr
	 |NOT expr 
	 |OPENAREN expr CLOSEPAREN
	 ;

callout_args:expr |STRINGLITERAL;

bin_op: arith_op|rel_op|eq_op|cond_op ;

arith_op: ADD|SUB|MULT|DIV;

rel_op:LESSTHAT|GREATTHAT|LESSEQ|GREATEQ;

eq_op: EQUAL|NOTEQUAL;

cond_op: AND|OR;

literal: INTLITERAL|CHARLIT|BOOLEANLITERAL;


body    	: (STRINGLITERAL | CHARLIT)*;