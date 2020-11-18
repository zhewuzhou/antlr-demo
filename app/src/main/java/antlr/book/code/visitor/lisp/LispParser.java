package antlr.book.code.visitor.lisp;

// Generated from Lisp.g4 by ANTLR 4.8

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LispParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, VAR = 6, INT = 7, WS = 8;
    public static final int
            RULE_prog = 0, RULE_expr = 1, RULE_var_expr_list = 2, RULE_let_expr = 3,
            RULE_add_expr = 4, RULE_mult_expr = 5;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\n\62\4\2\t\2\4\3" +
                    "\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\26" +
                    "\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\36\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3" +
                    "\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\2" +
                    "\60\2\16\3\2\2\2\4\25\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n%\3\2\2\2\f+" +
                    "\3\2\2\2\16\17\5\4\3\2\17\3\3\2\2\2\20\26\5\b\5\2\21\26\5\n\6\2\22\26" +
                    "\5\f\7\2\23\26\7\b\2\2\24\26\7\t\2\2\25\20\3\2\2\2\25\21\3\2\2\2\25\22" +
                    "\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\5\3\2\2\2\27\30\7\b\2\2\30\31" +
                    "\5\4\3\2\31\32\5\6\4\2\32\36\3\2\2\2\33\34\7\b\2\2\34\36\5\4\3\2\35\27" +
                    "\3\2\2\2\35\33\3\2\2\2\36\7\3\2\2\2\37 \7\3\2\2 !\7\4\2\2!\"\5\6\4\2\"" +
                    "#\5\4\3\2#$\7\5\2\2$\t\3\2\2\2%&\7\3\2\2&\'\7\6\2\2\'(\5\4\3\2()\5\4\3" +
                    "\2)*\7\5\2\2*\13\3\2\2\2+,\7\3\2\2,-\7\7\2\2-.\5\4\3\2./\5\4\3\2/\60\7" +
                    "\5\2\2\60\r\3\2\2\2\4\25\35";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION);
    }

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public LispParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "expr", "var_expr_list", "let_expr", "add_expr", "mult_expr"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "'let'", "')'", "'add'", "'mult'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, "VAR", "INT", "WS"
        };
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() {
        return "Lisp.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(12);
                expr();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_expr);
        try {
            setState(19);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(14);
                    let_expr();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(15);
                    add_expr();
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(16);
                    mult_expr();
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(17);
                    match(VAR);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(18);
                    match(INT);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Var_expr_listContext var_expr_list() throws RecognitionException {
        Var_expr_listContext _localctx = new Var_expr_listContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_var_expr_list);
        try {
            setState(27);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(21);
                    match(VAR);
                    setState(22);
                    expr();
                    setState(23);
                    var_expr_list();
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(25);
                    match(VAR);
                    setState(26);
                    expr();
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Let_exprContext let_expr() throws RecognitionException {
        Let_exprContext _localctx = new Let_exprContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_let_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(29);
                match(T__0);
                setState(30);
                match(T__1);
                setState(31);
                var_expr_list();
                setState(32);
                expr();
                setState(33);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Add_exprContext add_expr() throws RecognitionException {
        Add_exprContext _localctx = new Add_exprContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_add_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(35);
                match(T__0);
                setState(36);
                match(T__3);
                setState(37);
                expr();
                setState(38);
                expr();
                setState(39);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Mult_exprContext mult_expr() throws RecognitionException {
        Mult_exprContext _localctx = new Mult_exprContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_mult_expr);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(41);
                match(T__0);
                setState(42);
                match(T__4);
                setState(43);
                expr();
                setState(44);
                expr();
                setState(45);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitProg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Let_exprContext let_expr() {
            return getRuleContext(Let_exprContext.class, 0);
        }

        public Add_exprContext add_expr() {
            return getRuleContext(Add_exprContext.class, 0);
        }

        public Mult_exprContext mult_expr() {
            return getRuleContext(Mult_exprContext.class, 0);
        }

        public TerminalNode VAR() {
            return getToken(LispParser.VAR, 0);
        }

        public TerminalNode INT() {
            return getToken(LispParser.INT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitExpr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitExpr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Var_expr_listContext extends ParserRuleContext {
        public Var_expr_listContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode VAR() {
            return getToken(LispParser.VAR, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public Var_expr_listContext var_expr_list() {
            return getRuleContext(Var_expr_listContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_var_expr_list;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterVar_expr_list(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitVar_expr_list(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitVar_expr_list(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Let_exprContext extends ParserRuleContext {
        public Let_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Var_expr_listContext var_expr_list() {
            return getRuleContext(Var_expr_listContext.class, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_let_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterLet_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitLet_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitLet_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Add_exprContext extends ParserRuleContext {
        public Add_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_add_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterAdd_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitAdd_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitAdd_expr(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Mult_exprContext extends ParserRuleContext {
        public Mult_exprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mult_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).enterMult_expr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof LispListener) ((LispListener) listener).exitMult_expr(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof LispVisitor) return ((LispVisitor<? extends T>) visitor).visitMult_expr(this);
            else return visitor.visitChildren(this);
        }
    }
}