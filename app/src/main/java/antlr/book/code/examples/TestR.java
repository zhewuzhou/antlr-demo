package antlr.book.code.examples; /***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/

import antlr.book.code.gen.RLexer;
import antlr.book.code.gen.RParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RuleContext;

import static org.antlr.v4.gui.Trees.inspect;

public class TestR {
    public static void main(String[] args) throws Exception {
        CodePointCharStream input = CharStreams.fromString(args[0]);
        RLexer lexer = new RLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RParser parser = new RParser(tokens);
        parser.setBuildParseTree(true);
        RuleContext tree = parser.prog();
        inspect(tree, parser);
        //tree.save(parser, "/tmp/R.ps"); // Generate postscript
        System.out.println(tree.toStringTree(parser));
    }
}
