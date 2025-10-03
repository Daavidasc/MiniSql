// Generated from SQLMini.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLMiniLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, INSERT=3, INTO=4, SELECT=5, VALUES=6, ESTRELLA=7, FROM=8, 
		INT=9, VINT=10, DECIMAL=11, VARCHAR=12, BOOLEAN=13, TRUE=14, FALSE=15, 
		DPARE=16, IPARE=17, PYC=18, COM=19, PTO=20, ID=21, STRING=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CREATE", "TABLE", "INSERT", "INTO", "SELECT", "VALUES", "ESTRELLA", 
			"FROM", "INT", "VINT", "DECIMAL", "VARCHAR", "BOOLEAN", "TRUE", "FALSE", 
			"DPARE", "IPARE", "PYC", "COM", "PTO", "ID", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'TABLE'", "'INSERT'", "'INTO'", "'SELECT'", "'VALUES'", 
			"'*'", "'FROM'", "'int'", null, "'decimal'", "'varchar'", "'boolean'", 
			"'true'", "'false'", "')'", "'('", "';'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "INSERT", "INTO", "SELECT", "VALUES", "ESTRELLA", 
			"FROM", "INT", "VINT", "DECIMAL", "VARCHAR", "BOOLEAN", "TRUE", "FALSE", 
			"DPARE", "IPARE", "PYC", "COM", "PTO", "ID", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SQLMiniLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLMini.g4"; }

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
		"\u0004\u0000\u0017\u00aa\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004"+
		"\tc\b\t\u000b\t\f\td\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0096\b\u0014\n\u0014\f\u0014\u0099\t\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u009d\b\u0015\n\u0015\f\u0015\u00a0\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0004\u0016\u00a5\b\u0016\u000b\u0016\f\u0016\u00a6"+
		"\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0005\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000\'\'\u0003\u0000\t"+
		"\n\r\r  \u00ad\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0001/\u0001\u0000\u0000\u0000\u00036\u0001\u0000\u0000\u0000\u0005"+
		"<\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\tH\u0001\u0000"+
		"\u0000\u0000\u000bO\u0001\u0000\u0000\u0000\rV\u0001\u0000\u0000\u0000"+
		"\u000fX\u0001\u0000\u0000\u0000\u0011]\u0001\u0000\u0000\u0000\u0013b"+
		"\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017n\u0001\u0000"+
		"\u0000\u0000\u0019v\u0001\u0000\u0000\u0000\u001b~\u0001\u0000\u0000\u0000"+
		"\u001d\u0083\u0001\u0000\u0000\u0000\u001f\u0089\u0001\u0000\u0000\u0000"+
		"!\u008b\u0001\u0000\u0000\u0000#\u008d\u0001\u0000\u0000\u0000%\u008f"+
		"\u0001\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000)\u0093\u0001"+
		"\u0000\u0000\u0000+\u009a\u0001\u0000\u0000\u0000-\u00a4\u0001\u0000\u0000"+
		"\u0000/0\u0005C\u0000\u000001\u0005R\u0000\u000012\u0005E\u0000\u0000"+
		"23\u0005A\u0000\u000034\u0005T\u0000\u000045\u0005E\u0000\u00005\u0002"+
		"\u0001\u0000\u0000\u000067\u0005T\u0000\u000078\u0005A\u0000\u000089\u0005"+
		"B\u0000\u00009:\u0005L\u0000\u0000:;\u0005E\u0000\u0000;\u0004\u0001\u0000"+
		"\u0000\u0000<=\u0005I\u0000\u0000=>\u0005N\u0000\u0000>?\u0005S\u0000"+
		"\u0000?@\u0005E\u0000\u0000@A\u0005R\u0000\u0000AB\u0005T\u0000\u0000"+
		"B\u0006\u0001\u0000\u0000\u0000CD\u0005I\u0000\u0000DE\u0005N\u0000\u0000"+
		"EF\u0005T\u0000\u0000FG\u0005O\u0000\u0000G\b\u0001\u0000\u0000\u0000"+
		"HI\u0005S\u0000\u0000IJ\u0005E\u0000\u0000JK\u0005L\u0000\u0000KL\u0005"+
		"E\u0000\u0000LM\u0005C\u0000\u0000MN\u0005T\u0000\u0000N\n\u0001\u0000"+
		"\u0000\u0000OP\u0005V\u0000\u0000PQ\u0005A\u0000\u0000QR\u0005L\u0000"+
		"\u0000RS\u0005U\u0000\u0000ST\u0005E\u0000\u0000TU\u0005S\u0000\u0000"+
		"U\f\u0001\u0000\u0000\u0000VW\u0005*\u0000\u0000W\u000e\u0001\u0000\u0000"+
		"\u0000XY\u0005F\u0000\u0000YZ\u0005R\u0000\u0000Z[\u0005O\u0000\u0000"+
		"[\\\u0005M\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]^\u0005i\u0000"+
		"\u0000^_\u0005n\u0000\u0000_`\u0005t\u0000\u0000`\u0012\u0001\u0000\u0000"+
		"\u0000ac\u0007\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000e\u0014"+
		"\u0001\u0000\u0000\u0000fg\u0005d\u0000\u0000gh\u0005e\u0000\u0000hi\u0005"+
		"c\u0000\u0000ij\u0005i\u0000\u0000jk\u0005m\u0000\u0000kl\u0005a\u0000"+
		"\u0000lm\u0005l\u0000\u0000m\u0016\u0001\u0000\u0000\u0000no\u0005v\u0000"+
		"\u0000op\u0005a\u0000\u0000pq\u0005r\u0000\u0000qr\u0005c\u0000\u0000"+
		"rs\u0005h\u0000\u0000st\u0005a\u0000\u0000tu\u0005r\u0000\u0000u\u0018"+
		"\u0001\u0000\u0000\u0000vw\u0005b\u0000\u0000wx\u0005o\u0000\u0000xy\u0005"+
		"o\u0000\u0000yz\u0005l\u0000\u0000z{\u0005e\u0000\u0000{|\u0005a\u0000"+
		"\u0000|}\u0005n\u0000\u0000}\u001a\u0001\u0000\u0000\u0000~\u007f\u0005"+
		"t\u0000\u0000\u007f\u0080\u0005r\u0000\u0000\u0080\u0081\u0005u\u0000"+
		"\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u001c\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0005f\u0000\u0000\u0084\u0085\u0005a\u0000\u0000\u0085\u0086"+
		"\u0005l\u0000\u0000\u0086\u0087\u0005s\u0000\u0000\u0087\u0088\u0005e"+
		"\u0000\u0000\u0088\u001e\u0001\u0000\u0000\u0000\u0089\u008a\u0005)\u0000"+
		"\u0000\u008a \u0001\u0000\u0000\u0000\u008b\u008c\u0005(\u0000\u0000\u008c"+
		"\"\u0001\u0000\u0000\u0000\u008d\u008e\u0005;\u0000\u0000\u008e$\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0005,\u0000\u0000\u0090&\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0005.\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093"+
		"\u0097\u0007\u0001\u0000\u0000\u0094\u0096\u0007\u0002\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"*\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009e"+
		"\u0005\'\u0000\u0000\u009b\u009d\b\u0003\u0000\u0000\u009c\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001"+
		"\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		"\'\u0000\u0000\u00a2,\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0004"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\u0016"+
		"\u0000\u0000\u00a9.\u0001\u0000\u0000\u0000\u0005\u0000d\u0097\u009e\u00a6"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}