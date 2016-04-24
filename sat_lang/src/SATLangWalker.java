import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;




public class SATLangWalker extends SATLanguageBaseListener{
	
	
	StringBuilder sb = new StringBuilder("ENTERING MAIN:- ");
	@Override
	public void enterMain(SATLanguageParser.MainContext ctx) {
		// TODO Auto-generated method stub
		super.enterMain(ctx);
	}

	@Override
	public void exitMain(SATLanguageParser.MainContext ctx) {
		// TODO Auto-generated method stub
		super.exitMain(ctx);
	}

	@Override
	public void enterFunction(SATLanguageParser.FunctionContext ctx) {
		// TODO Auto-generated method stub
		super.enterFunction(ctx);
	}

	@Override
	public void exitFunction(SATLanguageParser.FunctionContext ctx) {
		// TODO Auto-generated method stub
		super.exitFunction(ctx);
	}

	@Override
	public void enterName(SATLanguageParser.NameContext ctx) {
		// TODO Auto-generated method stub
		super.enterName(ctx);
	}

	@Override
	public void exitName(SATLanguageParser.NameContext ctx) {
		// TODO Auto-generated method stub
		super.exitName(ctx);
	}

	@Override
	public void enterRtType(SATLanguageParser.RtTypeContext ctx) {
		// TODO Auto-generated method stub
		super.enterRtType(ctx);
	}

	@Override
	public void exitRtType(SATLanguageParser.RtTypeContext ctx) {
		// TODO Auto-generated method stub
		super.exitRtType(ctx);
	}

	@Override
	public void enterSt_list(SATLanguageParser.St_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterSt_list(ctx);
	}

	@Override
	public void exitSt_list(SATLanguageParser.St_listContext ctx) {
		// TODO Auto-generated method stub
		super.exitSt_list(ctx);
	}

	@Override
	public void enterSt(SATLanguageParser.StContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSt(SATLanguageParser.StContext ctx) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enterSim_st(SATLanguageParser.Sim_stContext ctx) {
		// TODO Auto-generated method stub
		
		System.out.println("Entering Simple Statement: ");
		
		System.out.println("Printing ctx.getText\t"+ctx.getText()+"\n\n");
	
		
	}

	@Override
	public void exitSim_st(SATLanguageParser.Sim_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Exiting Simple Statement: ");
		System.out.println("Printing ctx.getText\t"+ctx.getText()+"\n\n");
		
		
	}

	@Override
	public void enterAssi_expr(SATLanguageParser.Assi_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Entering Assign Expression: ");
		System.out.println("Printing ctx.getText\t"+ctx.getText()+"\n\n");
		sb.append("PUSH "+ctx.ID()+"\n");

	}

	@Override
	public void exitAssi_expr(SATLanguageParser.Assi_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Exiting Assign Expression: ");
		System.out.println("Printing ctx.getText\t"+ctx.getText());
		System.out.println("Printing ctx.ID\t"+ctx.ID()+"\n\n");
		sb.append("ASSIGN\n");
		System.out.println("Printing String Builder:\n "+sb.toString());
	}

	@Override
	public void enterCon_st(SATLanguageParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		super.enterCon_st(ctx);
	}

	@Override
	public void exitCon_st(SATLanguageParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		super.exitCon_st(ctx);
	}

	@Override
	public void enterIte_st(SATLanguageParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		super.enterIte_st(ctx);
	}

	@Override
	public void exitIte_st(SATLanguageParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		super.exitIte_st(ctx);
	}

	@Override
	public void enterCom_st(SATLanguageParser.Com_stContext ctx) {
		// TODO Auto-generated method stub
		super.enterCom_st(ctx);
	}

	@Override
	public void exitCom_st(SATLanguageParser.Com_stContext ctx) {
		// TODO Auto-generated method stub
		super.exitCom_st(ctx);
	}

	@Override
	public void enterExp(SATLanguageParser.ExpContext ctx) {
		// TODO Auto-generated method stub
		super.enterExp(ctx);
	}

	@Override
	public void exitExp(SATLanguageParser.ExpContext ctx) {
		// TODO Auto-generated method stub
		super.exitExp(ctx);
	}

	@Override
	public void enterTerm(SATLanguageParser.TermContext ctx) {
		// TODO Auto-generated method stub
		super.enterTerm(ctx);
	}

	@Override
	public void exitTerm(SATLanguageParser.TermContext ctx) {
		// TODO Auto-generated method stub
		super.exitTerm(ctx);
	}

	@Override
	public void enterFactor(SATLanguageParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		super.enterFactor(ctx);
	}

	@Override
	public void exitFactor(SATLanguageParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		super.exitFactor(ctx);
	}

	@Override
	public void enterCon(SATLanguageParser.ConContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.getText());
		//System.out.println(ctx.getToken(arg0, arg1));
	}

	@Override
	public void exitCon(SATLanguageParser.ConContext ctx) {
		// TODO Auto-generated method stub
		super.exitCon(ctx);
	}

	@Override
	public void enterSimpleExp(SATLanguageParser.SimpleExpContext ctx) {
		// TODO Auto-generated method stub
		super.enterSimpleExp(ctx);
	}

	@Override
	public void exitSimpleExp(SATLanguageParser.SimpleExpContext ctx) {
		// TODO Auto-generated method stub
		super.exitSimpleExp(ctx);
	}

	@Override
	public void enterDt(SATLanguageParser.DtContext ctx) {
		// TODO Auto-generated method stub
		super.enterDt(ctx);
	}

	@Override
	public void exitDt(SATLanguageParser.DtContext ctx) {
		// TODO Auto-generated method stub
		super.exitDt(ctx);
	}

	@Override
	public void enterParams(SATLanguageParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		super.enterParams(ctx);
	}

	@Override
	public void exitParams(SATLanguageParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		super.exitParams(ctx);
	}

	@Override
	public void enterIni(SATLanguageParser.IniContext ctx) {
		// TODO Auto-generated method stub
		super.enterIni(ctx);
	}

	@Override
	public void exitIni(SATLanguageParser.IniContext ctx) {
		// TODO Auto-generated method stub
		super.exitIni(ctx);
	}

	@Override
	public void enterModif(SATLanguageParser.ModifContext ctx) {
		// TODO Auto-generated method stub
		super.enterModif(ctx);
	}

	@Override
	public void exitModif(SATLanguageParser.ModifContext ctx) {
		// TODO Auto-generated method stub
		super.exitModif(ctx);
	}

	@Override
	public void enterVar(SATLanguageParser.VarContext ctx) {
		// TODO Auto-generated method stub
		
		sb.append("PUSH "+ctx.getText()+"\n");
		System.out.println("Entering Var: ");
		System.out.println("Printing ctx.getText\t"+ctx.getText());
		System.out.println("Printing ctx.ID\t"+ctx.ID()+"\n\n");
	}

	@Override
	public void exitVar(SATLanguageParser.VarContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Exiting Var: ");
		System.out.println("Printing ctx.getText\t"+ctx.getText());
		System.out.println("Printing ctx.ID\t"+ctx.ID()+"\n\n");
		
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		super.visitErrorNode(node);
	}

}
