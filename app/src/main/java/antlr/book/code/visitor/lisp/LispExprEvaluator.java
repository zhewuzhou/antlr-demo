package antlr.book.code.visitor.lisp;

public class LispExprEvaluator extends LispBaseVisitor<Integer> {
    @Override
    public Integer visitProg(LispParser.ProgContext ctx) {
        return 0;
    }
}
