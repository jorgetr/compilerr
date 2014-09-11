make:  scanner/DecafLexer.java scanner/DecafLexer.class  scanner/Scanner.class parser/Decaf.java parser/Decaf.class parser/CC4Parser.class    Compiler.class

git.class: add


Compiler.class: Compiler.java
	javac Compiler.java
		git add . -A
	git commit -m "update AST"
	git push -u origin master
	
parser/CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java
	
parser/Decaf.class: parser/Decaf.java
	javac parser/Decaf.java
	
parser/Decaf.java: parser/Decaf.g
	java org.antlr.v4.Tool -lib scanner/ parser/Decaf.g
	
	
	
scanner/Scanner.class: scanner/Scanner.java
	javac scanner/Scanner.java
	
scanner/DecafLexer.class: scanner/DecafLexer.java
	javac scanner/DecafLexer.java
	
scanner/DecafLexer.java: scanner/DecafLexer.g
	java org.antlr.v4.Tool scanner/DecafLexer.g
	
	

	
clean:
	del *~ *.class
	del lib/*.class
	del opt/*.class
	del codegen/*.class
	del irt/*.class
	del semantic/*.class
	del ast/*.class
	del scanner/DecafLexer.java scanner/*.class scanner/*~ scanner/*.tokens
	del parser/Decaf.java parser/*.class parser/*~ parser/*.tokens