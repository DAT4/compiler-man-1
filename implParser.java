// Generated from impl.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INC=11, DEC=12, IF=13, ELIF=14, ELSE=15, WHILE=16, FOR=17, PLUS=18, 
		MINUS=19, MULT=20, DIV=21, AND=22, OR=23, NEQ=24, EQ=25, LEQ=26, GEQ=27, 
		GT=28, LT=29, NOT=30, TRUE=31, FALSE=32, OUTPUT=33, ID=34, FLOAT=35, ALPHA=36, 
		NUM=37, WHITESPACE=38, COMMENT=39, COMMENT2=40;
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_command = 2, RULE_ifElse = 3, RULE_expr = 4, 
		RULE_condition = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "program", "command", "ifElse", "expr", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'['", "']'", "'='", "'('", "')'", "'..'", 
			"','", "'++'", "'--'", "'if'", "'elif'", "'else'", "'while'", "'for'", 
			"'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!='", "'=='", "'<='", "'>='", 
			"'>'", "'<'", "'!'", "'true'", "'false'", "'output'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "INC", 
			"DEC", "IF", "ELIF", "ELSE", "WHILE", "FOR", "PLUS", "MINUS", "MULT", 
			"DIV", "AND", "OR", "NEQ", "EQ", "LEQ", "GEQ", "GT", "LT", "NOT", "TRUE", 
			"FALSE", "OUTPUT", "ID", "FLOAT", "ALPHA", "NUM", "WHITESPACE", "COMMENT", 
			"COMMENT2"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MINUS) | (1L << OUTPUT) | (1L << ID) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(12);
				((StartContext)_localctx).command = command();
				((StartContext)_localctx).cs.add(((StartContext)_localctx).command);
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(18);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleCommandsContext extends ProgramContext {
		public CommandContext command;
		public List<CommandContext> cs = new ArrayList<CommandContext>();
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MultipleCommandsContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultipleCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultipleCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultipleCommands(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends ProgramContext {
		public CommandContext c;
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public SingleCommandContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			setState(29);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				((SingleCommandContext)_localctx).c = command();
				}
				break;
			case 2:
				_localctx = new MultipleCommandsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(21);
				match(T__0);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MINUS) | (1L << OUTPUT) | (1L << ID) | (1L << FLOAT))) != 0)) {
					{
					{
					setState(22);
					((MultipleCommandsContext)_localctx).command = command();
					((MultipleCommandsContext)_localctx).cs.add(((MultipleCommandsContext)_localctx).command);
					}
					}
					setState(27);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(28);
				match(T__1);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfBlockContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public IfElseContext ifElse;
		public List<IfElseContext> cs = new ArrayList<IfElseContext>();
		public TerminalNode IF() { return getToken(implParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<IfElseContext> ifElse() {
			return getRuleContexts(IfElseContext.class);
		}
		public IfElseContext ifElse(int i) {
			return getRuleContext(IfElseContext.class,i);
		}
		public IfBlockContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopContext extends CommandContext {
		public ConditionContext c;
		public ProgramContext p;
		public TerminalNode WHILE() { return getToken(implParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public WhileLoopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpressionContext extends CommandContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayAssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e1;
		public ExprContext e2;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForloopContext extends CommandContext {
		public Token x;
		public ExprContext e1;
		public ExprContext e2;
		public ProgramContext p;
		public TerminalNode FOR() { return getToken(implParser.FOR, 0); }
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ForloopContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterForloop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitForloop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitForloop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends CommandContext {
		public Token x;
		public ExprContext e;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends CommandContext {
		public ExprContext e;
		public TerminalNode OUTPUT() { return getToken(implParser.OUTPUT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncContext extends CommandContext {
		public Token x;
		public Token op;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public TerminalNode INC() { return getToken(implParser.INC, 0); }
		public TerminalNode DEC() { return getToken(implParser.DEC, 0); }
		public IncContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		int _la;
		try {
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				((ExpressionContext)_localctx).e = expr(0);
				setState(32);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new ArrayAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ArrayAssignmentContext)_localctx).x = match(ID);
				setState(35);
				match(T__3);
				setState(36);
				((ArrayAssignmentContext)_localctx).e1 = expr(0);
				setState(37);
				match(T__4);
				setState(38);
				match(T__5);
				setState(39);
				((ArrayAssignmentContext)_localctx).e2 = expr(0);
				setState(40);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				((AssignmentContext)_localctx).x = match(ID);
				setState(43);
				match(T__5);
				setState(44);
				((AssignmentContext)_localctx).e = expr(0);
				setState(45);
				match(T__2);
				}
				break;
			case 4:
				_localctx = new IncContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				((IncContext)_localctx).x = match(ID);
				setState(48);
				((IncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(49);
				match(T__2);
				}
				break;
			case 5:
				_localctx = new IfBlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(50);
				match(IF);
				setState(51);
				match(T__6);
				setState(52);
				((IfBlockContext)_localctx).c = condition(0);
				setState(53);
				match(T__7);
				setState(54);
				((IfBlockContext)_localctx).p = program();
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						((IfBlockContext)_localctx).ifElse = ifElse();
						((IfBlockContext)_localctx).cs.add(((IfBlockContext)_localctx).ifElse);
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 6:
				_localctx = new WhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				match(WHILE);
				setState(62);
				match(T__6);
				setState(63);
				((WhileLoopContext)_localctx).c = condition(0);
				setState(64);
				match(T__7);
				setState(65);
				((WhileLoopContext)_localctx).p = program();
				}
				break;
			case 7:
				_localctx = new ForloopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				match(FOR);
				setState(68);
				match(T__6);
				setState(69);
				((ForloopContext)_localctx).x = match(ID);
				setState(70);
				match(T__5);
				setState(71);
				((ForloopContext)_localctx).e1 = expr(0);
				setState(72);
				match(T__8);
				setState(73);
				((ForloopContext)_localctx).e2 = expr(0);
				setState(74);
				match(T__7);
				setState(75);
				((ForloopContext)_localctx).p = program();
				}
				break;
			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(77);
				match(OUTPUT);
				setState(78);
				((ReturnContext)_localctx).e = expr(0);
				setState(79);
				match(T__2);
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

	public static class IfElseContext extends ParserRuleContext {
		public IfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElse; }
	 
		public IfElseContext() { }
		public void copyFrom(IfElseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ElifStatContext extends IfElseContext {
		public ConditionContext c;
		public ProgramContext p;
		public TerminalNode ELIF() { return getToken(implParser.ELIF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ElifStatContext(IfElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterElifStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitElifStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitElifStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseStatContext extends IfElseContext {
		public ProgramContext p;
		public TerminalNode ELSE() { return getToken(implParser.ELSE, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public ElseStatContext(IfElseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterElseStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitElseStat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitElseStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseContext ifElse() throws RecognitionException {
		IfElseContext _localctx = new IfElseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifElse);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				_localctx = new ElifStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(ELIF);
				setState(84);
				match(T__6);
				setState(85);
				((ElifStatContext)_localctx).c = condition(0);
				setState(86);
				match(T__7);
				setState(87);
				((ElifStatContext)_localctx).p = program();
				}
				break;
			case ELSE:
				_localctx = new ElseStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(ELSE);
				setState(90);
				((ElseStatContext)_localctx).p = program();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstantContext extends ExprContext {
		public Token e;
		public TerminalNode FLOAT() { return getToken(implParser.FLOAT, 0); }
		public ConstantContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr;
		public List<ExprContext> es = new ArrayList<ExprContext>();
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExprContext {
		public ExprContext e;
		public TerminalNode MINUS() { return getToken(implParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x;
		public TerminalNode ID() { return getToken(implParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(implParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(implParser.DIV, 0); }
		public MultiplicationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayIndexContext extends ExprContext {
		public ExprContext x;
		public ExprContext e;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterArrayIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitArrayIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitArrayIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisContext extends ExprContext {
		public ExprContext e;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenthesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionContext extends ExprContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(implParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(implParser.MINUS, 0); }
		public AdditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				_localctx = new ArrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94);
				match(T__0);
				setState(95);
				((ArrayContext)_localctx).e = expr(0);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(96);
					match(T__9);
					setState(97);
					((ArrayContext)_localctx).expr = expr(0);
					((ArrayContext)_localctx).es.add(((ArrayContext)_localctx).expr);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__1);
				}
				break;
			case MINUS:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(MINUS);
				setState(106);
				((UnaryMinusContext)_localctx).e = expr(6);
				}
				break;
			case FLOAT:
				{
				_localctx = new ConstantContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				((ConstantContext)_localctx).e = match(FLOAT);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				((VariableContext)_localctx).x = match(ID);
				}
				break;
			case T__6:
				{
				_localctx = new ParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				match(T__6);
				setState(110);
				((ParenthesisContext)_localctx).e = expr(0);
				setState(111);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						((MultiplicationContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultiplicationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(117);
						((MultiplicationContext)_localctx).e2 = expr(6);
						}
						break;
					case 2:
						{
						_localctx = new AdditionContext(new ExprContext(_parentctx, _parentState));
						((AdditionContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(118);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(119);
						((AdditionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(120);
						((AdditionContext)_localctx).e2 = expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ArrayIndexContext(new ExprContext(_parentctx, _parentState));
						((ArrayIndexContext)_localctx).x = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(121);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(122);
						match(T__3);
						setState(123);
						((ArrayIndexContext)_localctx).e = expr(0);
						setState(124);
						match(T__4);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationalConditionContext extends ConditionContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LEQ() { return getToken(implParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(implParser.GEQ, 0); }
		public TerminalNode LT() { return getToken(implParser.LT, 0); }
		public TerminalNode GT() { return getToken(implParser.GT, 0); }
		public RelationalConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterRelationalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitRelationalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitRelationalCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotConditionContext extends ConditionContext {
		public ConditionContext c;
		public TerminalNode NOT() { return getToken(implParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public NotConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNotCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNotCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNotCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalConditionContext extends ConditionContext {
		public ConditionContext c1;
		public Token op;
		public ConditionContext c2;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(implParser.OR, 0); }
		public TerminalNode AND() { return getToken(implParser.AND, 0); }
		public LogicalConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLogicalCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLogicalCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLogicalCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityConditionContext extends ConditionContext {
		public ExprContext e1;
		public Token op;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(implParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(implParser.NEQ, 0); }
		public EqualityConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterEqualityCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitEqualityCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitEqualityCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NotConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(132);
				match(NOT);
				setState(133);
				((NotConditionContext)_localctx).c = condition(4);
				}
				break;
			case 2:
				{
				_localctx = new EqualityConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(134);
				((EqualityConditionContext)_localctx).e1 = expr(0);
				setState(135);
				((EqualityConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NEQ || _la==EQ) ) {
					((EqualityConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(136);
				((EqualityConditionContext)_localctx).e2 = expr(0);
				}
				break;
			case 3:
				{
				_localctx = new RelationalConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				((RelationalConditionContext)_localctx).e1 = expr(0);
				setState(139);
				((RelationalConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LEQ) | (1L << GEQ) | (1L << GT) | (1L << LT))) != 0)) ) {
					((RelationalConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(140);
				((RelationalConditionContext)_localctx).e2 = expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalConditionContext(new ConditionContext(_parentctx, _parentState));
					((LogicalConditionContext)_localctx).c1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(144);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(145);
					((LogicalConditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
						((LogicalConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(146);
					((LogicalConditionContext)_localctx).c2 = condition(4);
					}
					} 
				}
				setState(151);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 5:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u009b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\7\2\20\n\2\f\2\16\2\23\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\3\5\3 \n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4;\n\4\f\4\16\4>\13\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4T\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5^\n\5\3\6\3\6\3\6\3\6\3\6\7\6e\n\6\f\6"+
		"\16\6h\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6t\n\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0081\n\6\f\6\16\6\u0084\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0091\n\7\3\7\3\7\3\7\7"+
		"\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\2\4\n\f\b\2\4\6\b\n\f\2\b\3\2\r\16"+
		"\3\2\26\27\3\2\24\25\3\2\32\33\3\2\34\37\3\2\30\31\2\u00ab\2\21\3\2\2"+
		"\2\4\37\3\2\2\2\6S\3\2\2\2\b]\3\2\2\2\ns\3\2\2\2\f\u0090\3\2\2\2\16\20"+
		"\5\6\4\2\17\16\3\2\2\2\20\23\3\2\2\2\21\17\3\2\2\2\21\22\3\2\2\2\22\24"+
		"\3\2\2\2\23\21\3\2\2\2\24\25\7\2\2\3\25\3\3\2\2\2\26 \5\6\4\2\27\33\7"+
		"\3\2\2\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\36\3\2\2\2\35\33\3\2\2\2\36 \7\4\2\2\37\26\3\2\2\2\37\27\3\2"+
		"\2\2 \5\3\2\2\2!\"\5\n\6\2\"#\7\5\2\2#T\3\2\2\2$%\7$\2\2%&\7\6\2\2&\'"+
		"\5\n\6\2\'(\7\7\2\2()\7\b\2\2)*\5\n\6\2*+\7\5\2\2+T\3\2\2\2,-\7$\2\2-"+
		".\7\b\2\2./\5\n\6\2/\60\7\5\2\2\60T\3\2\2\2\61\62\7$\2\2\62\63\t\2\2\2"+
		"\63T\7\5\2\2\64\65\7\17\2\2\65\66\7\t\2\2\66\67\5\f\7\2\678\7\n\2\28<"+
		"\5\4\3\29;\5\b\5\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=T\3\2\2\2>"+
		"<\3\2\2\2?@\7\22\2\2@A\7\t\2\2AB\5\f\7\2BC\7\n\2\2CD\5\4\3\2DT\3\2\2\2"+
		"EF\7\23\2\2FG\7\t\2\2GH\7$\2\2HI\7\b\2\2IJ\5\n\6\2JK\7\13\2\2KL\5\n\6"+
		"\2LM\7\n\2\2MN\5\4\3\2NT\3\2\2\2OP\7#\2\2PQ\5\n\6\2QR\7\5\2\2RT\3\2\2"+
		"\2S!\3\2\2\2S$\3\2\2\2S,\3\2\2\2S\61\3\2\2\2S\64\3\2\2\2S?\3\2\2\2SE\3"+
		"\2\2\2SO\3\2\2\2T\7\3\2\2\2UV\7\20\2\2VW\7\t\2\2WX\5\f\7\2XY\7\n\2\2Y"+
		"Z\5\4\3\2Z^\3\2\2\2[\\\7\21\2\2\\^\5\4\3\2]U\3\2\2\2][\3\2\2\2^\t\3\2"+
		"\2\2_`\b\6\1\2`a\7\3\2\2af\5\n\6\2bc\7\f\2\2ce\5\n\6\2db\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2ij\7\4\2\2jt\3\2\2\2kl\7\25"+
		"\2\2lt\5\n\6\bmt\7%\2\2nt\7$\2\2op\7\t\2\2pq\5\n\6\2qr\7\n\2\2rt\3\2\2"+
		"\2s_\3\2\2\2sk\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2t\u0082\3\2\2\2uv"+
		"\f\7\2\2vw\t\3\2\2w\u0081\5\n\6\bxy\f\6\2\2yz\t\4\2\2z\u0081\5\n\6\7{"+
		"|\f\t\2\2|}\7\6\2\2}~\5\n\6\2~\177\7\7\2\2\177\u0081\3\2\2\2\u0080u\3"+
		"\2\2\2\u0080x\3\2\2\2\u0080{\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\13\3\2\2\2\u0084\u0082\3\2\2\2\u0085"+
		"\u0086\b\7\1\2\u0086\u0087\7 \2\2\u0087\u0091\5\f\7\6\u0088\u0089\5\n"+
		"\6\2\u0089\u008a\t\5\2\2\u008a\u008b\5\n\6\2\u008b\u0091\3\2\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\u008e\t\6\2\2\u008e\u008f\5\n\6\2\u008f\u0091\3\2"+
		"\2\2\u0090\u0085\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u008c\3\2\2\2\u0091"+
		"\u0097\3\2\2\2\u0092\u0093\f\5\2\2\u0093\u0094\t\7\2\2\u0094\u0096\5\f"+
		"\7\6\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\r\3\2\2\2\u0099\u0097\3\2\2\2\16\21\33\37<S]fs\u0080"+
		"\u0082\u0090\u0097";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}