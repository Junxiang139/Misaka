// Generated from C:/Users/DolphinAuditore/workspace/Misaka/src/Parser\Misaka.g4 by ANTLR 4.5.1
package Parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MisakaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NULL=1, Break=2, Continue=3, Else=4, For=5, If=6, Int=7, String=8, New=9, 
		Return=10, Class=11, Void=12, While=13, LP=14, RP=15, LK=16, RK=17, LB=18, 
		RB=19, Less=20, LessEqual=21, Greater=22, GreaterEqual=23, LeftShift=24, 
		RightShift=25, Plus=26, PlusPlus=27, Minus=28, MinusMinus=29, Star=30, 
		Div=31, Mod=32, And=33, Or=34, AndAnd=35, OrOr=36, Caret=37, Not=38, Tilde=39, 
		Question=40, Colon=41, Semi=42, Comma=43, Assign=44, Equal=45, NotEqual=46, 
		Dot=47, ID=48, INT_LITERAL=49, STRING_LITERAL=50, Whitespace=51, Newline=52, 
		BlockComment=53, LineComment=54;
	public static final int
		RULE_expr = 0, RULE_assignment_expr = 1, RULE_log_or_expr = 2, RULE_log_and_expr = 3, 
		RULE_inclusive_or_expr = 4, RULE_exclusive_or_expr = 5, RULE_and_expr = 6, 
		RULE_equal_expr = 7, RULE_relation_expr = 8, RULE_shift_expr = 9, RULE_add_expr = 10, 
		RULE_multi_expr = 11, RULE_new_expr = 12, RULE_dim_expr = 13, RULE_type = 14, 
		RULE_unary_expr = 15, RULE_postfix_expr = 16, RULE_argument_expr_list = 17, 
		RULE_primary_expr = 18, RULE_stmt = 19, RULE_compound_stmt = 20, RULE_blockItem_list = 21, 
		RULE_blockItem = 22, RULE_expr_stmt = 23, RULE_select_stmt = 24, RULE_iter_stmt = 25, 
		RULE_jump_stmt = 26, RULE_declaration = 27, RULE_init_decl = 28, RULE_decl = 29, 
		RULE_identifierList = 30, RULE_initializer = 31, RULE_initializer_list = 32, 
		RULE_compilation_unit = 33, RULE_translation_unit = 34, RULE_external_declaration = 35, 
		RULE_class_def = 36, RULE_function_def = 37;
	public static final String[] ruleNames = {
		"expr", "assignment_expr", "log_or_expr", "log_and_expr", "inclusive_or_expr", 
		"exclusive_or_expr", "and_expr", "equal_expr", "relation_expr", "shift_expr", 
		"add_expr", "multi_expr", "new_expr", "dim_expr", "type", "unary_expr", 
		"postfix_expr", "argument_expr_list", "primary_expr", "stmt", "compound_stmt", 
		"blockItem_list", "blockItem", "expr_stmt", "select_stmt", "iter_stmt", 
		"jump_stmt", "declaration", "init_decl", "decl", "identifierList", "initializer", 
		"initializer_list", "compilation_unit", "translation_unit", "external_declaration", 
		"class_def", "function_def"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'NULL'", "'break'", "'continue'", "'else'", "'for'", "'if'", "'int'", 
		"'string'", "'new'", "'return'", "'class'", "'void'", "'while'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", 
		"'>>'", "'+'", "'++'", "'-'", "'--'", "'*'", "'/'", "'%'", "'&'", null, 
		"'&&'", "'||'", "'^'", "'!'", "'~'", "'?'", "':'", "';'", "','", "'='", 
		"'=='", "'!='", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NULL", "Break", "Continue", "Else", "For", "If", "Int", "String", 
		"New", "Return", "Class", "Void", "While", "LP", "RP", "LK", "RK", "LB", 
		"RB", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
		"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
		"Semi", "Comma", "Assign", "Equal", "NotEqual", "Dot", "ID", "INT_LITERAL", 
		"STRING_LITERAL", "Whitespace", "Newline", "BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "Misaka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MisakaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
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
	public static class Expr_to_assignContext extends ExprContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Expr_to_assignContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterExpr_to_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitExpr_to_assign(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			_localctx = new Expr_to_assignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			assignment_expr();
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

	public static class Assignment_exprContext extends ParserRuleContext {
		public Assignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_expr; }
	 
		public Assignment_exprContext() { }
		public void copyFrom(Assignment_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assign_to_logorContext extends Assignment_exprContext {
		public Log_or_exprContext log_or_expr() {
			return getRuleContext(Log_or_exprContext.class,0);
		}
		public Assign_to_logorContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAssign_to_logor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAssign_to_logor(this);
		}
	}
	public static class Assign_defContext extends Assignment_exprContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MisakaParser.Assign, 0); }
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Assign_defContext(Assignment_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAssign_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAssign_def(this);
		}
	}

	public final Assignment_exprContext assignment_expr() throws RecognitionException {
		Assignment_exprContext _localctx = new Assignment_exprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment_expr);
		try {
			setState(83);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new Assign_to_logorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				log_or_expr(0);
				}
				break;
			case 2:
				_localctx = new Assign_defContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				unary_expr();
				setState(80);
				match(Assign);
				setState(81);
				assignment_expr();
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

	public static class Log_or_exprContext extends ParserRuleContext {
		public Log_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_or_expr; }
	 
		public Log_or_exprContext() { }
		public void copyFrom(Log_or_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Logor_to_logandContext extends Log_or_exprContext {
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public Logor_to_logandContext(Log_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterLogor_to_logand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitLogor_to_logand(this);
		}
	}
	public static class Or_defContext extends Log_or_exprContext {
		public Log_or_exprContext log_or_expr() {
			return getRuleContext(Log_or_exprContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(MisakaParser.OrOr, 0); }
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public Or_defContext(Log_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterOr_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitOr_def(this);
		}
	}

	public final Log_or_exprContext log_or_expr() throws RecognitionException {
		return log_or_expr(0);
	}

	private Log_or_exprContext log_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Log_or_exprContext _localctx = new Log_or_exprContext(_ctx, _parentState);
		Log_or_exprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_log_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Logor_to_logandContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(86);
			log_and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Or_defContext(new Log_or_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_log_or_expr);
					setState(88);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(89);
					match(OrOr);
					setState(90);
					log_and_expr(0);
					}
					} 
				}
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Log_and_exprContext extends ParserRuleContext {
		public Log_and_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log_and_expr; }
	 
		public Log_and_exprContext() { }
		public void copyFrom(Log_and_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Logand_to_incorContext extends Log_and_exprContext {
		public Inclusive_or_exprContext inclusive_or_expr() {
			return getRuleContext(Inclusive_or_exprContext.class,0);
		}
		public Logand_to_incorContext(Log_and_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterLogand_to_incor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitLogand_to_incor(this);
		}
	}
	public static class Logand_defContext extends Log_and_exprContext {
		public Log_and_exprContext log_and_expr() {
			return getRuleContext(Log_and_exprContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(MisakaParser.AndAnd, 0); }
		public Inclusive_or_exprContext inclusive_or_expr() {
			return getRuleContext(Inclusive_or_exprContext.class,0);
		}
		public Logand_defContext(Log_and_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterLogand_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitLogand_def(this);
		}
	}

	public final Log_and_exprContext log_and_expr() throws RecognitionException {
		return log_and_expr(0);
	}

	private Log_and_exprContext log_and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Log_and_exprContext _localctx = new Log_and_exprContext(_ctx, _parentState);
		Log_and_exprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_log_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Logand_to_incorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(97);
			inclusive_or_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logand_defContext(new Log_and_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_log_and_expr);
					setState(99);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(100);
					match(AndAnd);
					setState(101);
					inclusive_or_expr(0);
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class Inclusive_or_exprContext extends ParserRuleContext {
		public Inclusive_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusive_or_expr; }
	 
		public Inclusive_or_exprContext() { }
		public void copyFrom(Inclusive_or_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Incor_to_exlorContext extends Inclusive_or_exprContext {
		public Exclusive_or_exprContext exclusive_or_expr() {
			return getRuleContext(Exclusive_or_exprContext.class,0);
		}
		public Incor_to_exlorContext(Inclusive_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIncor_to_exlor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIncor_to_exlor(this);
		}
	}
	public static class Incor_defContext extends Inclusive_or_exprContext {
		public Inclusive_or_exprContext inclusive_or_expr() {
			return getRuleContext(Inclusive_or_exprContext.class,0);
		}
		public TerminalNode Or() { return getToken(MisakaParser.Or, 0); }
		public Exclusive_or_exprContext exclusive_or_expr() {
			return getRuleContext(Exclusive_or_exprContext.class,0);
		}
		public Incor_defContext(Inclusive_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIncor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIncor_def(this);
		}
	}

	public final Inclusive_or_exprContext inclusive_or_expr() throws RecognitionException {
		return inclusive_or_expr(0);
	}

	private Inclusive_or_exprContext inclusive_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Inclusive_or_exprContext _localctx = new Inclusive_or_exprContext(_ctx, _parentState);
		Inclusive_or_exprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_inclusive_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Incor_to_exlorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(108);
			exclusive_or_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Incor_defContext(new Inclusive_or_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_inclusive_or_expr);
					setState(110);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(111);
					match(Or);
					setState(112);
					exclusive_or_expr(0);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Exclusive_or_exprContext extends ParserRuleContext {
		public Exclusive_or_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusive_or_expr; }
	 
		public Exclusive_or_exprContext() { }
		public void copyFrom(Exclusive_or_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exlor_to_andContext extends Exclusive_or_exprContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public Exlor_to_andContext(Exclusive_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterExlor_to_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitExlor_to_and(this);
		}
	}
	public static class Exlor_defContext extends Exclusive_or_exprContext {
		public Exclusive_or_exprContext exclusive_or_expr() {
			return getRuleContext(Exclusive_or_exprContext.class,0);
		}
		public TerminalNode Caret() { return getToken(MisakaParser.Caret, 0); }
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public Exlor_defContext(Exclusive_or_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterExlor_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitExlor_def(this);
		}
	}

	public final Exclusive_or_exprContext exclusive_or_expr() throws RecognitionException {
		return exclusive_or_expr(0);
	}

	private Exclusive_or_exprContext exclusive_or_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exclusive_or_exprContext _localctx = new Exclusive_or_exprContext(_ctx, _parentState);
		Exclusive_or_exprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exclusive_or_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Exlor_to_andContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(119);
			and_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exlor_defContext(new Exclusive_or_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exclusive_or_expr);
					setState(121);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(122);
					match(Caret);
					setState(123);
					and_expr(0);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class And_exprContext extends ParserRuleContext {
		public And_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and_expr; }
	 
		public And_exprContext() { }
		public void copyFrom(And_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class And_defContext extends And_exprContext {
		public And_exprContext and_expr() {
			return getRuleContext(And_exprContext.class,0);
		}
		public TerminalNode And() { return getToken(MisakaParser.And, 0); }
		public Equal_exprContext equal_expr() {
			return getRuleContext(Equal_exprContext.class,0);
		}
		public And_defContext(And_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAnd_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAnd_def(this);
		}
	}
	public static class And_to_equalContext extends And_exprContext {
		public Equal_exprContext equal_expr() {
			return getRuleContext(Equal_exprContext.class,0);
		}
		public And_to_equalContext(And_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAnd_to_equal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAnd_to_equal(this);
		}
	}

	public final And_exprContext and_expr() throws RecognitionException {
		return and_expr(0);
	}

	private And_exprContext and_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		And_exprContext _localctx = new And_exprContext(_ctx, _parentState);
		And_exprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_and_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new And_to_equalContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(130);
			equal_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new And_defContext(new And_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_and_expr);
					setState(132);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(133);
					match(And);
					setState(134);
					equal_expr(0);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class Equal_exprContext extends ParserRuleContext {
		public Equal_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_expr; }
	 
		public Equal_exprContext() { }
		public void copyFrom(Equal_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Equal_to_relContext extends Equal_exprContext {
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public Equal_to_relContext(Equal_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEqual_to_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEqual_to_rel(this);
		}
	}
	public static class Equal_not_defContext extends Equal_exprContext {
		public Equal_exprContext equal_expr() {
			return getRuleContext(Equal_exprContext.class,0);
		}
		public TerminalNode NotEqual() { return getToken(MisakaParser.NotEqual, 0); }
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public Equal_not_defContext(Equal_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEqual_not_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEqual_not_def(this);
		}
	}
	public static class Equal_defContext extends Equal_exprContext {
		public Equal_exprContext equal_expr() {
			return getRuleContext(Equal_exprContext.class,0);
		}
		public TerminalNode Equal() { return getToken(MisakaParser.Equal, 0); }
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public Equal_defContext(Equal_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEqual_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEqual_def(this);
		}
	}

	public final Equal_exprContext equal_expr() throws RecognitionException {
		return equal_expr(0);
	}

	private Equal_exprContext equal_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Equal_exprContext _localctx = new Equal_exprContext(_ctx, _parentState);
		Equal_exprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_equal_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Equal_to_relContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(141);
			relation_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(149);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new Equal_defContext(new Equal_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equal_expr);
						setState(143);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(144);
						match(Equal);
						setState(145);
						relation_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Equal_not_defContext(new Equal_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_equal_expr);
						setState(146);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(147);
						match(NotEqual);
						setState(148);
						relation_expr(0);
						}
						break;
					}
					} 
				}
				setState(153);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Relation_exprContext extends ParserRuleContext {
		public Relation_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_expr; }
	 
		public Relation_exprContext() { }
		public void copyFrom(Relation_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Rel_to_shiftContext extends Relation_exprContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Rel_to_shiftContext(Relation_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterRel_to_shift(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitRel_to_shift(this);
		}
	}
	public static class Rel_liteContext extends Relation_exprContext {
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public TerminalNode LessEqual() { return getToken(MisakaParser.LessEqual, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Rel_liteContext(Relation_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterRel_lite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitRel_lite(this);
		}
	}
	public static class Rel_bigContext extends Relation_exprContext {
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public TerminalNode Greater() { return getToken(MisakaParser.Greater, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Rel_bigContext(Relation_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterRel_big(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitRel_big(this);
		}
	}
	public static class Rel_bigeContext extends Relation_exprContext {
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public TerminalNode GreaterEqual() { return getToken(MisakaParser.GreaterEqual, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Rel_bigeContext(Relation_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterRel_bige(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitRel_bige(this);
		}
	}
	public static class Rel_litContext extends Relation_exprContext {
		public Relation_exprContext relation_expr() {
			return getRuleContext(Relation_exprContext.class,0);
		}
		public TerminalNode Less() { return getToken(MisakaParser.Less, 0); }
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public Rel_litContext(Relation_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterRel_lit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitRel_lit(this);
		}
	}

	public final Relation_exprContext relation_expr() throws RecognitionException {
		return relation_expr(0);
	}

	private Relation_exprContext relation_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Relation_exprContext _localctx = new Relation_exprContext(_ctx, _parentState);
		Relation_exprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_relation_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Rel_to_shiftContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(155);
			shift_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new Rel_litContext(new Relation_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation_expr);
						setState(157);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(158);
						match(Less);
						setState(159);
						shift_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Rel_bigContext(new Relation_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation_expr);
						setState(160);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(161);
						match(Greater);
						setState(162);
						shift_expr(0);
						}
						break;
					case 3:
						{
						_localctx = new Rel_liteContext(new Relation_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation_expr);
						setState(163);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(164);
						match(LessEqual);
						setState(165);
						shift_expr(0);
						}
						break;
					case 4:
						{
						_localctx = new Rel_bigeContext(new Relation_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_relation_expr);
						setState(166);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(167);
						match(GreaterEqual);
						setState(168);
						shift_expr(0);
						}
						break;
					}
					} 
				}
				setState(173);
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

	public static class Shift_exprContext extends ParserRuleContext {
		public Shift_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shift_expr; }
	 
		public Shift_exprContext() { }
		public void copyFrom(Shift_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Shift_lContext extends Shift_exprContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(MisakaParser.LeftShift, 0); }
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Shift_lContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterShift_l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitShift_l(this);
		}
	}
	public static class Shift_to_addContext extends Shift_exprContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Shift_to_addContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterShift_to_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitShift_to_add(this);
		}
	}
	public static class Shift_rContext extends Shift_exprContext {
		public Shift_exprContext shift_expr() {
			return getRuleContext(Shift_exprContext.class,0);
		}
		public TerminalNode RightShift() { return getToken(MisakaParser.RightShift, 0); }
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public Shift_rContext(Shift_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterShift_r(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitShift_r(this);
		}
	}

	public final Shift_exprContext shift_expr() throws RecognitionException {
		return shift_expr(0);
	}

	private Shift_exprContext shift_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Shift_exprContext _localctx = new Shift_exprContext(_ctx, _parentState);
		Shift_exprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_shift_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Shift_to_addContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(175);
			add_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new Shift_lContext(new Shift_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(177);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(178);
						match(LeftShift);
						setState(179);
						add_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Shift_rContext(new Shift_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_shift_expr);
						setState(180);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(181);
						match(RightShift);
						setState(182);
						add_expr(0);
						}
						break;
					}
					} 
				}
				setState(187);
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

	public static class Add_exprContext extends ParserRuleContext {
		public Add_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expr; }
	 
		public Add_exprContext() { }
		public void copyFrom(Add_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Add_to_multiContext extends Add_exprContext {
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public Add_to_multiContext(Add_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAdd_to_multi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAdd_to_multi(this);
		}
	}
	public static class Add_decContext extends Add_exprContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public TerminalNode Minus() { return getToken(MisakaParser.Minus, 0); }
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public Add_decContext(Add_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAdd_dec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAdd_dec(this);
		}
	}
	public static class Add_incContext extends Add_exprContext {
		public Add_exprContext add_expr() {
			return getRuleContext(Add_exprContext.class,0);
		}
		public TerminalNode Plus() { return getToken(MisakaParser.Plus, 0); }
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public Add_incContext(Add_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterAdd_inc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitAdd_inc(this);
		}
	}

	public final Add_exprContext add_expr() throws RecognitionException {
		return add_expr(0);
	}

	private Add_exprContext add_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Add_exprContext _localctx = new Add_exprContext(_ctx, _parentState);
		Add_exprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_add_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Add_to_multiContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(189);
			multi_expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(197);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Add_incContext(new Add_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_add_expr);
						setState(191);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(192);
						match(Plus);
						setState(193);
						multi_expr(0);
						}
						break;
					case 2:
						{
						_localctx = new Add_decContext(new Add_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_add_expr);
						setState(194);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(195);
						match(Minus);
						setState(196);
						multi_expr(0);
						}
						break;
					}
					} 
				}
				setState(201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Multi_exprContext extends ParserRuleContext {
		public Multi_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_expr; }
	 
		public Multi_exprContext() { }
		public void copyFrom(Multi_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multi_modContext extends Multi_exprContext {
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public TerminalNode Mod() { return getToken(MisakaParser.Mod, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Multi_modContext(Multi_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterMulti_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitMulti_mod(this);
		}
	}
	public static class Multi_mulContext extends Multi_exprContext {
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public TerminalNode Star() { return getToken(MisakaParser.Star, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Multi_mulContext(Multi_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterMulti_mul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitMulti_mul(this);
		}
	}
	public static class Multi_devContext extends Multi_exprContext {
		public Multi_exprContext multi_expr() {
			return getRuleContext(Multi_exprContext.class,0);
		}
		public TerminalNode Div() { return getToken(MisakaParser.Div, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Multi_devContext(Multi_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterMulti_dev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitMulti_dev(this);
		}
	}
	public static class Multi_to_newContext extends Multi_exprContext {
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Multi_to_newContext(Multi_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterMulti_to_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitMulti_to_new(this);
		}
	}

	public final Multi_exprContext multi_expr() throws RecognitionException {
		return multi_expr(0);
	}

	private Multi_exprContext multi_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Multi_exprContext _localctx = new Multi_exprContext(_ctx, _parentState);
		Multi_exprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_multi_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Multi_to_newContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(203);
			new_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Multi_mulContext(new Multi_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multi_expr);
						setState(205);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(206);
						match(Star);
						setState(207);
						new_expr();
						}
						break;
					case 2:
						{
						_localctx = new Multi_devContext(new Multi_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multi_expr);
						setState(208);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(209);
						match(Div);
						setState(210);
						new_expr();
						}
						break;
					case 3:
						{
						_localctx = new Multi_modContext(new Multi_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_multi_expr);
						setState(211);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(212);
						match(Mod);
						setState(213);
						new_expr();
						}
						break;
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class New_exprContext extends ParserRuleContext {
		public New_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_expr; }
	 
		public New_exprContext() { }
		public void copyFrom(New_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class New_defContext extends New_exprContext {
		public TerminalNode New() { return getToken(MisakaParser.New, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
		}
		public New_defContext(New_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterNew_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitNew_def(this);
		}
	}
	public static class New_to_unaryContext extends New_exprContext {
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public New_to_unaryContext(New_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterNew_to_unary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitNew_to_unary(this);
		}
	}

	public final New_exprContext new_expr() throws RecognitionException {
		New_exprContext _localctx = new New_exprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_new_expr);
		try {
			setState(224);
			switch (_input.LA(1)) {
			case NULL:
			case LP:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case ID:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new New_to_unaryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				unary_expr();
				}
				break;
			case New:
				_localctx = new New_defContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(New);
				setState(221);
				type(0);
				setState(222);
				dim_expr(0);
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

	public static class Dim_exprContext extends ParserRuleContext {
		public Dim_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dim_expr; }
	 
		public Dim_exprContext() { }
		public void copyFrom(Dim_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dim_listContext extends Dim_exprContext {
		public Dim_exprContext dim_expr() {
			return getRuleContext(Dim_exprContext.class,0);
		}
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Dim_listContext(Dim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDim_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDim_list(this);
		}
	}
	public static class Dim_defContext extends Dim_exprContext {
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Dim_defContext(Dim_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDim_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDim_def(this);
		}
	}

	public final Dim_exprContext dim_expr() throws RecognitionException {
		return dim_expr(0);
	}

	private Dim_exprContext dim_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Dim_exprContext _localctx = new Dim_exprContext(_ctx, _parentState);
		Dim_exprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_dim_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Dim_defContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(227);
			match(LK);
			setState(228);
			expr();
			setState(229);
			match(RK);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Dim_listContext(new Dim_exprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_dim_expr);
					setState(231);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(232);
					match(LK);
					setState(233);
					expr();
					setState(234);
					match(RK);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Type_stringContext extends TypeContext {
		public TerminalNode String() { return getToken(MisakaParser.String, 0); }
		public Type_stringContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_string(this);
		}
	}
	public static class Type_defContext extends TypeContext {
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public Type_defContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_def(this);
		}
	}
	public static class Type_arrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Type_arrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_array(this);
		}
	}
	public static class Type_voidContext extends TypeContext {
		public TerminalNode Void() { return getToken(MisakaParser.Void, 0); }
		public Type_voidContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_void(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_void(this);
		}
	}
	public static class Type_array2Context extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Type_array2Context(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_array2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_array2(this);
		}
	}
	public static class Type_intContext extends TypeContext {
		public TerminalNode Int() { return getToken(MisakaParser.Int, 0); }
		public Type_intContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterType_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitType_int(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			switch (_input.LA(1)) {
			case Void:
				{
				_localctx = new Type_voidContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(242);
				match(Void);
				}
				break;
			case Int:
				{
				_localctx = new Type_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(243);
				match(Int);
				}
				break;
			case String:
				{
				_localctx = new Type_stringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(244);
				match(String);
				}
				break;
			case ID:
				{
				_localctx = new Type_defContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new Type_arrayContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(249);
						match(LK);
						setState(250);
						match(RK);
						}
						break;
					case 2:
						{
						_localctx = new Type_array2Context(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(251);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(252);
						match(LK);
						setState(253);
						expr();
						setState(254);
						match(RK);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Unary_exprContext extends ParserRuleContext {
		public Unary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_expr; }
	 
		public Unary_exprContext() { }
		public void copyFrom(Unary_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unary_to_postContext extends Unary_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public Unary_to_postContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_to_post(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_to_post(this);
		}
	}
	public static class Unary_t_newContext extends Unary_exprContext {
		public TerminalNode Tilde() { return getToken(MisakaParser.Tilde, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Unary_t_newContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_t_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_t_new(this);
		}
	}
	public static class Unary_ppContext extends Unary_exprContext {
		public TerminalNode PlusPlus() { return getToken(MisakaParser.PlusPlus, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Unary_ppContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_pp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_pp(this);
		}
	}
	public static class Unary_mmContext extends Unary_exprContext {
		public TerminalNode MinusMinus() { return getToken(MisakaParser.MinusMinus, 0); }
		public Unary_exprContext unary_expr() {
			return getRuleContext(Unary_exprContext.class,0);
		}
		public Unary_mmContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_mm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_mm(this);
		}
	}
	public static class Unary_p_newContext extends Unary_exprContext {
		public TerminalNode Plus() { return getToken(MisakaParser.Plus, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Unary_p_newContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_p_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_p_new(this);
		}
	}
	public static class Unary_m_newContext extends Unary_exprContext {
		public TerminalNode Minus() { return getToken(MisakaParser.Minus, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Unary_m_newContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_m_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_m_new(this);
		}
	}
	public static class Unary_n_newContext extends Unary_exprContext {
		public TerminalNode Not() { return getToken(MisakaParser.Not, 0); }
		public New_exprContext new_expr() {
			return getRuleContext(New_exprContext.class,0);
		}
		public Unary_n_newContext(Unary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterUnary_n_new(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitUnary_n_new(this);
		}
	}

	public final Unary_exprContext unary_expr() throws RecognitionException {
		Unary_exprContext _localctx = new Unary_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_expr);
		try {
			setState(274);
			switch (_input.LA(1)) {
			case NULL:
			case LP:
			case ID:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new Unary_to_postContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				postfix_expr(0);
				}
				break;
			case PlusPlus:
				_localctx = new Unary_ppContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(PlusPlus);
				setState(263);
				unary_expr();
				}
				break;
			case MinusMinus:
				_localctx = new Unary_mmContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				match(MinusMinus);
				setState(265);
				unary_expr();
				}
				break;
			case Plus:
				_localctx = new Unary_p_newContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(Plus);
				setState(267);
				new_expr();
				}
				break;
			case Minus:
				_localctx = new Unary_m_newContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(268);
				match(Minus);
				setState(269);
				new_expr();
				}
				break;
			case Tilde:
				_localctx = new Unary_t_newContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(270);
				match(Tilde);
				setState(271);
				new_expr();
				}
				break;
			case Not:
				_localctx = new Unary_n_newContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(272);
				match(Not);
				setState(273);
				new_expr();
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

	public static class Postfix_exprContext extends ParserRuleContext {
		public Postfix_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfix_expr; }
	 
		public Postfix_exprContext() { }
		public void copyFrom(Postfix_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Post_ppContext extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(MisakaParser.PlusPlus, 0); }
		public Post_ppContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_pp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_pp(this);
		}
	}
	public static class Post_mmContext extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(MisakaParser.MinusMinus, 0); }
		public Post_mmContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_mm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_mm(this);
		}
	}
	public static class Post_argument2Context extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public Argument_expr_listContext argument_expr_list() {
			return getRuleContext(Argument_expr_listContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public Post_argument2Context(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_argument2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_argument2(this);
		}
	}
	public static class Post_structContext extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode Dot() { return getToken(MisakaParser.Dot, 0); }
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public Post_structContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_struct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_struct(this);
		}
	}
	public static class Post_to_primContext extends Postfix_exprContext {
		public Primary_exprContext primary_expr() {
			return getRuleContext(Primary_exprContext.class,0);
		}
		public Post_to_primContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_to_prim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_to_prim(this);
		}
	}
	public static class Post_arrayContext extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Post_arrayContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_array(this);
		}
	}
	public static class Post_argumentContext extends Postfix_exprContext {
		public Postfix_exprContext postfix_expr() {
			return getRuleContext(Postfix_exprContext.class,0);
		}
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public Post_argumentContext(Postfix_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPost_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPost_argument(this);
		}
	}

	public final Postfix_exprContext postfix_expr() throws RecognitionException {
		return postfix_expr(0);
	}

	private Postfix_exprContext postfix_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Postfix_exprContext _localctx = new Postfix_exprContext(_ctx, _parentState);
		Postfix_exprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_postfix_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Post_to_primContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(277);
			primary_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new Post_arrayContext(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(280);
						match(LK);
						setState(281);
						expr();
						setState(282);
						match(RK);
						}
						break;
					case 2:
						{
						_localctx = new Post_argumentContext(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(284);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(285);
						match(LP);
						setState(286);
						match(RP);
						}
						break;
					case 3:
						{
						_localctx = new Post_argument2Context(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(287);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(288);
						match(LP);
						setState(289);
						argument_expr_list(0);
						setState(290);
						match(RP);
						}
						break;
					case 4:
						{
						_localctx = new Post_structContext(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(292);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						match(Dot);
						setState(294);
						match(ID);
						}
						break;
					case 5:
						{
						_localctx = new Post_ppContext(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296);
						match(PlusPlus);
						}
						break;
					case 6:
						{
						_localctx = new Post_mmContext(new Postfix_exprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfix_expr);
						setState(297);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(298);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Argument_expr_listContext extends ParserRuleContext {
		public Argument_expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_expr_list; }
	 
		public Argument_expr_listContext() { }
		public void copyFrom(Argument_expr_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Argument_defContext extends Argument_expr_listContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Argument_defContext(Argument_expr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterArgument_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitArgument_def(this);
		}
	}
	public static class Argument_listContext extends Argument_expr_listContext {
		public Argument_expr_listContext argument_expr_list() {
			return getRuleContext(Argument_expr_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MisakaParser.Comma, 0); }
		public Argument_listContext(Argument_expr_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterArgument_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitArgument_list(this);
		}
	}

	public final Argument_expr_listContext argument_expr_list() throws RecognitionException {
		return argument_expr_list(0);
	}

	private Argument_expr_listContext argument_expr_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Argument_expr_listContext _localctx = new Argument_expr_listContext(_ctx, _parentState);
		Argument_expr_listContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_argument_expr_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Argument_defContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(305);
			assignment_expr();
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Argument_listContext(new Argument_expr_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_argument_expr_list);
					setState(307);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(308);
					match(Comma);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class Primary_exprContext extends ParserRuleContext {
		public Primary_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary_expr; }
	 
		public Primary_exprContext() { }
		public void copyFrom(Primary_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Prim_exprContext extends Primary_exprContext {
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public Prim_exprContext(Primary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPrim_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPrim_expr(this);
		}
	}
	public static class Prim_NULLContext extends Primary_exprContext {
		public TerminalNode NULL() { return getToken(MisakaParser.NULL, 0); }
		public Prim_NULLContext(Primary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPrim_NULL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPrim_NULL(this);
		}
	}
	public static class Prim_INTContext extends Primary_exprContext {
		public TerminalNode INT_LITERAL() { return getToken(MisakaParser.INT_LITERAL, 0); }
		public Prim_INTContext(Primary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPrim_INT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPrim_INT(this);
		}
	}
	public static class Prim_STRINGContext extends Primary_exprContext {
		public TerminalNode STRING_LITERAL() { return getToken(MisakaParser.STRING_LITERAL, 0); }
		public Prim_STRINGContext(Primary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPrim_STRING(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPrim_STRING(this);
		}
	}
	public static class Prim_IDContext extends Primary_exprContext {
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public Prim_IDContext(Primary_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterPrim_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitPrim_ID(this);
		}
	}

	public final Primary_exprContext primary_expr() throws RecognitionException {
		Primary_exprContext _localctx = new Primary_exprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary_expr);
		try {
			setState(322);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Prim_IDContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(ID);
				}
				break;
			case NULL:
				_localctx = new Prim_NULLContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				match(NULL);
				}
				break;
			case INT_LITERAL:
				_localctx = new Prim_INTContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(INT_LITERAL);
				}
				break;
			case STRING_LITERAL:
				_localctx = new Prim_STRINGContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(317);
				match(STRING_LITERAL);
				}
				break;
			case LP:
				_localctx = new Prim_exprContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(318);
				match(LP);
				setState(319);
				expr();
				setState(320);
				match(RP);
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

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt_to_selectContext extends StmtContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Stmt_to_selectContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterStmt_to_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitStmt_to_select(this);
		}
	}
	public static class Stmt_to_jumpContext extends StmtContext {
		public Jump_stmtContext jump_stmt() {
			return getRuleContext(Jump_stmtContext.class,0);
		}
		public Stmt_to_jumpContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterStmt_to_jump(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitStmt_to_jump(this);
		}
	}
	public static class Stmt_to_compContext extends StmtContext {
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Stmt_to_compContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterStmt_to_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitStmt_to_comp(this);
		}
	}
	public static class Stmt_to_iterContext extends StmtContext {
		public Iter_stmtContext iter_stmt() {
			return getRuleContext(Iter_stmtContext.class,0);
		}
		public Stmt_to_iterContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterStmt_to_iter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitStmt_to_iter(this);
		}
	}
	public static class Stmt_to_expr_stmtContext extends StmtContext {
		public Expr_stmtContext expr_stmt() {
			return getRuleContext(Expr_stmtContext.class,0);
		}
		public Stmt_to_expr_stmtContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterStmt_to_expr_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitStmt_to_expr_stmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_stmt);
		try {
			setState(329);
			switch (_input.LA(1)) {
			case LB:
				_localctx = new Stmt_to_compContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				compound_stmt();
				}
				break;
			case NULL:
			case New:
			case LP:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case Semi:
			case ID:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new Stmt_to_expr_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(325);
				expr_stmt();
				}
				break;
			case If:
				_localctx = new Stmt_to_selectContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(326);
				select_stmt();
				}
				break;
			case For:
			case While:
				_localctx = new Stmt_to_iterContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				iter_stmt();
				}
				break;
			case Break:
			case Continue:
			case Return:
				_localctx = new Stmt_to_jumpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(328);
				jump_stmt();
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

	public static class Compound_stmtContext extends ParserRuleContext {
		public Compound_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stmt; }
	 
		public Compound_stmtContext() { }
		public void copyFrom(Compound_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Comp_to_blocklist2Context extends Compound_stmtContext {
		public TerminalNode LB() { return getToken(MisakaParser.LB, 0); }
		public BlockItem_listContext blockItem_list() {
			return getRuleContext(BlockItem_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(MisakaParser.RB, 0); }
		public Comp_to_blocklist2Context(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterComp_to_blocklist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitComp_to_blocklist2(this);
		}
	}
	public static class Comp_to_blocklistContext extends Compound_stmtContext {
		public TerminalNode LB() { return getToken(MisakaParser.LB, 0); }
		public TerminalNode RB() { return getToken(MisakaParser.RB, 0); }
		public Comp_to_blocklistContext(Compound_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterComp_to_blocklist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitComp_to_blocklist(this);
		}
	}

	public final Compound_stmtContext compound_stmt() throws RecognitionException {
		Compound_stmtContext _localctx = new Compound_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_compound_stmt);
		try {
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				_localctx = new Comp_to_blocklistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(LB);
				setState(332);
				match(RB);
				}
				break;
			case 2:
				_localctx = new Comp_to_blocklist2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(LB);
				setState(334);
				blockItem_list(0);
				setState(335);
				match(RB);
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

	public static class BlockItem_listContext extends ParserRuleContext {
		public BlockItem_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem_list; }
	 
		public BlockItem_listContext() { }
		public void copyFrom(BlockItem_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Blocklist_to_blockContext extends BlockItem_listContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public Blocklist_to_blockContext(BlockItem_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterBlocklist_to_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitBlocklist_to_block(this);
		}
	}
	public static class Blocklist_defContext extends BlockItem_listContext {
		public BlockItem_listContext blockItem_list() {
			return getRuleContext(BlockItem_listContext.class,0);
		}
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public Blocklist_defContext(BlockItem_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterBlocklist_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitBlocklist_def(this);
		}
	}

	public final BlockItem_listContext blockItem_list() throws RecognitionException {
		return blockItem_list(0);
	}

	private BlockItem_listContext blockItem_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItem_listContext _localctx = new BlockItem_listContext(_ctx, _parentState);
		BlockItem_listContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_blockItem_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Blocklist_to_blockContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(340);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(346);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Blocklist_defContext(new BlockItem_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_blockItem_list);
					setState(342);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(343);
					blockItem();
					}
					} 
				}
				setState(348);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class BlockItemContext extends ParserRuleContext {
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
	 
		public BlockItemContext() { }
		public void copyFrom(BlockItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Block_to_declarationContext extends BlockItemContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Block_to_declarationContext(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterBlock_to_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitBlock_to_declaration(this);
		}
	}
	public static class Block_to_stmtContext extends BlockItemContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Block_to_stmtContext(BlockItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterBlock_to_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitBlock_to_stmt(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_blockItem);
		try {
			setState(351);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new Block_to_declarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				declaration();
				}
				break;
			case 2:
				_localctx = new Block_to_stmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				stmt();
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

	public static class Expr_stmtContext extends ParserRuleContext {
		public Expr_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_stmt; }
	 
		public Expr_stmtContext() { }
		public void copyFrom(Expr_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Expr_stmt_defContext extends Expr_stmtContext {
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Expr_stmt_defContext(Expr_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterExpr_stmt_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitExpr_stmt_def(this);
		}
	}
	public static class Expr_stmt_def2Context extends Expr_stmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Expr_stmt_def2Context(Expr_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterExpr_stmt_def2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitExpr_stmt_def2(this);
		}
	}

	public final Expr_stmtContext expr_stmt() throws RecognitionException {
		Expr_stmtContext _localctx = new Expr_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expr_stmt);
		try {
			setState(357);
			switch (_input.LA(1)) {
			case Semi:
				_localctx = new Expr_stmt_defContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				match(Semi);
				}
				break;
			case NULL:
			case New:
			case LP:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case ID:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new Expr_stmt_def2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				expr();
				setState(355);
				match(Semi);
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

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
	 
		public Select_stmtContext() { }
		public void copyFrom(Select_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Select_def2Context extends Select_stmtContext {
		public TerminalNode If() { return getToken(MisakaParser.If, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Else() { return getToken(MisakaParser.Else, 0); }
		public Select_def2Context(Select_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterSelect_def2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitSelect_def2(this);
		}
	}
	public static class Select_defContext extends Select_stmtContext {
		public TerminalNode If() { return getToken(MisakaParser.If, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Select_defContext(Select_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterSelect_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitSelect_def(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_select_stmt);
		try {
			setState(373);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new Select_defContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(If);
				setState(360);
				match(LP);
				setState(361);
				expr();
				setState(362);
				match(RP);
				setState(363);
				stmt();
				}
				break;
			case 2:
				_localctx = new Select_def2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(If);
				setState(366);
				match(LP);
				setState(367);
				expr();
				setState(368);
				match(RP);
				setState(369);
				stmt();
				setState(370);
				match(Else);
				setState(371);
				stmt();
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

	public static class Iter_stmtContext extends ParserRuleContext {
		public Iter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iter_stmt; }
	 
		public Iter_stmtContext() { }
		public void copyFrom(Iter_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Iter_whileContext extends Iter_stmtContext {
		public TerminalNode While() { return getToken(MisakaParser.While, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_whileContext(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_while(this);
		}
	}
	public static class Iter_for010Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for010Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for010(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for010(this);
		}
	}
	public static class Iter_for001Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for001Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for001(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for001(this);
		}
	}
	public static class Iter_for100Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for100Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for100(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for100(this);
		}
	}
	public static class Iter_for111Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for111Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for111(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for111(this);
		}
	}
	public static class Iter_for000Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for000Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for000(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for000(this);
		}
	}
	public static class Iter_for011Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for011Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for011(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for011(this);
		}
	}
	public static class Iter_for110Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for110Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for110(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for110(this);
		}
	}
	public static class Iter_for101Context extends Iter_stmtContext {
		public TerminalNode For() { return getToken(MisakaParser.For, 0); }
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> Semi() { return getTokens(MisakaParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(MisakaParser.Semi, i);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public Iter_for101Context(Iter_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIter_for101(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIter_for101(this);
		}
	}

	public final Iter_stmtContext iter_stmt() throws RecognitionException {
		Iter_stmtContext _localctx = new Iter_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_iter_stmt);
		try {
			setState(448);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new Iter_whileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				match(While);
				setState(376);
				match(LP);
				setState(377);
				expr();
				setState(378);
				match(RP);
				setState(379);
				stmt();
				}
				break;
			case 2:
				_localctx = new Iter_for000Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(For);
				setState(382);
				match(LP);
				setState(383);
				match(Semi);
				setState(384);
				match(Semi);
				setState(385);
				match(RP);
				setState(386);
				stmt();
				}
				break;
			case 3:
				_localctx = new Iter_for001Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(387);
				match(For);
				setState(388);
				match(LP);
				setState(389);
				match(Semi);
				setState(390);
				match(Semi);
				setState(391);
				expr();
				setState(392);
				match(RP);
				setState(393);
				stmt();
				}
				break;
			case 4:
				_localctx = new Iter_for010Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(395);
				match(For);
				setState(396);
				match(LP);
				setState(397);
				match(Semi);
				setState(398);
				expr();
				setState(399);
				match(Semi);
				setState(400);
				match(RP);
				setState(401);
				stmt();
				}
				break;
			case 5:
				_localctx = new Iter_for011Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(403);
				match(For);
				setState(404);
				match(LP);
				setState(405);
				match(Semi);
				setState(406);
				expr();
				setState(407);
				match(Semi);
				setState(408);
				expr();
				setState(409);
				match(RP);
				setState(410);
				stmt();
				}
				break;
			case 6:
				_localctx = new Iter_for100Context(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(412);
				match(For);
				setState(413);
				match(LP);
				setState(414);
				expr();
				setState(415);
				match(Semi);
				setState(416);
				match(Semi);
				setState(417);
				match(RP);
				setState(418);
				stmt();
				}
				break;
			case 7:
				_localctx = new Iter_for101Context(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(420);
				match(For);
				setState(421);
				match(LP);
				setState(422);
				expr();
				setState(423);
				match(Semi);
				setState(424);
				match(Semi);
				setState(425);
				expr();
				setState(426);
				match(RP);
				setState(427);
				stmt();
				}
				break;
			case 8:
				_localctx = new Iter_for110Context(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(429);
				match(For);
				setState(430);
				match(LP);
				setState(431);
				expr();
				setState(432);
				match(Semi);
				setState(433);
				expr();
				setState(434);
				match(Semi);
				setState(435);
				match(RP);
				setState(436);
				stmt();
				}
				break;
			case 9:
				_localctx = new Iter_for111Context(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				match(For);
				setState(439);
				match(LP);
				setState(440);
				expr();
				setState(441);
				match(Semi);
				setState(442);
				expr();
				setState(443);
				match(Semi);
				setState(444);
				expr();
				setState(445);
				match(RP);
				setState(446);
				stmt();
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

	public static class Jump_stmtContext extends ParserRuleContext {
		public Jump_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jump_stmt; }
	 
		public Jump_stmtContext() { }
		public void copyFrom(Jump_stmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Jump_continueContext extends Jump_stmtContext {
		public TerminalNode Continue() { return getToken(MisakaParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Jump_continueContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterJump_continue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitJump_continue(this);
		}
	}
	public static class Jump_return2Context extends Jump_stmtContext {
		public TerminalNode Return() { return getToken(MisakaParser.Return, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Jump_return2Context(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterJump_return2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitJump_return2(this);
		}
	}
	public static class Jump_returnContext extends Jump_stmtContext {
		public TerminalNode Return() { return getToken(MisakaParser.Return, 0); }
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Jump_returnContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterJump_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitJump_return(this);
		}
	}
	public static class Jump_breakContext extends Jump_stmtContext {
		public TerminalNode Break() { return getToken(MisakaParser.Break, 0); }
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Jump_breakContext(Jump_stmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterJump_break(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitJump_break(this);
		}
	}

	public final Jump_stmtContext jump_stmt() throws RecognitionException {
		Jump_stmtContext _localctx = new Jump_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jump_stmt);
		try {
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new Jump_continueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(Continue);
				setState(451);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new Jump_breakContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				match(Break);
				setState(453);
				match(Semi);
				}
				break;
			case 3:
				_localctx = new Jump_returnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				match(Return);
				setState(455);
				match(Semi);
				}
				break;
			case 4:
				_localctx = new Jump_return2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(456);
				match(Return);
				setState(457);
				expr();
				setState(458);
				match(Semi);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Declaration_to_initlist2Context extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Init_declContext init_decl() {
			return getRuleContext(Init_declContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Declaration_to_initlist2Context(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDeclaration_to_initlist2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDeclaration_to_initlist2(this);
		}
	}
	public static class Declaration_to_initlistContext extends DeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Declaration_to_initlistContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDeclaration_to_initlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDeclaration_to_initlist(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_declaration);
		try {
			setState(469);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new Declaration_to_initlistContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462);
				type(0);
				setState(463);
				match(Semi);
				}
				break;
			case 2:
				_localctx = new Declaration_to_initlist2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(465);
				type(0);
				setState(466);
				init_decl();
				setState(467);
				match(Semi);
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

	public static class Init_declContext extends ParserRuleContext {
		public Init_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_decl; }
	 
		public Init_declContext() { }
		public void copyFrom(Init_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Init_defContext extends Init_declContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Init_defContext(Init_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInit_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInit_def(this);
		}
	}
	public static class Init_decl_defContext extends Init_declContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode Assign() { return getToken(MisakaParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Init_decl_defContext(Init_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInit_decl_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInit_decl_def(this);
		}
	}

	public final Init_declContext init_decl() throws RecognitionException {
		Init_declContext _localctx = new Init_declContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_init_decl);
		try {
			setState(476);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Init_defContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				decl(0);
				}
				break;
			case 2:
				_localctx = new Init_decl_defContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				decl(0);
				setState(473);
				match(Assign);
				setState(474);
				initializer();
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

	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Decl_brackContext extends DeclContext {
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public Decl_brackContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDecl_brack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDecl_brack(this);
		}
	}
	public static class Decl_funcContext extends DeclContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode LP() { return getToken(MisakaParser.LP, 0); }
		public TerminalNode RP() { return getToken(MisakaParser.RP, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public Decl_funcContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDecl_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDecl_func(this);
		}
	}
	public static class Decl_arrayContext extends DeclContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode LK() { return getToken(MisakaParser.LK, 0); }
		public TerminalNode RK() { return getToken(MisakaParser.RK, 0); }
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Decl_arrayContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDecl_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDecl_array(this);
		}
	}
	public static class Decl_IDContext extends DeclContext {
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public Decl_IDContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterDecl_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitDecl_ID(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		return decl(0);
	}

	private DeclContext decl(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclContext _localctx = new DeclContext(_ctx, _parentState);
		DeclContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_decl, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			switch (_input.LA(1)) {
			case ID:
				{
				_localctx = new Decl_IDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(479);
				match(ID);
				}
				break;
			case LP:
				{
				_localctx = new Decl_brackContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(480);
				match(LP);
				setState(481);
				decl(0);
				setState(482);
				match(RP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(498);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new Decl_arrayContext(new DeclContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_decl);
						setState(486);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(487);
						match(LK);
						setState(489);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NULL) | (1L << New) | (1L << LP) | (1L << Plus) | (1L << PlusPlus) | (1L << Minus) | (1L << MinusMinus) | (1L << Not) | (1L << Tilde) | (1L << ID) | (1L << INT_LITERAL) | (1L << STRING_LITERAL))) != 0)) {
							{
							setState(488);
							assignment_expr();
							}
						}

						setState(491);
						match(RK);
						}
						break;
					case 2:
						{
						_localctx = new Decl_funcContext(new DeclContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_decl);
						setState(492);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(493);
						match(LP);
						setState(495);
						_la = _input.LA(1);
						if (_la==ID) {
							{
							setState(494);
							identifierList(0);
							}
						}

						setState(497);
						match(RP);
						}
						break;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
	 
		public IdentifierListContext() { }
		public void copyFrom(IdentifierListContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IDlist_defContext extends IdentifierListContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MisakaParser.Comma, 0); }
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public IDlist_defContext(IdentifierListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIDlist_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIDlist_def(this);
		}
	}
	public static class IDlist_to_IDContext extends IdentifierListContext {
		public TerminalNode ID() { return getToken(MisakaParser.ID, 0); }
		public IDlist_to_IDContext(IdentifierListContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterIDlist_to_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitIDlist_to_ID(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IDlist_to_IDContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(504);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(511);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IDlist_defContext(new IdentifierListContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(506);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(507);
					match(Comma);
					setState(508);
					match(ID);
					}
					} 
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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

	public static class InitializerContext extends ParserRuleContext {
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
	 
		public InitializerContext() { }
		public void copyFrom(InitializerContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Initializer_to_initializer_listContext extends InitializerContext {
		public TerminalNode LB() { return getToken(MisakaParser.LB, 0); }
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(MisakaParser.RB, 0); }
		public Initializer_to_initializer_listContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInitializer_to_initializer_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInitializer_to_initializer_list(this);
		}
	}
	public static class Initializer_to_assignContext extends InitializerContext {
		public Assignment_exprContext assignment_expr() {
			return getRuleContext(Assignment_exprContext.class,0);
		}
		public Initializer_to_assignContext(InitializerContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInitializer_to_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInitializer_to_assign(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_initializer);
		try {
			setState(519);
			switch (_input.LA(1)) {
			case NULL:
			case New:
			case LP:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Not:
			case Tilde:
			case ID:
			case INT_LITERAL:
			case STRING_LITERAL:
				_localctx = new Initializer_to_assignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(514);
				assignment_expr();
				}
				break;
			case LB:
				_localctx = new Initializer_to_initializer_listContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				match(LB);
				setState(516);
				initializer_list(0);
				setState(517);
				match(RB);
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

	public static class Initializer_listContext extends ParserRuleContext {
		public Initializer_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer_list; }
	 
		public Initializer_listContext() { }
		public void copyFrom(Initializer_listContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Initializer_list_defContext extends Initializer_listContext {
		public Initializer_listContext initializer_list() {
			return getRuleContext(Initializer_listContext.class,0);
		}
		public TerminalNode Comma() { return getToken(MisakaParser.Comma, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Initializer_list_defContext(Initializer_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInitializer_list_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInitializer_list_def(this);
		}
	}
	public static class Initializer_list_to_initializerContext extends Initializer_listContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public Initializer_list_to_initializerContext(Initializer_listContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterInitializer_list_to_initializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitInitializer_list_to_initializer(this);
		}
	}

	public final Initializer_listContext initializer_list() throws RecognitionException {
		return initializer_list(0);
	}

	private Initializer_listContext initializer_list(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Initializer_listContext _localctx = new Initializer_listContext(_ctx, _parentState);
		Initializer_listContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_initializer_list, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Initializer_list_to_initializerContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(522);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Initializer_list_defContext(new Initializer_listContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_initializer_list);
					setState(524);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(525);
					match(Comma);
					setState(526);
					initializer();
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class Compilation_unitContext extends ParserRuleContext {
		public Compilation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilation_unit; }
	 
		public Compilation_unitContext() { }
		public void copyFrom(Compilation_unitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Compilation_unit_to_translation_unit2Context extends Compilation_unitContext {
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MisakaParser.EOF, 0); }
		public Compilation_unit_to_translation_unit2Context(Compilation_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterCompilation_unit_to_translation_unit2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitCompilation_unit_to_translation_unit2(this);
		}
	}
	public static class Compilation_unit_to_translation_unitContext extends Compilation_unitContext {
		public TerminalNode EOF() { return getToken(MisakaParser.EOF, 0); }
		public Compilation_unit_to_translation_unitContext(Compilation_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterCompilation_unit_to_translation_unit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitCompilation_unit_to_translation_unit(this);
		}
	}

	public final Compilation_unitContext compilation_unit() throws RecognitionException {
		Compilation_unitContext _localctx = new Compilation_unitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_compilation_unit);
		try {
			setState(536);
			switch (_input.LA(1)) {
			case EOF:
				_localctx = new Compilation_unit_to_translation_unitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(EOF);
				}
				break;
			case Int:
			case String:
			case Class:
			case Void:
			case Semi:
			case ID:
				_localctx = new Compilation_unit_to_translation_unit2Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				translation_unit(0);
				setState(534);
				match(EOF);
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

	public static class Translation_unitContext extends ParserRuleContext {
		public Translation_unitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation_unit; }
	 
		public Translation_unitContext() { }
		public void copyFrom(Translation_unitContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Translation_unit_to_ex_declarationContext extends Translation_unitContext {
		public External_declarationContext external_declaration() {
			return getRuleContext(External_declarationContext.class,0);
		}
		public Translation_unit_to_ex_declarationContext(Translation_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterTranslation_unit_to_ex_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitTranslation_unit_to_ex_declaration(this);
		}
	}
	public static class Translation_unit_listContext extends Translation_unitContext {
		public Translation_unitContext translation_unit() {
			return getRuleContext(Translation_unitContext.class,0);
		}
		public External_declarationContext external_declaration() {
			return getRuleContext(External_declarationContext.class,0);
		}
		public Translation_unit_listContext(Translation_unitContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterTranslation_unit_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitTranslation_unit_list(this);
		}
	}

	public final Translation_unitContext translation_unit() throws RecognitionException {
		return translation_unit(0);
	}

	private Translation_unitContext translation_unit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Translation_unitContext _localctx = new Translation_unitContext(_ctx, _parentState);
		Translation_unitContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_translation_unit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new Translation_unit_to_ex_declarationContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(539);
			external_declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Translation_unit_listContext(new Translation_unitContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_translation_unit);
					setState(541);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(542);
					external_declaration();
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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

	public static class External_declarationContext extends ParserRuleContext {
		public External_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_external_declaration; }
	 
		public External_declarationContext() { }
		public void copyFrom(External_declarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Ex_declaration_to_classContext extends External_declarationContext {
		public Class_defContext class_def() {
			return getRuleContext(Class_defContext.class,0);
		}
		public Ex_declaration_to_classContext(External_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEx_declaration_to_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEx_declaration_to_class(this);
		}
	}
	public static class Ex_declaration_to_funcContext extends External_declarationContext {
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public Ex_declaration_to_funcContext(External_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEx_declaration_to_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEx_declaration_to_func(this);
		}
	}
	public static class Ex_declaration_strayContext extends External_declarationContext {
		public TerminalNode Semi() { return getToken(MisakaParser.Semi, 0); }
		public Ex_declaration_strayContext(External_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEx_declaration_stray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEx_declaration_stray(this);
		}
	}
	public static class Ex_declaration_to_declarationContext extends External_declarationContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Ex_declaration_to_declarationContext(External_declarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterEx_declaration_to_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitEx_declaration_to_declaration(this);
		}
	}

	public final External_declarationContext external_declaration() throws RecognitionException {
		External_declarationContext _localctx = new External_declarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_external_declaration);
		try {
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new Ex_declaration_to_classContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				class_def();
				}
				break;
			case 2:
				_localctx = new Ex_declaration_to_funcContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(549);
				function_def();
				}
				break;
			case 3:
				_localctx = new Ex_declaration_to_declarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(550);
				declaration();
				}
				break;
			case 4:
				_localctx = new Ex_declaration_strayContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(Semi);
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

	public static class Class_defContext extends ParserRuleContext {
		public Class_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_def; }
	 
		public Class_defContext() { }
		public void copyFrom(Class_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Class_deffContext extends Class_defContext {
		public TerminalNode Class() { return getToken(MisakaParser.Class, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Class_deffContext(Class_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterClass_deff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitClass_deff(this);
		}
	}

	public final Class_defContext class_def() throws RecognitionException {
		Class_defContext _localctx = new Class_defContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_class_def);
		try {
			_localctx = new Class_deffContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(Class);
			setState(555);
			decl(0);
			setState(556);
			compound_stmt();
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

	public static class Function_defContext extends ParserRuleContext {
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
	 
		public Function_defContext() { }
		public void copyFrom(Function_defContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Func_defContext extends Function_defContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public Compound_stmtContext compound_stmt() {
			return getRuleContext(Compound_stmtContext.class,0);
		}
		public Func_defContext(Function_defContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).enterFunc_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MisakaListener ) ((MisakaListener)listener).exitFunc_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_def);
		try {
			_localctx = new Func_defContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			type(0);
			setState(559);
			decl(0);
			setState(560);
			compound_stmt();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return log_or_expr_sempred((Log_or_exprContext)_localctx, predIndex);
		case 3:
			return log_and_expr_sempred((Log_and_exprContext)_localctx, predIndex);
		case 4:
			return inclusive_or_expr_sempred((Inclusive_or_exprContext)_localctx, predIndex);
		case 5:
			return exclusive_or_expr_sempred((Exclusive_or_exprContext)_localctx, predIndex);
		case 6:
			return and_expr_sempred((And_exprContext)_localctx, predIndex);
		case 7:
			return equal_expr_sempred((Equal_exprContext)_localctx, predIndex);
		case 8:
			return relation_expr_sempred((Relation_exprContext)_localctx, predIndex);
		case 9:
			return shift_expr_sempred((Shift_exprContext)_localctx, predIndex);
		case 10:
			return add_expr_sempred((Add_exprContext)_localctx, predIndex);
		case 11:
			return multi_expr_sempred((Multi_exprContext)_localctx, predIndex);
		case 13:
			return dim_expr_sempred((Dim_exprContext)_localctx, predIndex);
		case 14:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 16:
			return postfix_expr_sempred((Postfix_exprContext)_localctx, predIndex);
		case 17:
			return argument_expr_list_sempred((Argument_expr_listContext)_localctx, predIndex);
		case 21:
			return blockItem_list_sempred((BlockItem_listContext)_localctx, predIndex);
		case 29:
			return decl_sempred((DeclContext)_localctx, predIndex);
		case 30:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 32:
			return initializer_list_sempred((Initializer_listContext)_localctx, predIndex);
		case 34:
			return translation_unit_sempred((Translation_unitContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean log_or_expr_sempred(Log_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean log_and_expr_sempred(Log_and_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusive_or_expr_sempred(Inclusive_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusive_or_expr_sempred(Exclusive_or_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean and_expr_sempred(And_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equal_expr_sempred(Equal_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_expr_sempred(Relation_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean shift_expr_sempred(Shift_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean add_expr_sempred(Add_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 2);
		case 14:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multi_expr_sempred(Multi_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean dim_expr_sempred(Dim_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfix_expr_sempred(Postfix_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 6);
		case 22:
			return precpred(_ctx, 5);
		case 23:
			return precpred(_ctx, 4);
		case 24:
			return precpred(_ctx, 3);
		case 25:
			return precpred(_ctx, 2);
		case 26:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean argument_expr_list_sempred(Argument_expr_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 27:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean blockItem_list_sempred(BlockItem_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean decl_sempred(DeclContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 2);
		case 30:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 31:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean initializer_list_sempred(Initializer_listContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translation_unit_sempred(Translation_unitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0235\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a\13\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5i\n\5\f\5\16\5l\13\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6t\n"+
		"\6\f\6\16\6w\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082\13"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n\f\n\16"+
		"\n\u00af\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00ba"+
		"\n\13\f\13\16\13\u00bd\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c8"+
		"\n\f\f\f\16\f\u00cb\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00d9\n\r\f\r\16\r\u00dc\13\r\3\16\3\16\3\16\3\16\3\16\5\16\u00e3"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00ef\n\17"+
		"\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0103\n\20\f\20\16\20\u0106\13"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0115\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u012e"+
		"\n\22\f\22\16\22\u0131\13\22\3\23\3\23\3\23\3\23\3\23\7\23\u0138\n\23"+
		"\f\23\16\23\u013b\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0145"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\5\25\u014c\n\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0154\n\26\3\27\3\27\3\27\3\27\3\27\7\27\u015b\n\27\f\27\16"+
		"\27\u015e\13\27\3\30\3\30\5\30\u0162\n\30\3\31\3\31\3\31\3\31\5\31\u0168"+
		"\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u0178\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u01c3\n\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01cf\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01d8\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u01df\n\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u01e7\n\37\3\37\3\37\3\37\5\37\u01ec"+
		"\n\37\3\37\3\37\3\37\3\37\5\37\u01f2\n\37\3\37\7\37\u01f5\n\37\f\37\16"+
		"\37\u01f8\13\37\3 \3 \3 \3 \3 \3 \7 \u0200\n \f \16 \u0203\13 \3!\3!\3"+
		"!\3!\3!\5!\u020a\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0212\n\"\f\"\16\"\u0215"+
		"\13\"\3#\3#\3#\3#\5#\u021b\n#\3$\3$\3$\3$\3$\7$\u0222\n$\f$\16$\u0225"+
		"\13$\3%\3%\3%\3%\5%\u022b\n%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\2\25\6\b"+
		"\n\f\16\20\22\24\26\30\34\36\"$,<>BF(\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL\2\2\u025c\2N\3\2\2\2\4U\3\2\2\2"+
		"\6W\3\2\2\2\bb\3\2\2\2\nm\3\2\2\2\fx\3\2\2\2\16\u0083\3\2\2\2\20\u008e"+
		"\3\2\2\2\22\u009c\3\2\2\2\24\u00b0\3\2\2\2\26\u00be\3\2\2\2\30\u00cc\3"+
		"\2\2\2\32\u00e2\3\2\2\2\34\u00e4\3\2\2\2\36\u00f8\3\2\2\2 \u0114\3\2\2"+
		"\2\"\u0116\3\2\2\2$\u0132\3\2\2\2&\u0144\3\2\2\2(\u014b\3\2\2\2*\u0153"+
		"\3\2\2\2,\u0155\3\2\2\2.\u0161\3\2\2\2\60\u0167\3\2\2\2\62\u0177\3\2\2"+
		"\2\64\u01c2\3\2\2\2\66\u01ce\3\2\2\28\u01d7\3\2\2\2:\u01de\3\2\2\2<\u01e6"+
		"\3\2\2\2>\u01f9\3\2\2\2@\u0209\3\2\2\2B\u020b\3\2\2\2D\u021a\3\2\2\2F"+
		"\u021c\3\2\2\2H\u022a\3\2\2\2J\u022c\3\2\2\2L\u0230\3\2\2\2NO\5\4\3\2"+
		"O\3\3\2\2\2PV\5\6\4\2QR\5 \21\2RS\7.\2\2ST\5\4\3\2TV\3\2\2\2UP\3\2\2\2"+
		"UQ\3\2\2\2V\5\3\2\2\2WX\b\4\1\2XY\5\b\5\2Y_\3\2\2\2Z[\f\3\2\2[\\\7&\2"+
		"\2\\^\5\b\5\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2a_\3\2"+
		"\2\2bc\b\5\1\2cd\5\n\6\2dj\3\2\2\2ef\f\3\2\2fg\7%\2\2gi\5\n\6\2he\3\2"+
		"\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\t\3\2\2\2lj\3\2\2\2mn\b\6\1\2no\5"+
		"\f\7\2ou\3\2\2\2pq\f\3\2\2qr\7$\2\2rt\5\f\7\2sp\3\2\2\2tw\3\2\2\2us\3"+
		"\2\2\2uv\3\2\2\2v\13\3\2\2\2wu\3\2\2\2xy\b\7\1\2yz\5\16\b\2z\u0080\3\2"+
		"\2\2{|\f\3\2\2|}\7\'\2\2}\177\5\16\b\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0084\b\b\1\2\u0084\u0085\5\20\t\2\u0085\u008b\3\2\2\2\u0086\u0087\f"+
		"\3\2\2\u0087\u0088\7#\2\2\u0088\u008a\5\20\t\2\u0089\u0086\3\2\2\2\u008a"+
		"\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\17\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008e\u008f\b\t\1\2\u008f\u0090\5\22\n\2\u0090"+
		"\u0099\3\2\2\2\u0091\u0092\f\4\2\2\u0092\u0093\7/\2\2\u0093\u0098\5\22"+
		"\n\2\u0094\u0095\f\3\2\2\u0095\u0096\7\60\2\2\u0096\u0098\5\22\n\2\u0097"+
		"\u0091\3\2\2\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\21\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\b\n\1\2\u009d\u009e\5\24\13\2\u009e\u00ad\3\2\2\2\u009f\u00a0\f\6\2\2"+
		"\u00a0\u00a1\7\26\2\2\u00a1\u00ac\5\24\13\2\u00a2\u00a3\f\5\2\2\u00a3"+
		"\u00a4\7\30\2\2\u00a4\u00ac\5\24\13\2\u00a5\u00a6\f\4\2\2\u00a6\u00a7"+
		"\7\27\2\2\u00a7\u00ac\5\24\13\2\u00a8\u00a9\f\3\2\2\u00a9\u00aa\7\31\2"+
		"\2\u00aa\u00ac\5\24\13\2\u00ab\u009f\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab"+
		"\u00a5\3\2\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ad\u00ae\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1"+
		"\b\13\1\2\u00b1\u00b2\5\26\f\2\u00b2\u00bb\3\2\2\2\u00b3\u00b4\f\4\2\2"+
		"\u00b4\u00b5\7\32\2\2\u00b5\u00ba\5\26\f\2\u00b6\u00b7\f\3\2\2\u00b7\u00b8"+
		"\7\33\2\2\u00b8\u00ba\5\26\f\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2"+
		"\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\25"+
		"\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\b\f\1\2\u00bf\u00c0\5\30\r\2"+
		"\u00c0\u00c9\3\2\2\2\u00c1\u00c2\f\4\2\2\u00c2\u00c3\7\34\2\2\u00c3\u00c8"+
		"\5\30\r\2\u00c4\u00c5\f\3\2\2\u00c5\u00c6\7\36\2\2\u00c6\u00c8\5\30\r"+
		"\2\u00c7\u00c1\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\27\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\b\r\1\2\u00cd\u00ce\5\32\16\2\u00ce\u00da\3\2\2\2\u00cf\u00d0\f"+
		"\5\2\2\u00d0\u00d1\7 \2\2\u00d1\u00d9\5\32\16\2\u00d2\u00d3\f\4\2\2\u00d3"+
		"\u00d4\7!\2\2\u00d4\u00d9\5\32\16\2\u00d5\u00d6\f\3\2\2\u00d6\u00d7\7"+
		"\"\2\2\u00d7\u00d9\5\32\16\2\u00d8\u00cf\3\2\2\2\u00d8\u00d2\3\2\2\2\u00d8"+
		"\u00d5\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\31\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e3\5 \21\2\u00de\u00df"+
		"\7\13\2\2\u00df\u00e0\5\36\20\2\u00e0\u00e1\5\34\17\2\u00e1\u00e3\3\2"+
		"\2\2\u00e2\u00dd\3\2\2\2\u00e2\u00de\3\2\2\2\u00e3\33\3\2\2\2\u00e4\u00e5"+
		"\b\17\1\2\u00e5\u00e6\7\22\2\2\u00e6\u00e7\5\2\2\2\u00e7\u00e8\7\23\2"+
		"\2\u00e8\u00f0\3\2\2\2\u00e9\u00ea\f\3\2\2\u00ea\u00eb\7\22\2\2\u00eb"+
		"\u00ec\5\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e9\3"+
		"\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\35\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\b\20\1\2\u00f4\u00f9\7\16"+
		"\2\2\u00f5\u00f9\7\t\2\2\u00f6\u00f9\7\n\2\2\u00f7\u00f9\7\62\2\2\u00f8"+
		"\u00f3\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u0104\3\2\2\2\u00fa\u00fb\f\4\2\2\u00fb\u00fc\7\22\2\2\u00fc"+
		"\u0103\7\23\2\2\u00fd\u00fe\f\3\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0100\5"+
		"\2\2\2\u0100\u0101\7\23\2\2\u0101\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102"+
		"\u00fd\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\37\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0115\5\"\22\2\u0108\u0109"+
		"\7\35\2\2\u0109\u0115\5 \21\2\u010a\u010b\7\37\2\2\u010b\u0115\5 \21\2"+
		"\u010c\u010d\7\34\2\2\u010d\u0115\5\32\16\2\u010e\u010f\7\36\2\2\u010f"+
		"\u0115\5\32\16\2\u0110\u0111\7)\2\2\u0111\u0115\5\32\16\2\u0112\u0113"+
		"\7(\2\2\u0113\u0115\5\32\16\2\u0114\u0107\3\2\2\2\u0114\u0108\3\2\2\2"+
		"\u0114\u010a\3\2\2\2\u0114\u010c\3\2\2\2\u0114\u010e\3\2\2\2\u0114\u0110"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0115!\3\2\2\2\u0116\u0117\b\22\1\2\u0117"+
		"\u0118\5&\24\2\u0118\u012f\3\2\2\2\u0119\u011a\f\b\2\2\u011a\u011b\7\22"+
		"\2\2\u011b\u011c\5\2\2\2\u011c\u011d\7\23\2\2\u011d\u012e\3\2\2\2\u011e"+
		"\u011f\f\7\2\2\u011f\u0120\7\20\2\2\u0120\u012e\7\21\2\2\u0121\u0122\f"+
		"\6\2\2\u0122\u0123\7\20\2\2\u0123\u0124\5$\23\2\u0124\u0125\7\21\2\2\u0125"+
		"\u012e\3\2\2\2\u0126\u0127\f\5\2\2\u0127\u0128\7\61\2\2\u0128\u012e\7"+
		"\62\2\2\u0129\u012a\f\4\2\2\u012a\u012e\7\35\2\2\u012b\u012c\f\3\2\2\u012c"+
		"\u012e\7\37\2\2\u012d\u0119\3\2\2\2\u012d\u011e\3\2\2\2\u012d\u0121\3"+
		"\2\2\2\u012d\u0126\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130#\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0132\u0133\b\23\1\2\u0133\u0134\5\4\3\2\u0134\u0139"+
		"\3\2\2\2\u0135\u0136\f\3\2\2\u0136\u0138\7-\2\2\u0137\u0135\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a%\3\2\2\2"+
		"\u013b\u0139\3\2\2\2\u013c\u0145\7\62\2\2\u013d\u0145\7\3\2\2\u013e\u0145"+
		"\7\63\2\2\u013f\u0145\7\64\2\2\u0140\u0141\7\20\2\2\u0141\u0142\5\2\2"+
		"\2\u0142\u0143\7\21\2\2\u0143\u0145\3\2\2\2\u0144\u013c\3\2\2\2\u0144"+
		"\u013d\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2"+
		"\2\2\u0145\'\3\2\2\2\u0146\u014c\5*\26\2\u0147\u014c\5\60\31\2\u0148\u014c"+
		"\5\62\32\2\u0149\u014c\5\64\33\2\u014a\u014c\5\66\34\2\u014b\u0146\3\2"+
		"\2\2\u014b\u0147\3\2\2\2\u014b\u0148\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014a\3\2\2\2\u014c)\3\2\2\2\u014d\u014e\7\24\2\2\u014e\u0154\7\25\2"+
		"\2\u014f\u0150\7\24\2\2\u0150\u0151\5,\27\2\u0151\u0152\7\25\2\2\u0152"+
		"\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u014f\3\2\2\2\u0154+\3\2\2\2"+
		"\u0155\u0156\b\27\1\2\u0156\u0157\5.\30\2\u0157\u015c\3\2\2\2\u0158\u0159"+
		"\f\3\2\2\u0159\u015b\5.\30\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d-\3\2\2\2\u015e\u015c\3\2\2\2"+
		"\u015f\u0162\58\35\2\u0160\u0162\5(\25\2\u0161\u015f\3\2\2\2\u0161\u0160"+
		"\3\2\2\2\u0162/\3\2\2\2\u0163\u0168\7,\2\2\u0164\u0165\5\2\2\2\u0165\u0166"+
		"\7,\2\2\u0166\u0168\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0164\3\2\2\2\u0168"+
		"\61\3\2\2\2\u0169\u016a\7\b\2\2\u016a\u016b\7\20\2\2\u016b\u016c\5\2\2"+
		"\2\u016c\u016d\7\21\2\2\u016d\u016e\5(\25\2\u016e\u0178\3\2\2\2\u016f"+
		"\u0170\7\b\2\2\u0170\u0171\7\20\2\2\u0171\u0172\5\2\2\2\u0172\u0173\7"+
		"\21\2\2\u0173\u0174\5(\25\2\u0174\u0175\7\6\2\2\u0175\u0176\5(\25\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0169\3\2\2\2\u0177\u016f\3\2\2\2\u0178\63\3\2\2"+
		"\2\u0179\u017a\7\17\2\2\u017a\u017b\7\20\2\2\u017b\u017c\5\2\2\2\u017c"+
		"\u017d\7\21\2\2\u017d\u017e\5(\25\2\u017e\u01c3\3\2\2\2\u017f\u0180\7"+
		"\7\2\2\u0180\u0181\7\20\2\2\u0181\u0182\7,\2\2\u0182\u0183\7,\2\2\u0183"+
		"\u0184\7\21\2\2\u0184\u01c3\5(\25\2\u0185\u0186\7\7\2\2\u0186\u0187\7"+
		"\20\2\2\u0187\u0188\7,\2\2\u0188\u0189\7,\2\2\u0189\u018a\5\2\2\2\u018a"+
		"\u018b\7\21\2\2\u018b\u018c\5(\25\2\u018c\u01c3\3\2\2\2\u018d\u018e\7"+
		"\7\2\2\u018e\u018f\7\20\2\2\u018f\u0190\7,\2\2\u0190\u0191\5\2\2\2\u0191"+
		"\u0192\7,\2\2\u0192\u0193\7\21\2\2\u0193\u0194\5(\25\2\u0194\u01c3\3\2"+
		"\2\2\u0195\u0196\7\7\2\2\u0196\u0197\7\20\2\2\u0197\u0198\7,\2\2\u0198"+
		"\u0199\5\2\2\2\u0199\u019a\7,\2\2\u019a\u019b\5\2\2\2\u019b\u019c\7\21"+
		"\2\2\u019c\u019d\5(\25\2\u019d\u01c3\3\2\2\2\u019e\u019f\7\7\2\2\u019f"+
		"\u01a0\7\20\2\2\u01a0\u01a1\5\2\2\2\u01a1\u01a2\7,\2\2\u01a2\u01a3\7,"+
		"\2\2\u01a3\u01a4\7\21\2\2\u01a4\u01a5\5(\25\2\u01a5\u01c3\3\2\2\2\u01a6"+
		"\u01a7\7\7\2\2\u01a7\u01a8\7\20\2\2\u01a8\u01a9\5\2\2\2\u01a9\u01aa\7"+
		",\2\2\u01aa\u01ab\7,\2\2\u01ab\u01ac\5\2\2\2\u01ac\u01ad\7\21\2\2\u01ad"+
		"\u01ae\5(\25\2\u01ae\u01c3\3\2\2\2\u01af\u01b0\7\7\2\2\u01b0\u01b1\7\20"+
		"\2\2\u01b1\u01b2\5\2\2\2\u01b2\u01b3\7,\2\2\u01b3\u01b4\5\2\2\2\u01b4"+
		"\u01b5\7,\2\2\u01b5\u01b6\7\21\2\2\u01b6\u01b7\5(\25\2\u01b7\u01c3\3\2"+
		"\2\2\u01b8\u01b9\7\7\2\2\u01b9\u01ba\7\20\2\2\u01ba\u01bb\5\2\2\2\u01bb"+
		"\u01bc\7,\2\2\u01bc\u01bd\5\2\2\2\u01bd\u01be\7,\2\2\u01be\u01bf\5\2\2"+
		"\2\u01bf\u01c0\7\21\2\2\u01c0\u01c1\5(\25\2\u01c1\u01c3\3\2\2\2\u01c2"+
		"\u0179\3\2\2\2\u01c2\u017f\3\2\2\2\u01c2\u0185\3\2\2\2\u01c2\u018d\3\2"+
		"\2\2\u01c2\u0195\3\2\2\2\u01c2\u019e\3\2\2\2\u01c2\u01a6\3\2\2\2\u01c2"+
		"\u01af\3\2\2\2\u01c2\u01b8\3\2\2\2\u01c3\65\3\2\2\2\u01c4\u01c5\7\5\2"+
		"\2\u01c5\u01cf\7,\2\2\u01c6\u01c7\7\4\2\2\u01c7\u01cf\7,\2\2\u01c8\u01c9"+
		"\7\f\2\2\u01c9\u01cf\7,\2\2\u01ca\u01cb\7\f\2\2\u01cb\u01cc\5\2\2\2\u01cc"+
		"\u01cd\7,\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01c4\3\2\2\2\u01ce\u01c6\3\2"+
		"\2\2\u01ce\u01c8\3\2\2\2\u01ce\u01ca\3\2\2\2\u01cf\67\3\2\2\2\u01d0\u01d1"+
		"\5\36\20\2\u01d1\u01d2\7,\2\2\u01d2\u01d8\3\2\2\2\u01d3\u01d4\5\36\20"+
		"\2\u01d4\u01d5\5:\36\2\u01d5\u01d6\7,\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d0"+
		"\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d89\3\2\2\2\u01d9\u01df\5<\37\2\u01da"+
		"\u01db\5<\37\2\u01db\u01dc\7.\2\2\u01dc\u01dd\5@!\2\u01dd\u01df\3\2\2"+
		"\2\u01de\u01d9\3\2\2\2\u01de\u01da\3\2\2\2\u01df;\3\2\2\2\u01e0\u01e1"+
		"\b\37\1\2\u01e1\u01e7\7\62\2\2\u01e2\u01e3\7\20\2\2\u01e3\u01e4\5<\37"+
		"\2\u01e4\u01e5\7\21\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6"+
		"\u01e2\3\2\2\2\u01e7\u01f6\3\2\2\2\u01e8\u01e9\f\4\2\2\u01e9\u01eb\7\22"+
		"\2\2\u01ea\u01ec\5\4\3\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01f5\7\23\2\2\u01ee\u01ef\f\3\2\2\u01ef\u01f1\7"+
		"\20\2\2\u01f0\u01f2\5> \2\u01f1\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3\u01f5\7\21\2\2\u01f4\u01e8\3\2\2\2\u01f4\u01ee\3"+
		"\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"=\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\b \1\2\u01fa\u01fb\7\62\2\2"+
		"\u01fb\u0201\3\2\2\2\u01fc\u01fd\f\3\2\2\u01fd\u01fe\7-\2\2\u01fe\u0200"+
		"\7\62\2\2\u01ff\u01fc\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2"+
		"\u0201\u0202\3\2\2\2\u0202?\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u020a\5"+
		"\4\3\2\u0205\u0206\7\24\2\2\u0206\u0207\5B\"\2\u0207\u0208\7\25\2\2\u0208"+
		"\u020a\3\2\2\2\u0209\u0204\3\2\2\2\u0209\u0205\3\2\2\2\u020aA\3\2\2\2"+
		"\u020b\u020c\b\"\1\2\u020c\u020d\5@!\2\u020d\u0213\3\2\2\2\u020e\u020f"+
		"\f\3\2\2\u020f\u0210\7-\2\2\u0210\u0212\5@!\2\u0211\u020e\3\2\2\2\u0212"+
		"\u0215\3\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214C\3\2\2\2"+
		"\u0215\u0213\3\2\2\2\u0216\u021b\7\2\2\3\u0217\u0218\5F$\2\u0218\u0219"+
		"\7\2\2\3\u0219\u021b\3\2\2\2\u021a\u0216\3\2\2\2\u021a\u0217\3\2\2\2\u021b"+
		"E\3\2\2\2\u021c\u021d\b$\1\2\u021d\u021e\5H%\2\u021e\u0223\3\2\2\2\u021f"+
		"\u0220\f\3\2\2\u0220\u0222\5H%\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2"+
		"\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224G\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u022b\5J&\2\u0227\u022b\5L\'\2\u0228\u022b\58\35\2\u0229"+
		"\u022b\7,\2\2\u022a\u0226\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2"+
		"\2\2\u022a\u0229\3\2\2\2\u022bI\3\2\2\2\u022c\u022d\7\r\2\2\u022d\u022e"+
		"\5<\37\2\u022e\u022f\5*\26\2\u022fK\3\2\2\2\u0230\u0231\5\36\20\2\u0231"+
		"\u0232\5<\37\2\u0232\u0233\5*\26\2\u0233M\3\2\2\2\61U_ju\u0080\u008b\u0097"+
		"\u0099\u00ab\u00ad\u00b9\u00bb\u00c7\u00c9\u00d8\u00da\u00e2\u00f0\u00f8"+
		"\u0102\u0104\u0114\u012d\u012f\u0139\u0144\u014b\u0153\u015c\u0161\u0167"+
		"\u0177\u01c2\u01ce\u01d7\u01de\u01e6\u01eb\u01f1\u01f4\u01f6\u0201\u0209"+
		"\u0213\u021a\u0223\u022a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}