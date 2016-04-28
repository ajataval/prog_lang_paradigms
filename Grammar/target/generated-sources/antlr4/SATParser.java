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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, OP=23, BOOL=24, ID=25, 
		NUM=26, RELOP=27, WS=28;
	public static final int
		RULE_main = 0, RULE_function = 1, RULE_funcCall = 2, RULE_returna = 3, 
		RULE_name = 4, RULE_print = 5, RULE_rtType = 6, RULE_st_list = 7, RULE_st = 8, 
		RULE_sim_st = 9, RULE_stack_st = 10, RULE_decl_st = 11, RULE_assi_expr = 12, 
		RULE_con_st = 13, RULE_ite_st = 14, RULE_com_st = 15, RULE_exp = 16, RULE_term = 17, 
		RULE_factor = 18, RULE_con = 19, RULE_simpleExp = 20, RULE_dt = 21, RULE_params = 22, 
		RULE_params1 = 23, RULE_ini = 24, RULE_modif = 25, RULE_var = 26;
	public static final String[] ruleNames = {
		"main", "function", "funcCall", "returna", "name", "print", "rtType", 
		"st_list", "st", "sim_st", "stack_st", "decl_st", "assi_expr", "con_st", 
		"ite_st", "com_st", "exp", "term", "factor", "con", "simpleExp", "dt", 
		"params", "params1", "ini", "modif", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "','", "'}'", "'return'", "'main'", 
		"'print'", "'void'", "'int'", "';'", "'push('", "'peek('", "'pop('", "'isempty('", 
		"'='", "'if'", "'else'", "'for'", "'bool'", "'stack'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "OP", 
		"BOOL", "ID", "NUM", "RELOP", "WS"
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
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9 || _la==T__10) {
				{
				{
				setState(54);
				function();
				}
				}
				setState(59);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			rtType();
			setState(61);
			match(T__0);
			setState(62);
			name();
			setState(63);
			match(T__1);
			setState(64);
			params();
			setState(65);
			match(T__2);
			setState(66);
			match(T__3);
			setState(78);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(67);
					dt();
					setState(68);
					match(ID);
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(69);
						match(T__4);
						setState(70);
						match(ID);
						}
						}
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(80);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(81);
			st_list();
			setState(82);
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
			setState(84);
			match(ID);
			setState(85);
			match(T__1);
			setState(86);
			params1();
			setState(87);
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
			setState(89);
			match(T__6);
			setState(90);
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
			setState(92);
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
			setState(94);
			match(T__8);
			setState(95);
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
			setState(97);
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
			setState(100); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(99);
				st();
				}
				}
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NUM))) != 0) );
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				sim_st();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				con_st();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				ite_st();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
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
		public Decl_stContext decl_st() {
			return getRuleContext(Decl_stContext.class,0);
		}
		public Stack_stContext stack_st() {
			return getRuleContext(Stack_stContext.class,0);
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					exp();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << NUM))) != 0) );
				}
				break;
			case 2:
				{
				setState(116);
				assi_expr();
				}
				break;
			case 3:
				{
				setState(117);
				returna();
				}
				break;
			case 4:
				{
				setState(118);
				print();
				}
				break;
			case 5:
				{
				setState(119);
				decl_st();
				}
				break;
			case 6:
				{
				setState(120);
				stack_st();
				}
				break;
			}
			setState(123);
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

	public static class Stack_stContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SATParser.NUM, 0); }
		public Stack_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stack_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterStack_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitStack_st(this);
		}
	}

	public final Stack_stContext stack_st() throws RecognitionException {
		Stack_stContext _localctx = new Stack_stContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_stack_st);
		try {
			setState(139);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(T__12);
				setState(126);
				match(ID);
				setState(127);
				match(T__4);
				setState(128);
				match(NUM);
				setState(129);
				match(T__2);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__13);
				setState(131);
				match(ID);
				setState(132);
				match(T__2);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__14);
				setState(134);
				match(ID);
				setState(135);
				match(T__2);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(T__15);
				setState(137);
				match(ID);
				setState(138);
				match(T__2);
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

	public static class Decl_stContext extends ParserRuleContext {
		public DtContext dt() {
			return getRuleContext(DtContext.class,0);
		}
		public TerminalNode ID() { return getToken(SATParser.ID, 0); }
		public Decl_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterDecl_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitDecl_st(this);
		}
	}

	public final Decl_stContext decl_st() throws RecognitionException {
		Decl_stContext _localctx = new Decl_stContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decl_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			dt();
			setState(142);
			match(ID);
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
		enterRule(_localctx, 24, RULE_assi_expr);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(ID);
				setState(145);
				match(T__16);
				setState(146);
				simpleExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
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
		enterRule(_localctx, 26, RULE_con_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__17);
			setState(151);
			match(T__1);
			setState(152);
			con();
			setState(153);
			match(T__2);
			setState(154);
			com_st();
			setState(157);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(155);
				match(T__18);
				setState(156);
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
		enterRule(_localctx, 28, RULE_ite_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(T__19);
			setState(160);
			match(T__1);
			setState(161);
			ini();
			setState(162);
			match(T__11);
			setState(163);
			con();
			setState(164);
			match(T__11);
			setState(165);
			modif();
			setState(166);
			match(T__2);
			setState(167);
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
		enterRule(_localctx, 30, RULE_com_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__3);
			setState(170);
			st_list();
			setState(171);
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
		enterRule(_localctx, 32, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			simpleExp();
			setState(176);
			_la = _input.LA(1);
			if (_la==RELOP) {
				{
				setState(174);
				match(RELOP);
				setState(175);
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
		enterRule(_localctx, 34, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			factor();
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(OP);
					setState(180);
					factor();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(186);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(187);
					match(ID);
					}
					break;
				case T__1:
					{
					setState(188);
					match(T__1);
					setState(189);
					exp();
					setState(190);
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
				setState(194);
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
		enterRule(_localctx, 38, RULE_con);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			var();
			setState(198);
			match(RELOP);
			setState(199);
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
		enterRule(_localctx, 40, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			term();
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(202);
				match(OP);
				setState(203);
				term();
				}
				}
				setState(208);
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
		enterRule(_localctx, 42, RULE_dt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 44, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(214);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(211);
				dt();
				setState(212);
				match(ID);
				}
			}

			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(216);
				match(T__4);
				setState(217);
				dt();
				setState(218);
				match(ID);
				}
				}
				setState(224);
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
		enterRule(_localctx, 46, RULE_params1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			var();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(226);
				match(T__4);
				setState(227);
				var();
				}
				}
				setState(232);
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
		enterRule(_localctx, 48, RULE_ini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(ID);
			setState(234);
			match(T__16);
			setState(235);
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
		enterRule(_localctx, 50, RULE_modif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(ID);
			setState(238);
			match(T__16);
			{
			setState(239);
			var();
			setState(240);
			match(OP);
			setState(241);
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
		enterRule(_localctx, 52, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00f8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\7\2:\n\2\f\2\16\2=\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3J\n\3\f\3\16\3M\13\3\7\3O\n\3\f\3"+
		"\16\3R\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\b\3\b\3\t\6\tg\n\t\r\t\16\th\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\13"+
		"\6\13s\n\13\r\13\16\13t\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008e\n\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00a0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00b3\n\22\3\23\3\23"+
		"\3\23\7\23\u00b8\n\23\f\23\16\23\u00bb\13\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00c3\n\24\3\24\5\24\u00c6\n\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\7\26\u00cf\n\26\f\26\16\26\u00d2\13\26\3\27\3\27\3\30\3\30\3"+
		"\30\5\30\u00d9\n\30\3\30\3\30\3\30\3\30\7\30\u00df\n\30\f\30\16\30\u00e2"+
		"\13\30\3\31\3\31\3\31\7\31\u00e7\n\31\f\31\16\31\u00ea\13\31\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\2\2\35\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\4\2\n\n\33\33"+
		"\3\2\f\r\4\2\r\r\27\30\3\2\33\34\u00f8\2;\3\2\2\2\4>\3\2\2\2\6V\3\2\2"+
		"\2\b[\3\2\2\2\n^\3\2\2\2\f`\3\2\2\2\16c\3\2\2\2\20f\3\2\2\2\22o\3\2\2"+
		"\2\24{\3\2\2\2\26\u008d\3\2\2\2\30\u008f\3\2\2\2\32\u0096\3\2\2\2\34\u0098"+
		"\3\2\2\2\36\u00a1\3\2\2\2 \u00ab\3\2\2\2\"\u00af\3\2\2\2$\u00b4\3\2\2"+
		"\2&\u00c5\3\2\2\2(\u00c7\3\2\2\2*\u00cb\3\2\2\2,\u00d3\3\2\2\2.\u00d8"+
		"\3\2\2\2\60\u00e3\3\2\2\2\62\u00eb\3\2\2\2\64\u00ef\3\2\2\2\66\u00f5\3"+
		"\2\2\28:\5\4\3\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\3\3\2\2\2=;"+
		"\3\2\2\2>?\5\16\b\2?@\7\3\2\2@A\5\n\6\2AB\7\4\2\2BC\5.\30\2CD\7\5\2\2"+
		"DP\7\6\2\2EF\5,\27\2FK\7\33\2\2GH\7\7\2\2HJ\7\33\2\2IG\3\2\2\2JM\3\2\2"+
		"\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NE\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\5\20\t\2TU\7\b\2\2U\5\3\2\2\2VW\7\33"+
		"\2\2WX\7\4\2\2XY\5\60\31\2YZ\7\5\2\2Z\7\3\2\2\2[\\\7\t\2\2\\]\5\66\34"+
		"\2]\t\3\2\2\2^_\t\2\2\2_\13\3\2\2\2`a\7\13\2\2ab\5\66\34\2b\r\3\2\2\2"+
		"cd\t\3\2\2d\17\3\2\2\2eg\5\22\n\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2"+
		"\2\2i\21\3\2\2\2jp\5\6\4\2kp\5\24\13\2lp\5\34\17\2mp\5\36\20\2np\5 \21"+
		"\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2p\23\3\2\2\2qs\5\""+
		"\22\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u|\3\2\2\2v|\5\32\16\2w|"+
		"\5\b\5\2x|\5\f\7\2y|\5\30\r\2z|\5\26\f\2{r\3\2\2\2{v\3\2\2\2{w\3\2\2\2"+
		"{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}~\7\16\2\2~\25\3\2\2\2\177\u0080"+
		"\7\17\2\2\u0080\u0081\7\33\2\2\u0081\u0082\7\7\2\2\u0082\u0083\7\34\2"+
		"\2\u0083\u008e\7\5\2\2\u0084\u0085\7\20\2\2\u0085\u0086\7\33\2\2\u0086"+
		"\u008e\7\5\2\2\u0087\u0088\7\21\2\2\u0088\u0089\7\33\2\2\u0089\u008e\7"+
		"\5\2\2\u008a\u008b\7\22\2\2\u008b\u008c\7\33\2\2\u008c\u008e\7\5\2\2\u008d"+
		"\177\3\2\2\2\u008d\u0084\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2"+
		"\2\u008e\27\3\2\2\2\u008f\u0090\5,\27\2\u0090\u0091\7\33\2\2\u0091\31"+
		"\3\2\2\2\u0092\u0093\7\33\2\2\u0093\u0094\7\23\2\2\u0094\u0097\5*\26\2"+
		"\u0095\u0097\5\6\4\2\u0096\u0092\3\2\2\2\u0096\u0095\3\2\2\2\u0097\33"+
		"\3\2\2\2\u0098\u0099\7\24\2\2\u0099\u009a\7\4\2\2\u009a\u009b\5(\25\2"+
		"\u009b\u009c\7\5\2\2\u009c\u009f\5 \21\2\u009d\u009e\7\25\2\2\u009e\u00a0"+
		"\5 \21\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\35\3\2\2\2\u00a1"+
		"\u00a2\7\26\2\2\u00a2\u00a3\7\4\2\2\u00a3\u00a4\5\62\32\2\u00a4\u00a5"+
		"\7\16\2\2\u00a5\u00a6\5(\25\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\64\33"+
		"\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\5 \21\2\u00aa\37\3\2\2\2\u00ab\u00ac"+
		"\7\6\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7\b\2\2\u00ae!\3\2\2\2\u00af"+
		"\u00b2\5*\26\2\u00b0\u00b1\7\35\2\2\u00b1\u00b3\5*\26\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3#\3\2\2\2\u00b4\u00b9\5&\24\2\u00b5\u00b6"+
		"\7\31\2\2\u00b6\u00b8\5&\24\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2"+
		"\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba%\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bc\u00c3\7\34\2\2\u00bd\u00c3\7\33\2\2\u00be\u00bf\7\4\2\2\u00bf"+
		"\u00c0\5\"\22\2\u00c0\u00c1\7\5\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3"+
		"\2\2\2\u00c2\u00bd\3\2\2\2\u00c2\u00be\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c6\5\6\4\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\'\3\2\2\2"+
		"\u00c7\u00c8\5\66\34\2\u00c8\u00c9\7\35\2\2\u00c9\u00ca\5\66\34\2\u00ca"+
		")\3\2\2\2\u00cb\u00d0\5$\23\2\u00cc\u00cd\7\31\2\2\u00cd\u00cf\5$\23\2"+
		"\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4"+
		"-\3\2\2\2\u00d5\u00d6\5,\27\2\u00d6\u00d7\7\33\2\2\u00d7\u00d9\3\2\2\2"+
		"\u00d8\u00d5\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00e0\3\2\2\2\u00da\u00db"+
		"\7\7\2\2\u00db\u00dc\5,\27\2\u00dc\u00dd\7\33\2\2\u00dd\u00df\3\2\2\2"+
		"\u00de\u00da\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1/\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e8\5\66\34\2\u00e4"+
		"\u00e5\7\7\2\2\u00e5\u00e7\5\66\34\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3"+
		"\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\61\3\2\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ec\7\33\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ee\5"+
		"\66\34\2\u00ee\63\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\7\23\2\2\u00f1"+
		"\u00f2\5\66\34\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\5\66\34\2\u00f4\65\3"+
		"\2\2\2\u00f5\u00f6\t\5\2\2\u00f6\67\3\2\2\2\24;KPhot{\u008d\u0096\u009f"+
		"\u00b2\u00b9\u00c2\u00c5\u00d0\u00d8\u00e0\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}