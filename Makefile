make:   SCANNER   CC4PARSER   AST  SEMANTIC.CLASS IRT.CLASS CODEGEN.CLASS  programa


SCANNER: scanner/Scanner.java
	javac scanner/Scanner.java


CC4PARSER: parser/CC4Parser.java
	javac parser/CC4Parser.java

AST: ast/Ast.java
	javac ast/Ast.java


SEMANTIC.CLASS: semantic/Semantic.java
	javac semantic/Semantic.java

IRT.CLASS: irt/Irt.java
	javac irt/Irt.java

CODEGEN.CLASS: codegen/Codegen.java
	javac codegen/Codegen.java



programa:
	javac Compiler.java


clean: 
	
	rm scanner/*.class
	rm parser/*.class
	rm parser/GramaticaParser.java
	rm ast/*.class
	rm semantic/*.class
	rm irt/*.class
	rm codegen/*.class
	
#	clear