package antlr.demo.visitor.lisp;// Generated from Lisp.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LispParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LispParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LispParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(LispParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(LispParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#varExprList}.
	 * @param ctx the parse tree
	 */
	void enterVarExprList(LispParser.VarExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#varExprList}.
	 * @param ctx the parse tree
	 */
	void exitVarExprList(LispParser.VarExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void enterLetExpr(LispParser.LetExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#letExpr}.
	 * @param ctx the parse tree
	 */
	void exitLetExpr(LispParser.LetExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(LispParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(LispParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link LispParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(LispParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LispParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(LispParser.MultExprContext ctx);
}