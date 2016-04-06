/* Misaka 2016 grammar Antlr 4 */
grammar Misaka;

/******** expr ********/
expr
    :   assignment_expr                         #expr_to_assign
    ;

assignment_expr
    :   log_or_expr                             #assign_to_logor
    |   unary_expr Assign assignment_expr       #assign_def
    ;

log_or_expr
    :   log_and_expr                            #logor_to_logand
    |   log_or_expr OrOr log_and_expr           #or_def
    ;

log_and_expr
    :   inclusive_or_expr                       #logand_to_incor
    |   log_and_expr AndAnd inclusive_or_expr   #logand_def
    ;

inclusive_or_expr
    :   exclusive_or_expr                       #incor_to_exlor
    |   inclusive_or_expr Or exclusive_or_expr  #incor_def
    ;

exclusive_or_expr
    :   and_expr                                #exlor_to_and
    |   exclusive_or_expr Caret and_expr        #exlor_def
    ;

and_expr
    :   equal_expr                              #and_to_equal
    |   and_expr And equal_expr                 #and_def
    ;

equal_expr
    :   relation_expr                           #equal_to_rel
    |   equal_expr Equal relation_expr          #equal_def
    |   equal_expr NotEqual relation_expr       #equal_not_def
    ;

relation_expr
    :   shift_expr                              #rel_to_shift
    |   relation_expr Less shift_expr           #rel_lit
    |   relation_expr Greater shift_expr        #rel_big
    |   relation_expr LessEqual shift_expr      #rel_lite
    |   relation_expr GreaterEqual shift_expr   #rel_bige
    ;

shift_expr
    :   add_expr                                #shift_to_add
    |   shift_expr LeftShift add_expr           #shift_l
    |   shift_expr RightShift add_expr          #shift_r
    ;

add_expr
    :   multi_expr                              #add_to_multi
    |   add_expr Plus multi_expr                #add_inc
    |   add_expr Minus multi_expr               #add_dec
    ;

multi_expr
    :   new_expr                                #multi_to_new
    |   multi_expr Star new_expr                #multi_mul
    |   multi_expr Div new_expr                 #multi_dev
    |   multi_expr Mod new_expr                 #multi_mod
    ;

new_expr
    :   unary_expr                              #new_to_unary
    |   New type dim_expr                       #new_def
    ;

dim_expr
    :   LK expr RK                              #dim_def
    |   dim_expr LK expr RK                     #dim_list
    ;

type
    :   Void        #type_void
    |   Int         #type_int
    |   String      #type_string
    |   ID          #type_def
    |   type LK RK  #type_array
    |   type LK expr RK  #type_array2
    ;

unary_expr
    :   postfix_expr            #unary_to_post
    |   PlusPlus unary_expr     #unary_pp
    |   MinusMinus unary_expr   #unary_mm
    |   Plus new_expr           #unary_p_new
    |   Minus new_expr          #unary_m_new
    |   Tilde new_expr          #unary_t_new
    |   Not new_expr            #unary_n_new
    //|   New postfix_expr
    ;

/*
unary_op
    :   '+' | '-' | '~' | '!'
    ;
*/

postfix_expr
    :   primary_expr                            #post_to_prim
    |   postfix_expr LK expr RK                 #post_array
    |   postfix_expr LP RP                      #post_argument
    |   postfix_expr LP argument_expr_list RP   #post_argument2
    |   postfix_expr Dot ID                     #post_struct
    |   postfix_expr PlusPlus                   #post_pp
    |   postfix_expr MinusMinus                 #post_mm
    //|   LP typeName RP LB initializer_list RB
    //|   LP typeName RP LB initializer_list Comma RB
    ;

argument_expr_list
    :   assignment_expr             #argument_def
    |   argument_expr_list Comma    #argument_list
    ;

primary_expr
    :   ID              #prim_ID
    |   NULL            #prim_NULL
    |   INT_LITERAL     #prim_INT
    |   STRING_LITERAL  #prim_STRING
    |   LP expr RP      #prim_expr
    ;

/******** expr ********/

















    

/******** stmt ********/
    
stmt
    :   compound_stmt   #stmt_to_comp
    |   expr_stmt       #stmt_to_expr_stmt
    |   select_stmt     #stmt_to_select
    |   iter_stmt       #stmt_to_iter
    |   jump_stmt       #stmt_to_jump
    ;

compound_stmt
    :   LB RB                       #comp_to_blocklist
    |   LB blockItem_list RB        #comp_to_blocklist2
    ;

blockItem_list
    :   blockItem                   #blocklist_to_block
    |   blockItem_list blockItem    #blocklist_def
    ;

