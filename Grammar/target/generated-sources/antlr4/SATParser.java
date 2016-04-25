// Generated from SAT.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SATParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, ADDING_OPERATOR=16, 
		MULTIPLYING_OPERATOR=17, BOOL=18, ID=19, NUM=20, RELOP=21, WS=22;
	public static final int
		RULE_main = 0, RULE_function = 1, RULE_funcCall = 2, RULE_name = 3, RULE_rtType = 4, 
		RULE_st_list = 5, RULE_st = 6, RULE_sim_st = 7, RULE_assi_expr = 8, RULE_con_st = 9, 
		RULE_ite_st = 10, RULE_com_st = 11, RULE_exp = 12, RULE_term = 13, RULE_factor = 14, 
		RULE_con = 15, RULE_simpleExp = 16, RULE_dt = 17, RULE_params = 18, RULE_ini = 19, 
		RULE_modif = 20, RULE_var = 21;
	public static final String[] ruleNames = {
		"main", "function", "funcCall", "name", "rtType", "st_list", "st", "sim_st", 
		"assi_expr", "con_st", "ite_st", "com_st", "exp", "term", "factor", "con", 
		"simpleExp", "dt", "params", "ini", "modif", "var"
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

	@Override
	public String getGrammarFileName() { return "SAT.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SATParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MainContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==T__8) {
				{
				{
				setState(44);
				function();
				}
				}
				setState(49);
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

	public static class FunctionContext extends ParserRuleContext {
		public RtTypeContext rtType() {
			return getRuleContext(RtTypeContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public St_listContext st_list() {
			return getRuleContext(St_listContext.class,0);
		}
		public List<DtContext> dt() {
			return getRuleContexts(DtContext.class);
		}
		public DtContext dt(int i) {
			return getRuleContext(DtContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SATParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SATParser.ID, i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			rtType();
			setState(51);
			match(T__0);
			setState(52);
			name();
			setState(53);
			match(T__1);
			setState(54);
			params();
			setState(55);
			match(T__2);
			setState(56);
			match(T__3);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__14) {
				{
				{
				setState(57);
				dt();
				setState(58);
				match(ID);
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(59);
					match(T__4);
					setState(60);
					match(ID);
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			st_list();
			setState(72);
			match(T__5);
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

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitFuncCall(this);
		}
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__0);
			setState(75);
			match(ID);
			setState(76);
			match(T__1);
			setState(77);
			match(T__2);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==ID) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RtTypeContext extends ParserRuleContext {
		public RtTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterRtType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitRtType(this);
		}
	}

	public final RtTypeContext rtType() throws RecognitionException {
		RtTypeContext _localctx = new RtTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rtType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class St_listContext extends ParserRuleContext {
		public List<StContext> st() {
			return getRuleContexts(StContext.class);
		}
		public StContext st(int i) {
			return getRuleContext(StContext.class,i);
		}
		public St_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterSt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitSt_list(this);
		}
	}

	public final St_listContext st_list() throws RecognitionException {
		St_listContext _localctx = new St_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_st_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83);
				st();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__10) | (1L << T__12) | (1L << ID) | (1L << NUM))) != 0) );
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

	public static class StContext extends ParserRuleContext {
		public Sim_stContext sim_st() {
			return getRuleContext(Sim_stContext.class,0);
		}
		public Con_stContext con_st() {
			return getRuleContext(Con_stContext.class,0);
		}
		public Ite_stContext ite_st() {
			return getRuleContext(Ite_stContext.class,0);
		}
		public Com_stContext com_st() {
			return getRuleContext(Com_stContext.class,0);
		}
		public StContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterSt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitSt(this);
		}
	}

	public final StContext st() throws RecognitionException {
		StContext _localctx = new StContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_st);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case T__1:
			case ID:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				sim_st();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				con_st();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				ite_st();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				com_st();
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

	public static class Sim_stContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public Assi_exprContext assi_expr() {
			return getRuleContext(Assi_exprContext.class,0);
		}
		public Sim_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sim_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterSim_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitSim_st(this);
		}
	}

	public final Sim_stContext sim_st() throws RecognitionException {
		Sim_stContext _localctx = new Sim_stContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sim_st);
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(94);
						exp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(97); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				assi_expr();
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

	public static class Assi_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Assi_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assi_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterAssi_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitAssi_expr(this);
		}
	}

	public final Assi_exprContext assi_expr() throws RecognitionException {
		Assi_exprContext _localctx = new Assi_exprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assi_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(T__9);
			setState(104);
			var();
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

	public static class Con_stContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public List<Com_stContext> com_st() {
			return getRuleContexts(Com_stContext.class);
		}
		public Com_stContext com_st(int i) {
			return getRuleContext(Com_stContext.class,i);
		}
		public Con_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterCon_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitCon_st(this);
		}
	}

	public final Con_stContext con_st() throws RecognitionException {
		Con_stContext _localctx = new Con_stContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_con_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__10);
			setState(107);
			match(T__1);
			setState(108);
			con();
			setState(109);
			match(T__2);
			setState(110);
			com_st();
			setState(113);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(111);
				match(T__11);
				setState(112);
				com_st();
				}
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

	public static class Ite_stContext extends ParserRuleContext {
		public IniContext ini() {
			return getRuleContext(IniContext.class,0);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public ModifContext modif() {
			return getRuleContext(ModifContext.class,0);
		}
		public Com_stContext com_st() {
			return getRuleContext(Com_stContext.class,0);
		}
		public Ite_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ite_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterIte_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitIte_st(this);
		}
	}

	public final Ite_stContext ite_st() throws RecognitionException {
		Ite_stContext _localctx = new Ite_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ite_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__12);
			setState(116);
			match(T__1);
			setState(117);
			ini();
			setState(118);
			match(T__13);
			setState(119);
			con();
			setState(120);
			match(T__13);
			setState(121);
			modif();
			setState(122);
			match(T__2);
			setState(123);
			com_st();
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

	public static class Com_stContext extends ParserRuleContext {
		public St_listContext st_list() {
			return getRuleContext(St_listContext.class,0);
		}
		public Com_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterCom_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitCom_st(this);
		}
	}

	public final Com_stContext com_st() throws RecognitionException {
		Com_stContext _localctx = new Com_stContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_com_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__3);
			setState(126);
			st_list();
			setState(127);
			match(T__5);
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

	public static class ExpContext extends ParserRuleContext {
		public List<SimpleExpContext> simpleExp() {
			return getRuleContexts(SimpleExpContext.class);
		}
		public SimpleExpContext simpleExp(int i) {
			return getRuleContext(SimpleExpContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(SATParser.RELOP, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			simpleExp();
			setState(132);
			_la = _input.LA(1);
			if (_la==RELOP) {
				{
				setState(130);
				match(RELOP);
				setState(131);
				simpleExp();
				}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MULTIPLYING_OPERATOR() { return getTokens(SATParser.MULTIPLYING_OPERATOR); }
		public TerminalNode MULTIPLYING_OPERATOR(int i) {
			return getToken(SATParser.MULTIPLYING_OPERATOR, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			factor();
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLYING_OPERATOR) {
				{
				{
				setState(135);
				match(MULTIPLYING_OPERATOR);
				setState(136);
				factor();
				}
				}
				setState(141);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(SATParser.NUM, 0); }
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			switch (_input.LA(1)) {
			case NUM:
				{
				setState(142);
				match(NUM);
				}
				break;
			case ID:
				{
				setState(143);
				match(ID);
				}
				break;
			case T__1:
				{
				setState(144);
				match(T__1);
				setState(145);
				exp();
				setState(146);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode RELOP() { return getToken(SATParser.RELOP, 0); }
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitCon(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_con);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			var();
			setState(151);
			match(RELOP);
			setState(152);
			var();
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

	public static class SimpleExpContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADDING_OPERATOR() { return getTokens(SATParser.ADDING_OPERATOR); }
		public TerminalNode ADDING_OPERATOR(int i) {
			return getToken(SATParser.ADDING_OPERATOR, i);
		}
		public SimpleExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterSimpleExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitSimpleExp(this);
		}
	}

	public final SimpleExpContext simpleExp() throws RecognitionException {
		SimpleExpContext _localctx = new SimpleExpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			term();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADDING_OPERATOR) {
				{
				{
				setState(155);
				match(ADDING_OPERATOR);
				setState(156);
				term();
				}
				}
				setState(161);
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

	public static class DtContext extends ParserRuleContext {
		public DtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterDt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitDt(this);
		}
	}

	public final DtContext dt() throws RecognitionException {
		DtContext _localctx = new DtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_la = _input.LA(1);
			if ( !(_la==T__8 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ParamsContext extends ParserRuleContext {
		public List<DtContext> dt() {
			return getRuleContexts(DtContext.class);
		}
		public DtContext dt(int i) {
			return getRuleContext(DtContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(SATParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SATParser.ID, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(167);
			_la = _input.LA(1);
			if (_la==T__8 || _la==T__14) {
				{
				setState(164);
				dt();
				setState(165);
				match(ID);
				}
			}

			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(169);
				match(T__4);
				setState(170);
				dt();
				setState(171);
				match(ID);
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IniContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IniContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ini; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterIni(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitIni(this);
		}
	}

	public final IniContext ini() throws RecognitionException {
		IniContext _localctx = new IniContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(ID);
			setState(179);
			match(T__9);
			setState(180);
			var();
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

	public static class ModifContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode ADDING_OPERATOR() { return getToken(SATParser.ADDING_OPERATOR, 0); }
		public TerminalNode MULTIPLYING_OPERATOR() { return getToken(SATParser.MULTIPLYING_OPERATOR, 0); }
		public ModifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterModif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitModif(this);
		}
	}

	public final ModifContext modif() throws RecognitionException {
		ModifContext _localctx = new ModifContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_modif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(ID);
			setState(183);
			match(T__9);
			{
			setState(184);
			var();
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==ADDING_OPERATOR || _la==MULTIPLYING_OPERATOR) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(186);
			var();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SATParser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u00c1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f\3"+
		"\16\3C\13\3\7\3E\n\3\f\3\16\3H\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\6\7W\n\7\r\7\16\7X\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\6\t"+
		"b\n\t\r\t\16\tc\3\t\5\tg\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\5\16\u0087\n\16\3\17\3\17\3\17\7\17\u008c\n\17"+
		"\f\17\16\17\u008f\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0097\n\20"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u00a0\n\22\f\22\16\22\u00a3\13"+
		"\22\3\23\3\23\3\24\3\24\3\24\5\24\u00aa\n\24\3\24\3\24\3\24\3\24\7\24"+
		"\u00b0\n\24\f\24\16\24\u00b3\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,\2\7\4\2\t\t\25\25\3\2\n\13\4\2\13\13\21\21\3\2\22\23\3"+
		"\2\25\26\u00bb\2\61\3\2\2\2\4\64\3\2\2\2\6L\3\2\2\2\bQ\3\2\2\2\nS\3\2"+
		"\2\2\fV\3\2\2\2\16^\3\2\2\2\20f\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2\26u\3"+
		"\2\2\2\30\177\3\2\2\2\32\u0083\3\2\2\2\34\u0088\3\2\2\2\36\u0096\3\2\2"+
		"\2 \u0098\3\2\2\2\"\u009c\3\2\2\2$\u00a4\3\2\2\2&\u00a9\3\2\2\2(\u00b4"+
		"\3\2\2\2*\u00b8\3\2\2\2,\u00be\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\5\n\6"+
		"\2\65\66\7\3\2\2\66\67\5\b\5\2\678\7\4\2\289\5&\24\29:\7\5\2\2:F\7\6\2"+
		"\2;<\5$\23\2<A\7\25\2\2=>\7\7\2\2>@\7\25\2\2?=\3\2\2\2@C\3\2\2\2A?\3\2"+
		"\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D;\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GI\3\2\2\2HF\3\2\2\2IJ\5\f\7\2JK\7\b\2\2K\5\3\2\2\2LM\7\3\2\2MN\7"+
		"\25\2\2NO\7\4\2\2OP\7\5\2\2P\7\3\2\2\2QR\t\2\2\2R\t\3\2\2\2ST\t\3\2\2"+
		"T\13\3\2\2\2UW\5\16\b\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\r\3\2"+
		"\2\2Z_\5\20\t\2[_\5\24\13\2\\_\5\26\f\2]_\5\30\r\2^Z\3\2\2\2^[\3\2\2\2"+
		"^\\\3\2\2\2^]\3\2\2\2_\17\3\2\2\2`b\5\32\16\2a`\3\2\2\2bc\3\2\2\2ca\3"+
		"\2\2\2cd\3\2\2\2dg\3\2\2\2eg\5\22\n\2fa\3\2\2\2fe\3\2\2\2g\21\3\2\2\2"+
		"hi\7\25\2\2ij\7\f\2\2jk\5,\27\2k\23\3\2\2\2lm\7\r\2\2mn\7\4\2\2no\5 \21"+
		"\2op\7\5\2\2ps\5\30\r\2qr\7\16\2\2rt\5\30\r\2sq\3\2\2\2st\3\2\2\2t\25"+
		"\3\2\2\2uv\7\17\2\2vw\7\4\2\2wx\5(\25\2xy\7\20\2\2yz\5 \21\2z{\7\20\2"+
		"\2{|\5*\26\2|}\7\5\2\2}~\5\30\r\2~\27\3\2\2\2\177\u0080\7\6\2\2\u0080"+
		"\u0081\5\f\7\2\u0081\u0082\7\b\2\2\u0082\31\3\2\2\2\u0083\u0086\5\"\22"+
		"\2\u0084\u0085\7\27\2\2\u0085\u0087\5\"\22\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\33\3\2\2\2\u0088\u008d\5\36\20\2\u0089\u008a\7\23"+
		"\2\2\u008a\u008c\5\36\20\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\35\3\2\2\2\u008f\u008d\3\2\2"+
		"\2\u0090\u0097\7\26\2\2\u0091\u0097\7\25\2\2\u0092\u0093\7\4\2\2\u0093"+
		"\u0094\5\32\16\2\u0094\u0095\7\5\2\2\u0095\u0097\3\2\2\2\u0096\u0090\3"+
		"\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097\37\3\2\2\2\u0098"+
		"\u0099\5,\27\2\u0099\u009a\7\27\2\2\u009a\u009b\5,\27\2\u009b!\3\2\2\2"+
		"\u009c\u00a1\5\34\17\2\u009d\u009e\7\22\2\2\u009e\u00a0\5\34\17\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2#\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5%\3\2"+
		"\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\7\25\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a6\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b1\3\2\2\2\u00ab\u00ac\7\7"+
		"\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7\25\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\'\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7\25\2\2\u00b5\u00b6"+
		"\7\f\2\2\u00b6\u00b7\5,\27\2\u00b7)\3\2\2\2\u00b8\u00b9\7\25\2\2\u00b9"+
		"\u00ba\7\f\2\2\u00ba\u00bb\5,\27\2\u00bb\u00bc\t\5\2\2\u00bc\u00bd\5,"+
		"\27\2\u00bd+\3\2\2\2\u00be\u00bf\t\6\2\2\u00bf-\3\2\2\2\20\61AFX^cfs\u0086"+
		"\u008d\u0096\u00a1\u00a9\u00b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}