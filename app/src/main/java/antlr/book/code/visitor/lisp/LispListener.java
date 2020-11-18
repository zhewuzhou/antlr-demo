package antlr.book.code.visitor.lisp;

// Generated from Lisp.g4 by ANTLR 4.8

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LispParser}.
 */
public interface LispListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link LispParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(LispParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(LispParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link LispParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(LispParser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(LispParser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link LispParser#var_expr_list}.
     *
     * @param ctx the parse tree
     */
    void enterVar_expr_list(LispParser.Var_expr_listContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#var_expr_list}.
     *
     * @param ctx the parse tree
     */
    void exitVar_expr_list(LispParser.Var_expr_listContext ctx);

    /**
     * Enter a parse tree produced by {@link LispParser#let_expr}.
     *
     * @param ctx the parse tree
     */
    void enterLet_expr(LispParser.Let_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#let_expr}.
     *
     * @param ctx the parse tree
     */
    void exitLet_expr(LispParser.Let_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link LispParser#add_expr}.
     *
     * @param ctx the parse tree
     */
    void enterAdd_expr(LispParser.Add_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#add_expr}.
     *
     * @param ctx the parse tree
     */
    void exitAdd_expr(LispParser.Add_exprContext ctx);

    /**
     * Enter a parse tree produced by {@link LispParser#mult_expr}.
     *
     * @param ctx the parse tree
     */
    void enterMult_expr(LispParser.Mult_exprContext ctx);

    /**
     * Exit a parse tree produced by {@link LispParser#mult_expr}.
     *
     * @param ctx the parse tree
     */
    void exitMult_expr(LispParser.Mult_exprContext ctx);
}