blockItem
    :   declaration                 #block_to_declaration
    |   stmt                        #block_to_stmt
    ;

expr_stmt
    :   Semi                        #expr_stmt_def
    |   expr Semi                   #expr_stmt_def2
    ;

select_stmt
    :   If LP expr RP stmt                          #select_def
    |   If LP expr RP stmt Else stmt                #select_def2
    ;

iter_stmt
    :   While LP expr RP stmt                       #iter_while
    |   For LP Semi Semi RP stmt                    #iter_for000
    |   For LP Semi Semi expr RP stmt               #iter_for001
    |   For LP Semi expr Semi RP stmt               #iter_for010
    |   For LP Semi expr Semi expr RP stmt          #iter_for011
    |   For LP expr Semi Semi RP stmt               #iter_for100
    |   For LP expr Semi Semi expr RP stmt          #iter_for101
    |   For LP expr Semi expr Semi RP stmt          #iter_for110
    |   For LP expr Semi expr Semi expr RP stmt     #iter_for111
    ;

jump_stmt
    :   Continue Semi                   #jump_continue
    |   Break Semi                      #jump_break
    |   Return Semi                     #jump_return
    |   Return expr Semi                #jump_return2
    ;

declaration
    :   type Semi                       #declaration_to_initlist
    |   type init_decl Semi             #declaration_to_initlist2
    ;

/*
init_decl_list
    :   init_decl                       #initlist_to_init
    |   init_decl_list Comma init_decl  #initlist_def
    ;
*/

init_decl
    :   decl                            #init_def
    |   decl Assign initializer         #init_decl_def
    ;

decl
    :   ID                              #decl_ID
    |   LP decl RP                      #decl_brack
    |   decl LK assignment_expr? RK     #decl_array
    |   decl LP identifierList? RP      #decl_func
    ;

identifierList
    :   ID                              #IDlist_to_ID
    |   identifierList Comma ID         #IDlist_def
    ;

initializer
    :   assignment_expr                 #initializer_to_assign
    |   LB initializer_list RB          #initializer_to_initializer_list
    //|   LB initializer_list Comma RB    #initializer_to_multi_initializer_list
    ;

initializer_list
    :   initializer                         #initializer_list_to_initializer
    |   initializer_list Comma initializer  #initializer_list_def
    ;

/******** stmt ********/



















/******** compile & function ********/
    
compilation_unit
    :   EOF                                     #compilation_unit_to_translation_unit
    |   translation_unit EOF                    #compilation_unit_to_translation_unit2
    ;

translation_unit
    :   external_declaration                    #translation_unit_to_ex_declaration
    |   translation_unit external_declaration   #translation_unit_list
    ;

external_declaration
    :   class_def                   #ex_declaration_to_class
    |   function_def                #ex_declaration_to_func
    |   declaration                 #ex_declaration_to_declaration
    |   Semi                        #ex_declaration_stray
    ;

class_def
    :   Class decl compound_stmt    #class_deff
    ;

function_def
    :   type decl compound_stmt     #func_def
    ;

NULL: 'NULL';
Break : 'break';
Continue : 'continue';
Else : 'else';
For : 'for';
If : 'if';
Int : 'int';
String : 'string';
New : 'new';
Return : 'return';
Class : 'class';
Void : 'void';
While : 'while';

LP : '(';
RP : ')';
LK : '[';
RK : ']';
LB : '{';
RB : '}';

Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
LeftShift : '<<';
RightShift : '>>';

Plus : '+';
PlusPlus : '++';
Minus : '-';
MinusMinus : '--';
Star : '*';
Div : '/';
Mod : '%';

And : '&';
Or : RB;
AndAnd : '&&';
OrOr : '||';
Caret : '^';
Not : '!';
Tilde : '~';

Question : '?';
Colon : ':';
Semi : ';';
Comma : ',';

Assign : '=';

Equal : '==';
NotEqual : '!=';
Dot : '.';

ID
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;


/*
fragment
IDNondigit
    :   Nondigit
    //|   // other implementation-defined characters...
    ;

*/

/*
ID
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;
*/
fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

INT_LITERAL
    :   NonzeroDigit Digit*
    |   '0'
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
Digit_seq
    :   Digit+
    ;

STRING_LITERAL
    :   '"' SChar_seq? '"'
    ;

fragment
SChar_seq
    :   SChar+
    ;

fragment
SChar
    :   ~["\\\r\n]
    |   Escape_seq
    ;

fragment
Escape_seq
    : '\\\''
    | '\\"'
    | '\\?'
    | '\\\\'
    | '\\a'
    | '\\b'
    | '\\f'
    | '\\n'
    | '\\r'
    | '\\t'
    | '\\v'
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;