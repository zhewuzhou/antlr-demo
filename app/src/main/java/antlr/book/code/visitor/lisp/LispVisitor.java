package antlr.book.code.visitor.lisp;

// Generated from Lisp.g4 by ANTLR 4.8

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LispParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface LispVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link LispParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(LispParser.ProgContext ctx);

    /**
     * Visit a parse tree produced by {@link LispParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExpr(LispParser.ExprContext ctx);

    /**
     * Visit a parse tree produced by {@link LispParser#var_expr_list}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVar_expr_list(LispParser.Var_expr_listContext ctx);

    /**
     * Visit a parse tree produced by {@link LispParser#let_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLet_expr(LispParser.Let_exprContext ctx);

    /**
     * Visit a parse tree produced by {@link LispParser#add_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAdd_expr(LispParser.Add_exprContext ctx);

    /**
     * Visit a parse tree produced by {@link LispParser#mult_expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMult_expr(LispParser.Mult_exprContext ctx);
}