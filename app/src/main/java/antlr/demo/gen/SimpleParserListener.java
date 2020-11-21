package antlr.demo.gen;// Generated from /Users/zwzhou/Projects/sources/tpantlr4/api/SimpleParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(SimpleParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(SimpleParser.SContext ctx);
}