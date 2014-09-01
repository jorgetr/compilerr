// Generated from scanner/DecafLexer.g by ANTLR 4.3

  package compiler.scanner;
  import java.util.LinkedList;

;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, MULT=3, DIV=4, PORC=5, LESSTHAT=6, GREATTHAT=7, LESSEQ=8, 
		GREATEQ=9, AND=10, OR=11, NOT=12, XOR=13, EQUAL=14, NOTEQUAL=15, ASSIGN=16, 
		PLUSASSIGN=17, MINUSASSIGN=18, COMA=19, SEMICOLON=20, OPENAREN=21, CLOSEPAREN=22, 
		OPENBRACKET=23, CLOSEBRACKET=24, OPENBRACE=25, CLOSEBRACE=26, STRINGLITERAL=27, 
		CHARLIT=28, BOOLEANLITERAL=29, HEXLIT=30, INTLITERAL=31, DECIMALIT=32, 
		CLASS=33, INT=34, BOOLEAN=35, VOID=36, IF=37, FOR=38, RETURN=39, BREAK=40, 
		CONTINUE=41, CALLOUT=42, ELSE=43, PROGRAM=44, VAR=45, ESPACIOS=46, COMENT=47;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'"
	};
	public static final String[] ruleNames = {
		"DIGIT", "HEX", "LETTER", "SIGNO", "ESC", "ADD", "SUB", "MULT", "DIV", 
		"PORC", "LESSTHAT", "GREATTHAT", "LESSEQ", "GREATEQ", "AND", "OR", "NOT", 
		"XOR", "EQUAL", "NOTEQUAL", "ASSIGN", "PLUSASSIGN", "MINUSASSIGN", "COMA", 
		"SEMICOLON", "OPENAREN", "CLOSEPAREN", "OPENBRACKET", "CLOSEBRACKET", 
		"OPENBRACE", "CLOSEBRACE", "STRINGLITERAL", "CHARLIT", "BOOLEANLITERAL", 
		"HEXLIT", "INTLITERAL", "DECIMALIT", "CLASS", "INT", "BOOLEAN", "VOID", 
		"IF", "FOR", "RETURN", "BREAK", "CONTINUE", "CALLOUT", "ELSE", "PROGRAM", 
		"VAR", "ESPACIOS", "COMENT"
	};


		
		
		public String token = "";
		
		public void LisToken(int number, String name,String lexema){
				token = number+" "+lexema+" "+name;
			
		}


	public LinkedList error = new LinkedList();
		
		public void reportError(java.lang.String s)
		{
			error.add(s);
		}


	public DecafLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DecafLexer.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 5: ADD_action((RuleContext)_localctx, actionIndex); break;

		case 6: SUB_action((RuleContext)_localctx, actionIndex); break;

		case 7: MULT_action((RuleContext)_localctx, actionIndex); break;

		case 8: DIV_action((RuleContext)_localctx, actionIndex); break;

		case 9: PORC_action((RuleContext)_localctx, actionIndex); break;

		case 10: LESSTHAT_action((RuleContext)_localctx, actionIndex); break;

		case 11: GREATTHAT_action((RuleContext)_localctx, actionIndex); break;

		case 12: LESSEQ_action((RuleContext)_localctx, actionIndex); break;

		case 13: GREATEQ_action((RuleContext)_localctx, actionIndex); break;

		case 14: AND_action((RuleContext)_localctx, actionIndex); break;

		case 15: OR_action((RuleContext)_localctx, actionIndex); break;

		case 16: NOT_action((RuleContext)_localctx, actionIndex); break;

		case 17: XOR_action((RuleContext)_localctx, actionIndex); break;

		case 18: EQUAL_action((RuleContext)_localctx, actionIndex); break;

		case 19: NOTEQUAL_action((RuleContext)_localctx, actionIndex); break;

		case 20: ASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 21: PLUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 22: MINUSASSIGN_action((RuleContext)_localctx, actionIndex); break;

		case 23: COMA_action((RuleContext)_localctx, actionIndex); break;

		case 24: SEMICOLON_action((RuleContext)_localctx, actionIndex); break;

		case 25: OPENAREN_action((RuleContext)_localctx, actionIndex); break;

		case 26: CLOSEPAREN_action((RuleContext)_localctx, actionIndex); break;

		case 27: OPENBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 28: CLOSEBRACKET_action((RuleContext)_localctx, actionIndex); break;

		case 29: OPENBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 30: CLOSEBRACE_action((RuleContext)_localctx, actionIndex); break;

		case 31: STRINGLITERAL_action((RuleContext)_localctx, actionIndex); break;

		case 32: CHARLIT_action((RuleContext)_localctx, actionIndex); break;

		case 33: BOOLEANLITERAL_action((RuleContext)_localctx, actionIndex); break;

		case 34: HEXLIT_action((RuleContext)_localctx, actionIndex); break;

		case 35: INTLITERAL_action((RuleContext)_localctx, actionIndex); break;

		case 36: DECIMALIT_action((RuleContext)_localctx, actionIndex); break;

		case 37: CLASS_action((RuleContext)_localctx, actionIndex); break;

		case 38: INT_action((RuleContext)_localctx, actionIndex); break;

		case 39: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 40: VOID_action((RuleContext)_localctx, actionIndex); break;

		case 41: IF_action((RuleContext)_localctx, actionIndex); break;

		case 42: FOR_action((RuleContext)_localctx, actionIndex); break;

		case 43: RETURN_action((RuleContext)_localctx, actionIndex); break;

		case 44: BREAK_action((RuleContext)_localctx, actionIndex); break;

		case 45: CONTINUE_action((RuleContext)_localctx, actionIndex); break;

		case 46: CALLOUT_action((RuleContext)_localctx, actionIndex); break;

		case 47: ELSE_action((RuleContext)_localctx, actionIndex); break;

		case 48: PROGRAM_action((RuleContext)_localctx, actionIndex); break;

		case 49: VAR_action((RuleContext)_localctx, actionIndex); break;

		case 50: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 51: COMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void OPENBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: LisToken(getLine(),getText(),"OPENBRACE"); break;
		}
	}
	private void CLOSEPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: LisToken(getLine(),getText(),"CLOSEPAREN"); break;
		}
	}
	private void CLASS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: LisToken(getLine(),getText(),"CLASS"); break;
		}
	}
	private void XOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: LisToken(getLine(),getText(),"XOR"); break;
		}
	}
	private void COMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 46: skip(); break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42: LisToken(getLine(),getText(),"ELSE"); break;
		}
	}
	private void CHARLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: LisToken(getLine(),getText(),"CHARLIT"); break;
		}
	}
	private void BOOLEANLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: LisToken(getLine(),getText(),"BOOLEANLITERAL"); break;
		}
	}
	private void OPENBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: LisToken(getLine(),getText(),"OPENBRACKET"); break;
		}
	}
	private void FOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 37: LisToken(getLine(),getText(),"FOR"); break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: LisToken(getLine(),getText(),"SUB"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: LisToken(getLine(),getText(),"INT"); break;
		}
	}
	private void SEMICOLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: LisToken(getLine(),getText(),"SEMICOLON"); break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: LisToken(getLine(),getText(),"NOT"); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: LisToken(getLine(),getText(),"MULT"); break;
		}
	}
	private void MINUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: LisToken(getLine(),getText(),"MINUSASSIGN"); break;
		}
	}
	private void INTLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: LisToken(getLine(),getText(),"INTLITERAL"); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: LisToken(getLine(),getText(),"AND"); break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: LisToken(getLine(),getText(),"COMA"); break;
		}
	}
	private void BREAK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 39: LisToken(getLine(),getText(),"BREAK"); break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 36: LisToken(getLine(),getText(),"IF"); break;
		}
	}
	private void NOTEQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: LisToken(getLine(),getText(),"NOTEQUAL"); break;
		}
	}
	private void CLOSEBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: LisToken(getLine(),getText(),"CLOSEBRACKET"); break;
		}
	}
	private void BOOLEAN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: LisToken(getLine(),getText(),"BOOLEAN"); break;
		}
	}
	private void HEXLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: LisToken(getLine(),getText(),"HEXLIT"); break;
		}
	}
	private void GREATEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: LisToken(getLine(),getText(),"GREATEQ"); break;
		}
	}
	private void LESSEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: LisToken(getLine(),getText(),"LESSEQ"); break;
		}
	}
	private void CONTINUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 40: LisToken(getLine(),getText(),"CONTINUE"); break;
		}
	}
	private void CLOSEBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: LisToken(getLine(),getText(),"CLOSEBRACE"); break;
		}
	}
	private void STRINGLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: LisToken(getLine(),getText(),"STRINGLITERAL"); break;
		}
	}
	private void PORC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: LisToken(getLine(),getText(),"MOD"); break;
		}
	}
	private void EQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: LisToken(getLine(),getText(),"EQUAL"); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: LisToken(getLine(),getText(),"OR"); break;
		}
	}
	private void RETURN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 38: LisToken(getLine(),getText(),"RETURN"); break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: LisToken(getLine(),getText(),"ASSIGN"); break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43: LisToken(getLine(),getText(),"PROGRAM"); break;
		}
	}
	private void GREATTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: LisToken(getLine(),getText(),"GREATTHAT"); break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44: LisToken(getLine(),getText(),"VAR"); break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: LisToken(getLine(),getText(),"VOID"); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45:  skip() ; break;
		}
	}
	private void DECIMALIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: LisToken(getLine(),getText(),"DECIMALIT"); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: LisToken(getLine(),getText(),"DIV"); break;
		}
	}
	private void PLUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: LisToken(getLine(),getText(),"PLUSASSIGN"); break;
		}
	}
	private void OPENAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: LisToken(getLine(),getText(),"OPENAREN"); break;
		}
	}
	private void CALLOUT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: LisToken(getLine(),getText(),"CALLOUT"); break;
		}
	}
	private void LESSTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: LisToken(getLine(),getText(),"LESSTHAT"); break;
		}
	}
	private void ADD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: LisToken(getLine(),getText(),"ADD"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\61\u019e\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\3\2\3\2\3\3\5\3o\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u00d9\n!\f!\16!\u00dc\13!\3!\3!\3!"+
		"\3\"\3\"\3\"\5\"\u00e4\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00f2"+
		"\n#\3#\3#\3$\3$\3$\3$\5$\u00fa\n$\3$\3$\7$\u00fe\n$\f$\16$\u0101\13$\3"+
		"$\3$\3%\6%\u0106\n%\r%\16%\u0107\3%\3%\3%\6%\u010d\n%\r%\16%\u010e\5%"+
		"\u0111\n%\3%\3%\3&\3&\7&\u0117\n&\f&\16&\u011a\13&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*"+
		"\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-"+
		"\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63"+
		"\5\63\u0181\n\63\3\63\3\63\3\63\7\63\u0186\n\63\f\63\16\63\u0189\13\63"+
		"\3\63\3\63\3\64\6\64\u018e\n\64\r\64\16\64\u018f\3\64\3\64\3\65\3\65\3"+
		"\65\3\65\7\65\u0198\n\65\f\65\16\65\u019b\13\65\3\65\3\65\2\2\66\3\2\5"+
		"\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#"+
		"\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A"+
		"\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61\3\2\13\4\2CHch\4"+
		"\2C\\c|\4\2--//\n\2$$))^^ddhhppttvv\5\2$$))^^\6\2\13\f$$))^^\4\2ZZzz\5"+
		"\2\13\f\17\17\"\"\4\2\f\f\17\17\u01a9\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\3k\3\2\2\2\5n\3\2\2\2\7p\3\2\2\2\tr\3\2\2\2"+
		"\13t\3\2\2\2\rw\3\2\2\2\17z\3\2\2\2\21}\3\2\2\2\23\u0080\3\2\2\2\25\u0083"+
		"\3\2\2\2\27\u0086\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3\2\2\2\35\u0091\3"+
		"\2\2\2\37\u0096\3\2\2\2!\u009b\3\2\2\2#\u00a0\3\2\2\2%\u00a3\3\2\2\2\'"+
		"\u00a6\3\2\2\2)\u00ab\3\2\2\2+\u00b0\3\2\2\2-\u00b3\3\2\2\2/\u00b8\3\2"+
		"\2\2\61\u00bd\3\2\2\2\63\u00c0\3\2\2\2\65\u00c3\3\2\2\2\67\u00c6\3\2\2"+
		"\29\u00c9\3\2\2\2;\u00cc\3\2\2\2=\u00cf\3\2\2\2?\u00d2\3\2\2\2A\u00d5"+
		"\3\2\2\2C\u00e0\3\2\2\2E\u00f1\3\2\2\2G\u00f5\3\2\2\2I\u0110\3\2\2\2K"+
		"\u0114\3\2\2\2M\u011d\3\2\2\2O\u0125\3\2\2\2Q\u012b\3\2\2\2S\u0135\3\2"+
		"\2\2U\u013c\3\2\2\2W\u0141\3\2\2\2Y\u0147\3\2\2\2[\u0150\3\2\2\2]\u0158"+
		"\3\2\2\2_\u0163\3\2\2\2a\u016d\3\2\2\2c\u0174\3\2\2\2e\u0180\3\2\2\2g"+
		"\u018d\3\2\2\2i\u0193\3\2\2\2kl\4\62;\2l\4\3\2\2\2mo\t\2\2\2nm\3\2\2\2"+
		"o\6\3\2\2\2pq\t\3\2\2q\b\3\2\2\2rs\t\4\2\2s\n\3\2\2\2tu\7^\2\2uv\t\5\2"+
		"\2v\f\3\2\2\2wx\7-\2\2xy\b\7\2\2y\16\3\2\2\2z{\7/\2\2{|\b\b\3\2|\20\3"+
		"\2\2\2}~\7,\2\2~\177\b\t\4\2\177\22\3\2\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\b\n\5\2\u0082\24\3\2\2\2\u0083\u0084\7\'\2\2\u0084\u0085\b\13\6"+
		"\2\u0085\26\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\b\f\7\2\u0088\30\3"+
		"\2\2\2\u0089\u008a\7@\2\2\u008a\u008b\b\r\b\2\u008b\32\3\2\2\2\u008c\u008d"+
		"\7>\2\2\u008d\u008e\7?\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\16\t\2\u0090"+
		"\34\3\2\2\2\u0091\u0092\7@\2\2\u0092\u0093\7?\2\2\u0093\u0094\3\2\2\2"+
		"\u0094\u0095\b\17\n\2\u0095\36\3\2\2\2\u0096\u0097\7(\2\2\u0097\u0098"+
		"\7(\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\20\13\2\u009a \3\2\2\2\u009b"+
		"\u009c\7~\2\2\u009c\u009d\7~\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\21"+
		"\f\2\u009f\"\3\2\2\2\u00a0\u00a1\7#\2\2\u00a1\u00a2\b\22\r\2\u00a2$\3"+
		"\2\2\2\u00a3\u00a4\7`\2\2\u00a4\u00a5\b\23\16\2\u00a5&\3\2\2\2\u00a6\u00a7"+
		"\7?\2\2\u00a7\u00a8\7?\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\24\17\2\u00aa"+
		"(\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7?\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\b\25\20\2\u00af*\3\2\2\2\u00b0\u00b1\7?\2\2\u00b1\u00b2\b\26\21"+
		"\2\u00b2,\3\2\2\2\u00b3\u00b4\7-\2\2\u00b4\u00b5\7?\2\2\u00b5\u00b6\3"+
		"\2\2\2\u00b6\u00b7\b\27\22\2\u00b7.\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\b\30\23\2\u00bc\60\3\2\2\2\u00bd"+
		"\u00be\7.\2\2\u00be\u00bf\b\31\24\2\u00bf\62\3\2\2\2\u00c0\u00c1\7=\2"+
		"\2\u00c1\u00c2\b\32\25\2\u00c2\64\3\2\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c5"+
		"\b\33\26\2\u00c5\66\3\2\2\2\u00c6\u00c7\7+\2\2\u00c7\u00c8\b\34\27\2\u00c8"+
		"8\3\2\2\2\u00c9\u00ca\7]\2\2\u00ca\u00cb\b\35\30\2\u00cb:\3\2\2\2\u00cc"+
		"\u00cd\7_\2\2\u00cd\u00ce\b\36\31\2\u00ce<\3\2\2\2\u00cf\u00d0\7}\2\2"+
		"\u00d0\u00d1\b\37\32\2\u00d1>\3\2\2\2\u00d2\u00d3\7\177\2\2\u00d3\u00d4"+
		"\b \33\2\u00d4@\3\2\2\2\u00d5\u00da\7$\2\2\u00d6\u00d9\5\13\6\2\u00d7"+
		"\u00d9\n\6\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2"+
		"\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00de\u00df\b!\34\2\u00dfB\3\2\2\2\u00e0"+
		"\u00e3\7)\2\2\u00e1\u00e4\5\13\6\2\u00e2\u00e4\n\7\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\7)\2\2\u00e6"+
		"\u00e7\b\"\35\2\u00e7D\3\2\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7t\2\2\u00ea"+
		"\u00eb\7w\2\2\u00eb\u00f2\7g\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7c\2\2"+
		"\u00ee\u00ef\7n\2\2\u00ef\u00f0\7u\2\2\u00f0\u00f2\7g\2\2\u00f1\u00e8"+
		"\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\b#\36\2\u00f4"+
		"F\3\2\2\2\u00f5\u00f6\7\62\2\2\u00f6\u00f9\t\b\2\2\u00f7\u00fa\5\3\2\2"+
		"\u00f8\u00fa\5\5\3\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00ff"+
		"\3\2\2\2\u00fb\u00fe\5\3\2\2\u00fc\u00fe\5\5\3\2\u00fd\u00fb\3\2\2\2\u00fd"+
		"\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0102\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\b$\37\2\u0103"+
		"H\3\2\2\2\u0104\u0106\5\3\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2"+
		"\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0111\3\2\2\2\u0109\u010a"+
		"\7\62\2\2\u010a\u010c\t\b\2\2\u010b\u010d\5\5\3\2\u010c\u010b\3\2\2\2"+
		"\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111"+
		"\3\2\2\2\u0110\u0105\3\2\2\2\u0110\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0113\b% \2\u0113J\3\2\2\2\u0114\u0118\5\3\2\2\u0115\u0117\5\3\2\2\u0116"+
		"\u0115\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119\u011b\3\2\2\2\u011a\u0118\3\2\2\2\u011b\u011c\b&!\2\u011cL"+
		"\3\2\2\2\u011d\u011e\7e\2\2\u011e\u011f\7n\2\2\u011f\u0120\7c\2\2\u0120"+
		"\u0121\7u\2\2\u0121\u0122\7u\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\'\""+
		"\2\u0124N\3\2\2\2\u0125\u0126\7k\2\2\u0126\u0127\7p\2\2\u0127\u0128\7"+
		"v\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b(#\2\u012aP\3\2\2\2\u012b\u012c"+
		"\7d\2\2\u012c\u012d\7q\2\2\u012d\u012e\7q\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7g\2\2\u0130\u0131\7c\2\2\u0131\u0132\7p\2\2\u0132\u0133\3\2\2"+
		"\2\u0133\u0134\b)$\2\u0134R\3\2\2\2\u0135\u0136\7x\2\2\u0136\u0137\7q"+
		"\2\2\u0137\u0138\7k\2\2\u0138\u0139\7f\2\2\u0139\u013a\3\2\2\2\u013a\u013b"+
		"\b*%\2\u013bT\3\2\2\2\u013c\u013d\7k\2\2\u013d\u013e\7h\2\2\u013e\u013f"+
		"\3\2\2\2\u013f\u0140\b+&\2\u0140V\3\2\2\2\u0141\u0142\7h\2\2\u0142\u0143"+
		"\7q\2\2\u0143\u0144\7t\2\2\u0144\u0145\3\2\2\2\u0145\u0146\b,\'\2\u0146"+
		"X\3\2\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7v\2\2\u014a"+
		"\u014b\7w\2\2\u014b\u014c\7t\2\2\u014c\u014d\7p\2\2\u014d\u014e\3\2\2"+
		"\2\u014e\u014f\b-(\2\u014fZ\3\2\2\2\u0150\u0151\7d\2\2\u0151\u0152\7t"+
		"\2\2\u0152\u0153\7g\2\2\u0153\u0154\7c\2\2\u0154\u0155\7m\2\2\u0155\u0156"+
		"\3\2\2\2\u0156\u0157\b.)\2\u0157\\\3\2\2\2\u0158\u0159\7e\2\2\u0159\u015a"+
		"\7q\2\2\u015a\u015b\7p\2\2\u015b\u015c\7v\2\2\u015c\u015d\7k\2\2\u015d"+
		"\u015e\7p\2\2\u015e\u015f\7w\2\2\u015f\u0160\7g\2\2\u0160\u0161\3\2\2"+
		"\2\u0161\u0162\b/*\2\u0162^\3\2\2\2\u0163\u0164\7e\2\2\u0164\u0165\7c"+
		"\2\2\u0165\u0166\7n\2\2\u0166\u0167\7n\2\2\u0167\u0168\7q\2\2\u0168\u0169"+
		"\7w\2\2\u0169\u016a\7v\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b\60+\2\u016c"+
		"`\3\2\2\2\u016d\u016e\7g\2\2\u016e\u016f\7n\2\2\u016f\u0170\7u\2\2\u0170"+
		"\u0171\7g\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b\61,\2\u0173b\3\2\2\2\u0174"+
		"\u0175\7R\2\2\u0175\u0176\7t\2\2\u0176\u0177\7q\2\2\u0177\u0178\7i\2\2"+
		"\u0178\u0179\7t\2\2\u0179\u017a\7c\2\2\u017a\u017b\7o\2\2\u017b\u017c"+
		"\3\2\2\2\u017c\u017d\b\62-\2\u017dd\3\2\2\2\u017e\u0181\5\7\4\2\u017f"+
		"\u0181\7a\2\2\u0180\u017e\3\2\2\2\u0180\u017f\3\2\2\2\u0181\u0187\3\2"+
		"\2\2\u0182\u0186\5\7\4\2\u0183\u0186\7a\2\2\u0184\u0186\5\3\2\2\u0185"+
		"\u0182\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2"+
		"\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189"+
		"\u0187\3\2\2\2\u018a\u018b\b\63.\2\u018bf\3\2\2\2\u018c\u018e\t\t\2\2"+
		"\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\b\64/\2\u0192h\3\2\2\2\u0193"+
		"\u0194\7\61\2\2\u0194\u0195\7\61\2\2\u0195\u0199\3\2\2\2\u0196\u0198\n"+
		"\n\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\b\65"+
		"\60\2\u019dj\3\2\2\2\24\2n\u00d8\u00da\u00e3\u00f1\u00f9\u00fd\u00ff\u0107"+
		"\u010e\u0110\u0118\u0180\u0185\u0187\u018f\u0199\61\3\7\2\3\b\3\3\t\4"+
		"\3\n\5\3\13\6\3\f\7\3\r\b\3\16\t\3\17\n\3\20\13\3\21\f\3\22\r\3\23\16"+
		"\3\24\17\3\25\20\3\26\21\3\27\22\3\30\23\3\31\24\3\32\25\3\33\26\3\34"+
		"\27\3\35\30\3\36\31\3\37\32\3 \33\3!\34\3\"\35\3#\36\3$\37\3% \3&!\3\'"+
		"\"\3(#\3)$\3*%\3+&\3,\'\3-(\3.)\3/*\3\60+\3\61,\3\62-\3\63.\3\64/\3\65"+
		"\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}