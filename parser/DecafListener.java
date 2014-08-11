// Generated from Decaf.g by ANTLR 4.3

	package compiler.parser;
	import java.util.LinkedList;


import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Decaf}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Decaf#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull Decaf.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull Decaf.BodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull Decaf.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull Decaf.ProgramContext ctx);
}