// Generated from parser/Decaf.g by ANTLR 4.3

	package compiler.parser;
	
	import java.util.Stack;


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
		OPENBRACE=25, CLOSEPAREN=22, CLASS=33, XOR=13, COMENT=47, ELSE=43, CHARLIT=28, 
		BOOLEANLITERAL=29, OPENBRACKET=23, FOR=38, SUB=2, INT=34, SEMICOLON=20, 
		NOT=12, MULT=3, MINUSASSIGN=18, INTLITERAL=31, AND=10, COMA=19, BREAK=40, 
		IF=37, NOTEQUAL=15, CLOSEBRACKET=24, BOOLEAN=35, HEXLIT=30, GREATEQ=9, 
		LESSEQ=8, CONTINUE=41, CLOSEBRACE=26, STRINGLITERAL=27, PORC=5, EQUAL=14, 
		OR=11, RETURN=39, ASSIGN=16, PROGRAM=44, GREATTHAT=7, VAR=45, VOID=36, 
		ESPACIOS=46, DECIMALIT=32, DIV=4, PLUSASSIGN=17, OPENAREN=21, CALLOUT=42, 
		LESSTHAT=6, ADD=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'>'", "'<='", 
		"'>='", "'&&'", "'||'", "'!'", "'^'", "'=='", "'!='", "'='", "'+='", "'-='", 
		"','", "';'", "'('", "')'", "'['", "']'", "'{'", "'}'", "STRINGLITERAL", 
		"CHARLIT", "BOOLEANLITERAL", "HEXLIT", "INTLITERAL", "DECIMALIT", "'class'", 
		"INT", "BOOLEAN", "VOID", "IF", "FOR", "RETURN", "BREAK", "CONTINUE", 
		"CALLOUT", "ELSE", "PROGRAM", "VAR", "ESPACIOS", "COMENT"
	};
	public static final int
		RULE_programa = 0, RULE_field_decli = 1, RULE_method_decli = 2, RULE_block = 3, 
		RULE_var_decl = 4, RULE_type = 5, RULE_statement = 6, RULE_asig_op = 7, 
		RULE_method_call = 8, RULE_method_name = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_callout_args = 12, RULE_bin_op = 13, RULE_arith_op = 14, RULE_rel_op = 15, 
		RULE_eq_op = 16, RULE_cond_op = 17, RULE_literal = 18;
	public static final String[] ruleNames = {
		"programa", "field_decli", "method_decli", "block", "var_decl", "type", 
		"statement", "asig_op", "method_call", "method_name", "location", "expr", 
		"callout_args", "bin_op", "arith_op", "rel_op", "eq_op", "cond_op", "literal"
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


	public  Stack treeParse = new Stack();
		
	public String lineaParse = "";
		
		
		public void Tree(String lexema){
				lineaParse = lexema;
				treeParse.push(lineaParse);
		;}
		
		public void emitErrorMessage(String msg)
		{
			
		}

	public Decaf(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
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
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafListener ) ((DecafListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(38); match(CLASS);
			setState(39); match(PROGRAM);
			setState(40); match(OPENBRACE);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41); field_decli();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				{
				setState(47); method_decli();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53); match(CLOSEBRACE);
			Tree("programa");
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
			setState(56); type();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				setState(77);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(64); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(62);
							switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
							case 1:
								{
								setState(57); match(VAR);
								}
								break;

							case 2:
								{
								{
								setState(58); match(VAR);
								setState(59); match(OPENBRACKET);
								setState(60); match(INTLITERAL);
								setState(61); match(CLOSEBRACKET);
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
						setState(66); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					{
					setState(75);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(68); match(VAR);
						}
						break;

					case 2:
						{
						{
						setState(69); match(VAR);
						setState(70); match(OPENBRACKET);
						setState(71); match(INTLITERAL);
						setState(72); match(CLOSEBRACKET);
						}
						setState(74); match(COMA);
						}
						break;
					}
					}
					}
					break;
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82); match(SEMICOLON);
			Tree("field_decli");
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
			setState(87);
			switch (_input.LA(1)) {
			case INT:
			case BOOLEAN:
				{
				setState(85); type();
				}
				break;
			case VOID:
				{
				setState(86); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89); match(VAR);
			setState(90); match(OPENAREN);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOOLEAN) {
				{
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(100); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(94); 
							_errHandler.sync(this);
							_la = _input.LA(1);
							do {
								{
								{
								setState(91); type();
								setState(92); match(VAR);
								}
								}
								setState(96); 
								_errHandler.sync(this);
								_la = _input.LA(1);
							} while ( _la==INT || _la==BOOLEAN );
							setState(98); match(COMA);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(102); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					{
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(104); type();
						setState(105); match(VAR);
						}
						}
						setState(109); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==INT || _la==BOOLEAN );
					setState(111); match(COMA);
					}
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118); match(CLOSEPAREN);
			setState(119); block();
			Tree("method_decli");
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
		public TerminalNode CLOSEBRACE() { return getToken(Decaf.CLOSEBRACE, 0); }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPENBRACE) | (1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << BREAK) | (1L << CONTINUE) | (1L << CALLOUT) | (1L << VAR))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135); match(CLOSEBRACE);
			Tree("block");
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
			setState(138); type();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				setState(146);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(140); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(139); match(VAR);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(142); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;

				case 2:
					{
					setState(144); match(VAR);
					setState(145); match(COMA);
					}
					break;
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151); match(SEMICOLON);
			Tree("var_decl");
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
			setState(154);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOLEAN) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			Tree("type");
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
			setState(197);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(157); location();
				setState(158); asig_op();
				setState(159); expr(0);
				setState(160); match(SEMICOLON);
				}
				}
				break;

			case 2:
				{
				{
				{
				setState(162); method_call();
				}
				setState(163); match(SEMICOLON);
				}
				}
				break;

			case 3:
				{
				{
				setState(165); match(IF);
				setState(166); match(OPENAREN);
				{
				setState(167); expr(0);
				}
				setState(168); match(CLOSEPAREN);
				setState(169); block();
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170); match(ELSE);
					setState(171); block();
					}
					}
					setState(174); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELSE );
				}
				}
				break;

			case 4:
				{
				{
				setState(176); match(FOR);
				{
				setState(177); match(VAR);
				}
				setState(178); match(ASSIGN);
				{
				setState(179); expr(0);
				}
				setState(180); match(COMA);
				setState(181); expr(0);
				setState(182); block();
				}
				}
				break;

			case 5:
				{
				{
				setState(184); match(BREAK);
				setState(185); match(SEMICOLON);
				}
				}
				break;

			case 6:
				{
				{
				setState(186); match(CONTINUE);
				setState(187); match(SEMICOLON);
				}
				}
				break;

			case 7:
				{
				{
				setState(188); block();
				}
				}
				break;

			case 8:
				{
				{
				setState(189); match(RETURN);
				setState(191); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(190); expr(0);
					}
					}
					setState(193); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NOT) | (1L << OPENAREN) | (1L << CHARLIT) | (1L << BOOLEANLITERAL) | (1L << INTLITERAL) | (1L << CALLOUT) | (1L << VAR))) != 0) );
				setState(195); match(SEMICOLON);
				}
				}
				break;
			}
			Tree("statement");
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
		try {
			setState(205);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); match(ASSIGN);
				}
				break;
			case PLUSASSIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(202); match(PLUSASSIGN);
				}
				break;
			case MINUSASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(203); match(MINUSASSIGN);
				Tree("asig_op");
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
			setState(234);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(207); method_name();
				setState(208); match(OPENAREN);
				setState(213);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(209); expr(0);
					}
					break;

				case 2:
					{
					setState(210); expr(0);
					setState(211); match(COMA);
					}
					break;
				}
				setState(215); match(CLOSEPAREN);
				}
				}
				break;
			case CALLOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(CALLOUT);
				setState(218); match(STRINGLITERAL);
				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(219); match(COMA);
						setState(226);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								setState(224);
								switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
								case 1:
									{
									setState(220); callout_args();
									}
									break;

								case 2:
									{
									setState(221); callout_args();
									setState(222); match(COMA);
									}
									break;
								}
								} 
							}
							setState(228);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				Tree("method_call");
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
			setState(236); match(VAR);
			Tree("method_name");
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
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); match(VAR);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); match(VAR);
				setState(241); match(OPENBRACKET);
				setState(242); expr(0);
				setState(243); match(CLOSEBRACKET);
				Tree("location");
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
			setState(261);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(249); match(SUB);
				setState(250); expr(3);
				}
				break;

			case 2:
				{
				setState(251); match(NOT);
				setState(252); expr(2);
				}
				break;

			case 3:
				{
				setState(253); location();
				}
				break;

			case 4:
				{
				setState(254); method_call();
				}
				break;

			case 5:
				{
				setState(255); literal();
				}
				break;

			case 6:
				{
				setState(256); match(OPENAREN);
				setState(257); expr(0);
				setState(258); match(CLOSEPAREN);
				Tree("expr");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(263);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(264); bin_op();
					setState(265); expr(5);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			setState(275);
			switch (_input.LA(1)) {
			case SUB:
			case NOT:
			case OPENAREN:
			case CHARLIT:
			case BOOLEANLITERAL:
			case INTLITERAL:
			case CALLOUT:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); expr(0);
				}
				break;
			case STRINGLITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(STRINGLITERAL);
				Tree("callout_args");
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
			setState(283);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
			case MULT:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); arith_op();
				}
				break;
			case LESSTHAT:
			case GREATTHAT:
			case LESSEQ:
			case GREATEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(278); rel_op();
				}
				break;
			case EQUAL:
			case NOTEQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(279); eq_op();
				}
				break;
			case AND:
			case OR:
				enterOuterAlt(_localctx, 4);
				{
				setState(280); cond_op();
				Tree("bin_op");
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
		try {
			setState(290);
			switch (_input.LA(1)) {
			case ADD:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(ADD);
				}
				break;
			case SUB:
				enterOuterAlt(_localctx, 2);
				{
				setState(286); match(SUB);
				}
				break;
			case MULT:
				enterOuterAlt(_localctx, 3);
				{
				setState(287); match(MULT);
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 4);
				{
				setState(288); match(DIV);
				Tree("arith_op");
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
		try {
			setState(297);
			switch (_input.LA(1)) {
			case LESSTHAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); match(LESSTHAT);
				}
				break;
			case GREATTHAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(293); match(GREATTHAT);
				}
				break;
			case LESSEQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(294); match(LESSEQ);
				}
				break;
			case GREATEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(295); match(GREATEQ);
				Tree("rel_op");
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
		try {
			setState(302);
			switch (_input.LA(1)) {
			case EQUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(299); match(EQUAL);
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(300); match(NOTEQUAL);
				Tree("eq_op");
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
		try {
			setState(307);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(304); match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				setState(305); match(OR);
				Tree("cond_op");
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
		try {
			setState(313);
			switch (_input.LA(1)) {
			case INTLITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(309); match(INTLITERAL);
				}
				break;
			case CHARLIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(CHARLIT);
				}
				break;
			case BOOLEANLITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(311); match(BOOLEANLITERAL);
				Tree("literal");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u013e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\7\2-\n\2\f\2\16\2\60\13\2\3\2\7\2"+
		"\63\n\2\f\2\16\2\66\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\6\3C\n\3\r\3\16\3D\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\7\3P\n\3\f\3"+
		"\16\3S\13\3\3\3\3\3\3\3\3\4\3\4\5\4Z\n\4\3\4\3\4\3\4\3\4\3\4\6\4a\n\4"+
		"\r\4\16\4b\3\4\3\4\6\4g\n\4\r\4\16\4h\3\4\3\4\3\4\6\4n\n\4\r\4\16\4o\3"+
		"\4\3\4\7\4t\n\4\f\4\16\4w\13\4\3\4\3\4\3\4\3\4\3\5\3\5\7\5\177\n\5\f\5"+
		"\16\5\u0082\13\5\3\5\7\5\u0085\n\5\f\5\16\5\u0088\13\5\3\5\3\5\3\5\3\6"+
		"\3\6\6\6\u008f\n\6\r\6\16\6\u0090\3\6\3\6\7\6\u0095\n\6\f\6\16\6\u0098"+
		"\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\6\b\u00af\n\b\r\b\16\b\u00b0\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u00c2\n\b\r\b\16\b\u00c3"+
		"\3\b\3\b\5\b\u00c8\n\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00d0\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00d8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00e3"+
		"\n\n\f\n\16\n\u00e6\13\n\6\n\u00e8\n\n\r\n\16\n\u00e9\3\n\5\n\u00ed\n"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f9\n\f\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0108\n\r\3\r\3\r\3\r\3"+
		"\r\7\r\u010e\n\r\f\r\16\r\u0111\13\r\3\16\3\16\3\16\5\16\u0116\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u011e\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0125\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u012c\n\21\3\22\3\22\3"+
		"\22\5\22\u0131\n\22\3\23\3\23\3\23\5\23\u0136\n\23\3\24\3\24\3\24\3\24"+
		"\5\24\u013c\n\24\3\24\2\3\30\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&\2\3\3\2$%\u0161\2(\3\2\2\2\4:\3\2\2\2\6Y\3\2\2\2\b|\3\2\2\2\n\u008c"+
		"\3\2\2\2\f\u009c\3\2\2\2\16\u00c7\3\2\2\2\20\u00cf\3\2\2\2\22\u00ec\3"+
		"\2\2\2\24\u00ee\3\2\2\2\26\u00f8\3\2\2\2\30\u0107\3\2\2\2\32\u0115\3\2"+
		"\2\2\34\u011d\3\2\2\2\36\u0124\3\2\2\2 \u012b\3\2\2\2\"\u0130\3\2\2\2"+
		"$\u0135\3\2\2\2&\u013b\3\2\2\2()\7#\2\2)*\7.\2\2*.\7\33\2\2+-\5\4\3\2"+
		",+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61"+
		"\63\5\6\4\2\62\61\3\2\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\67\3\2\2\2\66\64\3\2\2\2\678\7\34\2\289\b\2\1\29\3\3\2\2\2:Q\5\f\7\2"+
		";A\7/\2\2<=\7/\2\2=>\7\31\2\2>?\7!\2\2?A\7\32\2\2@;\3\2\2\2@<\3\2\2\2"+
		"AC\3\2\2\2B@\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2\2EP\3\2\2\2FN\7/\2\2"+
		"GH\7/\2\2HI\7\31\2\2IJ\7!\2\2JK\7\32\2\2KL\3\2\2\2LN\7\25\2\2MF\3\2\2"+
		"\2MG\3\2\2\2NP\3\2\2\2OB\3\2\2\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2"+
		"\2RT\3\2\2\2SQ\3\2\2\2TU\7\26\2\2UV\b\3\1\2V\5\3\2\2\2WZ\5\f\7\2XZ\7&"+
		"\2\2YW\3\2\2\2YX\3\2\2\2Z[\3\2\2\2[\\\7/\2\2\\u\7\27\2\2]^\5\f\7\2^_\7"+
		"/\2\2_a\3\2\2\2`]\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\7"+
		"\25\2\2eg\3\2\2\2f`\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2it\3\2\2\2jk"+
		"\5\f\7\2kl\7/\2\2ln\3\2\2\2mj\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq"+
		"\3\2\2\2qr\7\25\2\2rt\3\2\2\2sf\3\2\2\2sm\3\2\2\2tw\3\2\2\2us\3\2\2\2"+
		"uv\3\2\2\2vx\3\2\2\2wu\3\2\2\2xy\7\30\2\2yz\5\b\5\2z{\b\4\1\2{\7\3\2\2"+
		"\2|\u0080\7\33\2\2}\177\5\n\6\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0086\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\5\16\b\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3"+
		"\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008a\7\34\2\2\u008a\u008b\b\5\1\2\u008b\t\3\2\2\2\u008c\u0096\5\f\7"+
		"\2\u008d\u008f\7/\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0095\3\2\2\2\u0092\u0093\7/\2\2\u0093"+
		"\u0095\7\25\2\2\u0094\u008e\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\26\2\2\u009a\u009b\b\6\1\2\u009b\13\3\2\2"+
		"\2\u009c\u009d\t\2\2\2\u009d\u009e\b\7\1\2\u009e\r\3\2\2\2\u009f\u00a0"+
		"\5\26\f\2\u00a0\u00a1\5\20\t\2\u00a1\u00a2\5\30\r\2\u00a2\u00a3\7\26\2"+
		"\2\u00a3\u00c8\3\2\2\2\u00a4\u00a5\5\22\n\2\u00a5\u00a6\7\26\2\2\u00a6"+
		"\u00c8\3\2\2\2\u00a7\u00a8\7\'\2\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5"+
		"\30\r\2\u00aa\u00ab\7\30\2\2\u00ab\u00ae\5\b\5\2\u00ac\u00ad\7-\2\2\u00ad"+
		"\u00af\5\b\5\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00c8\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3"+
		"\u00b4\7/\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\30\r\2\u00b6\u00b7\7"+
		"\25\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00b9\5\b\5\2\u00b9\u00c8\3\2\2\2\u00ba"+
		"\u00bb\7*\2\2\u00bb\u00c8\7\26\2\2\u00bc\u00bd\7+\2\2\u00bd\u00c8\7\26"+
		"\2\2\u00be\u00c8\5\b\5\2\u00bf\u00c1\7)\2\2\u00c0\u00c2\5\30\r\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u009f\3\2\2\2\u00c7\u00a4\3\2\2\2\u00c7\u00a7\3\2\2\2\u00c7\u00b2\3\2"+
		"\2\2\u00c7\u00ba\3\2\2\2\u00c7\u00bc\3\2\2\2\u00c7\u00be\3\2\2\2\u00c7"+
		"\u00bf\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\b\1\2\u00ca\17\3\2\2"+
		"\2\u00cb\u00d0\7\22\2\2\u00cc\u00d0\7\23\2\2\u00cd\u00ce\7\24\2\2\u00ce"+
		"\u00d0\b\t\1\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2"+
		"\2\2\u00d0\21\3\2\2\2\u00d1\u00d2\5\24\13\2\u00d2\u00d7\7\27\2\2\u00d3"+
		"\u00d8\5\30\r\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6\7\25\2\2\u00d6\u00d8"+
		"\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00da\7\30\2\2\u00da\u00ed\3\2\2\2\u00db\u00dc\7,\2\2\u00dc\u00e7\7\35"+
		"\2\2\u00dd\u00e4\7\25\2\2\u00de\u00e3\5\32\16\2\u00df\u00e0\5\32\16\2"+
		"\u00e0\u00e1\7\25\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00de\3\2\2\2\u00e2\u00df"+
		"\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ed\b\n\1\2\u00ec\u00d1\3\2\2\2\u00ec\u00db\3\2\2\2\u00ed\23\3\2\2"+
		"\2\u00ee\u00ef\7/\2\2\u00ef\u00f0\b\13\1\2\u00f0\25\3\2\2\2\u00f1\u00f9"+
		"\7/\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4\7\31\2\2\u00f4\u00f5\5\30\r\2\u00f5"+
		"\u00f6\7\32\2\2\u00f6\u00f7\b\f\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00f1\3"+
		"\2\2\2\u00f8\u00f2\3\2\2\2\u00f9\27\3\2\2\2\u00fa\u00fb\b\r\1\2\u00fb"+
		"\u00fc\7\4\2\2\u00fc\u0108\5\30\r\5\u00fd\u00fe\7\16\2\2\u00fe\u0108\5"+
		"\30\r\4\u00ff\u0108\5\26\f\2\u0100\u0108\5\22\n\2\u0101\u0108\5&\24\2"+
		"\u0102\u0103\7\27\2\2\u0103\u0104\5\30\r\2\u0104\u0105\7\30\2\2\u0105"+
		"\u0106\b\r\1\2\u0106\u0108\3\2\2\2\u0107\u00fa\3\2\2\2\u0107\u00fd\3\2"+
		"\2\2\u0107\u00ff\3\2\2\2\u0107\u0100\3\2\2\2\u0107\u0101\3\2\2\2\u0107"+
		"\u0102\3\2\2\2\u0108\u010f\3\2\2\2\u0109\u010a\f\6\2\2\u010a\u010b\5\34"+
		"\17\2\u010b\u010c\5\30\r\7\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\31\3\2\2"+
		"\2\u0111\u010f\3\2\2\2\u0112\u0116\5\30\r\2\u0113\u0114\7\35\2\2\u0114"+
		"\u0116\b\16\1\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0116\33\3\2\2"+
		"\2\u0117\u011e\5\36\20\2\u0118\u011e\5 \21\2\u0119\u011e\5\"\22\2\u011a"+
		"\u011b\5$\23\2\u011b\u011c\b\17\1\2\u011c\u011e\3\2\2\2\u011d\u0117\3"+
		"\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011e"+
		"\35\3\2\2\2\u011f\u0125\7\3\2\2\u0120\u0125\7\4\2\2\u0121\u0125\7\5\2"+
		"\2\u0122\u0123\7\6\2\2\u0123\u0125\b\20\1\2\u0124\u011f\3\2\2\2\u0124"+
		"\u0120\3\2\2\2\u0124\u0121\3\2\2\2\u0124\u0122\3\2\2\2\u0125\37\3\2\2"+
		"\2\u0126\u012c\7\b\2\2\u0127\u012c\7\t\2\2\u0128\u012c\7\n\2\2\u0129\u012a"+
		"\7\13\2\2\u012a\u012c\b\21\1\2\u012b\u0126\3\2\2\2\u012b\u0127\3\2\2\2"+
		"\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012c!\3\2\2\2\u012d\u0131\7"+
		"\20\2\2\u012e\u012f\7\21\2\2\u012f\u0131\b\22\1\2\u0130\u012d\3\2\2\2"+
		"\u0130\u012e\3\2\2\2\u0131#\3\2\2\2\u0132\u0136\7\f\2\2\u0133\u0134\7"+
		"\r\2\2\u0134\u0136\b\23\1\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0136"+
		"%\3\2\2\2\u0137\u013c\7!\2\2\u0138\u013c\7\36\2\2\u0139\u013a\7\37\2\2"+
		"\u013a\u013c\b\24\1\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013c\'\3\2\2\2\'.\64@DMOQYbhosu\u0080\u0086\u0090\u0094\u0096"+
		"\u00b0\u00c3\u00c7\u00cf\u00d7\u00e2\u00e4\u00e9\u00ec\u00f8\u0107\u010f"+
		"\u0115\u011d\u0124\u012b\u0130\u0135\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}