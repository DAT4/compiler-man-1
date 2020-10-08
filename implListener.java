// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void enterMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 */
	void exitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expression}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterExpression(implParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitExpression(implParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(implParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(implParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inc}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterInc(implParser.IncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inc}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitInc(implParser.IncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(implParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(implParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forloop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForloop(implParser.ForloopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forloop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForloop(implParser.ForloopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code return}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterReturn(implParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code return}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitReturn(implParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elifStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterElifStat(implParser.ElifStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elifStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitElifStat(implParser.ElifStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(implParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(implParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstant(implParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstant(implParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArray(implParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArray(implParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(implParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(implParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(implParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(implParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(implParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(implParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterRelationalCondition(implParser.RelationalConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitRelationalCondition(implParser.RelationalConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNotCondition(implParser.NotConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNotCondition(implParser.NotConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterLogicalCondition(implParser.LogicalConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitLogicalCondition(implParser.LogicalConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityCondition(implParser.EqualityConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityCondition(implParser.EqualityConditionContext ctx);
}