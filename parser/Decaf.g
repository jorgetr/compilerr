parser grammar Decaf;

options {
	tokenVocab=DecafLexer;
	
}

@parser::header {
	package compiler.parser;
	
	import java.util.Stack;

}

@parser::members {
public  Stack treeParse = new Stack();
	
public String lineaParse = "";
	
	
	public void Tree(String lexema){
			lineaParse = lexema;
			treeParse.push(lineaParse);
	;}
	
	public void emitErrorMessage(String msg)
	{
		
	}
}

programa : CLASS PROGRAM OPENBRACE (field_decli)*   (method_decli)*  CLOSEBRACE 
			{Tree("programa");}; 

field_decli  : type (((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) ) )+
					|((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) COMA) ))*
					   SEMICOLON
				{Tree("field_decli");}
				;					   

method_decli : (type|VOID) VAR  OPENAREN 
								(((type VAR)+ COMA)+ |((type VAR)+ COMA))* 
								CLOSEPAREN 
								block
								{Tree("method_decli");}
								;

block : OPENBRACE var_decl* statement*  CLOSEBRACE
{Tree("block");}
;

var_decl : type (VAR+|VAR COMA)* SEMICOLON
{Tree("var_decl");}
;

type		: (BOOLEAN |INT)
{Tree("type");}
;

statement: (
			(location asig_op expr SEMICOLON)
		   |((method_call) SEMICOLON)
		   |(IF  OPENAREN (expr) CLOSEPAREN block (ELSE block)+)
		   |(FOR  (VAR)  ASSIGN  (expr)   COMA  expr block)
		   |(BREAK SEMICOLON)
		   |(CONTINUE SEMICOLON)
		   |(block)
		   
		   |(RETURN (expr)+ SEMICOLON)

		   )
			{Tree("statement");}
		   ;


asig_op: ASSIGN | PLUSASSIGN | MINUSASSIGN
{Tree("asig_op");};

method_call: (method_name OPENAREN (expr|expr COMA) CLOSEPAREN )
			|CALLOUT STRINGLITERAL (COMA (callout_args|callout_args COMA )* )+ 
			{Tree("method_call");};

method_name: VAR {Tree("method_name");};

location: VAR | VAR OPENBRACKET expr CLOSEBRACKET
{Tree("location");};

expr: location
	 |method_call
	 |literal
	 |expr bin_op expr 
	 |SUB expr
	 |NOT expr 
	 |OPENAREN expr CLOSEPAREN
	{Tree("expr");} ;

callout_args:expr |STRINGLITERAL {Tree("callout_args");};

bin_op: arith_op|rel_op|eq_op|cond_op {Tree("bin_op");};

arith_op: ADD|SUB|MULT|DIV  {Tree("arith_op");};

rel_op:LESSTHAT|GREATTHAT|LESSEQ|GREATEQ  {Tree("rel_op");};

eq_op: EQUAL|NOTEQUAL {Tree("eq_op");};

cond_op: AND|OR {Tree("cond_op");};

literal: INTLITERAL|CHARLIT|BOOLEANLITERAL {Tree("literal");};


