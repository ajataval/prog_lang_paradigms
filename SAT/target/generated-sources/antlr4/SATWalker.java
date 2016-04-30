import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class SATWalker extends SATBaseListener
{
	StringBuilder build = new StringBuilder();
	StringBuilder build1 = new StringBuilder();
	StringBuilder temp_build1 = new StringBuilder();
	ArrayList <String> A1 = new ArrayList<String>();
	ArrayList modif = new ArrayList();
	String name_params = new String();
	String temp_name_params = new String();
	String name = new String();
	int skip_else =0;
	int index_else = 0;
	int skip_if =0;
	int index_if = 0;
	int index_for = 0;
	int counter = 0;
	int ite_enter_no = 0;
	int con_enter_no = 0;
	int ite_exit_no = 0;
	int con_exit_no = 0;
	Stack <Integer> if_stack = new Stack<Integer>();
	Stack <Integer> for_stack = new Stack<Integer>();
	Stack <Integer> ite_exit = new Stack <Integer>();
	Stack <ArrayList> modif_stack = new Stack<ArrayList>();
	StringBuilder stack_sb = new StringBuilder();
	File filename = new File("OutputProgram.in");

//	String filename = new String("C:\\Anoop_Stuff\\ASU\\Spring 2016\\LPP\\Proj 2\\Code\\INTERM.txt");
	
	@Override
	public void enterStart(SATParser.StartContext ctx) {
		
		super.enterStart(ctx);
	}

	@Override
	public void exitStart(SATParser.StartContext ctx) {
		
		try {
			PrintWriter writer = new PrintWriter( filename,"UTF-8");
			for(int i =0; i<A1.size();i++)
			{
				writer.write(A1.get(i).toString() + '\n');
			}
				writer.close();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	
	
	public void enterFunction(SATParser.FunctionContext ctx) {
			
	}

	@Override
	public void exitFunction(SATParser.FunctionContext ctx) {
		
		
		String[] s = stack_sb.toString().split("\\n");
		if(s.length > 1)
		{
		for(String each_s: s){
			A1.add(each_s);
		}
		}
		if(!ctx.getText().toString().contains("main"))
		{
		A1.add("FEND");
		counter++;
		}
	}

	@Override
	public void enterStack_st(SATParser.Stack_stContext ctx) {
		
		
		if(ctx.getText().toString().contains("push")){
			stack_sb.append("SPUSH "+ ctx.ID()+','+ctx.NUM());
			stack_sb.append("\n");
		}
		else if(ctx.getText().toString().contains("pop")){
			stack_sb.append("SPOP "+ ctx.ID());
			stack_sb.append("\n");
		}
		else if(ctx.getText().toString().contains("peek")){
			stack_sb.append("SPEEK "+ ctx.ID());
			stack_sb.append("\n");
		}
		else{
		stack_sb.append("SEMPTY "+ ctx.ID());
		stack_sb.append("\n");
		}
	}

	@Override
	public void exitStack_st(SATParser.Stack_stContext ctx) {
		
	}

	@Override
	public void enterDecl_st(SATParser.Decl_stContext ctx) {
		
		
		if(ctx.getText().toString().contains("stack")){
			stack_sb.append("STACK "+ctx.ID());
			stack_sb.append("\n");
		}
		
	}

	@Override
	public void exitDecl_st(SATParser.Decl_stContext ctx) {
		
	}
	
	@Override
	public void enterFuncCall(SATParser.FuncCallContext ctx) {
		// TODO Auto-generated method stub
		
		temp_build1.append(ctx.ID());
		temp_build1.append(' ' + ctx.params1().getText());
		
		temp_name_params = temp_build1.toString();
		temp_build1.setLength(0);
		
	}	

	@Override
	public void exitFuncCall(SATParser.FuncCallContext ctx) {
		
	}

	@Override
	public void enterName(SATParser.NameContext ctx) {
		// TODO Auto-generated method stub
		
		build.setLength(0);
		if(!ctx.getText().toString().contains("main"))
		{
		build.append("FSTART" + ' ' + ctx.getText());
		name = ctx.getText();
		}
	}

	@Override
	public void exitName(SATParser.NameContext ctx) {
		
		
	}

	@Override
	public void enterRtType(SATParser.RtTypeContext ctx) {
		
	}

	
	
	
	@Override
	public void exitRtType(SATParser.RtTypeContext ctx) {
		
	}

	@Override public void enterReturna(SATParser.ReturnaContext ctx) 
	{
		
	}

	@Override public void exitReturna(SATParser.ReturnaContext ctx) 
	{
		
		
			A1.add("RETURN" + ' ' + ctx.var().getText().toString());
			counter++;	
	
	}
	
	
	
	
	@Override
	public void enterSt_list(SATParser.St_listContext ctx) {
		
	}

	@Override
	public void exitSt_list(SATParser.St_listContext ctx) {
		
	}

	@Override
	public void enterSt(SATParser.StContext ctx) {
		
	}

	@Override
	public void exitSt(SATParser.StContext ctx) {
		
	}

	@Override
	public void enterSim_st(SATParser.Sim_stContext ctx) {
		
	}

	@Override
	public void exitSim_st(SATParser.Sim_stContext ctx) {
		
	}

	@Override
	public void enterAssi_expr(SATParser.Assi_exprContext ctx) {
		
			A1.add("PUSH" + ' ' + ctx.ID());
			counter++;
		
		
	}

	@Override
	public void exitAssi_expr(SATParser.Assi_exprContext ctx) {
		A1.add("ASSIGN");
		counter++;
		
	}

	@Override
	public void enterCon_st(SATParser.Con_stContext ctx) {
		
	}

	@Override
	public void exitCon_st(SATParser.Con_stContext ctx) {
		
	}
	
	@Override public void enterIf_st(SATParser.If_stContext ctx) 
	{
		
		
	}
	
	@Override public void exitIf_st(SATParser.If_stContext ctx) 
	{
			
		String temp = new String();
		A1.add("PUSH FALSE");
		counter++;
	
		A1.add("FAILGOTO" + ' '+ skip_else);
		index_else = counter;
		counter++;
		skip_if = counter;
		int temp_index_if = if_stack.pop();
		temp = "FAILGOTO" + ' ' + skip_if;
		A1.set(temp_index_if, temp);
	}
	
	@Override public void enterElse_st(SATParser.Else_stContext ctx) 
	{
		skip_if = counter;
	}
	
	@Override public void exitElse_st(SATParser.Else_stContext ctx) 
	{
		
		String temp = new String();
		
		skip_else = counter;
		temp = "FAILGOTO" + ' ' + skip_else;
		A1.set(index_else, temp);
	}

	@Override
	public void enterIte_st(SATParser.Ite_stContext ctx) {
			}

	@Override
	public void exitIte_st(SATParser.Ite_stContext ctx) {
		// TODO Auto-generated method stub
		ArrayList temp = new ArrayList ();
		
		
		temp = modif_stack.pop();
		
		for(int i =0;i <temp.size(); i++)
		{
			A1.add(temp.get(i).toString());
			counter++;
		}
		
		A1.add("PUSH FALSE");
		counter++;
		int idx = for_stack.pop();
		A1.add("FAILGOTO" + ' ' + idx);
		counter++;
		ite_exit_no = counter;
		String temp1 = new String();
		temp1 = "FAILGOTO" + ' ' + ite_exit_no;
		
		int temp_index_for = idx + 3;
		A1.set(temp_index_for, temp1);
	}

	
	

	@Override
	public void enterCom_st(SATParser.Com_stContext ctx) {
		
	}

	@Override
	public void exitCom_st(SATParser.Com_stContext ctx) {
		
	}

	@Override
	public void enterExp(SATParser.ExpContext ctx) {
			
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
		
	}

	@Override
	public void exitExp(SATParser.ExpContext ctx) {
		
	}
	
	@Override public void enterPrint(SATParser.PrintContext ctx) 
	{ 
		
	}
	
	@Override public void exitPrint(SATParser.PrintContext ctx) 
	{
		A1.add("PRINT" + ' ' + ctx.var().getText().toString());
		counter++;
	}
	
	
	@Override
	public void enterTerm(SATParser.TermContext ctx) {
				

	}

	@Override
	public void exitTerm(SATParser.TermContext ctx) {
		for(int i =0; i< ctx.factor().size(); i++)
		{
			if(ctx.factor(i).getText().contains("("))
				{
				A1.add("CALL" + ' ' + temp_name_params);
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
	public void enterFactor(SATParser.FactorContext ctx) {
		
		
		
	}

	@Override
	public void exitFactor(SATParser.FactorContext ctx) {
			}

	@Override
	public void enterCon(SATParser.ConContext ctx) {
		for_stack.push(counter);
		
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
		
		
		index_if = counter;
		index_for = counter;
		if_stack.push(index_if);
		
		A1.add("FAILGOTO" + ' ');
		counter++;
		
		
		 
	
	}

	@Override
	public void exitCon(SATParser.ConContext ctx) {
			
	}

	@Override
	public void enterSimpleExp(SATParser.SimpleExpContext ctx) {
					}

	@Override
	public void exitSimpleExp(SATParser.SimpleExpContext ctx) {
			
	}

	@Override
	public void enterDt(SATParser.DtContext ctx) {
			}

	@Override
	public void exitDt(SATParser.DtContext ctx) {
			}

	@Override
	public void enterParams(SATParser.ParamsContext ctx) {
		
			build1.append(name + " ");
			for(int i=0; i<ctx.ID().size(); i++)
			{
				if(i==0)
				{
					build1.append(ctx.ID(i));
					build.append(" " + ctx.ID(i));
				}
				else
				{
					build1.append("," + ctx.ID(i));
					build.append(',' + ctx.ID(i).getText());
				}	
			}
			name_params = build1.toString();
			
		A1.add(build.toString());
		counter++;
		
	}

	@Override
	public void exitParams(SATParser.ParamsContext ctx) {
		
	}

	@Override
	public void enterIni(SATParser.IniContext ctx) {
		
		
	}

	@Override
	public void exitIni(SATParser.IniContext ctx) {
		A1.add("PUSH" + ' ' + ctx.ID());
		counter++;
		A1.add("PUSH" + ' ' + ctx.var().getText());
		counter++;
		A1.add("ASSIGN");
		counter++;
	}

	
	@Override
	public void enterModif(SATParser.ModifContext ctx) {
		ArrayList tmodif = new ArrayList();

		tmodif.add("PUSH" + ' ' + ctx.ID());
		
		tmodif.add("PUSH" + ' ' +ctx.var(0).getText());
		
		tmodif.add("PUSH" + ' ' + ctx.var(1).getText());
		
		
		if(ctx.OP().getText().equals("+"))
			tmodif.add("ADD");
		if(ctx.OP().getText().equals("-"))
			tmodif.add("SUB");
		
		
		tmodif.add("ASSIGN");
		
		modif_stack.push(tmodif);
		
		
	}

	@Override
	public void exitModif(SATParser.ModifContext ctx) {
		
	}

	@Override
	public void enterVar(SATParser.VarContext ctx) {
		
		
	}

	@Override
	public void exitVar(SATParser.VarContext ctx) {
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
			}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
			}

	@Override
	public void visitTerminal(TerminalNode node) {
		
		super.visitTerminal(node);
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		
		super.visitErrorNode(node);
	}
}
