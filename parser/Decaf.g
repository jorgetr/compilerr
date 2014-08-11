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

program		: CLASS VAR OPENBRACE body CLOSEBRACE { System.out.println("START");}; 
body    	: (STRINGLITERAL | CHARLIT)*;