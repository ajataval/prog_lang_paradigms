import java.io.PrintWriter;
import java.util.ArrayList;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SATWalker extends SATBaseListener
{
	StringBuilder build = new StringBuilder();
	StringBuilder build1 = new StringBuilder();
	ArrayList <String> A1 = new ArrayList<String>();
	ArrayList modif = new ArrayList();
	String name_params = new String();
	String name = new String();
	int index_if = 0;
	int index_for = 0;
	int counter = 0;
	int ite_enter_no = 0;
	int con_enter_no = 0;
	int ite_exit_no = 0;
	int con_exit_no = 0;
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
			for(int i =0; i<A1.size();i++)
			{
				writer.write(A1.get(i).toString() + '\n');
			}
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
		A1.add("FEND");
		counter++;
		
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
		System.out.println("before setting" + build.toString());
		build.setLength(0);
		System.out.println("after setting" + build.toString());
		System.out.println("entering name");
		System.out.println(ctx.getText());
		build.append("FSTART" + ' ' + ctx.getText());
		name = ctx.getText();
		System.out.println("after setting to fstart" + build.toString());
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
		A1.add("PUSH" + ' ' + ctx.ID());
		counter++;
		
		

		//System.out.println(InfixToPostfix.convertToPostfix(ctx.getText()));
	}

	@Override
	public void exitAssi_expr(SATParser.Assi_exprContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting ASsiExp");
		A1.add("ASSIGN");
		counter++;
		
	}

	@Override
	public void enterCon_st(SATParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering conSt");
		System.out.println(ctx.getText());
		con_enter_no = counter;
	}

	@Override
	public void exitCon_st(SATParser.Con_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting conSt");
		con_exit_no = counter;
		String temp = new String();
		temp = "FAILGOTO" + ' ' + con_exit_no;
		A1.set(index_if, temp);
		
	}

	@Override
	public void enterIte_st(SATParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering iteSt");
		System.out.println(ctx.getText());
		ite_enter_no = counter + 3;
	}

	@Override
	public void exitIte_st(SATParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		for(int i =0;i <modif.size(); i++)
		{
			A1.add(modif.get(i).toString());
			counter++;
		}
		System.out.println("exiting ITESt");
		A1.add("PUSH FALSE");
		counter++;
		A1.add("FAILGOTO" + ' ' + ite_enter_no);
		counter++;
		ite_exit_no = counter;
		String temp = new String();
		temp = "FAILGOTO" + ' ' + ite_exit_no;
		//System.out.print(index_for);
		A1.set(index_for, temp);
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
		
		for(int i =0; i<ctx.simpleExp().size(); i++)
		{
			A1.add("PUSH" + ' ' + ctx.simpleExp(i).getText());
			counter++;
		}
		
		
		
		if(ctx.RELOP().getText().equals("<"))
			{
			A1.add("LESSER");
			counter++;
			}
		if(ctx.RELOP().getText().equals(">"))
			{
			A1.add("GREATER");
			counter++;
			}
		if(ctx.RELOP().getText().equals("<="))
			{
			A1.add("LEQ");
			counter++;
			}
		if(ctx.RELOP().getText().equals(">="))
			{
			A1.add("GEQ");
			counter++;
			}
		if(ctx.RELOP().getText().equals("=="))
		{
			A1.add("EQUAL");
			counter++;
		}
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
		
		for(int i =0; i< ctx.factor().size(); i++)
		{
			if(ctx.factor(i).getText().contains("("))
				{
				A1.add("CALL" + ' ' + name_params);
				counter++;
				}
			else
				{
				A1.add("PUSH" + ' ' + ctx.factor(i).getText());
				counter++;
				}
				
		}
		
		
		
		
		if(ctx.OP().toString().contains("+"))
			{
			A1.add("ADD");
			counter++;
			}
		else if(ctx.OP().toString().contains("-"))
			{
			A1.add("SUB");
			counter++;
			}
		else if(ctx.OP().toString().contains("*"))
			{
			A1.add("MUL");
			counter++;
			}
		else if(ctx.OP().toString().contains("/"))
			{
			A1.add("DIV");		
			counter++;
			}
		

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
		A1.add("PUSH" + ' ' + ctx.var(0).getText());
		counter++;
		A1.add("PUSH" + ' ' + ctx.var(1).getText());
		counter++;
		
		
		
		if(ctx.RELOP().getText().equals("<"))
			{
			A1.add("LESSER");
			counter++;
			}
		if(ctx.RELOP().getText().equals(">"))
			{
			A1.add("GREATER");
			counter++;
			}
		if(ctx.RELOP().getText().equals("<="))
			{
			A1.add("LEQ");
			counter++;
			}
		if(ctx.RELOP().getText().equals(">="))
			{
			A1.add("GEQ");
			counter++;
			}
		if(ctx.RELOP().getText().equals("=="))
			{
			A1.add("EQUAL");
			counter++;
			}
		
		System.out.println("FINDING out who is john snows mother" + " " + ctx.parent.getText());
		
		if(ctx.parent.getText().contains("for("))
			A1.add("FOR");
			
		if(ctx.parent.getText().contains("if("))
			A1.add("IF");
		
		index_for = A1.indexOf("FOR");
		System.out.println(index_for + ' ' + "asadsadasdasdasd" + A1.indexOf(index_for));
		index_if = A1.indexOf("IF"); 
	
		counter++;
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
		
			build1.append(name + " ");
			for(int i=0; i<ctx.ID().size(); i++)
			{
				if(i==0)
					build1.append(ctx.ID(i));
				else
					build1.append("," + ctx.ID(i));
				build.append(' ' + ctx.ID(i).getText());
			}
			name_params = build1.toString();
			System.out.println("before adding to list" + build.toString());
		A1.add(build.toString());
		counter++;
		System.out.println("after adding to list" + A1.toString());
	}

	@Override
	public void exitParams(SATParser.ParamsContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("exiting params");
		
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
		A1.add("PUSH" + ' ' + ctx.ID());
		counter++;
		A1.add("PUSH" + ' ' + ctx.var().getText());
		counter++;
		A1.add("ASSIGN");
		counter++;
	}

	
	@Override
	public void enterModif(SATParser.ModifContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("entering modif");
		
		modif.add("PUSH" + ' ' + ctx.ID());
		
		modif.add("PUSH" + ' ' +ctx.var(0).getText());
		
		modif.add("PUSH" + ' ' + ctx.var(1).getText());
		
		System.out.println("PUSHED");
		if(ctx.OP().getText().equals("+"))
			modif.add("ADD");
		if(ctx.OP().getText().equals("-"))
			modif.add("SUB");
		
		
		modif.add("ASSIGN");
		
		//System.out.println(InfixToPostfix.convertToPostfix(ctx.getText()));
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
