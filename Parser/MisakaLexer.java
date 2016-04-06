// Generated from C:/Users/DolphinAuditore/workspace/Misaka/src/Parser\Misaka.g4 by ANTLR 4.5.1
package Parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MisakaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NULL", "Break", "Continue", "Else", "For", "If", "Int", "String", "New", 
		"Return", "Class", "Void", "While", "LP", "RP", "LK", "RK", "LB", "RB", 
		"Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", "RightShift", 
		"Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", "Mod", "And", 
		"Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", "Colon", 
		"Semi", "Comma", "Assign", "Equal", "NotEqual", "Dot", "ID", "Nondigit", 
		"Digit", "INT_LITERAL", "NonzeroDigit", "Sign", "Digit_seq", "STRING_LITERAL", 
		"SChar_seq", "SChar", "Escape_seq", "Whitespace", "Newline", "BlockComment", 
		"LineComment"
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


	public MisakaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Misaka.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\28\u0183\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3"+
		"\60\3\61\3\61\3\61\7\61\u0118\n\61\f\61\16\61\u011b\13\61\3\62\3\62\3"+
		"\63\3\63\3\64\3\64\7\64\u0123\n\64\f\64\16\64\u0126\13\64\3\64\5\64\u0129"+
		"\n\64\3\65\3\65\3\66\3\66\3\67\6\67\u0130\n\67\r\67\16\67\u0131\38\38"+
		"\58\u0136\n8\38\38\39\69\u013b\n9\r9\169\u013c\3:\3:\5:\u0141\n:\3;\3"+
		";\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\5;\u0159"+
		"\n;\3<\6<\u015c\n<\r<\16<\u015d\3<\3<\3=\3=\5=\u0164\n=\3=\5=\u0167\n"+
		"=\3=\3=\3>\3>\3>\3>\7>\u016f\n>\f>\16>\u0172\13>\3>\3>\3>\3>\3>\3?\3?"+
		"\3?\3?\7?\u017d\n?\f?\16?\u0180\13?\3?\3?\3\u0170\2@\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\63i\2k\2m\2o\64q\2s\2u\2w\65y\66{"+
		"\67}8\3\2\t\5\2C\\aac|\3\2\62;\3\2\63;\4\2--//\6\2\f\f\17\17$$^^\4\2\13"+
		"\13\"\"\4\2\f\f\17\17\u0191\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2g\3\2\2\2\2o\3\2\2\2\2w\3\2\2\2\2y"+
		"\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\3\177\3\2\2\2\5\u0084\3\2\2\2\7\u008a\3"+
		"\2\2\2\t\u0093\3\2\2\2\13\u0098\3\2\2\2\r\u009c\3\2\2\2\17\u009f\3\2\2"+
		"\2\21\u00a3\3\2\2\2\23\u00aa\3\2\2\2\25\u00ae\3\2\2\2\27\u00b5\3\2\2\2"+
		"\31\u00bb\3\2\2\2\33\u00c0\3\2\2\2\35\u00c6\3\2\2\2\37\u00c8\3\2\2\2!"+
		"\u00ca\3\2\2\2#\u00cc\3\2\2\2%\u00ce\3\2\2\2\'\u00d0\3\2\2\2)\u00d2\3"+
		"\2\2\2+\u00d4\3\2\2\2-\u00d7\3\2\2\2/\u00d9\3\2\2\2\61\u00dc\3\2\2\2\63"+
		"\u00df\3\2\2\2\65\u00e2\3\2\2\2\67\u00e4\3\2\2\29\u00e7\3\2\2\2;\u00e9"+
		"\3\2\2\2=\u00ec\3\2\2\2?\u00ee\3\2\2\2A\u00f0\3\2\2\2C\u00f2\3\2\2\2E"+
		"\u00f4\3\2\2\2G\u00f6\3\2\2\2I\u00f9\3\2\2\2K\u00fc\3\2\2\2M\u00fe\3\2"+
		"\2\2O\u0100\3\2\2\2Q\u0102\3\2\2\2S\u0104\3\2\2\2U\u0106\3\2\2\2W\u0108"+
		"\3\2\2\2Y\u010a\3\2\2\2[\u010c\3\2\2\2]\u010f\3\2\2\2_\u0112\3\2\2\2a"+
		"\u0114\3\2\2\2c\u011c\3\2\2\2e\u011e\3\2\2\2g\u0128\3\2\2\2i\u012a\3\2"+
		"\2\2k\u012c\3\2\2\2m\u012f\3\2\2\2o\u0133\3\2\2\2q\u013a\3\2\2\2s\u0140"+
		"\3\2\2\2u\u0158\3\2\2\2w\u015b\3\2\2\2y\u0166\3\2\2\2{\u016a\3\2\2\2}"+
		"\u0178\3\2\2\2\177\u0080\7P\2\2\u0080\u0081\7W\2\2\u0081\u0082\7N\2\2"+
		"\u0082\u0083\7N\2\2\u0083\4\3\2\2\2\u0084\u0085\7d\2\2\u0085\u0086\7t"+
		"\2\2\u0086\u0087\7g\2\2\u0087\u0088\7c\2\2\u0088\u0089\7m\2\2\u0089\6"+
		"\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d\7p\2\2\u008d"+
		"\u008e\7v\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0091\7w\2\2"+
		"\u0091\u0092\7g\2\2\u0092\b\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n"+
		"\2\2\u0095\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\n\3\2\2\2\u0098\u0099"+
		"\7h\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\f\3\2\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7h\2\2\u009e\16\3\2\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1"+
		"\7p\2\2\u00a1\u00a2\7v\2\2\u00a2\20\3\2\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5"+
		"\7v\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7p\2\2\u00a8"+
		"\u00a9\7i\2\2\u00a9\22\3\2\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7y\2\2\u00ad\24\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7p\2\2"+
		"\u00b4\26\3\2\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7n\2\2\u00b7\u00b8\7"+
		"c\2\2\u00b8\u00b9\7u\2\2\u00b9\u00ba\7u\2\2\u00ba\30\3\2\2\2\u00bb\u00bc"+
		"\7x\2\2\u00bc\u00bd\7q\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7f\2\2\u00bf"+
		"\32\3\2\2\2\u00c0\u00c1\7y\2\2\u00c1\u00c2\7j\2\2\u00c2\u00c3\7k\2\2\u00c3"+
		"\u00c4\7n\2\2\u00c4\u00c5\7g\2\2\u00c5\34\3\2\2\2\u00c6\u00c7\7*\2\2\u00c7"+
		"\36\3\2\2\2\u00c8\u00c9\7+\2\2\u00c9 \3\2\2\2\u00ca\u00cb\7]\2\2\u00cb"+
		"\"\3\2\2\2\u00cc\u00cd\7_\2\2\u00cd$\3\2\2\2\u00ce\u00cf\7}\2\2\u00cf"+
		"&\3\2\2\2\u00d0\u00d1\7\177\2\2\u00d1(\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3"+
		"*\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5\u00d6\7?\2\2\u00d6,\3\2\2\2\u00d7\u00d8"+
		"\7@\2\2\u00d8.\3\2\2\2\u00d9\u00da\7@\2\2\u00da\u00db\7?\2\2\u00db\60"+
		"\3\2\2\2\u00dc\u00dd\7>\2\2\u00dd\u00de\7>\2\2\u00de\62\3\2\2\2\u00df"+
		"\u00e0\7@\2\2\u00e0\u00e1\7@\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7-\2\2\u00e3"+
		"\66\3\2\2\2\u00e4\u00e5\7-\2\2\u00e5\u00e6\7-\2\2\u00e68\3\2\2\2\u00e7"+
		"\u00e8\7/\2\2\u00e8:\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7/\2\2\u00eb"+
		"<\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed>\3\2\2\2\u00ee\u00ef\7\61\2\2\u00ef"+
		"@\3\2\2\2\u00f0\u00f1\7\'\2\2\u00f1B\3\2\2\2\u00f2\u00f3\7(\2\2\u00f3"+
		"D\3\2\2\2\u00f4\u00f5\5\'\24\2\u00f5F\3\2\2\2\u00f6\u00f7\7(\2\2\u00f7"+
		"\u00f8\7(\2\2\u00f8H\3\2\2\2\u00f9\u00fa\7~\2\2\u00fa\u00fb\7~\2\2\u00fb"+
		"J\3\2\2\2\u00fc\u00fd\7`\2\2\u00fdL\3\2\2\2\u00fe\u00ff\7#\2\2\u00ffN"+
		"\3\2\2\2\u0100\u0101\7\u0080\2\2\u0101P\3\2\2\2\u0102\u0103\7A\2\2\u0103"+
		"R\3\2\2\2\u0104\u0105\7<\2\2\u0105T\3\2\2\2\u0106\u0107\7=\2\2\u0107V"+
		"\3\2\2\2\u0108\u0109\7.\2\2\u0109X\3\2\2\2\u010a\u010b\7?\2\2\u010bZ\3"+
		"\2\2\2\u010c\u010d\7?\2\2\u010d\u010e\7?\2\2\u010e\\\3\2\2\2\u010f\u0110"+
		"\7#\2\2\u0110\u0111\7?\2\2\u0111^\3\2\2\2\u0112\u0113\7\60\2\2\u0113`"+
		"\3\2\2\2\u0114\u0119\5c\62\2\u0115\u0118\5c\62\2\u0116\u0118\5e\63\2\u0117"+
		"\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011ab\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d"+
		"\t\2\2\2\u011dd\3\2\2\2\u011e\u011f\t\3\2\2\u011ff\3\2\2\2\u0120\u0124"+
		"\5i\65\2\u0121\u0123\5e\63\2\u0122\u0121\3\2\2\2\u0123\u0126\3\2\2\2\u0124"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0129\3\2\2\2\u0126\u0124\3\2"+
		"\2\2\u0127\u0129\7\62\2\2\u0128\u0120\3\2\2\2\u0128\u0127\3\2\2\2\u0129"+
		"h\3\2\2\2\u012a\u012b\t\4\2\2\u012bj\3\2\2\2\u012c\u012d\t\5\2\2\u012d"+
		"l\3\2\2\2\u012e\u0130\5e\63\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132n\3\2\2\2\u0133\u0135\7"+
		"$\2\2\u0134\u0136\5q9\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7$\2\2\u0138p\3\2\2\2\u0139\u013b\5s:\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013dr\3\2\2\2\u013e\u0141\n\6\2\2\u013f\u0141\5u;\2\u0140\u013e"+
		"\3\2\2\2\u0140\u013f\3\2\2\2\u0141t\3\2\2\2\u0142\u0143\7^\2\2\u0143\u0159"+
		"\7)\2\2\u0144\u0145\7^\2\2\u0145\u0159\7$\2\2\u0146\u0147\7^\2\2\u0147"+
		"\u0159\7A\2\2\u0148\u0149\7^\2\2\u0149\u0159\7^\2\2\u014a\u014b\7^\2\2"+
		"\u014b\u0159\7c\2\2\u014c\u014d\7^\2\2\u014d\u0159\7d\2\2\u014e\u014f"+
		"\7^\2\2\u014f\u0159\7h\2\2\u0150\u0151\7^\2\2\u0151\u0159\7p\2\2\u0152"+
		"\u0153\7^\2\2\u0153\u0159\7t\2\2\u0154\u0155\7^\2\2\u0155\u0159\7v\2\2"+
		"\u0156\u0157\7^\2\2\u0157\u0159\7x\2\2\u0158\u0142\3\2\2\2\u0158\u0144"+
		"\3\2\2\2\u0158\u0146\3\2\2\2\u0158\u0148\3\2\2\2\u0158\u014a\3\2\2\2\u0158"+
		"\u014c\3\2\2\2\u0158\u014e\3\2\2\2\u0158\u0150\3\2\2\2\u0158\u0152\3\2"+
		"\2\2\u0158\u0154\3\2\2\2\u0158\u0156\3\2\2\2\u0159v\3\2\2\2\u015a\u015c"+
		"\t\7\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b<\2\2\u0160x\3\2\2\2\u0161"+
		"\u0163\7\17\2\2\u0162\u0164\7\f\2\2\u0163\u0162\3\2\2\2\u0163\u0164\3"+
		"\2\2\2\u0164\u0167\3\2\2\2\u0165\u0167\7\f\2\2\u0166\u0161\3\2\2\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b=\2\2\u0169z\3\2\2\2\u016a"+
		"\u016b\7\61\2\2\u016b\u016c\7,\2\2\u016c\u0170\3\2\2\2\u016d\u016f\13"+
		"\2\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7,"+
		"\2\2\u0174\u0175\7\61\2\2\u0175\u0176\3\2\2\2\u0176\u0177\b>\2\2\u0177"+
		"|\3\2\2\2\u0178\u0179\7\61\2\2\u0179\u017a\7\61\2\2\u017a\u017e\3\2\2"+
		"\2\u017b\u017d\n\b\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\b?\2\2\u0182~\3\2\2\2\21\2\u0117\u0119\u0124\u0128\u0131\u0135"+
		"\u013c\u0140\u0158\u015d\u0163\u0166\u0170\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}