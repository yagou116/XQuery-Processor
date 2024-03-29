package XPath;// Generated from /Users/yaxudai/Documents/2017-18Winter/CSE232_Proj/src/XPath.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XPathLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		ValueEQ=18, IdEQ=19, ID=20, FILENAME=21, WHITESPACE=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"ValueEQ", "IdEQ", "ID", "FILENAME", "WHITESPACE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'doc(\"'", "'\")'", "'/'", "'//'", "'*'", "'.'", "'..'", "'text()'", 
		"'@'", "'('", "')'", "'['", "']'", "','", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "ValueEQ", "IdEQ", "ID", "FILENAME", 
		"WHITESPACE"
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


	public XPathLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "XPath/XPath.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23f\n\23\3\24\3\24\3\24\3\24\5\24l\n\24\3\25\6\25o\n\25\r\25\16"+
		"\25p\3\26\6\26t\n\26\r\26\16\26u\3\27\6\27y\n\27\r\27\16\27z\3\27\3\27"+
		"\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\5\7\2//\62;C\\aac|\7\2\60"+
		"\60\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0082\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\65\3\2\2\2\78\3\2\2\2\t"+
		":\3\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17A\3\2\2\2\21D\3\2\2\2\23K\3\2\2\2\25"+
		"M\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2"+
		"![\3\2\2\2#^\3\2\2\2%e\3\2\2\2\'k\3\2\2\2)n\3\2\2\2+s\3\2\2\2-x\3\2\2"+
		"\2/\60\7f\2\2\60\61\7q\2\2\61\62\7e\2\2\62\63\7*\2\2\63\64\7$\2\2\64\4"+
		"\3\2\2\2\65\66\7$\2\2\66\67\7+\2\2\67\6\3\2\2\289\7\61\2\29\b\3\2\2\2"+
		":;\7\61\2\2;<\7\61\2\2<\n\3\2\2\2=>\7,\2\2>\f\3\2\2\2?@\7\60\2\2@\16\3"+
		"\2\2\2AB\7\60\2\2BC\7\60\2\2C\20\3\2\2\2DE\7v\2\2EF\7g\2\2FG\7z\2\2GH"+
		"\7v\2\2HI\7*\2\2IJ\7+\2\2J\22\3\2\2\2KL\7B\2\2L\24\3\2\2\2MN\7*\2\2N\26"+
		"\3\2\2\2OP\7+\2\2P\30\3\2\2\2QR\7]\2\2R\32\3\2\2\2ST\7_\2\2T\34\3\2\2"+
		"\2UV\7.\2\2V\36\3\2\2\2WX\7c\2\2XY\7p\2\2YZ\7f\2\2Z \3\2\2\2[\\\7q\2\2"+
		"\\]\7t\2\2]\"\3\2\2\2^_\7p\2\2_`\7q\2\2`a\7v\2\2a$\3\2\2\2bf\7?\2\2cd"+
		"\7g\2\2df\7s\2\2eb\3\2\2\2ec\3\2\2\2f&\3\2\2\2gh\7?\2\2hl\7?\2\2ij\7k"+
		"\2\2jl\7u\2\2kg\3\2\2\2ki\3\2\2\2l(\3\2\2\2mo\t\2\2\2nm\3\2\2\2op\3\2"+
		"\2\2pn\3\2\2\2pq\3\2\2\2q*\3\2\2\2rt\t\3\2\2sr\3\2\2\2tu\3\2\2\2us\3\2"+
		"\2\2uv\3\2\2\2v,\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|}\b\27\2\2}.\3\2\2\2\b\2ekpuz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}