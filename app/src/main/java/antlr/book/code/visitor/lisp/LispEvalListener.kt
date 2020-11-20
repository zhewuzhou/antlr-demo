package antlr.book.code.visitor.lisp

import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.tree.ParseTreeProperty

//todo: fix the public field
//todo: why we need expr -> varListExpr, if we do inline, it will broken
//todo: why we need addExpr multExpr
class LispEvalListener : LispBaseListener() {
    private val scope = ParseTreeProperty<MutableMap<String, Int>>()
    private val values = ParseTreeProperty<Int>()
    var evalValue = 0
        private set


    override fun exitProg(ctx: LispParser.ProgContext) {
        evalValue = values[ctx.children[0]]
    }

    override fun exitExpr(ctx: LispParser.ExprContext) {
        val curScope = curScope(ctx)
        val v = when {
            ctx.children[0].text[0] == '(' -> {
                val subExpr = ctx.children[0]
                when (subExpr.getChild(1).text) {
                    "add" -> values[subExpr.getChild(2)] + values[subExpr.getChild(3)]
                    "mult" -> values[subExpr.getChild(2)] * values[subExpr.getChild(3)]
                    else -> values[subExpr.getChild(subExpr.childCount - 2)]
                }
            }
            else -> if (ctx.children[0].text[0].isDigit()) ctx.children[0].text.toInt() else curScope[ctx.children[0].text]
        }
        values.put(ctx, v)
        if (ctx.parent.getChild(0).text[0].isLetter()) {
            curScope.put(ctx.parent.getChild(0).text, v!!)
        }
    }

    override fun enterLetExpr(ctx: LispParser.LetExprContext) {
        val newScope = mutableMapOf<String, Int>()
        val curScope = curScope(ctx)
        newScope.putAll(curScope)
        scope.put(ctx, newScope)
    }

    private fun curScope(ctx: ParserRuleContext): MutableMap<String, Int> {
        var search: ParserRuleContext? = ctx
        while (search != null) {
            if (search.children.size > 4 && search.children[1].text == "let") {
                return if (scope[search] == null) mutableMapOf() else scope[search]
            }
            search = search.getParent()
        }
        return mutableMapOf()
    }
}