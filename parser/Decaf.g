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

programa : 		CLASS PROGRAM OPENBRACE 
				{Tree(getCurrentToken().getLine(),"program: ClASS PROGRAM");}
				(field_decli)*   (method_decli)*  CLOSEBRACE 
				{Tree(getCurrentToken().getLine(),"CLOSE");}
			; 

field_decli  : 	type 
				{Tree(getCurrentToken().getLine()," field_decli: type VAR");}
				(((VAR | (VAR OPENBRACKET INTLITERAL CLOSEBRACKET)))+
				{Tree(getCurrentToken().getLine()," ( LIT )");}
				|((VAR  {Tree(getCurrentToken().getLine(),"VAR");}
				|(VAR OPENBRACKET INTLITERAL CLOSEBRACKET) COMA  
				{Tree(getCurrentToken().getLine(),"VAR [ LIT ] , *");}
				) ))* SEMICOLON
				;					   

method_decli : (type|VOID) VAR  OPENAREN 
			   {Tree(getCurrentToken().getLine(),"method_decli type/void id (");}
			   (((type VAR)+ COMA)+ 
			   {Tree(getCurrentToken().getLine(),"type var");}
			   |((type VAR)+ COMA))* 
			   {Tree(getCurrentToken().getLine(),"type var,*");}
			   CLOSEPAREN 
			   {Tree(getCurrentToken().getLine(),")method_call");}
			   block
			   ;

block		 : OPENBRACE
				{Tree(getCurrentToken().getLine(),"block:{");}
		 		var_decl* statement*
		 		CLOSEBRACE
				{Tree(getCurrentToken().getLine(),"}");}
				;

var_decl 	: type (VAR+|VAR COMA)* SEMICOLON
			 {Tree(getCurrentToken().getLine(),"var_decl: type var,* ;");}
			 ;

type		: (BOOLEAN |INT)
			{Tree(getCurrentToken().getLine(),"type boolean/int");}
			;

statement: (
			(location asig_op expr SEMICOLON)
			{Tree(getCurrentToken().getLine(),"statement:location asig_op;");}
		   |((method_call) SEMICOLON)
		   {Tree(getCurrentToken().getLine(),"statement:methot_call");}
		   |(IF  OPENAREN (expr) CLOSEPAREN block (ELSE block)+)
		   {Tree(getCurrentToken().getLine(),"statement:if(expr)block (else)*");}
		   |(FOR  (VAR)  ASSIGN  (expr)   COMA  expr block)
		   {Tree(getCurrentToken().getLine(),"statement:for var=exprm expr , block");}
		   |(BREAK SEMICOLON)
		   {Tree(getCurrentToken().getLine(),"statement: Break;");}
		   |(CONTINUE SEMICOLON)
		   {Tree(getCurrentToken().getLine(),"statement:Continue;");}
		   |(block)
		   {Tree(getCurrentToken().getLine(),"block");}
		   |(RETURN (expr)+ SEMICOLON)
		   {Tree(getCurrentToken().getLine(),"return expr* ;");}

		   )
			
		   ;


asig_op		: ASSIGN | PLUSASSIGN | MINUSASSIGN
			{Tree(getCurrentToken().getLine(),"asig_op: =/+=/-=");};

method_call: (method_name OPENAREN (expr|expr COMA) CLOSEPAREN )
			{Tree(getCurrentToken().getLine(),"method_call:method_name (expr,*)");}
			|CALLOUT STRINGLITERAL (COMA (callout_args|callout_args COMA )* )+ 
			{Tree(getCurrentToken().getLine(),"method_call:CALLOUT STRINGLITERAL (,callout_args,)*");}
			;

method_name: VAR {Tree(getCurrentToken().getLine(),"method_name:VAR");};

location:	 (VAR) | (VAR OPENBRACKET expr CLOSEBRACKET)
			{Tree(getCurrentToken().getLine(),"location:VAR (exp)* ");};

expr: location
	 {Tree(getCurrentToken().getLine(),"expr:location");} 
	 | method_call
	 {Tree(getCurrentToken().getLine(),"expr:method_call");} 
	 |literal
	 {Tree(getCurrentToken().getLine(),"expr:literal");} 
	 |expr bin_op expr 
	 {Tree(getCurrentToken().getLine(),"expr: expr binOp expr");} 
	 |SUB expr
	 {Tree(getCurrentToken().getLine(),"expr: -expr");} 
	 |NOT expr 
	 {Tree(getCurrentToken().getLine(),"expr:!expr");} 
	 |OPENAREN expr CLOSEPAREN
	{Tree(getCurrentToken().getLine(),"expr:(exp)");}
	 ;

callout_args: expr |STRINGLITERAL 
{Tree(getCurrentToken().getLine(),"callout_args: expr/stringlit ");};

bin_op: 	arith_op|rel_op|eq_op|cond_op {Tree(getCurrentToken().getLine(),"bin_op: artih /  real/ cond ");};

arith_op: ADD|SUB|MULT|DIV  {Tree(getCurrentToken().getLine(),"arith_op: + - * /");};

rel_op:LESSTHAT|GREATTHAT|LESSEQ|GREATEQ  {Tree(getCurrentToken().getLine(),"rel_op: > < >= <=");};

eq_op: EQUAL|NOTEQUAL {Tree(getCurrentToken().getLine(),"eq_op: = !=");};

cond_op: AND|OR {Tree(getCurrentToken().getLine(),"cond_op: & | ");};

literal: INTLITERAL|CHARLIT|BOOLEANLITERAL {Tree(getCurrentToken().getLine(),"literal: INT CHAR BOOLEAN");};
