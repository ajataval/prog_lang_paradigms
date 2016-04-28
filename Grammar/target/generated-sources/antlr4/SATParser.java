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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		OP=18, BOOL=19, ID=20, NUM=21, RELOP=22, WS=23;
	public static final int
		RULE_main = 0, RULE_function = 1, RULE_funcCall = 2, RULE_returna = 3, 
		RULE_name = 4, RULE_print = 5, RULE_rtType = 6, RULE_st_list = 7, RULE_st = 8, 
		RULE_sim_st = 9, RULE_assi_expr = 10, RULE_con_st = 11, RULE_ite_st = 12, 
		RULE_com_st = 13, RULE_exp = 14, RULE_term = 15, RULE_factor = 16, RULE_con = 17, 
		RULE_simpleExp = 18, RULE_dt = 19, RULE_params = 20, RULE_params1 = 21, 
		RULE_ini = 22, RULE_modif = 23, RULE_var = 24;
	public static final String[] ruleNames = {
		"main", "function", "funcCall", "returna", "name", "print", "rtType", 
		"st_list", "st", "sim_st", "assi_expr", "con_st", "ite_st", "com_st", 
		"exp", "term", "factor", "con", "simpleExp", "dt", "params", "params1", 
		"ini", "modif", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "','", "'}'", "'return'", "'main'", 
		"'print'", "'void'", "'int'", "';'", "'='", "'if'", "'else'", "'for'", 
		"'bool'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "OP", "BOOL", "ID", "NUM", "RELOP", 
		"WS"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(50);
				function();
				}
				}
				setState(55);
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
			setState(56);
			rtType();
			setState(57);
			match(T__0);
			setState(58);
			name();
			setState(59);
			match(T__1);
			setState(60);
			params();
			setState(61);
			match(T__2);
			setState(62);
			match(T__3);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==T__16) {
				{
				{
				setState(63);
				dt();
				setState(64);
				match(ID);
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(65);
					match(T__4);
					setState(66);
					match(ID);
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			st_list();
			setState(78);
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
		public Params1Context params1() {
			return getRuleContext(Params1Context.class,0);
		}
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
			setState(80);
			match(ID);
			setState(81);
			match(T__1);
			setState(82);
			params1();
			setState(83);
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

	public static class ReturnaContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ReturnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterReturna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitReturna(this);
		}
	}

	public final ReturnaContext returna() throws RecognitionException {
		ReturnaContext _localctx = new ReturnaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__6);
			setState(86);
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
		enterRule(_localctx, 8, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==ID) ) {
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

	public static class PrintContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__8);
			setState(91);
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
		enterRule(_localctx, 12, RULE_rtType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		enterRule(_localctx, 14, RULE_st_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(95);
				st();
				}
				}
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__13) | (1L << T__15) | (1L << ID) | (1L << NUM))) != 0) );
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_st);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				sim_st();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				con_st();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				ite_st();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				com_st();
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

	public static class Sim_stContext extends ParserRuleContext {
		public Assi_exprContext assi_expr() {
			return getRuleContext(Assi_exprContext.class,0);
		}
		public ReturnaContext returna() {
			return getRuleContext(ReturnaContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		enterRule(_localctx, 18, RULE_sim_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(107);
					exp();
					}
					}
					setState(110); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << NUM))) != 0) );
				}
				break;
			case 2:
				{
				setState(112);
				assi_expr();
				}
				break;
			case 3:
				{
				setState(113);
				returna();
				}
				break;
			case 4:
				{
				setState(114);
				print();
				}
				break;
			}
			setState(117);
			match(T__11);
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
		public SimpleExpContext simpleExp() {
			return getRuleContext(SimpleExpContext.class,0);
		}
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
		enterRule(_localctx, 20, RULE_assi_expr);
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(ID);
				setState(120);
				match(T__12);
				setState(121);
				simpleExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				funcCall();
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
		enterRule(_localctx, 22, RULE_con_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__13);
			setState(126);
			match(T__1);
			setState(127);
			con();
			setState(128);
			match(T__2);
			setState(129);
			com_st();
			setState(132);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(130);
				match(T__14);
				setState(131);
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
		enterRule(_localctx, 24, RULE_ite_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__15);
			setState(135);
			match(T__1);
			setState(136);
			ini();
			setState(137);
			match(T__11);
			setState(138);
			con();
			setState(139);
			match(T__11);
			setState(140);
			modif();
			setState(141);
			match(T__2);
			setState(142);
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
		enterRule(_localctx, 26, RULE_com_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__3);
			setState(145);
			st_list();
			setState(146);
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
		enterRule(_localctx, 28, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			simpleExp();
			setState(151);
			_la = _input.LA(1);
			if (_la==RELOP) {
				{
				setState(149);
				match(RELOP);
				setState(150);
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
		public List<TerminalNode> OP() { return getTokens(SATParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(SATParser.OP, i);
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
		enterRule(_localctx, 30, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			factor();
			setState(158);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					match(OP);
					setState(155);
					factor();
					}
					} 
				}
				setState(160);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
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
		enterRule(_localctx, 32, RULE_factor);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(161);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(162);
					match(ID);
					}
					break;
				case T__1:
					{
					setState(163);
					match(T__1);
					setState(164);
					exp();
					setState(165);
					match(T__2);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				funcCall();
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
		enterRule(_localctx, 34, RULE_con);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			var();
			setState(173);
			match(RELOP);
			setState(174);
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
		public List<TerminalNode> OP() { return getTokens(SATParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(SATParser.OP, i);
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
		enterRule(_localctx, 36, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			term();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(177);
				match(OP);
				setState(178);
				term();
				}
				}
				setState(183);
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
		enterRule(_localctx, 38, RULE_dt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__16) ) {
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
		enterRule(_localctx, 40, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==T__10 || _la==T__16) {
				{
				setState(186);
				dt();
				setState(187);
				match(ID);
				}
			}

			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(191);
				match(T__4);
				setState(192);
				dt();
				setState(193);
				match(ID);
				}
				}
				setState(199);
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

	public static class Params1Context extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public Params1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterParams1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitParams1(this);
		}
	}

	public final Params1Context params1() throws RecognitionException {
		Params1Context _localctx = new Params1Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_params1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			var();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(201);
				match(T__4);
				setState(202);
				var();
				}
				}
				setState(207);
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
		enterRule(_localctx, 44, RULE_ini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(ID);
			setState(209);
			match(T__12);
			setState(210);
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
		public TerminalNode OP() { return getToken(SATParser.OP, 0); }
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
		enterRule(_localctx, 46, RULE_modif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(ID);
			setState(213);
			match(T__12);
			{
			setState(214);
			var();
			setState(215);
			match(OP);
			setState(216);
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
		enterRule(_localctx, 48, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00df\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3F\n\3\f\3\16\3I\13\3\7\3K\n\3\f\3\16\3N\13\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\6"+
		"\tc\n\t\r\t\16\td\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\6\13o\n\13\r\13\16"+
		"\13p\3\13\3\13\3\13\5\13v\n\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f~\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0087\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\5\20\u009a\n\20"+
		"\3\21\3\21\3\21\7\21\u009f\n\21\f\21\16\21\u00a2\13\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00aa\n\22\3\22\5\22\u00ad\n\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\7\24\u00b6\n\24\f\24\16\24\u00b9\13\24\3\25\3\25\3"+
		"\26\3\26\3\26\5\26\u00c0\n\26\3\26\3\26\3\26\3\26\7\26\u00c6\n\26\f\26"+
		"\16\26\u00c9\13\26\3\27\3\27\3\27\7\27\u00ce\n\27\f\27\16\27\u00d1\13"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\2"+
		"\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\6\4\2\n"+
		"\n\26\26\3\2\f\r\4\2\r\r\23\23\3\2\26\27\u00dc\2\67\3\2\2\2\4:\3\2\2\2"+
		"\6R\3\2\2\2\bW\3\2\2\2\nZ\3\2\2\2\f\\\3\2\2\2\16_\3\2\2\2\20b\3\2\2\2"+
		"\22k\3\2\2\2\24u\3\2\2\2\26}\3\2\2\2\30\177\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\u0092\3\2\2\2\36\u0096\3\2\2\2 \u009b\3\2\2\2\"\u00ac\3\2\2\2$\u00ae"+
		"\3\2\2\2&\u00b2\3\2\2\2(\u00ba\3\2\2\2*\u00bf\3\2\2\2,\u00ca\3\2\2\2."+
		"\u00d2\3\2\2\2\60\u00d6\3\2\2\2\62\u00dc\3\2\2\2\64\66\5\4\3\2\65\64\3"+
		"\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\3\3\2\2\29\67\3\2\2\2:;"+
		"\5\16\b\2;<\7\3\2\2<=\5\n\6\2=>\7\4\2\2>?\5*\26\2?@\7\5\2\2@L\7\6\2\2"+
		"AB\5(\25\2BG\7\26\2\2CD\7\7\2\2DF\7\26\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2JA\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MO\3\2\2\2NL\3\2\2\2OP\5\20\t\2PQ\7\b\2\2Q\5\3\2\2\2RS\7\26\2\2ST\7"+
		"\4\2\2TU\5,\27\2UV\7\5\2\2V\7\3\2\2\2WX\7\t\2\2XY\5\62\32\2Y\t\3\2\2\2"+
		"Z[\t\2\2\2[\13\3\2\2\2\\]\7\13\2\2]^\5\62\32\2^\r\3\2\2\2_`\t\3\2\2`\17"+
		"\3\2\2\2ac\5\22\n\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\21\3\2\2"+
		"\2fl\5\6\4\2gl\5\24\13\2hl\5\30\r\2il\5\32\16\2jl\5\34\17\2kf\3\2\2\2"+
		"kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\23\3\2\2\2mo\5\36\20\2nm\3\2"+
		"\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qv\3\2\2\2rv\5\26\f\2sv\5\b\5\2tv\5"+
		"\f\7\2un\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\7\16\2\2x\25"+
		"\3\2\2\2yz\7\26\2\2z{\7\17\2\2{~\5&\24\2|~\5\6\4\2}y\3\2\2\2}|\3\2\2\2"+
		"~\27\3\2\2\2\177\u0080\7\20\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5$\23"+
		"\2\u0082\u0083\7\5\2\2\u0083\u0086\5\34\17\2\u0084\u0085\7\21\2\2\u0085"+
		"\u0087\5\34\17\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\31\3\2"+
		"\2\2\u0088\u0089\7\22\2\2\u0089\u008a\7\4\2\2\u008a\u008b\5.\30\2\u008b"+
		"\u008c\7\16\2\2\u008c\u008d\5$\23\2\u008d\u008e\7\16\2\2\u008e\u008f\5"+
		"\60\31\2\u008f\u0090\7\5\2\2\u0090\u0091\5\34\17\2\u0091\33\3\2\2\2\u0092"+
		"\u0093\7\6\2\2\u0093\u0094\5\20\t\2\u0094\u0095\7\b\2\2\u0095\35\3\2\2"+
		"\2\u0096\u0099\5&\24\2\u0097\u0098\7\30\2\2\u0098\u009a\5&\24\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\37\3\2\2\2\u009b\u00a0\5\"\22"+
		"\2\u009c\u009d\7\24\2\2\u009d\u009f\5\"\22\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1!\3\2\2\2"+
		"\u00a2\u00a0\3\2\2\2\u00a3\u00aa\7\27\2\2\u00a4\u00aa\7\26\2\2\u00a5\u00a6"+
		"\7\4\2\2\u00a6\u00a7\5\36\20\2\u00a7\u00a8\7\5\2\2\u00a8\u00aa\3\2\2\2"+
		"\u00a9\u00a3\3\2\2\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2\u00aa\u00ad"+
		"\3\2\2\2\u00ab\u00ad\5\6\4\2\u00ac\u00a9\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad"+
		"#\3\2\2\2\u00ae\u00af\5\62\32\2\u00af\u00b0\7\30\2\2\u00b0\u00b1\5\62"+
		"\32\2\u00b1%\3\2\2\2\u00b2\u00b7\5 \21\2\u00b3\u00b4\7\24\2\2\u00b4\u00b6"+
		"\5 \21\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\'\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\t\4\2\2"+
		"\u00bb)\3\2\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\26\2\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c7\3\2\2\2\u00c1"+
		"\u00c2\7\7\2\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7\26\2\2\u00c4\u00c6\3"+
		"\2\2\2\u00c5\u00c1\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8+\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cf\5\62\32"+
		"\2\u00cb\u00cc\7\7\2\2\u00cc\u00ce\5\62\32\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0-\3\2\2\2"+
		"\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\26\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5"+
		"\5\62\32\2\u00d5/\3\2\2\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8\7\17\2\2\u00d8"+
		"\u00d9\5\62\32\2\u00d9\u00da\7\24\2\2\u00da\u00db\5\62\32\2\u00db\61\3"+
		"\2\2\2\u00dc\u00dd\t\5\2\2\u00dd\63\3\2\2\2\23\67GLdkpu}\u0086\u0099\u00a0"+
		"\u00a9\u00ac\u00b7\u00bf\u00c7\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}