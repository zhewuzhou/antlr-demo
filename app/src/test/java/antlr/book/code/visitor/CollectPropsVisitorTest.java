package antlr.book.code.visitor;

import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import static org.antlr.v4.runtime.CharStreams.fromStream;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CollectPropsVisitorTest {
    CollectPropsVisitor visitor = new CollectPropsVisitor();
    PropertyFileParser.FileContext tree;

    @BeforeEach
    public void setup() throws IOException {
        InputStream input = CollectPropsVisitorTest.class.getResourceAsStream("/t.properties");
        PropertyFileLexer lexer = new PropertyFileLexer(fromStream(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFileParser parser = new PropertyFileParser(tokens);
        tree = parser.file();
    }

    @Test
    public void shouldCollectAllProps() {
        visitor.visit(tree);
        Map<String, String> result = visitor.getProps();
        assertThat(result.size(), is(2));
        assertThat(result.get("user"), is("\"parrt\""));
        assertThat(result.get("machine"), is("\"maniac\""));
    }
}