// Generated from SQLMini.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLMiniParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, INSERT=3, INTO=4, SELECT=5, VALUES=6, ESTRELLA=7, FROM=8, 
		INT=9, VINT=10, DECIMAL=11, VARCHAR=12, BOOLEAN=13, TRUE=14, FALSE=15, 
		DPARE=16, IPARE=17, PYC=18, COM=19, PTO=20, ID=21, STRING=22, WS=23;
	public static final int
		RULE_program = 0, RULE_query = 1, RULE_create = 2, RULE_insert = 3, RULE_select = 4, 
		RULE_tipoDato = 5, RULE_dato = 6, RULE_bool = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "query", "create", "insert", "select", "tipoDato", "dato", 
			"bool"
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

	@Override
	public String getGrammarFileName() { return "SQLMini.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLMiniParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(16);
				query();
				}
				}
				setState(19); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 42L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public CreateContext create() {
			return getRuleContext(CreateContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			setState(24);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(21);
				create();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(22);
				insert();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				select();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLMiniParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLMiniParser.TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLMiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLMiniParser.ID, i);
		}
		public TerminalNode IPARE() { return getToken(SQLMiniParser.IPARE, 0); }
		public List<TipoDatoContext> tipoDato() {
			return getRuleContexts(TipoDatoContext.class);
		}
		public TipoDatoContext tipoDato(int i) {
			return getRuleContext(TipoDatoContext.class,i);
		}
		public TerminalNode DPARE() { return getToken(SQLMiniParser.DPARE, 0); }
		public TerminalNode PYC() { return getToken(SQLMiniParser.PYC, 0); }
		public List<TerminalNode> COM() { return getTokens(SQLMiniParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(SQLMiniParser.COM, i);
		}
		public CreateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterCreate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitCreate(this);
		}
	}

	public final CreateContext create() throws RecognitionException {
		CreateContext _localctx = new CreateContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_create);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(CREATE);
			setState(27);
			match(TABLE);
			setState(28);
			match(ID);
			setState(29);
			match(IPARE);
			setState(30);
			tipoDato();
			setState(31);
			match(ID);
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(32);
				match(COM);
				setState(33);
				tipoDato();
				setState(34);
				match(ID);
				}
				}
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41);
			match(DPARE);
			setState(42);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLMiniParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLMiniParser.INTO, 0); }
		public TerminalNode ID() { return getToken(SQLMiniParser.ID, 0); }
		public TerminalNode VALUES() { return getToken(SQLMiniParser.VALUES, 0); }
		public List<TerminalNode> IPARE() { return getTokens(SQLMiniParser.IPARE); }
		public TerminalNode IPARE(int i) {
			return getToken(SQLMiniParser.IPARE, i);
		}
		public List<DatoContext> dato() {
			return getRuleContexts(DatoContext.class);
		}
		public DatoContext dato(int i) {
			return getRuleContext(DatoContext.class,i);
		}
		public List<TerminalNode> DPARE() { return getTokens(SQLMiniParser.DPARE); }
		public TerminalNode DPARE(int i) {
			return getToken(SQLMiniParser.DPARE, i);
		}
		public TerminalNode PYC() { return getToken(SQLMiniParser.PYC, 0); }
		public List<TerminalNode> COM() { return getTokens(SQLMiniParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(SQLMiniParser.COM, i);
		}
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitInsert(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INSERT);
			setState(45);
			match(INTO);
			setState(46);
			match(ID);
			setState(47);
			match(VALUES);
			setState(48);
			match(IPARE);
			setState(49);
			dato();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(50);
				match(COM);
				setState(51);
				dato();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			match(DPARE);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COM) {
				{
				{
				setState(58);
				match(COM);
				setState(59);
				match(IPARE);
				setState(60);
				dato();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(61);
					match(COM);
					setState(62);
					dato();
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(68);
				match(DPARE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLMiniParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(SQLMiniParser.FROM, 0); }
		public List<TerminalNode> ID() { return getTokens(SQLMiniParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SQLMiniParser.ID, i);
		}
		public TerminalNode PYC() { return getToken(SQLMiniParser.PYC, 0); }
		public TerminalNode ESTRELLA() { return getToken(SQLMiniParser.ESTRELLA, 0); }
		public List<TerminalNode> COM() { return getTokens(SQLMiniParser.COM); }
		public TerminalNode COM(int i) {
			return getToken(SQLMiniParser.COM, i);
		}
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitSelect(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(SELECT);
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ESTRELLA:
				{
				setState(78);
				match(ESTRELLA);
				}
				break;
			case ID:
				{
				setState(79);
				match(ID);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COM) {
					{
					{
					setState(80);
					match(COM);
					setState(81);
					match(ID);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(89);
			match(FROM);
			setState(90);
			match(ID);
			setState(91);
			match(PYC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoDatoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(SQLMiniParser.INT, 0); }
		public TerminalNode DECIMAL() { return getToken(SQLMiniParser.DECIMAL, 0); }
		public TerminalNode IPARE() { return getToken(SQLMiniParser.IPARE, 0); }
		public List<TerminalNode> VINT() { return getTokens(SQLMiniParser.VINT); }
		public TerminalNode VINT(int i) {
			return getToken(SQLMiniParser.VINT, i);
		}
		public TerminalNode COM() { return getToken(SQLMiniParser.COM, 0); }
		public TerminalNode DPARE() { return getToken(SQLMiniParser.DPARE, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLMiniParser.VARCHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLMiniParser.BOOLEAN, 0); }
		public TipoDatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoDato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterTipoDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitTipoDato(this);
		}
	}

	public final TipoDatoContext tipoDato() throws RecognitionException {
		TipoDatoContext _localctx = new TipoDatoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoDato);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(INT);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(DECIMAL);
				setState(95);
				match(IPARE);
				setState(96);
				match(VINT);
				setState(97);
				match(COM);
				setState(98);
				match(VINT);
				setState(99);
				match(DPARE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(VARCHAR);
				setState(101);
				match(IPARE);
				setState(102);
				match(VINT);
				setState(103);
				match(DPARE);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DatoContext extends ParserRuleContext {
		public List<TerminalNode> VINT() { return getTokens(SQLMiniParser.VINT); }
		public TerminalNode VINT(int i) {
			return getToken(SQLMiniParser.VINT, i);
		}
		public TerminalNode STRING() { return getToken(SQLMiniParser.STRING, 0); }
		public TerminalNode PTO() { return getToken(SQLMiniParser.PTO, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public DatoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterDato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitDato(this);
		}
	}

	public final DatoContext dato() throws RecognitionException {
		DatoContext _localctx = new DatoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_dato);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(VINT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(VINT);
				setState(110);
				match(PTO);
				setState(111);
				match(VINT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				bool();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLMiniParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLMiniParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMiniListener ) ((SQLMiniListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
		"\u0004\u0001\u0017v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0004\u0000\u0012\b\u0000\u000b\u0000\f\u0000\u0013\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002%\b\u0002\n\u0002\f\u0002(\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"5\b\u0003\n\u0003\f\u00038\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003@\b\u0003\n\u0003\f\u0003"+
		"C\t\u0003\u0001\u0003\u0001\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003"+
		"J\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004S\b\u0004\n\u0004\f\u0004V\t\u0004"+
		"\u0003\u0004X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005j\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006r\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0000\u0000\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001"+
		"\u0001\u0000\u000e\u000f|\u0000\u0011\u0001\u0000\u0000\u0000\u0002\u0018"+
		"\u0001\u0000\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006,\u0001"+
		"\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000\u0000"+
		"\fq\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010\u0012"+
		"\u0003\u0002\u0001\u0000\u0011\u0010\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0001\u0000\u0000\u0000\u0013\u0011\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0001\u0000\u0000\u0000\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0019"+
		"\u0003\u0004\u0002\u0000\u0016\u0019\u0003\u0006\u0003\u0000\u0017\u0019"+
		"\u0003\b\u0004\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0018\u0016\u0001"+
		"\u0000\u0000\u0000\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u0003\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c\u0005"+
		"\u0002\u0000\u0000\u001c\u001d\u0005\u0015\u0000\u0000\u001d\u001e\u0005"+
		"\u0011\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000\u001f&\u0005\u0015"+
		"\u0000\u0000 !\u0005\u0013\u0000\u0000!\"\u0003\n\u0005\u0000\"#\u0005"+
		"\u0015\u0000\u0000#%\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000"+
		"%(\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000"+
		"\u0000\')\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)*\u0005\u0010"+
		"\u0000\u0000*+\u0005\u0012\u0000\u0000+\u0005\u0001\u0000\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u0015\u0000"+
		"\u0000/0\u0005\u0006\u0000\u000001\u0005\u0011\u0000\u000016\u0003\f\u0006"+
		"\u000023\u0005\u0013\u0000\u000035\u0003\f\u0006\u000042\u0001\u0000\u0000"+
		"\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u000079\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u00009H\u0005"+
		"\u0010\u0000\u0000:;\u0005\u0013\u0000\u0000;<\u0005\u0011\u0000\u0000"+
		"<A\u0003\f\u0006\u0000=>\u0005\u0013\u0000\u0000>@\u0003\f\u0006\u0000"+
		"?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000"+
		"\u0000\u0000DE\u0005\u0010\u0000\u0000EG\u0001\u0000\u0000\u0000F:\u0001"+
		"\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KL\u0005\u0012\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MW\u0005"+
		"\u0005\u0000\u0000NX\u0005\u0007\u0000\u0000OT\u0005\u0015\u0000\u0000"+
		"PQ\u0005\u0013\u0000\u0000QS\u0005\u0015\u0000\u0000RP\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WN\u0001"+
		"\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000"+
		"YZ\u0005\b\u0000\u0000Z[\u0005\u0015\u0000\u0000[\\\u0005\u0012\u0000"+
		"\u0000\\\t\u0001\u0000\u0000\u0000]j\u0005\t\u0000\u0000^_\u0005\u000b"+
		"\u0000\u0000_`\u0005\u0011\u0000\u0000`a\u0005\n\u0000\u0000ab\u0005\u0013"+
		"\u0000\u0000bc\u0005\n\u0000\u0000cj\u0005\u0010\u0000\u0000de\u0005\f"+
		"\u0000\u0000ef\u0005\u0011\u0000\u0000fg\u0005\n\u0000\u0000gj\u0005\u0010"+
		"\u0000\u0000hj\u0005\r\u0000\u0000i]\u0001\u0000\u0000\u0000i^\u0001\u0000"+
		"\u0000\u0000id\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000j\u000b"+
		"\u0001\u0000\u0000\u0000kr\u0005\n\u0000\u0000lr\u0005\u0016\u0000\u0000"+
		"mn\u0005\n\u0000\u0000no\u0005\u0014\u0000\u0000or\u0005\n\u0000\u0000"+
		"pr\u0003\u000e\u0007\u0000qk\u0001\u0000\u0000\u0000ql\u0001\u0000\u0000"+
		"\u0000qm\u0001\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000r\r\u0001\u0000"+
		"\u0000\u0000st\u0007\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000"+
		"\n\u0013\u0018&6AHTWiq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}