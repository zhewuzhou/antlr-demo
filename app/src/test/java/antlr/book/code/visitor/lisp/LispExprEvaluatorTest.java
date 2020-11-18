package antlr.book.code.visitor.lisp;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LispExprEvaluatorTest {
    private static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of("(add 1 2)", 3),
                Arguments.of("(mult 3 (add 2 3))", 15),
                Arguments.of("(let x 2 (mult x 5))", 10),
                Arguments.of("(let x 2 (mult x (let x 3 y 4 (add x y))))", 14),
                Arguments.of("(let x 1 y 2 x (add x y) (add x y))", 5),
                Arguments.of("(let a1 3 b2 (add a1 1) b2)", 4)
        );
    }

    @ParameterizedTest
    @MethodSource("cases")
    public void shouldEvalLispExpr(String expr, Integer expect) {
        LispLexer lexer = new LispLexer(CharStreams.fromString(expr));
        LispParser parser = new LispParser(new CommonTokenStream(lexer));
        Integer visit = new LispEvalVisitor().visit(parser.prog());
    }
}