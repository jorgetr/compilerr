// Generated from parser/Decaf.g by ANTLR 4.3

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
	 * Enter a parse tree produced by {@link Decaf#method_decli}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decli(@NotNull Decaf.Method_decliContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_decli}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decli(@NotNull Decaf.Method_decliContext ctx);

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

	/**
	 * Enter a parse tree produced by {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull Decaf.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull Decaf.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull Decaf.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull Decaf.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull Decaf.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull Decaf.Var_declContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#field_decli}.
	 * @param ctx the parse tree
	 */
	void enterField_decli(@NotNull Decaf.Field_decliContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#field_decli}.
	 * @param ctx the parse tree
	 */
	void exitField_decli(@NotNull Decaf.Field_decliContext ctx);
}