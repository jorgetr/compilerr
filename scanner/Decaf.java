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
import java.util.LinkedList;

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
		case 37: ESPACIOS_action((RuleContext)_localctx, actionIndex); break;

		case 38: COMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ESPACIOS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:  skip();  break;
		}
	}
	private void COMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\5\3U\n\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\7!\u009d\n!\f!\16!\u00a0\13!"+
		"\3!\3!\3\"\3\"\3\"\5\"\u00a7\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5"+
		"#\u00b4\n#\3$\3$\3$\3$\5$\u00ba\n$\3$\3$\7$\u00be\n$\f$\16$\u00c1\13$"+
		"\3%\6%\u00c4\n%\r%\16%\u00c5\3%\3%\3%\6%\u00cb\n%\r%\16%\u00cc\5%\u00cf"+
		"\n%\3&\3&\7&\u00d3\n&\f&\16&\u00d6\13&\3\'\6\'\u00d9\n\'\r\'\16\'\u00da"+
		"\3\'\3\'\3(\3(\3(\3(\7(\u00e3\n(\f(\16(\u00e6\13(\3(\3(\2\2)\3\2\5\2\7"+
		"\2\t\2\13\2\r\3\17\4\21\5\23\6\25\7\27\b\31\t\33\n\35\13\37\f!\r#\16%"+
		"\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C"+
		"\36E\37G I!K\"M#O$\3\2\13\4\2CHch\4\2C\\c|\4\2--//\n\2$$))^^ddhhppttv"+
		"v\5\2$$))^^\6\2\13\f$$))^^\4\2ZZzz\5\2\13\f\17\17\"\"\4\2\f\f\17\17\u00f0"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5T"+
		"\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a"+
		"\3\2\2\2\23c\3\2\2\2\25e\3\2\2\2\27g\3\2\2\2\31i\3\2\2\2\33k\3\2\2\2\35"+
		"n\3\2\2\2\37q\3\2\2\2!t\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)~\3\2\2"+
		"\2+\u0081\3\2\2\2-\u0083\3\2\2\2/\u0086\3\2\2\2\61\u0089\3\2\2\2\63\u008b"+
		"\3\2\2\2\65\u008d\3\2\2\2\67\u008f\3\2\2\29\u0091\3\2\2\2;\u0093\3\2\2"+
		"\2=\u0095\3\2\2\2?\u0097\3\2\2\2A\u0099\3\2\2\2C\u00a3\3\2\2\2E\u00b3"+
		"\3\2\2\2G\u00b5\3\2\2\2I\u00ce\3\2\2\2K\u00d0\3\2\2\2M\u00d8\3\2\2\2O"+
		"\u00de\3\2\2\2QR\4\62;\2R\4\3\2\2\2SU\t\2\2\2TS\3\2\2\2U\6\3\2\2\2VW\t"+
		"\3\2\2W\b\3\2\2\2XY\t\4\2\2Y\n\3\2\2\2Z[\7^\2\2[\\\t\5\2\2\\\f\3\2\2\2"+
		"]^\7-\2\2^\16\3\2\2\2_`\7/\2\2`\20\3\2\2\2ab\7,\2\2b\22\3\2\2\2cd\7\61"+
		"\2\2d\24\3\2\2\2ef\7\'\2\2f\26\3\2\2\2gh\7>\2\2h\30\3\2\2\2ij\7@\2\2j"+
		"\32\3\2\2\2kl\7>\2\2lm\7?\2\2m\34\3\2\2\2no\7@\2\2op\7?\2\2p\36\3\2\2"+
		"\2qr\7(\2\2rs\7(\2\2s \3\2\2\2tu\7~\2\2uv\7~\2\2v\"\3\2\2\2wx\7#\2\2x"+
		"$\3\2\2\2yz\7`\2\2z&\3\2\2\2{|\7?\2\2|}\7?\2\2}(\3\2\2\2~\177\7#\2\2\177"+
		"\u0080\7?\2\2\u0080*\3\2\2\2\u0081\u0082\7?\2\2\u0082,\3\2\2\2\u0083\u0084"+
		"\7-\2\2\u0084\u0085\7?\2\2\u0085.\3\2\2\2\u0086\u0087\7/\2\2\u0087\u0088"+
		"\7?\2\2\u0088\60\3\2\2\2\u0089\u008a\7.\2\2\u008a\62\3\2\2\2\u008b\u008c"+
		"\7=\2\2\u008c\64\3\2\2\2\u008d\u008e\7*\2\2\u008e\66\3\2\2\2\u008f\u0090"+
		"\7+\2\2\u00908\3\2\2\2\u0091\u0092\7]\2\2\u0092:\3\2\2\2\u0093\u0094\7"+
		"_\2\2\u0094<\3\2\2\2\u0095\u0096\7}\2\2\u0096>\3\2\2\2\u0097\u0098\7\177"+
		"\2\2\u0098@\3\2\2\2\u0099\u009e\7$\2\2\u009a\u009d\5\13\6\2\u009b\u009d"+
		"\n\6\2\2\u009c\u009a\3\2\2\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a2\7$\2\2\u00a2B\3\2\2\2\u00a3\u00a6\7)\2\2\u00a4\u00a7"+
		"\5\13\6\2\u00a5\u00a7\n\7\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2"+
		"\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7)\2\2\u00a9D\3\2\2\2\u00aa\u00ab\7v"+
		"\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7w\2\2\u00ad\u00b4\7g\2\2\u00ae\u00af"+
		"\7h\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7n\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b4\7g\2\2\u00b3\u00aa\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b4F\3\2\2\2\u00b5"+
		"\u00b6\7\62\2\2\u00b6\u00b9\t\b\2\2\u00b7\u00ba\5\3\2\2\u00b8\u00ba\5"+
		"\5\3\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bf\3\2\2\2\u00bb"+
		"\u00be\5\3\2\2\u00bc\u00be\5\5\3\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"H\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c4\5\3\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00cf"+
		"\3\2\2\2\u00c7\u00c8\7\62\2\2\u00c8\u00ca\t\b\2\2\u00c9\u00cb\5\5\3\2"+
		"\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00c3\3\2\2\2\u00ce\u00c7\3\2\2\2\u00cf"+
		"J\3\2\2\2\u00d0\u00d4\5\3\2\2\u00d1\u00d3\5\3\2\2\u00d2\u00d1\3\2\2\2"+
		"\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5L\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\t\t\2\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\b\'\2\2\u00ddN\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0"+
		"\7\61\2\2\u00e0\u00e4\3\2\2\2\u00e1\u00e3\n\n\2\2\u00e2\u00e1\3\2\2\2"+
		"\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\b(\3\2\u00e8P\3\2\2\2\21\2T\u009c"+
		"\u009e\u00a6\u00b3\u00b9\u00bd\u00bf\u00c5\u00cc\u00ce\u00d4\u00da\u00e4"+
		"\4\3\'\2\3(\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}