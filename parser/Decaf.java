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
		OPENBRACE=25, CLOSEPAREN=22, CLASS=34, XOR=13, COMENT=47, ELSE=44, CHARLIT=28, 
		BOOLEANLITERAL=29, OPENBRACKET=23, FOR=39, SUB=2, INT=35, SEMICOLON=20, 
		NOT=12, MULT=3, MINUSASSIGN=18, INTLITERAL=31, AND=10, COMA=19, BREAK=41, 
		IF=38, NOTEQUAL=15, CLOSEBRACKET=24, BOOLEAN=36, HEXLIT=30, GREATEQ=9, 
		LESSEQ=8, CONTINUE=42, CLOSEBRACE=26, STRINGLITERAL=27, PORC=5, EQUAL=14, 
		OR=11, RETURN=40, ASSIGN=16, PROGRAM=45, GREATTHAT=7, VAR=33, VOID=37, 
		ESPACIOS=46, DECIMALIT=32, DIV=4, PLUSASSIGN=17, OPENAREN=21, CALLOUT=43, 
		LESSTHAT=6, ADD=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
		"'>='", "'&&'", "'||'", "'!'", "'^'", "'=='", "'!='", "'='", "'+='", "'-='", 
		"','", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "STRINGLITERAL", 
		"CHARLIT", "BOOLEANLITERAL", "HEXLIT", "INTLITERAL", "DECIMALIT", "VAR", 
		"CLASS", "INT", "BOOLEAN", "VOID", "IF", "FOR", "RETURN", "BREAK", "CONTINUE", 
		"CALLOUT", "ELSE", "PROGRAM", "ESPACIOS", "COMENT"
	};
	public static final int
		RULE_program = 0, RULE_field_decli = 1, RULE_method_decli = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_statement = 6, RULE_asig_op = 7, 
		RULE_method_call = 8, RULE_method_name = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_callout_args = 12, RULE_bin_op = 13, RULE_arith_op = 14, RULE_rel_op = 15, 
		RULE_eq_op = 16, RULE_cond_op = 17, RULE_literal = 18, RULE_body = 19;
	public static final String[] ruleNames = {
		"program", "field_decli", "method_decli", "block", "var_decl", "type", 
		"statement", "asig_op", "method_call", "method_name", "location", "expr", 
		"callout_args", "bin_op", "arith_op", "rel_op", "eq_op", "cond_op", "literal", 
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
		public Method_decliContext method_decli(int i) {
			return getRuleContext(Method_decliContext.class,i);
		}
		public TerminalNode PROGRAM() { return getToken(Decaf.PROGRAM, 0); }
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
			setState(40); match(CLASS);
			setState(41); match(PROGRAM);
			setState(42); match(OPENBRACE);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(43); field_decli();
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(49); method_decli();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55); match(CLOSEBRACE);
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
		public TerminalNode SEMICOLON() { return getToken(Decaf.SEMICOLON, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58); type();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				setState(79);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(66); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(64);
							switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
							case 1:
								{
								setState(59); match(VAR);
								}
								break;

							case 2:
								{
								{
								setState(60); match(VAR);
								setState(61); match(OPENBRACKET);
								setState(62); match(INTLITERAL);
								setState(63); match(CLOSEBRACKET);
								}
								}
								break;
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(68); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					{
					setState(77);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(70); match(VAR);
						}
						break;

					case 2:
						{
						{
						setState(71); match(VAR);
						setState(72); match(OPENBRACKET);
						setState(73); match(INTLITERAL);
						setState(74); match(CLOSEBRACKET);
						}
						setState(76); match(COMA);
						}
						break;
					}
					}
					}
					break;
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); match(SEMICOLON);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
				{
				setState(86); type();
				}
				break;
			case VOID:
				{
				setState(87); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(90); match(VAR);
			setState(91); match(OPENAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				setState(114);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(101); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(95); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(92); type();
								setState(93); match(VAR);
								}
								}
								setState(97); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==INT || _la==BOOLEAN );
							setState(99); match(COMA);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(103); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					{
					setState(108); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(105); type();
						setState(106); match(VAR);
						}
						}
						setState(110); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==INT || _la==BOOLEAN );
					setState(112); match(COMA);
					}
					}
					break;
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119); match(CLOSEPAREN);
			setState(120); block();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(Decaf.CLOSEBRACKET, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(122); match(OPENBRACE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				{
				setState(123); var_decl();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << VAR) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALLOUT))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(CLOSEBRACKET);
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
		public List<TerminalNode> COMA() { return getTokens(Decaf.COMA); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMA(int i) {
			return getToken(Decaf.COMA, i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137); type();
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				setState(145);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(139); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(138); match(VAR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(141); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					setState(143); match(VAR);
					setState(144); match(COMA);
					}
					break;
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(150); match(SEMICOLON);
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
			setState(152);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ELSE(int i) {
			return getToken(Decaf.ELSE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(Decaf.SEMICOLON, 0); }
		public Asig_opContext asig_op() {
			return getRuleContext(Asig_opContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode BREAK() { return getToken(Decaf.BREAK, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(Decaf.CONTINUE, 0); }
		public TerminalNode IF() { return getToken(Decaf.IF, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<TerminalNode> ELSE() { return getTokens(Decaf.ELSE); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode FOR() { return getToken(Decaf.FOR, 0); }
		public TerminalNode ASSIGN() { return getToken(Decaf.ASSIGN, 0); }
		public TerminalNode VAR() { return getToken(Decaf.VAR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA() { return getToken(Decaf.COMA, 0); }
		public TerminalNode RETURN() { return getToken(Decaf.RETURN, 0); }
		public TerminalNode OPENAREN() { return getToken(Decaf.OPENAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode CLOSEPAREN() { return getToken(Decaf.CLOSEPAREN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(154); location();
				setState(155); asig_op();
				setState(156); expr(0);
				setState(157); match(SEMICOLON);
				}
				}
				break;

			case 2:
				{
				{
				{
				setState(159); method_call();
				}
				setState(160); match(SEMICOLON);
				}
				}
				break;

			case 3:
				{
				{
				setState(162); match(IF);
				setState(163); match(OPENAREN);
				{
				setState(164); expr(0);
				}
				setState(165); match(CLOSEPAREN);
				setState(166); block();
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(167); match(ELSE);
					setState(168); block();
					}
					}
					setState(171); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELSE );
				}
				}
				break;

			case 4:
				{
				{
				setState(173); match(FOR);
				{
				setState(174); match(VAR);
				}
				setState(175); match(ASSIGN);
				{
				setState(176); expr(0);
				}
				setState(177); match(COMA);
				setState(178); expr(0);
				setState(179); block();
				}
				}
				break;

			case 5:
				{
				{
				setState(181); match(BREAK);
				setState(182); match(SEMICOLON);
				}
				}
				break;

			case 6:
				{
				{
				setState(183); match(CONTINUE);
				setState(184); match(SEMICOLON);
				}
				}
				break;

			case 7:
				{
				{
				setState(185); block();
				}
				}
				break;

			case 8:
				{
				{
				setState(186); match(RETURN);
				setState(188); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(187); expr(0);
					}
					}
					setState(190); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << OPENAREN) | (1L << CHARLIT) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << VAR) | (1L << CALLOUT))) != 0) );
				setState(192); match(SEMICOLON);
				}
				}
				break;
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

	public static class Asig_opContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(Decaf.ASSIGN, 0); }
		public TerminalNode MINUSASSIGN() { return getToken(Decaf.MINUSASSIGN, 0); }
		public TerminalNode PLUSASSIGN() { return getToken(Decaf.PLUSASSIGN, 0); }
		public Asig_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asig_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterAsig_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitAsig_op(this);
		}
	}

	public final Asig_opContext asig_op() throws RecognitionException {
		Asig_opContext _localctx = new Asig_opContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asig_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << PLUSASSIGN) | (1L << MINUSASSIGN))) != 0)) ) {
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

	public static class Method_callContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Callout_argsContext callout_args(int i) {
			return getRuleContext(Callout_argsContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Decaf.COMA); }
		public TerminalNode OPENAREN() { return getToken(Decaf.OPENAREN, 0); }
		public List<Callout_argsContext> callout_args() {
			return getRuleContexts(Callout_argsContext.class);
		}
		public TerminalNode STRINGLITERAL() { return getToken(Decaf.STRINGLITERAL, 0); }
		public TerminalNode CALLOUT() { return getToken(Decaf.CALLOUT, 0); }
		public TerminalNode COMA(int i) {
			return getToken(Decaf.COMA, i);
		}
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(Decaf.CLOSEPAREN, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_call);
		try {
			int _alt;
			setState(224);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(198); method_name();
				setState(199); match(OPENAREN);
				setState(204);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(200); expr(0);
					}
					break;

				case 2:
					{
					setState(201); expr(0);
					setState(202); match(COMA);
					}
					break;
				}
				setState(206); match(CLOSEPAREN);
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(CALLOUT);
				setState(209); match(STRINGLITERAL);
				setState(220); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(210); match(COMA);
						setState(217);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(215);
								switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
								case 1:
									{
									setState(211); callout_args();
									}
									break;

								case 2:
									{
									setState(212); callout_args();
									setState(213); match(COMA);
									}
									break;
								}
								} 
							}
							setState(219);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(222); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Method_nameContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(Decaf.VAR, 0); }
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(VAR);
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

	public static class LocationContext extends ParserRuleContext {
		public TerminalNode OPENBRACKET() { return getToken(Decaf.OPENBRACKET, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSEBRACKET() { return getToken(Decaf.CLOSEBRACKET, 0); }
		public TerminalNode VAR() { return getToken(Decaf.VAR, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location);
		try {
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); match(VAR);
				setState(230); match(OPENBRACKET);
				setState(231); expr(0);
				setState(232); match(CLOSEBRACKET);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NOT() { return getToken(Decaf.NOT, 0); }
		public TerminalNode OPENAREN() { return getToken(Decaf.OPENAREN, 0); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode CLOSEPAREN() { return getToken(Decaf.CLOSEPAREN, 0); }
		public TerminalNode SUB() { return getToken(Decaf.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(237); match(SUB);
				setState(238); expr(3);
				}
				break;

			case 2:
				{
				setState(239); match(NOT);
				setState(240); expr(2);
				}
				break;

			case 3:
				{
				setState(241); location();
				}
				break;

			case 4:
				{
				setState(242); method_call();
				}
				break;

			case 5:
				{
				setState(243); literal();
				}
				break;

			case 6:
				{
				setState(244); match(OPENAREN);
				setState(245); expr(0);
				setState(246); match(CLOSEPAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(256);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(250);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(251); bin_op();
					setState(252); expr(5);
					}
					} 
				}
				setState(258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Callout_argsContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRINGLITERAL() { return getToken(Decaf.STRINGLITERAL, 0); }
		public Callout_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCallout_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCallout_args(this);
		}
	}

	public final Callout_argsContext callout_args() throws RecognitionException {
		Callout_argsContext _localctx = new Callout_argsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callout_args);
		try {
			setState(261);
			switch (_input.LA(1)) {
			case SUB:
			case NOT:
			case OPENAREN:
			case CHARLIT:
			case BOOLEANLITERAL:
			case INTLITERAL:
			case VAR:
			case CALLOUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(259); expr(0);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); match(STRINGLITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Bin_opContext extends ParserRuleContext {
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bin_op);
		try {
			setState(267);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULT:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(263); arith_op();
				}
				break;
			case LESSTHAT:
			case GREATTHAT:
			case LESSEQ:
			case GREATEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); rel_op();
				}
				break;
			case EQUAL:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(265); eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(266); cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(Decaf.DIV, 0); }
		public TerminalNode MULT() { return getToken(Decaf.MULT, 0); }
		public TerminalNode SUB() { return getToken(Decaf.SUB, 0); }
		public TerminalNode ADD() { return getToken(Decaf.ADD, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MULT) | (1L << DIV))) != 0)) ) {
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

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode GREATEQ() { return getToken(Decaf.GREATEQ, 0); }
		public TerminalNode LESSEQ() { return getToken(Decaf.LESSEQ, 0); }
		public TerminalNode GREATTHAT() { return getToken(Decaf.GREATTHAT, 0); }
		public TerminalNode LESSTHAT() { return getToken(Decaf.LESSTHAT, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESSTHAT) | (1L << GREATTHAT) | (1L << LESSEQ) | (1L << GREATEQ))) != 0)) ) {
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

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(Decaf.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(Decaf.NOTEQUAL, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_la = _input.LA(1);
			if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
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

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(Decaf.AND, 0); }
		public TerminalNode OR() { return getToken(Decaf.OR, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode CHARLIT() { return getToken(Decaf.CHARLIT, 0); }
		public TerminalNode INTLITERAL() { return getToken(Decaf.INTLITERAL, 0); }
		public TerminalNode BOOLEANLITERAL() { return getToken(Decaf.BOOLEANLITERAL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHARLIT) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL))) != 0)) ) {
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
		enterRule(_localctx, 38, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRINGLITERAL || _la==CHARLIT) {
				{
				{
				setState(279);
				_la = _input.LA(1);
				if ( !(_la==STRINGLITERAL || _la==CHARLIT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(284);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0120\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\7\2/\n\2\f\2\16\2\62\13"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3C\n\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\7\3R\n"+
		"\3\f\3\16\3U\13\3\3\3\3\3\3\4\3\4\5\4[\n\4\3\4\3\4\3\4\3\4\3\4\6\4b\n"+
		"\4\r\4\16\4c\3\4\3\4\6\4h\n\4\r\4\16\4i\3\4\3\4\3\4\6\4o\n\4\r\4\16\4"+
		"p\3\4\3\4\7\4u\n\4\f\4\16\4x\13\4\3\4\3\4\3\4\3\5\3\5\7\5\177\n\5\f\5"+
		"\16\5\u0082\13\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\3\5\3\6\3\6"+
		"\6\6\u008e\n\6\r\6\16\6\u008f\3\6\3\6\7\6\u0094\n\6\f\6\16\6\u0097\13"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\6\b\u00ac\n\b\r\b\16\b\u00ad\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00bf\n\b\r\b\16\b\u00c0\3\b\3\b\5\b"+
		"\u00c5\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00da\n\n\f\n\16\n\u00dd\13\n\6\n\u00df\n\n"+
		"\r\n\16\n\u00e0\5\n\u00e3\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ed"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00fb\n\r\3\r"+
		"\3\r\3\r\3\r\7\r\u0101\n\r\f\r\16\r\u0104\13\r\3\16\3\16\5\16\u0108\n"+
		"\16\3\17\3\17\3\17\3\17\5\17\u010e\n\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\7\25\u011b\n\25\f\25\16\25\u011e\13\25\3\25"+
		"\2\3\30\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\n\3\2%&\3\2"+
		"\22\24\3\2\3\6\3\2\b\13\3\2\20\21\3\2\f\r\4\2\36\37!!\3\2\35\36\u0137"+
		"\2*\3\2\2\2\4<\3\2\2\2\6Z\3\2\2\2\b|\3\2\2\2\n\u008b\3\2\2\2\f\u009a\3"+
		"\2\2\2\16\u00c4\3\2\2\2\20\u00c6\3\2\2\2\22\u00e2\3\2\2\2\24\u00e4\3\2"+
		"\2\2\26\u00ec\3\2\2\2\30\u00fa\3\2\2\2\32\u0107\3\2\2\2\34\u010d\3\2\2"+
		"\2\36\u010f\3\2\2\2 \u0111\3\2\2\2\"\u0113\3\2\2\2$\u0115\3\2\2\2&\u0117"+
		"\3\2\2\2(\u011c\3\2\2\2*+\7$\2\2+,\7/\2\2,\60\7\33\2\2-/\5\4\3\2.-\3\2"+
		"\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\66\3\2\2\2\62\60\3\2\2\2"+
		"\63\65\5\6\4\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67"+
		"9\3\2\2\28\66\3\2\2\29:\7\34\2\2:;\b\2\1\2;\3\3\2\2\2<S\5\f\7\2=C\7#\2"+
		"\2>?\7#\2\2?@\7\31\2\2@A\7!\2\2AC\7\32\2\2B=\3\2\2\2B>\3\2\2\2CE\3\2\2"+
		"\2DB\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GR\3\2\2\2HP\7#\2\2IJ\7#\2\2"+
		"JK\7\31\2\2KL\7!\2\2LM\7\32\2\2MN\3\2\2\2NP\7\25\2\2OH\3\2\2\2OI\3\2\2"+
		"\2PR\3\2\2\2QD\3\2\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2"+
		"\2US\3\2\2\2VW\7\26\2\2W\5\3\2\2\2X[\5\f\7\2Y[\7\'\2\2ZX\3\2\2\2ZY\3\2"+
		"\2\2[\\\3\2\2\2\\]\7#\2\2]v\7\27\2\2^_\5\f\7\2_`\7#\2\2`b\3\2\2\2a^\3"+
		"\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\25\2\2fh\3\2\2\2ga"+
		"\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2ju\3\2\2\2kl\5\f\7\2lm\7#\2\2mo"+
		"\3\2\2\2nk\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\25\2\2"+
		"su\3\2\2\2tg\3\2\2\2tn\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2"+
		"xv\3\2\2\2yz\7\30\2\2z{\5\b\5\2{\7\3\2\2\2|\u0080\7\33\2\2}\177\5\n\6"+
		"\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0086\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\16\b\2\u0084\u0083\3"+
		"\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\32\2\2\u008a\t\3\2\2"+
		"\2\u008b\u0095\5\f\7\2\u008c\u008e\7#\2\2\u008d\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u0092\7#\2\2\u0092\u0094\7\25\2\2\u0093\u008d\3\2\2\2\u0093\u0091\3\2"+
		"\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\26\2\2\u0099\13\3\2\2"+
		"\2\u009a\u009b\t\2\2\2\u009b\r\3\2\2\2\u009c\u009d\5\26\f\2\u009d\u009e"+
		"\5\20\t\2\u009e\u009f\5\30\r\2\u009f\u00a0\7\26\2\2\u00a0\u00c5\3\2\2"+
		"\2\u00a1\u00a2\5\22\n\2\u00a2\u00a3\7\26\2\2\u00a3\u00c5\3\2\2\2\u00a4"+
		"\u00a5\7(\2\2\u00a5\u00a6\7\27\2\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\7"+
		"\30\2\2\u00a8\u00ab\5\b\5\2\u00a9\u00aa\7.\2\2\u00aa\u00ac\5\b\5\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00c5\3\2\2\2\u00af\u00b0\7)\2\2\u00b0\u00b1\7#\2\2\u00b1\u00b2"+
		"\7\22\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4\7\25\2\2\u00b4\u00b5\5\30\r"+
		"\2\u00b5\u00b6\5\b\5\2\u00b6\u00c5\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\u00c5"+
		"\7\26\2\2\u00b9\u00ba\7,\2\2\u00ba\u00c5\7\26\2\2\u00bb\u00c5\5\b\5\2"+
		"\u00bc\u00be\7*\2\2\u00bd\u00bf\5\30\r\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\7\26\2\2\u00c3\u00c5\3\2\2\2\u00c4\u009c\3\2\2\2\u00c4\u00a1\3"+
		"\2\2\2\u00c4\u00a4\3\2\2\2\u00c4\u00af\3\2\2\2\u00c4\u00b7\3\2\2\2\u00c4"+
		"\u00b9\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00bc\3\2\2\2\u00c5\17\3\2\2"+
		"\2\u00c6\u00c7\t\3\2\2\u00c7\21\3\2\2\2\u00c8\u00c9\5\24\13\2\u00c9\u00ce"+
		"\7\27\2\2\u00ca\u00cf\5\30\r\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7\25\2"+
		"\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\u00d0"+
		"\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00e3\3\2\2\2\u00d2\u00d3\7-\2\2\u00d3"+
		"\u00de\7\35\2\2\u00d4\u00db\7\25\2\2\u00d5\u00da\5\32\16\2\u00d6\u00d7"+
		"\5\32\16\2\u00d7\u00d8\7\25\2\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2"+
		"\2\u00d9\u00d6\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00d4\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00c8\3\2\2\2\u00e2\u00d2\3\2\2\2\u00e3\23\3\2\2\2\u00e4\u00e5"+
		"\7#\2\2\u00e5\25\3\2\2\2\u00e6\u00ed\7#\2\2\u00e7\u00e8\7#\2\2\u00e8\u00e9"+
		"\7\31\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\7\32\2\2\u00eb\u00ed\3\2\2"+
		"\2\u00ec\u00e6\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\27\3\2\2\2\u00ee\u00ef"+
		"\b\r\1\2\u00ef\u00f0\7\4\2\2\u00f0\u00fb\5\30\r\5\u00f1\u00f2\7\16\2\2"+
		"\u00f2\u00fb\5\30\r\4\u00f3\u00fb\5\26\f\2\u00f4\u00fb\5\22\n\2\u00f5"+
		"\u00fb\5&\24\2\u00f6\u00f7\7\27\2\2\u00f7\u00f8\5\30\r\2\u00f8\u00f9\7"+
		"\30\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f1\3\2\2\2\u00fa"+
		"\u00f3\3\2\2\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f6\3\2"+
		"\2\2\u00fb\u0102\3\2\2\2\u00fc\u00fd\f\6\2\2\u00fd\u00fe\5\34\17\2\u00fe"+
		"\u00ff\5\30\r\7\u00ff\u0101\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\u0104\3"+
		"\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\31\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0105\u0108\5\30\r\2\u0106\u0108\7\35\2\2\u0107\u0105\3"+
		"\2\2\2\u0107\u0106\3\2\2\2\u0108\33\3\2\2\2\u0109\u010e\5\36\20\2\u010a"+
		"\u010e\5 \21\2\u010b\u010e\5\"\22\2\u010c\u010e\5$\23\2\u010d\u0109\3"+
		"\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e"+
		"\35\3\2\2\2\u010f\u0110\t\4\2\2\u0110\37\3\2\2\2\u0111\u0112\t\5\2\2\u0112"+
		"!\3\2\2\2\u0113\u0114\t\6\2\2\u0114#\3\2\2\2\u0115\u0116\t\7\2\2\u0116"+
		"%\3\2\2\2\u0117\u0118\t\b\2\2\u0118\'\3\2\2\2\u0119\u011b\t\t\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d)\3\2\2\2\u011e\u011c\3\2\2\2\"\60\66BFOQSZciptv\u0080\u0086"+
		"\u008f\u0093\u0095\u00ad\u00c0\u00c4\u00ce\u00d9\u00db\u00e0\u00e2\u00ec"+
		"\u00fa\u0102\u0107\u010d\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}