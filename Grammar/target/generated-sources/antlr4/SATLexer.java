// Generated from SAT.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SATLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ADDING_OPERATOR=16, 
		MULTIPLYING_OPERATOR=17, BOOL=18, ID=19, NUM=20, RELOP=21, WS=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "ADDING_OPERATOR", 
		"MULTIPLYING_OPERATOR", "BOOL", "ID", "NUM", "RELOP", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "','", "'}'", "'main'", "'void'", 
		"'int'", "'='", "'if'", "'else'", "'for'", "';'", "'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "ADDING_OPERATOR", "MULTIPLYING_OPERATOR", "BOOL", 
		"ID", "NUM", "RELOP", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
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

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public SATLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SAT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0094\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23o\n\23\3\24"+
		"\3\24\7\24s\n\24\f\24\16\24v\13\24\3\25\5\25y\n\25\3\25\6\25|\n\25\r\25"+
		"\16\25}\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008a\n"+
		"\26\3\27\3\27\3\27\6\27\u008f\n\27\r\27\16\27\u0090\3\27\3\27\2\2\30\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30\3\2\b\4\2--//\4\2,,\61\61\4\2C\\c|\5"+
		"\2\62;C\\c|\4\2>>@@\5\2\13\f\17\17\"\"\u009e\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\64\3\2\2\2\7\66\3\2\2"+
		"\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21C\3\2\2\2\23H\3\2\2"+
		"\2\25L\3\2\2\2\27N\3\2\2\2\31Q\3\2\2\2\33V\3\2\2\2\35Z\3\2\2\2\37\\\3"+
		"\2\2\2!a\3\2\2\2#c\3\2\2\2%n\3\2\2\2\'p\3\2\2\2)x\3\2\2\2+\u0089\3\2\2"+
		"\2-\u008e\3\2\2\2/\60\7h\2\2\60\61\7w\2\2\61\62\7p\2\2\62\63\7e\2\2\63"+
		"\4\3\2\2\2\64\65\7*\2\2\65\6\3\2\2\2\66\67\7+\2\2\67\b\3\2\2\289\7}\2"+
		"\29\n\3\2\2\2:;\7.\2\2;\f\3\2\2\2<=\7\177\2\2=\16\3\2\2\2>?\7o\2\2?@\7"+
		"c\2\2@A\7k\2\2AB\7p\2\2B\20\3\2\2\2CD\7x\2\2DE\7q\2\2EF\7k\2\2FG\7f\2"+
		"\2G\22\3\2\2\2HI\7k\2\2IJ\7p\2\2JK\7v\2\2K\24\3\2\2\2LM\7?\2\2M\26\3\2"+
		"\2\2NO\7k\2\2OP\7h\2\2P\30\3\2\2\2QR\7g\2\2RS\7n\2\2ST\7u\2\2TU\7g\2\2"+
		"U\32\3\2\2\2VW\7h\2\2WX\7q\2\2XY\7t\2\2Y\34\3\2\2\2Z[\7=\2\2[\36\3\2\2"+
		"\2\\]\7d\2\2]^\7q\2\2^_\7q\2\2_`\7n\2\2` \3\2\2\2ab\t\2\2\2b\"\3\2\2\2"+
		"cd\t\3\2\2d$\3\2\2\2ef\7v\2\2fg\7t\2\2gh\7w\2\2ho\7g\2\2ij\7h\2\2jk\7"+
		"c\2\2kl\7n\2\2lm\7u\2\2mo\7g\2\2ne\3\2\2\2ni\3\2\2\2o&\3\2\2\2pt\t\4\2"+
		"\2qs\t\5\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vt\3\2\2"+
		"\2wy\7/\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2z|\4\62;\2{z\3\2\2\2|}\3\2\2"+
		"\2}{\3\2\2\2}~\3\2\2\2~*\3\2\2\2\177\u008a\t\6\2\2\u0080\u0081\7>\2\2"+
		"\u0081\u008a\7?\2\2\u0082\u0083\7@\2\2\u0083\u008a\7?\2\2\u0084\u0085"+
		"\7#\2\2\u0085\u008a\7?\2\2\u0086\u0087\7?\2\2\u0087\u008a\7?\2\2\u0088"+
		"\u008a\7?\2\2\u0089\177\3\2\2\2\u0089\u0080\3\2\2\2\u0089\u0082\3\2\2"+
		"\2\u0089\u0084\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0088\3\2\2\2\u008a,"+
		"\3\2\2\2\u008b\u008f\t\7\2\2\u008c\u008d\7\"\2\2\u008d\u008f\7\16\2\2"+
		"\u008e\u008b\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\27\2\2"+
		"\u0093.\3\2\2\2\n\2ntx}\u0089\u008e\u0090\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}