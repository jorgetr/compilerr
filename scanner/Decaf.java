// Generated from Decaf.g by ANTLR 4.3

  package compiler.scanner;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import java.util.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Decaf extends Lexer {
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
		ESPACIOS=33, COMENT=34;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'"
	};
	public static final String[] ruleNames = {
		"DIGIT", "HEX", "LETTER", "SIGNO", "ESC", "ADD", "SUB", "MULT", "DIV", 
		"PORC", "LESSTHAT", "GREATTHAT", "LESSEQ", "GREATEQ", "AND", "OR", "NOT", 
		"XOR", "EQUAL", "NOTEQUAL", "ASSIGN", "PLUSASSIGN", "MINUSASSIGN", "COMA", 
		"SEMICOLON", "OPENAREN", "CLOSEPAREN", "OPENBRACKET", "CLOSEBRACKET", 
		"OPENBRACE", "CLOSEBRACE", "STRINGLITERAL", "CHARLIT", "BOOLEANLITERAL", 
		"HEXLIT", "INTLITERAL", "DECIMALIT", "ESPACIOS", "COMENT"
	};


		public LinkedList error = new LinkedList();
		public String cadena = "";
		
		public void format(int linea, String nombre, String valor){
			if(nombre.equals("")){
				cadena = linea+" "+valor;
			}else{
				cadena = linea+" "+nombre+" "+valor;
			}
		}
		

		public void emitErrorMessage(String msg)
		{
			error.add(msg);
		}


	public Decaf(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Decaf.g"; }

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

		case 37: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 38: COMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void OPENBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: format(getLine(), "", getText()); break;
		}
	}
	private void CLOSEPAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: format(getLine(), "", getText()); break;
		}
	}
	private void XOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: format(getLine(), "", getText()); break;
		}
	}
	private void COMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: skip(); break;
		}
	}
	private void CHARLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: format(getLine(), "CHARLITERAL", getText()); break;
		}
	}
	private void BOOLEANLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: format(getLine(), "BOOLEANLITERAL", getText()); break;
		}
	}
	private void OPENBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: format(getLine(), "", getText()); break;
		}
	}
	private void SUB_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: format(getLine(), "", getText()); break;
		}
	}
	private void SEMICOLON_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: format(getLine(), "", getText()); break;
		}
	}
	private void NOT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: format(getLine(), "", getText()); break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: format(getLine(), "", getText()); break;
		}
	}
	private void MINUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: format(getLine(), "", getText()); break;
		}
	}
	private void INTLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: format(getLine(), "INTLITERAL", getText()); break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: format(getLine(), "", getText()); break;
		}
	}
	private void COMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: format(getLine(), "", getText()); break;
		}
	}
	private void NOTEQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: format(getLine(), "", getText()); break;
		}
	}
	private void CLOSEBRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: format(getLine(), "", getText()); break;
		}
	}
	private void HEXLIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: format(getLine(), "HEXLIT", getText()); break;
		}
	}
	private void GREATEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: format(getLine(), "", getText()); break;
		}
	}
	private void LESSEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: format(getLine(), "", getText()); break;
		}
	}
	private void CLOSEBRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: format(getLine(), "", getText()); break;
		}
	}
	private void STRINGLITERAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: format(getLine(), "STRINGLITERAL", getText()); break;
		}
	}
	private void PORC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: format(getLine(), "", getText()); break;
		}
	}
	private void EQUAL_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: format(getLine(), "", getText()); break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: format(getLine(), "", getText()); break;
		}
	}
	private void ASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: format(getLine(), "", getText()); break;
		}
	}
	private void GREATTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: format(getLine(), "", getText()); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:  skip();  break;
		}
	}
	private void DECIMALIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: format(getLine(), "DECIMALIT", getText()); break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: format(getLine(), "", getText()); break;
		}
	}
	private void PLUSASSIGN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: format(getLine(), "", getText()); break;
		}
	}
	private void OPENAREN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: format(getLine(), "", getText()); break;
		}
	}
	private void LESSTHAT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: format(getLine(), "", getText()); break;
		}
	}
	private void ADD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: format(getLine(), "", getText()); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0115\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\5\3U\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\7!\u00bf"+
		"\n!\f!\16!\u00c2\13!\3!\3!\3!\3\"\3\"\3\"\5\"\u00ca\n\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00d8\n#\3#\3#\3$\3$\3$\3$\5$\u00e0\n$\3"+
		"$\3$\7$\u00e4\n$\f$\16$\u00e7\13$\3$\3$\3%\6%\u00ec\n%\r%\16%\u00ed\3"+
		"%\3%\3%\6%\u00f3\n%\r%\16%\u00f4\5%\u00f7\n%\3%\3%\3&\3&\7&\u00fd\n&\f"+
		"&\16&\u0100\13&\3&\3&\3\'\6\'\u0105\n\'\r\'\16\'\u0106\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u010f\n(\f(\16(\u0112\13(\3(\3(\2\2)\3\2\5\2\7\2\t\2\13\2\r\3"+
		"\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22"+
		"-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#"+
		"O$\3\2\13\4\2CHch\4\2C\\c|\4\2--//\n\2$$))^^ddhhppttvv\5\2$$))^^\6\2\13"+
		"\f$$))^^\4\2ZZzz\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u011c\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T\3\2\2\2\7V\3\2"+
		"\2\2\tX\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2\17`\3\2\2\2\21c\3\2\2\2\23f\3\2"+
		"\2\2\25i\3\2\2\2\27l\3\2\2\2\31o\3\2\2\2\33r\3\2\2\2\35w\3\2\2\2\37|\3"+
		"\2\2\2!\u0081\3\2\2\2#\u0086\3\2\2\2%\u0089\3\2\2\2\'\u008c\3\2\2\2)\u0091"+
		"\3\2\2\2+\u0096\3\2\2\2-\u0099\3\2\2\2/\u009e\3\2\2\2\61\u00a3\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a9\3\2\2\2\67\u00ac\3\2\2\29\u00af\3\2\2\2;\u00b2"+
		"\3\2\2\2=\u00b5\3\2\2\2?\u00b8\3\2\2\2A\u00bb\3\2\2\2C\u00c6\3\2\2\2E"+
		"\u00d7\3\2\2\2G\u00db\3\2\2\2I\u00f6\3\2\2\2K\u00fa\3\2\2\2M\u0104\3\2"+
		"\2\2O\u010a\3\2\2\2QR\4\62;\2R\4\3\2\2\2SU\t\2\2\2TS\3\2\2\2U\6\3\2\2"+
		"\2VW\t\3\2\2W\b\3\2\2\2XY\t\4\2\2Y\n\3\2\2\2Z[\7^\2\2[\\\t\5\2\2\\\f\3"+
		"\2\2\2]^\7-\2\2^_\b\7\2\2_\16\3\2\2\2`a\7/\2\2ab\b\b\3\2b\20\3\2\2\2c"+
		"d\7,\2\2de\b\t\4\2e\22\3\2\2\2fg\7\61\2\2gh\b\n\5\2h\24\3\2\2\2ij\7\'"+
		"\2\2jk\b\13\6\2k\26\3\2\2\2lm\7>\2\2mn\b\f\7\2n\30\3\2\2\2op\7@\2\2pq"+
		"\b\r\b\2q\32\3\2\2\2rs\7>\2\2st\7?\2\2tu\3\2\2\2uv\b\16\t\2v\34\3\2\2"+
		"\2wx\7@\2\2xy\7?\2\2yz\3\2\2\2z{\b\17\n\2{\36\3\2\2\2|}\7(\2\2}~\7(\2"+
		"\2~\177\3\2\2\2\177\u0080\b\20\13\2\u0080 \3\2\2\2\u0081\u0082\7~\2\2"+
		"\u0082\u0083\7~\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\21\f\2\u0085\"\3"+
		"\2\2\2\u0086\u0087\7#\2\2\u0087\u0088\b\22\r\2\u0088$\3\2\2\2\u0089\u008a"+
		"\7`\2\2\u008a\u008b\b\23\16\2\u008b&\3\2\2\2\u008c\u008d\7?\2\2\u008d"+
		"\u008e\7?\2\2\u008e\u008f\3\2\2\2\u008f\u0090\b\24\17\2\u0090(\3\2\2\2"+
		"\u0091\u0092\7#\2\2\u0092\u0093\7?\2\2\u0093\u0094\3\2\2\2\u0094\u0095"+
		"\b\25\20\2\u0095*\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\b\26\21\2\u0098"+
		",\3\2\2\2\u0099\u009a\7-\2\2\u009a\u009b\7?\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\b\27\22\2\u009d.\3\2\2\2\u009e\u009f\7/\2\2\u009f\u00a0\7?\2\2"+
		"\u00a0\u00a1\3\2\2\2\u00a1\u00a2\b\30\23\2\u00a2\60\3\2\2\2\u00a3\u00a4"+
		"\7.\2\2\u00a4\u00a5\b\31\24\2\u00a5\62\3\2\2\2\u00a6\u00a7\7=\2\2\u00a7"+
		"\u00a8\b\32\25\2\u00a8\64\3\2\2\2\u00a9\u00aa\7*\2\2\u00aa\u00ab\b\33"+
		"\26\2\u00ab\66\3\2\2\2\u00ac\u00ad\7+\2\2\u00ad\u00ae\b\34\27\2\u00ae"+
		"8\3\2\2\2\u00af\u00b0\7]\2\2\u00b0\u00b1\b\35\30\2\u00b1:\3\2\2\2\u00b2"+
		"\u00b3\7_\2\2\u00b3\u00b4\b\36\31\2\u00b4<\3\2\2\2\u00b5\u00b6\7}\2\2"+
		"\u00b6\u00b7\b\37\32\2\u00b7>\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9\u00ba"+
		"\b \33\2\u00ba@\3\2\2\2\u00bb\u00c0\7$\2\2\u00bc\u00bf\5\13\6\2\u00bd"+
		"\u00bf\n\6\2\2\u00be\u00bc\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2"+
		"\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4\u00c5\b!\34\2\u00c5B\3\2\2\2\u00c6"+
		"\u00c9\7)\2\2\u00c7\u00ca\5\13\6\2\u00c8\u00ca\n\7\2\2\u00c9\u00c7\3\2"+
		"\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7)\2\2\u00cc"+
		"\u00cd\b\"\35\2\u00cdD\3\2\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d1\7w\2\2\u00d1\u00d8\7g\2\2\u00d2\u00d3\7h\2\2\u00d3\u00d4\7c\2\2"+
		"\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d8\7g\2\2\u00d7\u00ce"+
		"\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b#\36\2\u00da"+
		"F\3\2\2\2\u00db\u00dc\7\62\2\2\u00dc\u00df\t\b\2\2\u00dd\u00e0\5\3\2\2"+
		"\u00de\u00e0\5\5\3\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e5"+
		"\3\2\2\2\u00e1\u00e4\5\3\2\2\u00e2\u00e4\5\5\3\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\b$\37\2\u00e9"+
		"H\3\2\2\2\u00ea\u00ec\5\3\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2"+
		"\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0"+
		"\7\62\2\2\u00f0\u00f2\t\b\2\2\u00f1\u00f3\5\5\3\2\u00f2\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f7"+
		"\3\2\2\2\u00f6\u00eb\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f9\b% \2\u00f9J\3\2\2\2\u00fa\u00fe\5\3\2\2\u00fb\u00fd\5\3\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2"+
		"\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\b&!\2\u0102L"+
		"\3\2\2\2\u0103\u0105\t\t\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\b\'"+
		"\"\2\u0109N\3\2\2\2\u010a\u010b\7\61\2\2\u010b\u010c\7\61\2\2\u010c\u0110"+
		"\3\2\2\2\u010d\u010f\n\n\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0113\u0114\b(#\2\u0114P\3\2\2\2\21\2T\u00be\u00c0\u00c9\u00d7\u00df"+
		"\u00e3\u00e5\u00ed\u00f4\u00f6\u00fe\u0106\u0110$\3\7\2\3\b\3\3\t\4\3"+
		"\n\5\3\13\6\3\f\7\3\r\b\3\16\t\3\17\n\3\20\13\3\21\f\3\22\r\3\23\16\3"+
		"\24\17\3\25\20\3\26\21\3\27\22\3\30\23\3\31\24\3\32\25\3\33\26\3\34\27"+
		"\3\35\30\3\36\31\3\37\32\3 \33\3!\34\3\"\35\3#\36\3$\37\3% \3&!\3\'\""+
		"\3(#";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}