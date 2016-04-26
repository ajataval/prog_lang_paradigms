import java.io.PrintWriter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SATWalker extends SATBaseListener
{
	StringBuilder build = new StringBuilder();
	String filename = new String("C:\\Anoop_Stuff\\ASU\\Spring 2016\\LPP\\Proj 2\\Code\\INTERM.txt");
	
	@Override
	public void enterMain(SATParser.MainContext ctx) {
		// TODO Auto-generated method stub
		super.enterMain(ctx);
	}

	@Override
	public void exitMain(SATParser.MainContext ctx) {
		// TODO Auto-generated method stub
		try {
			PrintWriter writer = new PrintWriter( filename,"UTF-8");
			writer.write(build.toString());
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void enterFunction(SATParser.FunctionContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Entering function");
		System.out.println(ctx.getText());
		
	}

	@Override
	public void exitFunction(SATParser.FunctionContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting function");
		build.append("FEND");
		build.append(System.getProperty("line.separator"));
	}

	@Override
	public void enterFuncCall(SATParser.FuncCallContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("Entering funccall");
		System.out.println(ctx.getText());
	}	

	@Override
	public void exitFuncCall(SATParser.FuncCallContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting funccall");
	}

	@Override
	public void enterName(SATParser.NameContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering name");
		System.out.println(ctx.getText());
		build.append("FSTART" + ' ' + ctx.getText());
		System.out.println("FSTART" + ' ' + ctx.getText());
	}

	@Override
	public void exitName(SATParser.NameContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting name");
		
	}

	@Override
	public void enterRtType(SATParser.RtTypeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering rttype");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitRtType(SATParser.RtTypeContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting rttype");
	}

	@Override
	public void enterSt_list(SATParser.St_listContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering stlist");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitSt_list(SATParser.St_listContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting stlist");
	}

	@Override
	public void enterSt(SATParser.StContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entring st");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitSt(SATParser.StContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting st");
	}

	@Override
	public void enterSim_st(SATParser.Sim_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering simSt");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitSim_st(SATParser.Sim_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting simSt");
	}

	@Override
	public void enterAssi_expr(SATParser.Assi_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering ASsiExp");
		System.out.println(ctx.getText());
		System.out.println(InfixToPostfix.convertToPostfix(ctx.getText()));
	}

	@Override
	public void exitAssi_expr(SATParser.Assi_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting ASsiExp");
	}

	@Override
	public void enterCon_st(SATParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering conSt");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitCon_st(SATParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting conSt");
	}

	@Override
	public void enterIte_st(SATParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering iteSt");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitIte_st(SATParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting conSt");
	}

	@Override
	public void enterCom_st(SATParser.Com_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering comSt");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitCom_st(SATParser.Com_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting comSt");
	}

	@Override
	public void enterExp(SATParser.ExpContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering exp");
		System.out.println(ctx.getText());
		build.append("PUSH" + ' ' + ctx.simpleExp(0).getText());
		build.append(System.getProperty("line.separator"));
		build.append("PUSH" + ' ' + ctx.simpleExp(1).getText());
		build.append(System.getProperty("line.separator"));
		
		System.out.println("PUSH" + ' ' + ctx.simpleExp(0).getText());
		System.out.println("PUSH" + ' ' + ctx.simpleExp(1).getText());
		
		
		
		if(ctx.RELOP().getText().equals("<"))
			build.append("LESSER");
		if(ctx.RELOP().getText().equals(">"))
			build.append("GREATER");
		if(ctx.RELOP().getText().equals("<="))
			build.append("LEQ");
		if(ctx.RELOP().getText().equals(">="))
			build.append("GEQ");
		if(ctx.RELOP().getText().equals("=="))
			build.append("EQUAL");
		build.append(System.getProperty("line.separator"));
		//System.out.println(InfixToPostfix.convertToPostfix(ctx.getText()));
		//System.out.println(ctx.RELOP().getText());
	}

	@Override
	public void exitExp(SATParser.ExpContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting exp");
	}

	@Override
	public void enterTerm(SATParser.TermContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering term");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitTerm(SATParser.TermContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting term");
	}

	@Override
	public void enterFactor(SATParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering factor");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitFactor(SATParser.FactorContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting factor");
	}

	@Override
	public void enterCon(SATParser.ConContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering con");
		System.out.println(ctx.getText());
		build.append("PUSH" + ' ' + ctx.var(0).getText());
		build.append(System.getProperty("line.separator"));
		build.append("PUSH" + ' ' + ctx.var(1).getText());
		build.append(System.getProperty("line.separator"));
		
		
		
		if(ctx.RELOP().getText().equals("<"))
			build.append("LESSER");
		if(ctx.RELOP().getText().equals(">"))
			build.append("GREATER");
		if(ctx.RELOP().getText().equals("<="))
			build.append("LEQ");
		if(ctx.RELOP().getText().equals(">="))
			build.append("GEQ");
		if(ctx.RELOP().getText().equals("=="))
			build.append("EQUAL");
		build.append(System.getProperty("line.separator"));
		build.append("FAILGOTO" + ' ');
		build.append(System.getProperty("line.separator"));
	}

	@Override
	public void exitCon(SATParser.ConContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting con");
	}

	@Override
	public void enterSimpleExp(SATParser.SimpleExpContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering simExp");
		System.out.println(ctx.getText());
		
		
	}

	@Override
	public void exitSimpleExp(SATParser.SimpleExpContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting simExp");
	}

	@Override
	public void enterDt(SATParser.DtContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering dt");
		System.out.println(ctx.getText());
	}

	@Override
	public void exitDt(SATParser.DtContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting dt");
	}

	@Override
	public void enterParams(SATParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering params");
		System.out.println(ctx.getText());
		
			for(int i=0; i<ctx.ID().size(); i++)
			{
				build.append(' ' + ctx.ID(i).getText());
			}
		
		
	}

	@Override
	public void exitParams(SATParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting params");
		build.append(System.getProperty("line.separator"));
	}

	@Override
	public void enterIni(SATParser.IniContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering ini");
		System.out.println(ctx.getText());
		
		
	}

	@Override
	public void exitIni(SATParser.IniContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting ini");
		build.append("PUSH" + ' ' + ctx.ID());
		build.append(System.getProperty("line.separator"));
		build.append("PUSH" + ' ' + ctx.var().getText());
		build.append(System.getProperty("line.separator"));
		build.append("ASSIGN");
		build.append(System.getProperty("line.separator"));
	}

	@Override
	public void enterModif(SATParser.ModifContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering modif");
		System.out.println(ctx.getText());
		System.out.println(InfixToPostfix.convertToPostfix(ctx.getText()));
	}

	@Override
	public void exitModif(SATParser.ModifContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting modif");
	}

	@Override
	public void enterVar(SATParser.VarContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering var");
		System.out.println(ctx.getText());
		
		
	}

	@Override
	public void exitVar(SATParser.VarContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting var");
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println();
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("");
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
