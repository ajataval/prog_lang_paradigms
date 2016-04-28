// Generated from SAT.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SATParser}.
 */
public interface SATListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SATParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SATParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SATParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SATParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SATParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(SATParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(SATParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#returna}.
	 * @param ctx the parse tree
	 */
	void enterReturna(SATParser.ReturnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#returna}.
	 * @param ctx the parse tree
	 */
	void exitReturna(SATParser.ReturnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SATParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SATParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(SATParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(SATParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#rtType}.
	 * @param ctx the parse tree
	 */
	void enterRtType(SATParser.RtTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#rtType}.
	 * @param ctx the parse tree
	 */
	void exitRtType(SATParser.RtTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#st_list}.
	 * @param ctx the parse tree
	 */
	void enterSt_list(SATParser.St_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#st_list}.
	 * @param ctx the parse tree
	 */
	void exitSt_list(SATParser.St_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#st}.
	 * @param ctx the parse tree
	 */
	void enterSt(SATParser.StContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#st}.
	 * @param ctx the parse tree
	 */
	void exitSt(SATParser.StContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#sim_st}.
	 * @param ctx the parse tree
	 */
	void enterSim_st(SATParser.Sim_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#sim_st}.
	 * @param ctx the parse tree
	 */
	void exitSim_st(SATParser.Sim_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#assi_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssi_expr(SATParser.Assi_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#assi_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssi_expr(SATParser.Assi_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#con_st}.
	 * @param ctx the parse tree
	 */
	void enterCon_st(SATParser.Con_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#con_st}.
	 * @param ctx the parse tree
	 */
	void exitCon_st(SATParser.Con_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#ite_st}.
	 * @param ctx the parse tree
	 */
	void enterIte_st(SATParser.Ite_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#ite_st}.
	 * @param ctx the parse tree
	 */
	void exitIte_st(SATParser.Ite_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#com_st}.
	 * @param ctx the parse tree
	 */
	void enterCom_st(SATParser.Com_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#com_st}.
	 * @param ctx the parse tree
	 */
	void exitCom_st(SATParser.Com_stContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(SATParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(SATParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(SATParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(SATParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(SATParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(SATParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#con}.
	 * @param ctx the parse tree
	 */
	void enterCon(SATParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#con}.
	 * @param ctx the parse tree
	 */
	void exitCon(SATParser.ConContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExp(SATParser.SimpleExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#simpleExp}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExp(SATParser.SimpleExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#dt}.
	 * @param ctx the parse tree
	 */
	void enterDt(SATParser.DtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#dt}.
	 * @param ctx the parse tree
	 */
	void exitDt(SATParser.DtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(SATParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(SATParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#params1}.
	 * @param ctx the parse tree
	 */
	void enterParams1(SATParser.Params1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#params1}.
	 * @param ctx the parse tree
	 */
	void exitParams1(SATParser.Params1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#ini}.
	 * @param ctx the parse tree
	 */
	void enterIni(SATParser.IniContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#ini}.
	 * @param ctx the parse tree
	 */
	void exitIni(SATParser.IniContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#modif}.
	 * @param ctx the parse tree
	 */
	void enterModif(SATParser.ModifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#modif}.
	 * @param ctx the parse tree
	 */
	void exitModif(SATParser.ModifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SATParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(SATParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link SATParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(SATParser.VarContext ctx);
}