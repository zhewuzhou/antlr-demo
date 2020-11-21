package antlr.demo.visitor.lisp;// Generated from Lisp.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LispVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LispParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LispParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(LispParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#varExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExprList(LispParser.VarExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#letExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(LispParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#addExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(LispParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link LispParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(LispParser.MultExprContext ctx);
}