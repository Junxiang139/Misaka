// Generated from C:/Users/DolphinAuditore/workspace/Misaka/src/Parser\Misaka.g4 by ANTLR 4.5.1
package Parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MisakaParser}.
 */
public interface MisakaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code expr_to_assign}
	 * labeled alternative in {@link MisakaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_to_assign(MisakaParser.Expr_to_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_to_assign}
	 * labeled alternative in {@link MisakaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_to_assign(MisakaParser.Expr_to_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_to_logor}
	 * labeled alternative in {@link MisakaParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_to_logor(MisakaParser.Assign_to_logorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_to_logor}
	 * labeled alternative in {@link MisakaParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_to_logor(MisakaParser.Assign_to_logorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign_def}
	 * labeled alternative in {@link MisakaParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_def(MisakaParser.Assign_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign_def}
	 * labeled alternative in {@link MisakaParser#assignment_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_def(MisakaParser.Assign_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logor_to_logand}
	 * labeled alternative in {@link MisakaParser#log_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogor_to_logand(MisakaParser.Logor_to_logandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logor_to_logand}
	 * labeled alternative in {@link MisakaParser#log_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogor_to_logand(MisakaParser.Logor_to_logandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or_def}
	 * labeled alternative in {@link MisakaParser#log_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_def(MisakaParser.Or_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or_def}
	 * labeled alternative in {@link MisakaParser#log_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_def(MisakaParser.Or_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logand_to_incor}
	 * labeled alternative in {@link MisakaParser#log_and_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogand_to_incor(MisakaParser.Logand_to_incorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logand_to_incor}
	 * labeled alternative in {@link MisakaParser#log_and_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogand_to_incor(MisakaParser.Logand_to_incorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logand_def}
	 * labeled alternative in {@link MisakaParser#log_and_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogand_def(MisakaParser.Logand_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logand_def}
	 * labeled alternative in {@link MisakaParser#log_and_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogand_def(MisakaParser.Logand_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incor_to_exlor}
	 * labeled alternative in {@link MisakaParser#inclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterIncor_to_exlor(MisakaParser.Incor_to_exlorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incor_to_exlor}
	 * labeled alternative in {@link MisakaParser#inclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitIncor_to_exlor(MisakaParser.Incor_to_exlorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code incor_def}
	 * labeled alternative in {@link MisakaParser#inclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterIncor_def(MisakaParser.Incor_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code incor_def}
	 * labeled alternative in {@link MisakaParser#inclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitIncor_def(MisakaParser.Incor_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exlor_to_and}
	 * labeled alternative in {@link MisakaParser#exclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterExlor_to_and(MisakaParser.Exlor_to_andContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exlor_to_and}
	 * labeled alternative in {@link MisakaParser#exclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitExlor_to_and(MisakaParser.Exlor_to_andContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exlor_def}
	 * labeled alternative in {@link MisakaParser#exclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void enterExlor_def(MisakaParser.Exlor_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exlor_def}
	 * labeled alternative in {@link MisakaParser#exclusive_or_expr}.
	 * @param ctx the parse tree
	 */
	void exitExlor_def(MisakaParser.Exlor_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_def}
	 * labeled alternative in {@link MisakaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_def(MisakaParser.And_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_def}
	 * labeled alternative in {@link MisakaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_def(MisakaParser.And_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and_to_equal}
	 * labeled alternative in {@link MisakaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_to_equal(MisakaParser.And_to_equalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and_to_equal}
	 * labeled alternative in {@link MisakaParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_to_equal(MisakaParser.And_to_equalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal_to_rel}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual_to_rel(MisakaParser.Equal_to_relContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal_to_rel}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual_to_rel(MisakaParser.Equal_to_relContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal_not_def}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual_not_def(MisakaParser.Equal_not_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal_not_def}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual_not_def(MisakaParser.Equal_not_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal_def}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual_def(MisakaParser.Equal_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal_def}
	 * labeled alternative in {@link MisakaParser#equal_expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual_def(MisakaParser.Equal_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_to_shift}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_to_shift(MisakaParser.Rel_to_shiftContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_to_shift}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_to_shift(MisakaParser.Rel_to_shiftContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_lite}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_lite(MisakaParser.Rel_liteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_lite}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_lite(MisakaParser.Rel_liteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_big}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_big(MisakaParser.Rel_bigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_big}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_big(MisakaParser.Rel_bigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_bige}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_bige(MisakaParser.Rel_bigeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_bige}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_bige(MisakaParser.Rel_bigeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rel_lit}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void enterRel_lit(MisakaParser.Rel_litContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rel_lit}
	 * labeled alternative in {@link MisakaParser#relation_expr}.
	 * @param ctx the parse tree
	 */
	void exitRel_lit(MisakaParser.Rel_litContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shift_l}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_l(MisakaParser.Shift_lContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shift_l}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_l(MisakaParser.Shift_lContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shift_to_add}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_to_add(MisakaParser.Shift_to_addContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shift_to_add}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_to_add(MisakaParser.Shift_to_addContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shift_r}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void enterShift_r(MisakaParser.Shift_rContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shift_r}
	 * labeled alternative in {@link MisakaParser#shift_expr}.
	 * @param ctx the parse tree
	 */
	void exitShift_r(MisakaParser.Shift_rContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_to_multi}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_to_multi(MisakaParser.Add_to_multiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_to_multi}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_to_multi(MisakaParser.Add_to_multiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_dec}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_dec(MisakaParser.Add_decContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_dec}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_dec(MisakaParser.Add_decContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_inc}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_inc(MisakaParser.Add_incContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_inc}
	 * labeled alternative in {@link MisakaParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_inc(MisakaParser.Add_incContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_mod}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_mod(MisakaParser.Multi_modContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_mod}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_mod(MisakaParser.Multi_modContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_mul}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_mul(MisakaParser.Multi_mulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_mul}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_mul(MisakaParser.Multi_mulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_dev}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_dev(MisakaParser.Multi_devContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_dev}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_dev(MisakaParser.Multi_devContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multi_to_new}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void enterMulti_to_new(MisakaParser.Multi_to_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multi_to_new}
	 * labeled alternative in {@link MisakaParser#multi_expr}.
	 * @param ctx the parse tree
	 */
	void exitMulti_to_new(MisakaParser.Multi_to_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new_to_unary}
	 * labeled alternative in {@link MisakaParser#new_expr}.
	 * @param ctx the parse tree
	 */
	void enterNew_to_unary(MisakaParser.New_to_unaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_to_unary}
	 * labeled alternative in {@link MisakaParser#new_expr}.
	 * @param ctx the parse tree
	 */
	void exitNew_to_unary(MisakaParser.New_to_unaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new_def}
	 * labeled alternative in {@link MisakaParser#new_expr}.
	 * @param ctx the parse tree
	 */
	void enterNew_def(MisakaParser.New_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new_def}
	 * labeled alternative in {@link MisakaParser#new_expr}.
	 * @param ctx the parse tree
	 */
	void exitNew_def(MisakaParser.New_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dim_list}
	 * labeled alternative in {@link MisakaParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void enterDim_list(MisakaParser.Dim_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dim_list}
	 * labeled alternative in {@link MisakaParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void exitDim_list(MisakaParser.Dim_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dim_def}
	 * labeled alternative in {@link MisakaParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void enterDim_def(MisakaParser.Dim_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dim_def}
	 * labeled alternative in {@link MisakaParser#dim_expr}.
	 * @param ctx the parse tree
	 */
	void exitDim_def(MisakaParser.Dim_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_string}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_string(MisakaParser.Type_stringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_string}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_string(MisakaParser.Type_stringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_def}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_def(MisakaParser.Type_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_def}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_def(MisakaParser.Type_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_array(MisakaParser.Type_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_array}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_array(MisakaParser.Type_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_void(MisakaParser.Type_voidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_void}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_void(MisakaParser.Type_voidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code type_array2}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_array2(MisakaParser.Type_array2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code type_array2}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_array2(MisakaParser.Type_array2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType_int(MisakaParser.Type_intContext ctx);
	/**
	 * Exit a parse tree produced by the {@code type_int}
	 * labeled alternative in {@link MisakaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType_int(MisakaParser.Type_intContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_to_post}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_to_post(MisakaParser.Unary_to_postContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_to_post}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_to_post(MisakaParser.Unary_to_postContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_pp}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_pp(MisakaParser.Unary_ppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_pp}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_pp(MisakaParser.Unary_ppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_mm}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_mm(MisakaParser.Unary_mmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_mm}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_mm(MisakaParser.Unary_mmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_p_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_p_new(MisakaParser.Unary_p_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_p_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_p_new(MisakaParser.Unary_p_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_m_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_m_new(MisakaParser.Unary_m_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_m_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_m_new(MisakaParser.Unary_m_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_t_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_t_new(MisakaParser.Unary_t_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_t_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_t_new(MisakaParser.Unary_t_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary_n_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_n_new(MisakaParser.Unary_n_newContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary_n_new}
	 * labeled alternative in {@link MisakaParser#unary_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_n_new(MisakaParser.Unary_n_newContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_pp}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_pp(MisakaParser.Post_ppContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_pp}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_pp(MisakaParser.Post_ppContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_mm}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_mm(MisakaParser.Post_mmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_mm}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_mm(MisakaParser.Post_mmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_argument2}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_argument2(MisakaParser.Post_argument2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code post_argument2}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_argument2(MisakaParser.Post_argument2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code post_struct}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_struct(MisakaParser.Post_structContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_struct}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_struct(MisakaParser.Post_structContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_to_prim}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_to_prim(MisakaParser.Post_to_primContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_to_prim}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_to_prim(MisakaParser.Post_to_primContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_array}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_array(MisakaParser.Post_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_array}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_array(MisakaParser.Post_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code post_argument}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void enterPost_argument(MisakaParser.Post_argumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code post_argument}
	 * labeled alternative in {@link MisakaParser#postfix_expr}.
	 * @param ctx the parse tree
	 */
	void exitPost_argument(MisakaParser.Post_argumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_def}
	 * labeled alternative in {@link MisakaParser#argument_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_def(MisakaParser.Argument_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_def}
	 * labeled alternative in {@link MisakaParser#argument_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_def(MisakaParser.Argument_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argument_list}
	 * labeled alternative in {@link MisakaParser#argument_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterArgument_list(MisakaParser.Argument_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argument_list}
	 * labeled alternative in {@link MisakaParser#argument_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitArgument_list(MisakaParser.Argument_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim_ID}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_ID(MisakaParser.Prim_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim_ID}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_ID(MisakaParser.Prim_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim_NULL}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_NULL(MisakaParser.Prim_NULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim_NULL}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_NULL(MisakaParser.Prim_NULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim_INT}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_INT(MisakaParser.Prim_INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim_INT}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_INT(MisakaParser.Prim_INTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim_STRING}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_STRING(MisakaParser.Prim_STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim_STRING}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_STRING(MisakaParser.Prim_STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prim_expr}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrim_expr(MisakaParser.Prim_exprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prim_expr}
	 * labeled alternative in {@link MisakaParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrim_expr(MisakaParser.Prim_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_to_comp}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt_to_comp(MisakaParser.Stmt_to_compContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_to_comp}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt_to_comp(MisakaParser.Stmt_to_compContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_to_expr_stmt}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt_to_expr_stmt(MisakaParser.Stmt_to_expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_to_expr_stmt}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt_to_expr_stmt(MisakaParser.Stmt_to_expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_to_select}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt_to_select(MisakaParser.Stmt_to_selectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_to_select}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt_to_select(MisakaParser.Stmt_to_selectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_to_iter}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt_to_iter(MisakaParser.Stmt_to_iterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_to_iter}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt_to_iter(MisakaParser.Stmt_to_iterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stmt_to_jump}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt_to_jump(MisakaParser.Stmt_to_jumpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stmt_to_jump}
	 * labeled alternative in {@link MisakaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt_to_jump(MisakaParser.Stmt_to_jumpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp_to_blocklist}
	 * labeled alternative in {@link MisakaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComp_to_blocklist(MisakaParser.Comp_to_blocklistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comp_to_blocklist}
	 * labeled alternative in {@link MisakaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComp_to_blocklist(MisakaParser.Comp_to_blocklistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comp_to_blocklist2}
	 * labeled alternative in {@link MisakaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void enterComp_to_blocklist2(MisakaParser.Comp_to_blocklist2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code comp_to_blocklist2}
	 * labeled alternative in {@link MisakaParser#compound_stmt}.
	 * @param ctx the parse tree
	 */
	void exitComp_to_blocklist2(MisakaParser.Comp_to_blocklist2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code blocklist_to_block}
	 * labeled alternative in {@link MisakaParser#blockItem_list}.
	 * @param ctx the parse tree
	 */
	void enterBlocklist_to_block(MisakaParser.Blocklist_to_blockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blocklist_to_block}
	 * labeled alternative in {@link MisakaParser#blockItem_list}.
	 * @param ctx the parse tree
	 */
	void exitBlocklist_to_block(MisakaParser.Blocklist_to_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blocklist_def}
	 * labeled alternative in {@link MisakaParser#blockItem_list}.
	 * @param ctx the parse tree
	 */
	void enterBlocklist_def(MisakaParser.Blocklist_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blocklist_def}
	 * labeled alternative in {@link MisakaParser#blockItem_list}.
	 * @param ctx the parse tree
	 */
	void exitBlocklist_def(MisakaParser.Blocklist_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_to_declaration}
	 * labeled alternative in {@link MisakaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlock_to_declaration(MisakaParser.Block_to_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_to_declaration}
	 * labeled alternative in {@link MisakaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlock_to_declaration(MisakaParser.Block_to_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code block_to_stmt}
	 * labeled alternative in {@link MisakaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlock_to_stmt(MisakaParser.Block_to_stmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code block_to_stmt}
	 * labeled alternative in {@link MisakaParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlock_to_stmt(MisakaParser.Block_to_stmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stmt_def}
	 * labeled alternative in {@link MisakaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt_def(MisakaParser.Expr_stmt_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stmt_def}
	 * labeled alternative in {@link MisakaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt_def(MisakaParser.Expr_stmt_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_stmt_def2}
	 * labeled alternative in {@link MisakaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt_def2(MisakaParser.Expr_stmt_def2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_stmt_def2}
	 * labeled alternative in {@link MisakaParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt_def2(MisakaParser.Expr_stmt_def2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code select_def}
	 * labeled alternative in {@link MisakaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_def(MisakaParser.Select_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select_def}
	 * labeled alternative in {@link MisakaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_def(MisakaParser.Select_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select_def2}
	 * labeled alternative in {@link MisakaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_def2(MisakaParser.Select_def2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code select_def2}
	 * labeled alternative in {@link MisakaParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_def2(MisakaParser.Select_def2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_while}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_while(MisakaParser.Iter_whileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_while}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_while(MisakaParser.Iter_whileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for000}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for000(MisakaParser.Iter_for000Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for000}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for000(MisakaParser.Iter_for000Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for001}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for001(MisakaParser.Iter_for001Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for001}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for001(MisakaParser.Iter_for001Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for010}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for010(MisakaParser.Iter_for010Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for010}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for010(MisakaParser.Iter_for010Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for011}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for011(MisakaParser.Iter_for011Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for011}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for011(MisakaParser.Iter_for011Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for100}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for100(MisakaParser.Iter_for100Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for100}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for100(MisakaParser.Iter_for100Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for101}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for101(MisakaParser.Iter_for101Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for101}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for101(MisakaParser.Iter_for101Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for110}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for110(MisakaParser.Iter_for110Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for110}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for110(MisakaParser.Iter_for110Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iter_for111}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIter_for111(MisakaParser.Iter_for111Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iter_for111}
	 * labeled alternative in {@link MisakaParser#iter_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIter_for111(MisakaParser.Iter_for111Context ctx);
	/**
	 * Enter a parse tree produced by the {@code jump_continue}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJump_continue(MisakaParser.Jump_continueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump_continue}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJump_continue(MisakaParser.Jump_continueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump_break}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJump_break(MisakaParser.Jump_breakContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump_break}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJump_break(MisakaParser.Jump_breakContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump_return}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJump_return(MisakaParser.Jump_returnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code jump_return}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJump_return(MisakaParser.Jump_returnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code jump_return2}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJump_return2(MisakaParser.Jump_return2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code jump_return2}
	 * labeled alternative in {@link MisakaParser#jump_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJump_return2(MisakaParser.Jump_return2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_to_initlist}
	 * labeled alternative in {@link MisakaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_to_initlist(MisakaParser.Declaration_to_initlistContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_to_initlist}
	 * labeled alternative in {@link MisakaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_to_initlist(MisakaParser.Declaration_to_initlistContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration_to_initlist2}
	 * labeled alternative in {@link MisakaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_to_initlist2(MisakaParser.Declaration_to_initlist2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration_to_initlist2}
	 * labeled alternative in {@link MisakaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_to_initlist2(MisakaParser.Declaration_to_initlist2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code init_def}
	 * labeled alternative in {@link MisakaParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void enterInit_def(MisakaParser.Init_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code init_def}
	 * labeled alternative in {@link MisakaParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void exitInit_def(MisakaParser.Init_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code init_decl_def}
	 * labeled alternative in {@link MisakaParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void enterInit_decl_def(MisakaParser.Init_decl_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code init_decl_def}
	 * labeled alternative in {@link MisakaParser#init_decl}.
	 * @param ctx the parse tree
	 */
	void exitInit_decl_def(MisakaParser.Init_decl_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_brack}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl_brack(MisakaParser.Decl_brackContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_brack}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl_brack(MisakaParser.Decl_brackContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_func}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl_func(MisakaParser.Decl_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_func}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl_func(MisakaParser.Decl_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_array}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl_array(MisakaParser.Decl_arrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_array}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl_array(MisakaParser.Decl_arrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decl_ID}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl_ID(MisakaParser.Decl_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decl_ID}
	 * labeled alternative in {@link MisakaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl_ID(MisakaParser.Decl_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDlist_def}
	 * labeled alternative in {@link MisakaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIDlist_def(MisakaParser.IDlist_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDlist_def}
	 * labeled alternative in {@link MisakaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIDlist_def(MisakaParser.IDlist_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDlist_to_ID}
	 * labeled alternative in {@link MisakaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIDlist_to_ID(MisakaParser.IDlist_to_IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDlist_to_ID}
	 * labeled alternative in {@link MisakaParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIDlist_to_ID(MisakaParser.IDlist_to_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_to_assign}
	 * labeled alternative in {@link MisakaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_to_assign(MisakaParser.Initializer_to_assignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_to_assign}
	 * labeled alternative in {@link MisakaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_to_assign(MisakaParser.Initializer_to_assignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_to_initializer_list}
	 * labeled alternative in {@link MisakaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_to_initializer_list(MisakaParser.Initializer_to_initializer_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_to_initializer_list}
	 * labeled alternative in {@link MisakaParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_to_initializer_list(MisakaParser.Initializer_to_initializer_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_list_def}
	 * labeled alternative in {@link MisakaParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list_def(MisakaParser.Initializer_list_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_list_def}
	 * labeled alternative in {@link MisakaParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list_def(MisakaParser.Initializer_list_defContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializer_list_to_initializer}
	 * labeled alternative in {@link MisakaParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void enterInitializer_list_to_initializer(MisakaParser.Initializer_list_to_initializerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializer_list_to_initializer}
	 * labeled alternative in {@link MisakaParser#initializer_list}.
	 * @param ctx the parse tree
	 */
	void exitInitializer_list_to_initializer(MisakaParser.Initializer_list_to_initializerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compilation_unit_to_translation_unit}
	 * labeled alternative in {@link MisakaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit_to_translation_unit(MisakaParser.Compilation_unit_to_translation_unitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compilation_unit_to_translation_unit}
	 * labeled alternative in {@link MisakaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit_to_translation_unit(MisakaParser.Compilation_unit_to_translation_unitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compilation_unit_to_translation_unit2}
	 * labeled alternative in {@link MisakaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void enterCompilation_unit_to_translation_unit2(MisakaParser.Compilation_unit_to_translation_unit2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code compilation_unit_to_translation_unit2}
	 * labeled alternative in {@link MisakaParser#compilation_unit}.
	 * @param ctx the parse tree
	 */
	void exitCompilation_unit_to_translation_unit2(MisakaParser.Compilation_unit_to_translation_unit2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code translation_unit_to_ex_declaration}
	 * labeled alternative in {@link MisakaParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit_to_ex_declaration(MisakaParser.Translation_unit_to_ex_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translation_unit_to_ex_declaration}
	 * labeled alternative in {@link MisakaParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit_to_ex_declaration(MisakaParser.Translation_unit_to_ex_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code translation_unit_list}
	 * labeled alternative in {@link MisakaParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void enterTranslation_unit_list(MisakaParser.Translation_unit_listContext ctx);
	/**
	 * Exit a parse tree produced by the {@code translation_unit_list}
	 * labeled alternative in {@link MisakaParser#translation_unit}.
	 * @param ctx the parse tree
	 */
	void exitTranslation_unit_list(MisakaParser.Translation_unit_listContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ex_declaration_to_class}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEx_declaration_to_class(MisakaParser.Ex_declaration_to_classContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ex_declaration_to_class}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEx_declaration_to_class(MisakaParser.Ex_declaration_to_classContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ex_declaration_to_func}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEx_declaration_to_func(MisakaParser.Ex_declaration_to_funcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ex_declaration_to_func}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEx_declaration_to_func(MisakaParser.Ex_declaration_to_funcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ex_declaration_to_declaration}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEx_declaration_to_declaration(MisakaParser.Ex_declaration_to_declarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ex_declaration_to_declaration}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEx_declaration_to_declaration(MisakaParser.Ex_declaration_to_declarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ex_declaration_stray}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEx_declaration_stray(MisakaParser.Ex_declaration_strayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ex_declaration_stray}
	 * labeled alternative in {@link MisakaParser#external_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEx_declaration_stray(MisakaParser.Ex_declaration_strayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code class_deff}
	 * labeled alternative in {@link MisakaParser#class_def}.
	 * @param ctx the parse tree
	 */
	void enterClass_deff(MisakaParser.Class_deffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code class_deff}
	 * labeled alternative in {@link MisakaParser#class_def}.
	 * @param ctx the parse tree
	 */
	void exitClass_deff(MisakaParser.Class_deffContext ctx);
	/**
	 * Enter a parse tree produced by the {@code func_def}
	 * labeled alternative in {@link MisakaParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(MisakaParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by the {@code func_def}
	 * labeled alternative in {@link MisakaParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(MisakaParser.Func_defContext ctx);
}