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
public  Stack stackErrorParse = new Stack();
public String lineaParse = "";
	
	
	public void Tree(int line,String lexema){
			lineaParse =line+" "+ lexema;
			treeParse.push(lineaParse);
	;}
	
@Override
public void notifyErrorListeners(@NotNull
                        Token offendingToken,
                        @NotNull
                        String msg,
                        @Nullable
                        RecognitionException e){
			String lineaError = "Error Line:"+offendingToken.getLine()+":"+msg;
			stackErrorParse.push(lineaError);

}
}

programa : CLASS PROGRAM OPENBRACE (field_decli)*   (method_decli)*  CLOSEBRACE 
			{Tree(getCurrentToken().getLine(),"programa");}; 

field_decli  : type (((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) ) )+
					|((VAR|  (VAR OPENBRACKET INTLITERAL CLOSEBRACKET) COMA) ))*
					   SEMICOLON
				{Tree(getCurrentToken().getLine(),"field_decli");}
				;					   

method_decli : (type|VOID) VAR  OPENAREN 
								(((type VAR)+ COMA)+ |((type VAR)+ COMA))* 
								CLOSEPAREN 
								block
								{Tree(getCurrentToken().getLine(),"method_decli");}
								;

block : OPENBRACE var_decl* statement*  CLOSEBRACE
{Tree(getCurrentToken().getLine(),"block");}
;

var_decl : type (VAR+|VAR COMA)* SEMICOLON
{Tree(getCurrentToken().getLine(),"var_decl");}
;

type		: (BOOLEAN |INT)
{Tree(getCurrentToken().getLine(),"type");}
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
			{Tree(getCurrentToken().getLine(),"statement");}
		   ;


asig_op: ASSIGN | PLUSASSIGN | MINUSASSIGN
{Tree(getCurrentToken().getLine(),"asig_op");};

method_call: (method_name OPENAREN (expr|expr COMA) CLOSEPAREN )
			|CALLOUT STRINGLITERAL (COMA (callout_args|callout_args COMA )* )+ 
			{Tree(getCurrentToken().getLine(),"method_call");};

method_name: VAR {Tree(getCurrentToken().getLine(),"method_name");};

location: VAR | VAR OPENBRACKET expr CLOSEBRACKET
{Tree(getCurrentToken().getLine(),"location");};

expr: location
	 |method_call
	 |literal
	 |expr bin_op expr 
	 |SUB expr
	 |NOT expr 
	 |OPENAREN expr CLOSEPAREN
	{Tree(getCurrentToken().getLine(),"expr");} ;

callout_args:expr |STRINGLITERAL {Tree(getCurrentToken().getLine(),"callout_args");};

bin_op: arith_op|rel_op|eq_op|cond_op {Tree(getCurrentToken().getLine(),"bin_op");};

arith_op: ADD|SUB|MULT|DIV  {Tree(getCurrentToken().getLine(),"arith_op");};

rel_op:LESSTHAT|GREATTHAT|LESSEQ|GREATEQ  {Tree(getCurrentToken().getLine(),"rel_op");};

eq_op: EQUAL|NOTEQUAL {Tree(getCurrentToken().getLine(),"eq_op");};

cond_op: AND|OR {Tree(getCurrentToken().getLine(),"cond_op");};

literal: INTLITERAL|CHARLIT|BOOLEANLITERAL {Tree(getCurrentToken().getLine(),"literal");};
