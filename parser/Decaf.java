// Generated from Decaf.g by ANTLR 4.3

	package compiler.parser;
	import java.util.LinkedList;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPENBRACE=25, CLOSEPAREN=22, CLASS=34, XOR=13, COMENT=46, ELSE=44, CHARLIT=28, 
		BOOLEANLITERAL=29, OPENBRACKET=23, FOR=39, SUB=2, INT=35, SEMICOLON=20, 
		NOT=12, MULT=3, MINUSASSIGN=18, INTLITERAL=31, AND=10, COMA=19, BREAK=41, 
		IF=38, NOTEQUAL=15, CLOSEBRACKET=24, BOOLEAN=36, HEXLIT=30, GREATEQ=9, 
		LESSEQ=8, CONTINUE=42, CLOSEBRACE=26, STRINGLITERAL=27, PORC=5, EQUAL=14, 
		OR=11, RETURN=40, ASSIGN=16, GREATTHAT=7, VAR=33, VOID=37, ESPACIOS=45, 
		DECIMALIT=32, DIV=4, PLUSASSIGN=17, OPENAREN=21, CALLOUT=43, LESSTHAT=6, 
		ADD=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
		"'>='", "'&&'", "'||'", "'!'", "'^'", "'=='", "'!='", "'='", "'+='", "'-='", 
		"','", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "STRINGLITERAL", 
		"CHARLIT", "BOOLEANLITERAL", "HEXLIT", "INTLITERAL", "DECIMALIT", "VAR", 
		"CLASS", "INT", "BOOLEAN", "VOID", "IF", "FOR", "RETURN", "BREAK", "CONTINUE", 
		"CALLOUT", "ELSE", "ESPACIOS", "COMENT"
	};
	public static final int
		RULE_program = 0, RULE_body = 1;
	public static final String[] ruleNames = {
		"program", "body"
	};

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		public LinkedList lista = new LinkedList();
		

		
		public void emitErrorMessage(String msg)
		{
			lista.add(msg);
		}

	public Decaf(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode CLOSEBRACE() { return getToken(Decaf.CLOSEBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode VAR() { return getToken(Decaf.VAR, 0); }
		public TerminalNode OPENBRACE() { return getToken(Decaf.OPENBRACE, 0); }
		public TerminalNode CLASS() { return getToken(Decaf.CLASS, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4); match(CLASS);
			setState(5); match(VAR);
			setState(6); match(OPENBRACE);
			setState(7); body();
			setState(8); match(CLOSEBRACE);
			 System.out.println("START");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<TerminalNode> CHARLIT() { return getTokens(Decaf.CHARLIT); }
		public List<TerminalNode> STRINGLITERAL() { return getTokens(Decaf.STRINGLITERAL); }
		public TerminalNode CHARLIT(int i) {
			return getToken(Decaf.CHARLIT, i);
		}
		public TerminalNode STRINGLITERAL(int i) {
			return getToken(Decaf.STRINGLITERAL, i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGLITERAL || _la==CHARLIT) {
				{
				{
				setState(11);
				_la = _input.LA(1);
				if ( !(_la==STRINGLITERAL || _la==CHARLIT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(16);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\24\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\17\n\3\f\3\16\3\22\13\3\3\3\2"+
		"\2\4\2\4\2\3\3\2\35\36\22\2\6\3\2\2\2\4\20\3\2\2\2\6\7\7$\2\2\7\b\7#\2"+
		"\2\b\t\7\33\2\2\t\n\5\4\3\2\n\13\7\34\2\2\13\f\b\2\1\2\f\3\3\2\2\2\r\17"+
		"\t\2\2\2\16\r\3\2\2\2\17\22\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2\21\5\3"+
		"\2\2\2\22\20\3\2\2\2\3\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}