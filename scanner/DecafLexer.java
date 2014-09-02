// Generated from scanner/DecafLexer.g by ANTLR 4.3

  package compiler.scanner;
  import java.util.LinkedList;
	import java.util.Stack;
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
		CHARLIT=28, BOOLEANLITERAL=29, HEXLIT=30, INTLITERAL=31, CLASS=32, INT=33, 
		BOOLEAN=34, VOID=35, IF=36, FOR=37, RETURN=38, BREAK=39, CONTINUE=40, 
		CALLOUT=41, ELSE=42, PROGRAM=43, VAR=44, ESPACIOS=45, COMENT=46;
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
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'"
	};
	public static final String[] ruleNames = {
		"DIGIT", "HEX", "LETTER", "SIGNO", "ESC", "ADD", "SUB", "MULT", "DIV", 
		"PORC", "LESSTHAT", "GREATTHAT", "LESSEQ", "GREATEQ", "AND", "OR", "NOT", 
		"XOR", "EQUAL", "NOTEQUAL", "ASSIGN", "PLUSASSIGN", "MINUSASSIGN", "COMA", 
		"SEMICOLON", "OPENAREN", "CLOSEPAREN", "OPENBRACKET", "CLOSEBRACKET", 
		"OPENBRACE", "CLOSEBRACE", "STRINGLITERAL", "CHARLIT", "BOOLEANLITERAL", 
		"HEXLIT", "INTLITERAL", "CLASS", "INT", "BOOLEAN", "VOID", "IF", "FOR", 
		"RETURN", "BREAK", "CONTINUE", "CALLOUT", "ELSE", "PROGRAM", "VAR", "ESPACIOS", 
		"COMENT"
	};


		
		
		public String token = "";
		
		public void LisToken(int number, String name,String lexema){
				token = number+" "+lexema+" "+name;
			
		}


	public  Stack errorStack = new Stack();
		

	@Override
	public String getErrorDisplay(String s){
				String errorLine = "Error Line:"+getLine()+":"+getCharPositionInLine()+"Symbol: "+s;
				errorStack.push(errorLine);
	return s;	
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

		case 36: CLASS_action((RuleContext)_localctx, actionIndex); break;

		case 37: INT_action((RuleContext)_localctx, actionIndex); break;

		case 38: BOOLEAN_action((RuleContext)_localctx, actionIndex); break;

		case 39: VOID_action((RuleContext)_localctx, actionIndex); break;

		case 40: IF_action((RuleContext)_localctx, actionIndex); break;

		case 41: FOR_action((RuleContext)_localctx, actionIndex); break;

		case 42: RETURN_action((RuleContext)_localctx, actionIndex); break;

		case 43: BREAK_action((RuleContext)_localctx, actionIndex); break;

		case 44: CONTINUE_action((RuleContext)_localctx, actionIndex); break;

		case 45: CALLOUT_action((RuleContext)_localctx, actionIndex); break;

		case 46: ELSE_action((RuleContext)_localctx, actionIndex); break;

		case 47: PROGRAM_action((RuleContext)_localctx, actionIndex); break;

		case 48: VAR_action((RuleContext)_localctx, actionIndex); break;

		case 49: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 50: COMENT_action((RuleContext)_localctx, actionIndex); break;
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
		case 31: LisToken(getLine(),getText(),"CLASS"); break;
		}
	}
	private void XOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: LisToken(getLine(),getText(),"XOR"); break;
		}
	}
	private void COMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 45: skip(); break;
		}
	}
	private void ELSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 41: LisToken(getLine(),getText(),"ELSE"); break;
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
		case 36: LisToken(getLine(),getText(),"FOR"); break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: LisToken(getLine(),getText(),"SUB"); break;
		}
	}
	private void INT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: LisToken(getLine(),getText(),"INT"); break;
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
		case 38: LisToken(getLine(),getText(),"BREAK"); break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: LisToken(getLine(),getText(),"IF"); break;
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
		case 33: LisToken(getLine(),getText(),"BOOLEAN"); break;
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
		case 39: LisToken(getLine(),getText(),"CONTINUE"); break;
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
		case 37: LisToken(getLine(),getText(),"RETURN"); break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: LisToken(getLine(),getText(),"ASSIGN"); break;
		}
	}
	private void PROGRAM_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 42: LisToken(getLine(),getText(),"PROGRAM"); break;
		}
	}
	private void GREATTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: LisToken(getLine(),getText(),"GREATTHAT"); break;
		}
	}
	private void VAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 43: LisToken(getLine(),getText(),"VAR"); break;
		}
	}
	private void VOID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: LisToken(getLine(),getText(),"VOID"); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 44:  skip() ; break;
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
		case 40: LisToken(getLine(),getText(),"CALLOUT"); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\60\u0193\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\3\2\3\3\5\3m\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3!\7!\u00d7\n!\f!\16!\u00da\13!\3!\3!\3!\3\"\3\"\3"+
		"\"\5\"\u00e2\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00f0\n#\3"+
		"#\3#\3$\3$\3$\3$\5$\u00f8\n$\3$\3$\7$\u00fc\n$\f$\16$\u00ff\13$\3$\3$"+
		"\3%\6%\u0104\n%\r%\16%\u0105\3%\3%\3%\6%\u010b\n%\r%\16%\u010c\5%\u010f"+
		"\n%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3("+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3"+
		"\62\5\62\u0176\n\62\3\62\3\62\3\62\7\62\u017b\n\62\f\62\16\62\u017e\13"+
		"\62\3\62\3\62\3\63\6\63\u0183\n\63\r\63\16\63\u0184\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\7\64\u018d\n\64\f\64\16\64\u0190\13\64\3\64\3\64\2\2\65\3\2"+
		"\5\2\7\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r"+
		"#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34"+
		"A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60\3\2\13\4\2CHch\4\2"+
		"C\\c|\4\2--//\n\2$$))^^ddhhppttvv\5\2$$))^^\6\2\13\f$$))^^\4\2ZZzz\5\2"+
		"\13\f\17\17\"\"\4\2\f\f\17\17\u019d\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\3i\3\2\2\2\5l\3\2\2\2\7n\3\2\2\2\tp\3\2\2\2\13r\3\2\2\2"+
		"\ru\3\2\2\2\17x\3\2\2\2\21{\3\2\2\2\23~\3\2\2\2\25\u0081\3\2\2\2\27\u0084"+
		"\3\2\2\2\31\u0087\3\2\2\2\33\u008a\3\2\2\2\35\u008f\3\2\2\2\37\u0094\3"+
		"\2\2\2!\u0099\3\2\2\2#\u009e\3\2\2\2%\u00a1\3\2\2\2\'\u00a4\3\2\2\2)\u00a9"+
		"\3\2\2\2+\u00ae\3\2\2\2-\u00b1\3\2\2\2/\u00b6\3\2\2\2\61\u00bb\3\2\2\2"+
		"\63\u00be\3\2\2\2\65\u00c1\3\2\2\2\67\u00c4\3\2\2\29\u00c7\3\2\2\2;\u00ca"+
		"\3\2\2\2=\u00cd\3\2\2\2?\u00d0\3\2\2\2A\u00d3\3\2\2\2C\u00de\3\2\2\2E"+
		"\u00ef\3\2\2\2G\u00f3\3\2\2\2I\u010e\3\2\2\2K\u0112\3\2\2\2M\u011a\3\2"+
		"\2\2O\u0120\3\2\2\2Q\u012a\3\2\2\2S\u0131\3\2\2\2U\u0136\3\2\2\2W\u013c"+
		"\3\2\2\2Y\u0145\3\2\2\2[\u014d\3\2\2\2]\u0158\3\2\2\2_\u0162\3\2\2\2a"+
		"\u0169\3\2\2\2c\u0175\3\2\2\2e\u0182\3\2\2\2g\u0188\3\2\2\2ij\4\62;\2"+
		"j\4\3\2\2\2km\t\2\2\2lk\3\2\2\2m\6\3\2\2\2no\t\3\2\2o\b\3\2\2\2pq\t\4"+
		"\2\2q\n\3\2\2\2rs\7^\2\2st\t\5\2\2t\f\3\2\2\2uv\7-\2\2vw\b\7\2\2w\16\3"+
		"\2\2\2xy\7/\2\2yz\b\b\3\2z\20\3\2\2\2{|\7,\2\2|}\b\t\4\2}\22\3\2\2\2~"+
		"\177\7\61\2\2\177\u0080\b\n\5\2\u0080\24\3\2\2\2\u0081\u0082\7\'\2\2\u0082"+
		"\u0083\b\13\6\2\u0083\26\3\2\2\2\u0084\u0085\7>\2\2\u0085\u0086\b\f\7"+
		"\2\u0086\30\3\2\2\2\u0087\u0088\7@\2\2\u0088\u0089\b\r\b\2\u0089\32\3"+
		"\2\2\2\u008a\u008b\7>\2\2\u008b\u008c\7?\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008e\b\16\t\2\u008e\34\3\2\2\2\u008f\u0090\7@\2\2\u0090\u0091\7?\2\2"+
		"\u0091\u0092\3\2\2\2\u0092\u0093\b\17\n\2\u0093\36\3\2\2\2\u0094\u0095"+
		"\7(\2\2\u0095\u0096\7(\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\20\13\2\u0098"+
		" \3\2\2\2\u0099\u009a\7~\2\2\u009a\u009b\7~\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\21\f\2\u009d\"\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0\b\22\r"+
		"\2\u00a0$\3\2\2\2\u00a1\u00a2\7`\2\2\u00a2\u00a3\b\23\16\2\u00a3&\3\2"+
		"\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7?\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8"+
		"\b\24\17\2\u00a8(\3\2\2\2\u00a9\u00aa\7#\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\b\25\20\2\u00ad*\3\2\2\2\u00ae\u00af\7?\2\2"+
		"\u00af\u00b0\b\26\21\2\u00b0,\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2\u00b3\7"+
		"?\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\27\22\2\u00b5.\3\2\2\2\u00b6\u00b7"+
		"\7/\2\2\u00b7\u00b8\7?\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b\30\23\2\u00ba"+
		"\60\3\2\2\2\u00bb\u00bc\7.\2\2\u00bc\u00bd\b\31\24\2\u00bd\62\3\2\2\2"+
		"\u00be\u00bf\7=\2\2\u00bf\u00c0\b\32\25\2\u00c0\64\3\2\2\2\u00c1\u00c2"+
		"\7*\2\2\u00c2\u00c3\b\33\26\2\u00c3\66\3\2\2\2\u00c4\u00c5\7+\2\2\u00c5"+
		"\u00c6\b\34\27\2\u00c68\3\2\2\2\u00c7\u00c8\7]\2\2\u00c8\u00c9\b\35\30"+
		"\2\u00c9:\3\2\2\2\u00ca\u00cb\7_\2\2\u00cb\u00cc\b\36\31\2\u00cc<\3\2"+
		"\2\2\u00cd\u00ce\7}\2\2\u00ce\u00cf\b\37\32\2\u00cf>\3\2\2\2\u00d0\u00d1"+
		"\7\177\2\2\u00d1\u00d2\b \33\2\u00d2@\3\2\2\2\u00d3\u00d8\7$\2\2\u00d4"+
		"\u00d7\5\13\6\2\u00d5\u00d7\n\6\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7$\2\2\u00dc\u00dd\b!\34"+
		"\2\u00ddB\3\2\2\2\u00de\u00e1\7)\2\2\u00df\u00e2\5\13\6\2\u00e0\u00e2"+
		"\n\7\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\7)\2\2\u00e4\u00e5\b\"\35\2\u00e5D\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7"+
		"\u00e8\7t\2\2\u00e8\u00e9\7w\2\2\u00e9\u00f0\7g\2\2\u00ea\u00eb\7h\2\2"+
		"\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00f0"+
		"\7g\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00ea\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b#\36\2\u00f2F\3\2\2\2\u00f3\u00f4\7\62\2\2\u00f4\u00f7\t\b\2\2"+
		"\u00f5\u00f8\5\3\2\2\u00f6\u00f8\5\5\3\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6"+
		"\3\2\2\2\u00f8\u00fd\3\2\2\2\u00f9\u00fc\5\3\2\2\u00fa\u00fc\5\5\3\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\b$\37\2\u0101H\3\2\2\2\u0102\u0104\5\3\2\2\u0103\u0102\3\2\2\2"+
		"\u0104\u0105\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u010f"+
		"\3\2\2\2\u0107\u0108\7\62\2\2\u0108\u010a\t\b\2\2\u0109\u010b\5\5\3\2"+
		"\u010a\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u0107\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0111\b% \2\u0111J\3\2\2\2\u0112\u0113\7e\2\2\u0113"+
		"\u0114\7n\2\2\u0114\u0115\7c\2\2\u0115\u0116\7u\2\2\u0116\u0117\7u\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0119\b&!\2\u0119L\3\2\2\2\u011a\u011b\7k\2"+
		"\2\u011b\u011c\7p\2\2\u011c\u011d\7v\2\2\u011d\u011e\3\2\2\2\u011e\u011f"+
		"\b\'\"\2\u011fN\3\2\2\2\u0120\u0121\7d\2\2\u0121\u0122\7q\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7n\2\2\u0124\u0125\7g\2\2\u0125\u0126\7c\2\2\u0126"+
		"\u0127\7p\2\2\u0127\u0128\3\2\2\2\u0128\u0129\b(#\2\u0129P\3\2\2\2\u012a"+
		"\u012b\7x\2\2\u012b\u012c\7q\2\2\u012c\u012d\7k\2\2\u012d\u012e\7f\2\2"+
		"\u012e\u012f\3\2\2\2\u012f\u0130\b)$\2\u0130R\3\2\2\2\u0131\u0132\7k\2"+
		"\2\u0132\u0133\7h\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b*%\2\u0135T\3\2"+
		"\2\2\u0136\u0137\7h\2\2\u0137\u0138\7q\2\2\u0138\u0139\7t\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u013b\b+&\2\u013bV\3\2\2\2\u013c\u013d\7t\2\2\u013d\u013e"+
		"\7g\2\2\u013e\u013f\7v\2\2\u013f\u0140\7w\2\2\u0140\u0141\7t\2\2\u0141"+
		"\u0142\7p\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b,\'\2\u0144X\3\2\2\2\u0145"+
		"\u0146\7d\2\2\u0146\u0147\7t\2\2\u0147\u0148\7g\2\2\u0148\u0149\7c\2\2"+
		"\u0149\u014a\7m\2\2\u014a\u014b\3\2\2\2\u014b\u014c\b-(\2\u014cZ\3\2\2"+
		"\2\u014d\u014e\7e\2\2\u014e\u014f\7q\2\2\u014f\u0150\7p\2\2\u0150\u0151"+
		"\7v\2\2\u0151\u0152\7k\2\2\u0152\u0153\7p\2\2\u0153\u0154\7w\2\2\u0154"+
		"\u0155\7g\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b.)\2\u0157\\\3\2\2\2\u0158"+
		"\u0159\7e\2\2\u0159\u015a\7c\2\2\u015a\u015b\7n\2\2\u015b\u015c\7n\2\2"+
		"\u015c\u015d\7q\2\2\u015d\u015e\7w\2\2\u015e\u015f\7v\2\2\u015f\u0160"+
		"\3\2\2\2\u0160\u0161\b/*\2\u0161^\3\2\2\2\u0162\u0163\7g\2\2\u0163\u0164"+
		"\7n\2\2\u0164\u0165\7u\2\2\u0165\u0166\7g\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\b\60+\2\u0168`\3\2\2\2\u0169\u016a\7R\2\2\u016a\u016b\7t\2\2\u016b"+
		"\u016c\7q\2\2\u016c\u016d\7i\2\2\u016d\u016e\7t\2\2\u016e\u016f\7c\2\2"+
		"\u016f\u0170\7o\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b\61,\2\u0172b\3\2"+
		"\2\2\u0173\u0176\5\7\4\2\u0174\u0176\7a\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u017c\3\2\2\2\u0177\u017b\5\7\4\2\u0178\u017b\7a"+
		"\2\2\u0179\u017b\5\3\2\2\u017a\u0177\3\2\2\2\u017a\u0178\3\2\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\b\62-\2\u0180"+
		"d\3\2\2\2\u0181\u0183\t\t\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2"+
		"\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187"+
		"\b\63.\2\u0187f\3\2\2\2\u0188\u0189\7\61\2\2\u0189\u018a\7\61\2\2\u018a"+
		"\u018e\3\2\2\2\u018b\u018d\n\n\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2"+
		"\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190"+
		"\u018e\3\2\2\2\u0191\u0192\b\64/\2\u0192h\3\2\2\2\23\2l\u00d6\u00d8\u00e1"+
		"\u00ef\u00f7\u00fb\u00fd\u0105\u010c\u010e\u0175\u017a\u017c\u0184\u018e"+
		"\60\3\7\2\3\b\3\3\t\4\3\n\5\3\13\6\3\f\7\3\r\b\3\16\t\3\17\n\3\20\13\3"+
		"\21\f\3\22\r\3\23\16\3\24\17\3\25\20\3\26\21\3\27\22\3\30\23\3\31\24\3"+
		"\32\25\3\33\26\3\34\27\3\35\30\3\36\31\3\37\32\3 \33\3!\34\3\"\35\3#\36"+
		"\3$\37\3% \3&!\3\'\"\3(#\3)$\3*%\3+&\3,\'\3-(\3.)\3/*\3\60+\3\61,\3\62"+
		"-\3\63.\3\64/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}