// Generated from parser/Decaf.g by ANTLR 4.3

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
		RULE_program = 0, RULE_field_decli = 1, RULE_method_decli = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_body = 6;
	public static final String[] ruleNames = {
		"program", "field_decli", "method_decli", "block", "var_decl", "type", 
		"body"
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
		public List<Method_decliContext> method_decli() {
			return getRuleContexts(Method_decliContext.class);
		}
		public List<Field_decliContext> field_decli() {
			return getRuleContexts(Field_decliContext.class);
		}
		public TerminalNode CLOSEBRACE() { return getToken(Decaf.CLOSEBRACE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Method_decliContext method_decli(int i) {
			return getRuleContext(Method_decliContext.class,i);
		}
		public TerminalNode VAR() { return getToken(Decaf.VAR, 0); }
		public Field_decliContext field_decli(int i) {
			return getRuleContext(Field_decliContext.class,i);
		}
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(CLASS);
			setState(15); match(VAR);
			setState(16); match(OPENBRACE);
			setState(20);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(17); field_decli();
					}
					} 
				}
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(23); method_decli();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29); body();
			setState(30); match(CLOSEBRACE);
			 System.out.

			println("START");
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

	public static class Field_decliContext extends ParserRuleContext {
		public TerminalNode INTLITERAL(int i) {
			return getToken(Decaf.INTLITERAL, i);
		}
		public TerminalNode VAR(int i) {
			return getToken(Decaf.VAR, i);
		}
		public List<TerminalNode> OPENBRACKET() { return getTokens(Decaf.OPENBRACKET); }
		public TerminalNode OPENBRACKET(int i) {
			return getToken(Decaf.OPENBRACKET, i);
		}
		public List<TerminalNode> CLOSEBRACKET() { return getTokens(Decaf.CLOSEBRACKET); }
		public List<TerminalNode> INTLITERAL() { return getTokens(Decaf.INTLITERAL); }
		public List<TerminalNode> VAR() { return getTokens(Decaf.VAR); }
		public List<TerminalNode> COMA() { return getTokens(Decaf.COMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode CLOSEBRACKET(int i) {
			return getToken(Decaf.CLOSEBRACKET, i);
		}
		public TerminalNode COMA(int i) {
			return getToken(Decaf.COMA, i);
		}
		public Field_decliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterField_decli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitField_decli(this);
		}
	}

	public final Field_decliContext field_decli() throws RecognitionException {
		Field_decliContext _localctx = new Field_decliContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_field_decli);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); type();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(39);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(34); match(VAR);
						}
						break;

					case 2:
						{
						{
						setState(35); match(VAR);
						setState(36); match(OPENBRACKET);
						setState(37); match(INTLITERAL);
						setState(38); match(CLOSEBRACKET);
						}
						}
						break;
					}
					}
					setState(41); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==VAR );
				setState(43); match(COMA);
				}
				}
				setState(48);
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

	public static class Method_decliContext extends ParserRuleContext {
		public TerminalNode VAR(int i) {
			return getToken(Decaf.VAR, i);
		}
		public List<TerminalNode> VAR() { return getTokens(Decaf.VAR); }
		public List<TerminalNode> COMA() { return getTokens(Decaf.COMA); }
		public TerminalNode VOID() { return getToken(Decaf.VOID, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode OPENAREN() { return getToken(Decaf.OPENAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COMA(int i) {
			return getToken(Decaf.COMA, i);
		}
		public TerminalNode CLOSEPAREN() { return getToken(Decaf.CLOSEPAREN, 0); }
		public Method_decliContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decli; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_decli(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_decli(this);
		}
	}

	public final Method_decliContext method_decli() throws RecognitionException {
		Method_decliContext _localctx = new Method_decliContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method_decli);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
				{
				setState(49); type();
				}
				break;
			case VOID:
				{
				setState(50); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(53); match(VAR);
			setState(54); match(OPENAREN);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55); type();
					setState(56); match(VAR);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INT || _la==BOOLEAN );
				setState(62); match(COMA);
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69); match(CLOSEPAREN);
			setState(70); block();
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

	public static class BlockContext extends ParserRuleContext {
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(Decaf.CLOSEBRACKET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public TerminalNode OPENBRACE() { return getToken(Decaf.OPENBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(OPENBRACE);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(73); var_decl();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79); body();
			setState(80); match(CLOSEBRACKET);
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

	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR(int i) {
			return getToken(Decaf.VAR, i);
		}
		public TerminalNode SEMICOLON() { return getToken(Decaf.SEMICOLON, 0); }
		public List<TerminalNode> VAR() { return getTokens(Decaf.VAR); }
		public TerminalNode COMA() { return getToken(Decaf.COMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); type();
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83); match(VAR);
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VAR );
			setState(88); match(COMA);
			setState(89); match(SEMICOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(Decaf.BOOLEAN, 0); }
		public TerminalNode INT() { return getToken(Decaf.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOLEAN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGLITERAL || _la==CHARLIT) {
				{
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==STRINGLITERAL || _la==CHARLIT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(98);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60f\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\7\2\25\n\2"+
		"\f\2\16\2\30\13\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3*\n\3\r\3\16\3+\3\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\3\4\3\4\5\4\66\n\4\3\4\3\4\3\4\3\4\3\4\6\4=\n\4\r\4\16\4>\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\4\3\5\3\5\7\5M\n\5\f\5\16\5P\13\5\3\5\3"+
		"\5\3\5\3\6\3\6\6\6W\n\6\r\6\16\6X\3\6\3\6\3\6\3\7\3\7\3\b\7\ba\n\b\f\b"+
		"\16\bd\13\b\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2%&\3\2\35\36i\2\20\3\2\2\2"+
		"\4#\3\2\2\2\6\65\3\2\2\2\bJ\3\2\2\2\nT\3\2\2\2\f]\3\2\2\2\16b\3\2\2\2"+
		"\20\21\7$\2\2\21\22\7#\2\2\22\26\7\33\2\2\23\25\5\4\3\2\24\23\3\2\2\2"+
		"\25\30\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\34\3\2\2\2\30\26\3\2\2\2"+
		"\31\33\5\6\4\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2"+
		"\35\37\3\2\2\2\36\34\3\2\2\2\37 \5\16\b\2 !\7\34\2\2!\"\b\2\1\2\"\3\3"+
		"\2\2\2#\60\5\f\7\2$*\7#\2\2%&\7#\2\2&\'\7\31\2\2\'(\7!\2\2(*\7\32\2\2"+
		")$\3\2\2\2)%\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\7\25\2"+
		"\2.)\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2\2\62\60"+
		"\3\2\2\2\63\66\5\f\7\2\64\66\7\'\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\67"+
		"\3\2\2\2\678\7#\2\28D\7\27\2\29:\5\f\7\2:;\7#\2\2;=\3\2\2\2<9\3\2\2\2"+
		"=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\25\2\2AC\3\2\2\2B<\3\2\2"+
		"\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\30\2\2HI\5\b"+
		"\5\2I\7\3\2\2\2JN\7\33\2\2KM\5\n\6\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\5\16\b\2RS\7\32\2\2S\t\3\2\2\2TV\5\f\7\2"+
		"UW\7#\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\25\2\2"+
		"[\\\7\26\2\2\\\13\3\2\2\2]^\t\2\2\2^\r\3\2\2\2_a\t\3\2\2`_\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2bc\3\2\2\2c\17\3\2\2\2db\3\2\2\2\r\26\34)+\60\65>DNXb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}