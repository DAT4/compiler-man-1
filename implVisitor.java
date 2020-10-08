// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleCommand}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(implParser.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multipleCommands}
	 * labeled alternative in {@link implParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleCommands(implParser.MultipleCommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expression}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(implParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(implParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inc}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(implParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifBlock}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(implParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileLoop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(implParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forloop}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForloop(implParser.ForloopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code return}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(implParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elifStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifStat(implParser.ElifStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code elseStat}
	 * labeled alternative in {@link implParser#ifElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStat(implParser.ElseStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constant}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(implParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(implParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinus}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(implParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(implParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(implParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayIndex}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(implParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(implParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(implParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalCondition(implParser.RelationalConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCondition(implParser.NotConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalCondition(implParser.LogicalConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityCondition}
	 * labeled alternative in {@link implParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityCondition(implParser.EqualityConditionContext ctx);
}