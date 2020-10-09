import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Simple calculator\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	CharStream input = CharStreams.fromFileName(filename);
	implLexer lex = new implLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lex);
	implParser parser = new implParser(tokens);
	ParseTree parseTree = parser.start();
	Interpreter interpreter = new Interpreter();
	interpreter.visit(parseTree);
    }
}

class Interpreter extends AbstractParseTreeVisitor<Double> implements implVisitor<Double> {

    static Environment env=new Environment();

	public Double visitStart(implParser.StartContext ctx){
        for(implParser.CommandContext c:ctx.cs) visit(c);
        return null;
    }
	public Double visitSingleCommand(implParser.SingleCommandContext ctx){
        return visit(ctx.c);
    }
	public Double visitMultipleCommands(implParser.MultipleCommandsContext ctx){
        for(implParser.CommandContext c:ctx.cs) visit(c);
        return null;
    }
    private String lastVariable;
	public Double visitArrayAssignment(implParser.ArrayAssignmentContext ctx){
        Double v=visit(ctx.e2);
        int index = visit(ctx.e1).intValue();
        env.setVariable(ctx.x.getText()+"["+index+"]",v);
        return null;
    }
	public Double visitAssignment(implParser.AssignmentContext ctx){
        this.lastVariable = ctx.x.getText();
        Double v=visit(ctx.e);
        env.setVariable(ctx.x.getText(),v);
        return null;
    }
	public Double visitIfBlock(implParser.IfBlockContext ctx){
        if(visit(ctx.c) == 1.0)
            return visit(ctx.p);
        else
            for(implParser.IfElseContext c: ctx.cs)
                if(visit(c) == 1.0)
                    break;
        return null;
    }
	public Double visitReturn(implParser.ReturnContext ctx){
        Double v=visit(ctx.e);
        System.out.println(v);
        return null;
    }
	public Double visitElifStat(implParser.ElifStatContext ctx){
        if(visit(ctx.c) == 1.0){
            visit(ctx.p);
            return 1.0;
        }
        return 0.0;
    }
	public Double visitElseStat(implParser.ElseStatContext ctx){
        visit(ctx.p);
        return 1.0;
    }
	public Double visitLogicalCondition(implParser.LogicalConditionContext ctx){
        if(ctx.op.getText().equals("&&")){
            if (visit(ctx.c1) == 1.0 && visit(ctx.c2) == 1.0){
                return 1.0;
            }
            else
                return 0.0;
        } else if(ctx.op.getText().equals("||")){
            if (visit(ctx.c1) == 1.0 || visit(ctx.c2) == 1.0)
                return 1.0;
            else
                return 0.0;
        } else {
            return null;
        }
    }
	public Double visitNotCondition(implParser.NotConditionContext ctx){
        return null;
    }
	public Double visitExpression(implParser.ExpressionContext ctx){
        return null;
    }

	public Double visitArray(implParser.ArrayContext ctx){
        env.setVariable(this.lastVariable+"[0]",visit(ctx.e));
        int i = 1;
        for(implParser.ExprContext e: ctx.es){
            env.setVariable(this.lastVariable+"["+i+"]",visit(e));
            i++;
        }
        return 0.0;

    }
	public Double visitArrayIndex(implParser.ArrayIndexContext ctx){
        int index = visit(ctx.e).intValue();
        return env.getVariable(ctx.x.getText()+"["+index+"]");
    }
	public Double visitConstant(implParser.ConstantContext ctx){
        return Double.parseDouble(ctx.e.getText());
    }
	public Double visitUnaryMinus(implParser.UnaryMinusContext ctx){
        return - Double.parseDouble(ctx.e.getText());
    }
	public Double visitVariable(implParser.VariableContext ctx){
        return env.getVariable(ctx.x.getText());
    }
	public Double visitMultiplication(implParser.MultiplicationContext ctx){
        if(ctx.op.getText() == "*")
            return visit(ctx.e1)*visit(ctx.e2);
        else
            return visit(ctx.e1)/visit(ctx.e2);
    }
	public Double visitParenthesis(implParser.ParenthesisContext ctx){
        return visit(ctx.e);
    }
	public Double visitInc(implParser.IncContext ctx){
        Double v=env.getVariable(ctx.x.getText());

        if(ctx.op.getText().equals("++")){
            v++;
        } else if(ctx.op.getText().equals("--")){
            v--;
        }
        env.setVariable(ctx.x.getText(),v);
        return null;
        
    }
	public Double visitAddition(implParser.AdditionContext ctx){
        if(ctx.op.getText() == "+")
            return visit(ctx.e1)+visit(ctx.e2);
        else
            return visit(ctx.e1)-visit(ctx.e2);
    }
    /* e1=expr op=(EQ | NEQ) e2=expr */
	public Double visitEqualityCondition(implParser.EqualityConditionContext ctx){
        if(ctx.op.getText().equals("==")){
            if (visit(ctx.e1).intValue() == visit(ctx.e2).intValue())
                return 1.0;
            else
                return 0.0;
        } else if(ctx.op.getText().equals("!=")){
            if (visit(ctx.e1).intValue() != visit(ctx.e2).intValue())
                return 1.0;
            else
                return 0.0;
        } else {
            return null;
        }
    }
	public Double visitRelationalCondition(implParser.RelationalConditionContext ctx){
        if(ctx.op.getText().equals(">")){
            if(visit(ctx.e1)>visit(ctx.e2)) return 1.0;
            else return 0.0;
        } else if(ctx.op.getText().equals("<")){
            if(visit(ctx.e1)<visit(ctx.e2)) return 1.0;
            else return 0.0;
        } else if(ctx.op.getText().equals(">=")){
            if(visit(ctx.e1)>=visit(ctx.e2)) return 1.0;
            else return 0.0;
        } else if(ctx.op.getText().equals("<=")){
            if(visit(ctx.e1)<=visit(ctx.e2)) return 1.0;
            else return 0.0;
        } else {
            return null;
        }
    }
	public Double visitWhileLoop(implParser.WhileLoopContext ctx){
       while(visit(ctx.c) == 1.0) visit(ctx.p);
       return null;
    }
	public Double visitForloop(implParser.ForloopContext ctx){
        String variable = ctx.x.getText();
        env.setVariable(variable,visit(ctx.e1));
        Double end=visit(ctx.e2);
        Double value = env.getVariable(variable)-1;
        while(value < end){
            env.setVariable(variable,++value);
            visit(ctx.p);
            value = env.getVariable(variable);
        }
        return null;
    }
}

