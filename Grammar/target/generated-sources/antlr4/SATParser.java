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
		RULE_stack_st = 4, RULE_decl_st = 5, RULE_name = 6, RULE_print = 7, RULE_rtType = 8, 
		RULE_st_list = 9, RULE_st = 10, RULE_sim_st = 11, RULE_assi_expr = 12, 
		RULE_con_st = 13, RULE_if_st = 14, RULE_else_st = 15, RULE_ite_st = 16, 
		RULE_com_st = 17, RULE_exp = 18, RULE_term = 19, RULE_factor = 20, RULE_con = 21, 
		RULE_simpleExp = 22, RULE_dt = 23, RULE_params = 24, RULE_params1 = 25, 
		RULE_ini = 26, RULE_modif = 27, RULE_var = 28;
	public static final String[] ruleNames = {
		"main", "function", "funcCall", "returna", "stack_st", "decl_st", "name", 
		"print", "rtType", "st_list", "st", "sim_st", "assi_expr", "con_st", "if_st", 
		"else_st", "ite_st", "com_st", "exp", "term", "factor", "con", "simpleExp", 
		"dt", "params", "params1", "ini", "modif", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'func'", "'('", "')'", "'{'", "','", "'}'", "'return'", "'push'", 
		"'peek'", "'pop'", "'isempty'", "'main'", "'print'", "'void'", "'int'", 
		"';'", "'='", "'if'", "'else'", "'for'", "'bool'", "'stack'"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13 || _la==T__14) {
				{
				{
				setState(58);
				function();
				}
				}
				setState(63);
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
			setState(64);
			rtType();
			setState(65);
			match(T__0);
			setState(66);
			name();
			setState(67);
			match(T__1);
			setState(68);
			params();
			setState(69);
			match(T__2);
			setState(70);
			match(T__3);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					dt();
					setState(72);
					match(ID);
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(73);
						match(T__4);
						setState(74);
						match(ID);
						}
						}
						setState(79);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(85);
			st_list();
			setState(86);
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
			setState(88);
			match(ID);
			setState(89);
			match(T__1);
			setState(90);
			params1();
			setState(91);
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
			setState(93);
			match(T__6);
			setState(94);
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
		enterRule(_localctx, 8, RULE_stack_st);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__7);
				setState(97);
				match(T__1);
				setState(98);
				match(ID);
				setState(99);
				match(T__4);
				setState(100);
				match(NUM);
				setState(101);
				match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(T__8);
				setState(103);
				match(T__1);
				setState(104);
				match(ID);
				setState(105);
				match(T__2);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__9);
				setState(107);
				match(T__1);
				setState(108);
				match(ID);
				setState(109);
				match(T__2);
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(110);
				match(T__10);
				setState(111);
				match(T__1);
				setState(112);
				match(ID);
				setState(113);
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
		enterRule(_localctx, 10, RULE_decl_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			dt();
			setState(117);
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
		enterRule(_localctx, 12, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_la = _input.LA(1);
			if ( !(_la==T__11 || _la==ID) ) {
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
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__12);
			setState(122);
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
		enterRule(_localctx, 16, RULE_rtType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
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
		enterRule(_localctx, 18, RULE_st_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				st();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__14) | (1L << T__17) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << ID) | (1L << NUM))) != 0) );
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
		enterRule(_localctx, 20, RULE_st);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				funcCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				sim_st();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				con_st();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				ite_st();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
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
		enterRule(_localctx, 22, RULE_sim_st);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138);
					exp();
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ID) | (1L << NUM))) != 0) );
				}
				break;
			case 2:
				{
				setState(143);
				assi_expr();
				}
				break;
			case 3:
				{
				setState(144);
				returna();
				}
				break;
			case 4:
				{
				setState(145);
				print();
				}
				break;
			case 5:
				{
				setState(146);
				decl_st();
				}
				break;
			case 6:
				{
				setState(147);
				stack_st();
				}
				break;
			}
			setState(150);
			match(T__15);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(ID);
				setState(153);
				match(T__16);
				setState(154);
				simpleExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
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
		public If_stContext if_st() {
			return getRuleContext(If_stContext.class,0);
		}
		public Else_stContext else_st() {
			return getRuleContext(Else_stContext.class,0);
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
			setState(158);
			if_st();
			setState(160);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(159);
				else_st();
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

	public static class If_stContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public Com_stContext com_st() {
			return getRuleContext(Com_stContext.class,0);
		}
		public If_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterIf_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitIf_st(this);
		}
	}

	public final If_stContext if_st() throws RecognitionException {
		If_stContext _localctx = new If_stContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__17);
			setState(163);
			match(T__1);
			setState(164);
			con();
			setState(165);
			match(T__2);
			setState(166);
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

	public static class Else_stContext extends ParserRuleContext {
		public Com_stContext com_st() {
			return getRuleContext(Com_stContext.class,0);
		}
		public Else_stContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_st; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).enterElse_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SATListener ) ((SATListener)listener).exitElse_st(this);
		}
	}

	public final Else_stContext else_st() throws RecognitionException {
		Else_stContext _localctx = new Else_stContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__18);
			setState(169);
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
		enterRule(_localctx, 32, RULE_ite_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(T__19);
			setState(172);
			match(T__1);
			setState(173);
			ini();
			setState(174);
			match(T__15);
			setState(175);
			con();
			setState(176);
			match(T__15);
			setState(177);
			modif();
			setState(178);
			match(T__2);
			setState(179);
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
		enterRule(_localctx, 34, RULE_com_st);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__3);
			setState(182);
			st_list();
			setState(183);
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
		enterRule(_localctx, 36, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			simpleExp();
			setState(188);
			_la = _input.LA(1);
			if (_la==RELOP) {
				{
				setState(186);
				match(RELOP);
				setState(187);
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
		enterRule(_localctx, 38, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			factor();
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(OP);
					setState(192);
					factor();
					}
					} 
				}
				setState(197);
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
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				switch (_input.LA(1)) {
				case NUM:
					{
					setState(198);
					match(NUM);
					}
					break;
				case ID:
					{
					setState(199);
					match(ID);
					}
					break;
				case T__1:
					{
					setState(200);
					match(T__1);
					setState(201);
					exp();
					setState(202);
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
				setState(206);
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
		enterRule(_localctx, 42, RULE_con);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			var();
			setState(210);
			match(RELOP);
			setState(211);
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
		enterRule(_localctx, 44, RULE_simpleExp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			term();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(214);
				match(OP);
				setState(215);
				term();
				}
				}
				setState(220);
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
		enterRule(_localctx, 46, RULE_dt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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
		enterRule(_localctx, 48, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(226);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__20) | (1L << T__21))) != 0)) {
				{
				setState(223);
				dt();
				setState(224);
				match(ID);
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(228);
				match(T__4);
				setState(229);
				dt();
				setState(230);
				match(ID);
				}
				}
				setState(236);
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
		enterRule(_localctx, 50, RULE_params1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			var();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(238);
				match(T__4);
				setState(239);
				var();
				}
				}
				setState(244);
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
		enterRule(_localctx, 52, RULE_ini);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(T__16);
			setState(247);
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
		enterRule(_localctx, 54, RULE_modif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ID);
			setState(250);
			match(T__16);
			{
			setState(251);
			var();
			setState(252);
			match(OP);
			setState(253);
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
		enterRule(_localctx, 56, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u0104\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3N\n\3\f\3\16\3"+
		"Q\13\3\7\3S\n\3\f\3\16\3V\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6u\n\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\6\13\u0082"+
		"\n\13\r\13\16\13\u0083\3\f\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\6\r\u008e"+
		"\n\r\r\r\16\r\u008f\3\r\3\r\3\r\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\5\16\u009f\n\16\3\17\3\17\5\17\u00a3\n\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u00bf\n\24\3\25\3\25"+
		"\3\25\7\25\u00c4\n\25\f\25\16\25\u00c7\13\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u00cf\n\26\3\26\5\26\u00d2\n\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\7\30\u00db\n\30\f\30\16\30\u00de\13\30\3\31\3\31\3\32\3\32\3"+
		"\32\5\32\u00e5\n\32\3\32\3\32\3\32\3\32\7\32\u00eb\n\32\f\32\16\32\u00ee"+
		"\13\32\3\33\3\33\3\33\7\33\u00f3\n\33\f\33\16\33\u00f6\13\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\2\2\37\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\6\4\2\16\16\33"+
		"\33\3\2\20\21\4\2\21\21\27\30\3\2\33\34\u0102\2?\3\2\2\2\4B\3\2\2\2\6"+
		"Z\3\2\2\2\b_\3\2\2\2\nt\3\2\2\2\fv\3\2\2\2\16y\3\2\2\2\20{\3\2\2\2\22"+
		"~\3\2\2\2\24\u0081\3\2\2\2\26\u008a\3\2\2\2\30\u0096\3\2\2\2\32\u009e"+
		"\3\2\2\2\34\u00a0\3\2\2\2\36\u00a4\3\2\2\2 \u00aa\3\2\2\2\"\u00ad\3\2"+
		"\2\2$\u00b7\3\2\2\2&\u00bb\3\2\2\2(\u00c0\3\2\2\2*\u00d1\3\2\2\2,\u00d3"+
		"\3\2\2\2.\u00d7\3\2\2\2\60\u00df\3\2\2\2\62\u00e4\3\2\2\2\64\u00ef\3\2"+
		"\2\2\66\u00f7\3\2\2\28\u00fb\3\2\2\2:\u0101\3\2\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BC\5\22\n\2CD\7\3"+
		"\2\2DE\5\16\b\2EF\7\4\2\2FG\5\62\32\2GH\7\5\2\2HT\7\6\2\2IJ\5\60\31\2"+
		"JO\7\33\2\2KL\7\7\2\2LN\7\33\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2"+
		"\2PS\3\2\2\2QO\3\2\2\2RI\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2"+
		"\2VT\3\2\2\2WX\5\24\13\2XY\7\b\2\2Y\5\3\2\2\2Z[\7\33\2\2[\\\7\4\2\2\\"+
		"]\5\64\33\2]^\7\5\2\2^\7\3\2\2\2_`\7\t\2\2`a\5:\36\2a\t\3\2\2\2bc\7\n"+
		"\2\2cd\7\4\2\2de\7\33\2\2ef\7\7\2\2fg\7\34\2\2gu\7\5\2\2hi\7\13\2\2ij"+
		"\7\4\2\2jk\7\33\2\2ku\7\5\2\2lm\7\f\2\2mn\7\4\2\2no\7\33\2\2ou\7\5\2\2"+
		"pq\7\r\2\2qr\7\4\2\2rs\7\33\2\2su\7\5\2\2tb\3\2\2\2th\3\2\2\2tl\3\2\2"+
		"\2tp\3\2\2\2u\13\3\2\2\2vw\5\60\31\2wx\7\33\2\2x\r\3\2\2\2yz\t\2\2\2z"+
		"\17\3\2\2\2{|\7\17\2\2|}\5:\36\2}\21\3\2\2\2~\177\t\3\2\2\177\23\3\2\2"+
		"\2\u0080\u0082\5\26\f\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u008b\5\6\4"+
		"\2\u0086\u008b\5\30\r\2\u0087\u008b\5\34\17\2\u0088\u008b\5\"\22\2\u0089"+
		"\u008b\5$\23\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u0087\3\2"+
		"\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3\2\2\2\u008b\27\3\2\2\2\u008c\u008e"+
		"\5&\24\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0097\3\2\2\2\u0091\u0097\5\32\16\2\u0092\u0097\5"+
		"\b\5\2\u0093\u0097\5\20\t\2\u0094\u0097\5\f\7\2\u0095\u0097\5\n\6\2\u0096"+
		"\u008d\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0096\u0093\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098"+
		"\u0099\7\22\2\2\u0099\31\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009c\7\23"+
		"\2\2\u009c\u009f\5.\30\2\u009d\u009f\5\6\4\2\u009e\u009a\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\33\3\2\2\2\u00a0\u00a2\5\36\20\2\u00a1\u00a3\5 \21"+
		"\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\35\3\2\2\2\u00a4\u00a5"+
		"\7\24\2\2\u00a5\u00a6\7\4\2\2\u00a6\u00a7\5,\27\2\u00a7\u00a8\7\5\2\2"+
		"\u00a8\u00a9\5$\23\2\u00a9\37\3\2\2\2\u00aa\u00ab\7\25\2\2\u00ab\u00ac"+
		"\5$\23\2\u00ac!\3\2\2\2\u00ad\u00ae\7\26\2\2\u00ae\u00af\7\4\2\2\u00af"+
		"\u00b0\5\66\34\2\u00b0\u00b1\7\22\2\2\u00b1\u00b2\5,\27\2\u00b2\u00b3"+
		"\7\22\2\2\u00b3\u00b4\58\35\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\5$\23\2"+
		"\u00b6#\3\2\2\2\u00b7\u00b8\7\6\2\2\u00b8\u00b9\5\24\13\2\u00b9\u00ba"+
		"\7\b\2\2\u00ba%\3\2\2\2\u00bb\u00be\5.\30\2\u00bc\u00bd\7\35\2\2\u00bd"+
		"\u00bf\5.\30\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\'\3\2\2\2"+
		"\u00c0\u00c5\5*\26\2\u00c1\u00c2\7\31\2\2\u00c2\u00c4\5*\26\2\u00c3\u00c1"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		")\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cf\7\34\2\2\u00c9\u00cf\7\33\2"+
		"\2\u00ca\u00cb\7\4\2\2\u00cb\u00cc\5&\24\2\u00cc\u00cd\7\5\2\2\u00cd\u00cf"+
		"\3\2\2\2\u00ce\u00c8\3\2\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00ca\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00d2\5\6\4\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2+\3\2\2\2\u00d3\u00d4\5:\36\2\u00d4\u00d5\7\35\2\2\u00d5\u00d6"+
		"\5:\36\2\u00d6-\3\2\2\2\u00d7\u00dc\5(\25\2\u00d8\u00d9\7\31\2\2\u00d9"+
		"\u00db\5(\25\2\u00da\u00d8\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd/\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0"+
		"\t\4\2\2\u00e0\61\3\2\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3\7\33\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00ec\3\2"+
		"\2\2\u00e6\u00e7\7\7\2\2\u00e7\u00e8\5\60\31\2\u00e8\u00e9\7\33\2\2\u00e9"+
		"\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\63\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f4"+
		"\5:\36\2\u00f0\u00f1\7\7\2\2\u00f1\u00f3\5:\36\2\u00f2\u00f0\3\2\2\2\u00f3"+
		"\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\65\3\2\2"+
		"\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\7\23\2\2\u00f9"+
		"\u00fa\5:\36\2\u00fa\67\3\2\2\2\u00fb\u00fc\7\33\2\2\u00fc\u00fd\7\23"+
		"\2\2\u00fd\u00fe\5:\36\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\5:\36\2\u0100"+
		"9\3\2\2\2\u0101\u0102\t\5\2\2\u0102;\3\2\2\2\24?OTt\u0083\u008a\u008f"+
		"\u0096\u009e\u00a2\u00be\u00c5\u00ce\u00d1\u00dc\u00e4\u00ec\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}