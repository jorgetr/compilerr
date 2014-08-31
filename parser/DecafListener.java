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
	 * Enter a parse tree produced by {@link Decaf#asig_op}.
	 * @param ctx the parse tree
	 */
	void enterAsig_op(@NotNull Decaf.Asig_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#asig_op}.
	 * @param ctx the parse tree
	 */
	void exitAsig_op(@NotNull Decaf.Asig_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull Decaf.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull Decaf.LocationContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull Decaf.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull Decaf.Method_nameContext ctx);

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
	 * Enter a parse tree produced by {@link Decaf#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull Decaf.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull Decaf.ExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull Decaf.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull Decaf.Bin_opContext ctx);

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
	 * Enter a parse tree produced by {@link Decaf#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull Decaf.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull Decaf.Rel_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull Decaf.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull Decaf.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(@NotNull Decaf.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(@NotNull Decaf.Arith_opContext ctx);

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
	 * Enter a parse tree produced by {@link Decaf#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(@NotNull Decaf.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(@NotNull Decaf.Eq_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull Decaf.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull Decaf.Method_callContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(@NotNull Decaf.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(@NotNull Decaf.Cond_opContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull Decaf.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull Decaf.LiteralContext ctx);

	/**
	 * Enter a parse tree produced by {@link Decaf#callout_args}.
	 * @param ctx the parse tree
	 */
	void enterCallout_args(@NotNull Decaf.Callout_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Decaf#callout_args}.
	 * @param ctx the parse tree
	 */
	void exitCallout_args(@NotNull Decaf.Callout_argsContext ctx);
}