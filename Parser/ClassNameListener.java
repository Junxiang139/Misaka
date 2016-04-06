package Parser;

import AST.Statement.Expression.BinaryExpression.*;
import AST.Statement.Expression.Expression;
import AST.Node;
import AST.Statement.Expression.UnaryExpression.*;
import AST.Statement.Frag.*;
import AST.Statement.MultiStatement.*;
import AST.Statement.Statement;
import AST.Statement.Type.*;
import AST.Statement.UnaryStatement.CompoundStmt;
import AST.Statement.UnaryStatement.CompoundStmt2;
import AST.Statement.UnaryStatement.ExprStmtDef;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

/*

*/

public class ClassNameListener extends MisakaBaseListener {
    public static ParseTreeProperty<Node> nodeProperty = new ParseTreeProperty<>();

    @Override public void exitExpr_to_assign(MisakaParser.Expr_to_assignContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.assignment_expr()));
    }

    @Override public void exitAssign_to_logor(MisakaParser.Assign_to_logorContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.log_or_expr()));
    }

    @Override public void exitAssign_def(MisakaParser.Assign_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.unary_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.assignment_expr());
        nodeProperty.put(ctx, new AssignmentExpression(lhs, rhs));
    }

    @Override public void exitLogor_to_logand(MisakaParser.Logor_to_logandContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.log_and_expr()));
    }

    @Override public void exitOr_def(MisakaParser.Or_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.log_or_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.log_and_expr());
        nodeProperty.put(ctx, new LogOrExpression(lhs, rhs));
    }

    @Override public void exitLogand_to_incor(MisakaParser.Logand_to_incorContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.inclusive_or_expr()));
    }

    @Override public void exitLogand_def(MisakaParser.Logand_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.log_and_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.inclusive_or_expr());
        nodeProperty.put(ctx, new LogAndExpression(lhs, rhs));
    }

    @Override public void exitIncor_to_exlor(MisakaParser.Incor_to_exlorContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.exclusive_or_expr()));
    }

    @Override public void exitIncor_def(MisakaParser.Incor_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.inclusive_or_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.exclusive_or_expr());
        nodeProperty.put(ctx, new IncOrExpression(lhs, rhs));
    }

    @Override public void exitExlor_to_and(MisakaParser.Exlor_to_andContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.and_expr()));
    }

    @Override public void exitExlor_def(MisakaParser.Exlor_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.exclusive_or_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.and_expr());
        nodeProperty.put(ctx, new ExlOrExpression(lhs, rhs));
    }

    @Override public void exitAnd_def(MisakaParser.And_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.and_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.equal_expr());
        nodeProperty.put(ctx, new AndExpression(lhs, rhs));
    }

    @Override public void exitAnd_to_equal(MisakaParser.And_to_equalContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.equal_expr()));
    }

    @Override public void exitEqual_to_rel(MisakaParser.Equal_to_relContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.relation_expr()));
    }

    @Override public void exitEqual_not_def(MisakaParser.Equal_not_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.equal_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.relation_expr());
        nodeProperty.put(ctx, new EqualNotExpression(lhs, rhs));
    }

    @Override public void exitEqual_def(MisakaParser.Equal_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.equal_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.relation_expr());
        nodeProperty.put(ctx, new EqualExpression(lhs, rhs));
    }

    @Override public void exitRel_to_shift(MisakaParser.Rel_to_shiftContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.shift_expr()));
    }

    @Override public void exitRel_lite(MisakaParser.Rel_liteContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.relation_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.shift_expr());
        nodeProperty.put(ctx, new RelLitEqualExpression(lhs, rhs));
    }

    @Override public void exitRel_big(MisakaParser.Rel_bigContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.relation_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.shift_expr());
        nodeProperty.put(ctx, new RelBigExpression(lhs, rhs));
    }

    @Override public void exitRel_bige(MisakaParser.Rel_bigeContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.relation_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.shift_expr());
        nodeProperty.put(ctx, new RelBigEqualExpression(lhs, rhs));
    }

    @Override public void exitRel_lit(MisakaParser.Rel_litContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.relation_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.shift_expr());
        nodeProperty.put(ctx, new RelLitExpression(lhs, rhs));
    }

    @Override public void exitShift_l(MisakaParser.Shift_lContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.shift_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.add_expr());
        nodeProperty.put(ctx, new ShiftLeftExpression(lhs, rhs));
    }

    @Override public void exitShift_to_add(MisakaParser.Shift_to_addContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.add_expr()));
    }

    @Override public void exitShift_r(MisakaParser.Shift_rContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.shift_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.add_expr());
        nodeProperty.put(ctx, new ShiftRightExpression(lhs, rhs));
    }

    @Override public void exitAdd_to_multi(MisakaParser.Add_to_multiContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.multi_expr()));
    }

    @Override public void exitAdd_dec(MisakaParser.Add_decContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.add_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.multi_expr());
        nodeProperty.put(ctx, new AddDecExpression(lhs, rhs));
    }

    @Override public void exitAdd_inc(MisakaParser.Add_incContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.add_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.multi_expr());
        nodeProperty.put(ctx, new AddIncExpression(lhs, rhs));
    }

    @Override public void exitMulti_mod(MisakaParser.Multi_modContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.multi_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new MultiModExpression(lhs, rhs));
    }

    @Override public void exitMulti_mul(MisakaParser.Multi_mulContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.multi_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new MultiMulExpression(lhs, rhs));
    }

    @Override public void exitMulti_dev(MisakaParser.Multi_devContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.multi_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new MultiDevExpression(lhs, rhs));
    }

    @Override public void exitMulti_to_new(MisakaParser.Multi_to_newContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.new_expr()));
    }

    @Override public void exitNew_to_unary(MisakaParser.New_to_unaryContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.unary_expr()));
    }

    @Override public void exitNew_def(MisakaParser.New_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.type());
        Expression rhs = (Expression) nodeProperty.get(ctx.dim_expr());
        nodeProperty.put(ctx, new NewExpression(lhs, rhs));
    }

    @Override public void exitDim_list(MisakaParser.Dim_listContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.dim_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.expr());
        nodeProperty.put(ctx, new DimExpression(lhs, rhs));
    }

    @Override public void exitDim_def(MisakaParser.Dim_defContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.expr()));
    }

    @Override public void exitType_string(MisakaParser.Type_stringContext ctx) {
        nodeProperty.put(ctx, new StringType());
    }

    @Override public void exitType_def(MisakaParser.Type_defContext ctx) {
        nodeProperty.put(ctx, new DefType());
    }

    @Override public void exitType_array(MisakaParser.Type_arrayContext ctx) {
        Type uhs = (Type) nodeProperty.get(ctx.type());
        nodeProperty.put(ctx, new TypeKK(uhs));
    }

    @Override public void exitType_array2(MisakaParser.Type_array2Context ctx) {
        Type lhs = (Type) nodeProperty.get(ctx.type());
        Expression rhs = (Expression) nodeProperty.get(ctx.expr());
        nodeProperty.put(ctx, new TypeKK2(lhs, rhs));
    }

    @Override public void exitType_void(MisakaParser.Type_voidContext ctx) {
        nodeProperty.put(ctx, new VoidType());
    }

    @Override public void exitType_int(MisakaParser.Type_intContext ctx) {
        nodeProperty.put(ctx, new IntType());
        System.out.println("Int");
    }

    @Override public void exitUnary_to_post(MisakaParser.Unary_to_postContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.postfix_expr()));
    }

    @Override public void exitUnary_pp(MisakaParser.Unary_ppContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.unary_expr()));
    }

    @Override public void exitUnary_mm(MisakaParser.Unary_mmContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.unary_expr()));
    }

    @Override public void exitUnary_p_new(MisakaParser.Unary_p_newContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new UnaryPNewExpression(uhs));
    }

    @Override public void exitUnary_m_new(MisakaParser.Unary_m_newContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new UnaryMNewExpression(uhs));
    }

    @Override public void exitUnary_t_new(MisakaParser.Unary_t_newContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new UnaryTNewExpression(uhs));
    }

    @Override public void exitUnary_n_new(MisakaParser.Unary_n_newContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.new_expr());
        nodeProperty.put(ctx, new UnaryNNewExpression(uhs));
    }

    @Override public void exitPost_pp(MisakaParser.Post_ppContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        nodeProperty.put(ctx, new PostPPExpression(uhs));
    }

    @Override public void exitPost_mm(MisakaParser.Post_mmContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        nodeProperty.put(ctx, new PostMMExpression(uhs));
    }

    @Override public void exitPost_struct(MisakaParser.Post_structContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        ID rhs = new ID (ctx.ID().getText());
        nodeProperty.put(ctx, new PostStructExpression(lhs, rhs));
    }

    @Override public void exitPost_to_prim(MisakaParser.Post_to_primContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.primary_expr()));
    }

    @Override public void exitPost_array(MisakaParser.Post_arrayContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.expr());
        nodeProperty.put(ctx, new PostArrayExpression(lhs, rhs));
    }

    @Override public void exitPost_argument(MisakaParser.Post_argumentContext ctx) {
        Expression uhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        nodeProperty.put(ctx, new PostArgumentExpression(uhs));
    }

    @Override public void exitPost_argument2(MisakaParser.Post_argument2Context ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.postfix_expr());
        Expression rhs = (Expression) nodeProperty.get(ctx.argument_expr_list());
        nodeProperty.put(ctx, new PostArgumentExpression2(lhs, rhs));
    }

    @Override public void exitArgument_def(MisakaParser.Argument_defContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.assignment_expr()));
    }

    @Override public void exitArgument_list(MisakaParser.Argument_listContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.argument_expr_list()));
    }

    @Override public void exitPrim_ID(MisakaParser.Prim_IDContext ctx) {
        ID name = new ID (ctx.ID().getText());
        nodeProperty.put(ctx, name);
    }

	/*
	// expr : ID ;
    @Override
    public void exitId(CalcParser.IdContext ctx) {
        values.put(ctx, vars.containsKey(ctx.ID().getText()) ? vars.get(ctx.ID().getText()) : .0);
    }
	*/

    @Override public void exitPrim_NULL(MisakaParser.Prim_NULLContext ctx) {
        NULL name = new NULL();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitPrim_INT(MisakaParser.Prim_INTContext ctx) {
        IntLiteral name = new IntLiteral();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitPrim_STRING(MisakaParser.Prim_STRINGContext ctx) {
        StringLiteral name = new StringLiteral();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitPrim_expr(MisakaParser.Prim_exprContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.expr()));
    }























    @Override public void exitStmt_to_comp(MisakaParser.Stmt_to_compContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.compound_stmt()));
    }

    @Override public void exitStmt_to_expr_stmt(MisakaParser.Stmt_to_expr_stmtContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.expr_stmt()));
    }

    @Override public void exitStmt_to_select(MisakaParser.Stmt_to_selectContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.select_stmt()));
    }

    @Override public void exitStmt_to_iter(MisakaParser.Stmt_to_iterContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.iter_stmt()));
    }

    @Override public void exitStmt_to_jump(MisakaParser.Stmt_to_jumpContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.jump_stmt()));
    }

    @Override public void exitComp_to_blocklist(MisakaParser.Comp_to_blocklistContext ctx) {
        nodeProperty.put(ctx, new CompoundStmt());
    }

    @Override public void exitComp_to_blocklist2(MisakaParser.Comp_to_blocklist2Context ctx) {
        Statement uhs = (Statement) nodeProperty.get(ctx.blockItem_list());
        nodeProperty.put(ctx, new CompoundStmt2(uhs));
    }

    @Override public void exitBlocklist_to_block(MisakaParser.Blocklist_to_blockContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.blockItem()));
    }

    @Override public void exitBlocklist_def(MisakaParser.Blocklist_defContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.blockItem_list());
        Statement rhs = (Statement) nodeProperty.get(ctx.blockItem());
        nodeProperty.put(ctx, new BlockItemList(lhs, rhs));
    }

    @Override public void exitBlock_to_declaration(MisakaParser.Block_to_declarationContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.declaration()));
    }

    @Override public void exitBlock_to_stmt(MisakaParser.Block_to_stmtContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.stmt()));
    }

    @Override public void exitExpr_stmt_def(MisakaParser.Expr_stmt_defContext ctx) {
        nodeProperty.put(ctx, new ExprStmtDef());
    }

    @Override public void exitExpr_stmt_def2(MisakaParser.Expr_stmt_def2Context ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.expr()));
    }

    @Override public void exitSelect_def(MisakaParser.Select_defContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.expr());
        Statement rhs = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new SelectDef(lhs, rhs));
    }

    @Override public void exitSelect_def2(MisakaParser.Select_def2Context ctx) {
        Expression hs1 = (Expression) nodeProperty.get(ctx.expr());
        Statement hs2 = (Statement) nodeProperty.get(ctx.stmt(0));
        Statement hs3 = (Statement) nodeProperty.get(ctx.stmt(1));
        nodeProperty.put(ctx, new SelectDef2(hs1, hs2, hs3));
    }

    @Override public void exitIter_while(MisakaParser.Iter_whileContext ctx) {
        Expression lhs = (Expression) nodeProperty.get(ctx.expr());
        Statement rhs = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterWhile(lhs, rhs));
    }

    @Override public void exitIter_for000(MisakaParser.Iter_for000Context ctx) {
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor000(hs4));
    }

    @Override public void exitIter_for001(MisakaParser.Iter_for001Context ctx) {
        Expression hs3 = (Expression) nodeProperty.get(ctx.expr());
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor001(hs3, hs4));
    }

    @Override public void exitIter_for010(MisakaParser.Iter_for010Context ctx) {
        Expression hs2 = (Expression) nodeProperty.get(ctx.expr());
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor010(hs2, hs4));
    }

    @Override public void exitIter_for011(MisakaParser.Iter_for011Context ctx) {
        Expression hs2 = (Expression) nodeProperty.get(ctx.expr(0));
        Expression hs3 = (Expression) nodeProperty.get(ctx.expr(1));
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor011(hs2, hs3, hs4));
    }

    @Override public void exitIter_for100(MisakaParser.Iter_for100Context ctx) {
        Expression hs1 = (Expression) nodeProperty.get(ctx.expr());
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor100(hs1, hs4));
    }

    @Override public void exitIter_for101(MisakaParser.Iter_for101Context ctx) {
        Expression hs1 = (Expression) nodeProperty.get(ctx.expr(0));
        Expression hs3 = (Expression) nodeProperty.get(ctx.expr(1));
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor101(hs1, hs3, hs4));
    }

    @Override public void exitIter_for110(MisakaParser.Iter_for110Context ctx) {
        Expression hs1 = (Expression) nodeProperty.get(ctx.expr(0));
        Expression hs2 = (Expression) nodeProperty.get(ctx.expr(1));
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor110(hs1, hs2, hs4));
    }

    @Override public void exitIter_for111(MisakaParser.Iter_for111Context ctx) {
        Expression hs1 = (Expression) nodeProperty.get(ctx.expr(0));
        Expression hs2 = (Expression) nodeProperty.get(ctx.expr(1));
        Expression hs3 = (Expression) nodeProperty.get(ctx.expr(2));
        Statement hs4 = (Statement) nodeProperty.get(ctx.stmt());
        nodeProperty.put(ctx, new IterFor111(hs1, hs2, hs3, hs4));
    }

    //@Override public void exitIter_declaration_for(MisakaParser.Iter_declaration_forContext ctx) { }

    @Override public void exitJump_continue(MisakaParser.Jump_continueContext ctx) {
        Continue name = new Continue();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitJump_break(MisakaParser.Jump_breakContext ctx) {
        Break name = new Break();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitJump_return(MisakaParser.Jump_returnContext ctx) {
        Return name = new Return();
        nodeProperty.put(ctx, name);
    }

    @Override public void exitDeclaration_to_initlist(MisakaParser.Declaration_to_initlistContext ctx) {
        Type uhs = (Type) nodeProperty.get(ctx.type());
        nodeProperty.put(ctx, new Declaration(uhs));
    }

    @Override public void exitDeclaration_to_initlist2(MisakaParser.Declaration_to_initlist2Context ctx) {
        Type lhs = (Type) nodeProperty.get(ctx.type());
        Statement rhs = (Statement) nodeProperty.get(ctx.init_decl());
        nodeProperty.put(ctx, new Declaration2(lhs, rhs));
    }

    @Override public void exitInit_def(MisakaParser.Init_defContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.decl()));
    }

    @Override public void exitInit_decl_def(MisakaParser.Init_decl_defContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.decl());
        Statement rhs = (Statement) nodeProperty.get(ctx.initializer());
        nodeProperty.put(ctx, new InitDeclDef(lhs, rhs));
    }

    @Override public void exitDecl_brack(MisakaParser.Decl_brackContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.decl()));
    }

    @Override public void exitDecl_func(MisakaParser.Decl_funcContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.decl());
        Statement rhs = (Statement) nodeProperty.get(ctx.identifierList());
        nodeProperty.put(ctx, new DeclFunc(lhs, rhs));
    }

    @Override public void exitDecl_array(MisakaParser.Decl_arrayContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.decl());
        Statement rhs = (Statement) nodeProperty.get(ctx.assignment_expr());
        nodeProperty.put(ctx, new DeclArray(lhs, rhs));
    }

    @Override public void exitDecl_ID(MisakaParser.Decl_IDContext ctx) {
        ID name = new ID (ctx.ID().getText());
        nodeProperty.put(ctx, name);
        System.out.println(name.name);
    }

    @Override public void exitIDlist_def(MisakaParser.IDlist_defContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.identifierList());
        ID rhs = new ID (ctx.ID().getText());
        nodeProperty.put(ctx, new IDListDef(lhs, rhs));
    }

    @Override public void exitIDlist_to_ID(MisakaParser.IDlist_to_IDContext ctx) {
        ID name = new ID (ctx.ID().getText());
        nodeProperty.put(ctx, name);
    }

    @Override public void exitInitializer_to_assign(MisakaParser.Initializer_to_assignContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.assignment_expr()));
    }

    @Override public void exitInitializer_to_initializer_list(
            MisakaParser.Initializer_to_initializer_listContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.initializer_list()));
    }

    @Override public void exitInitializer_list_def(MisakaParser.Initializer_list_defContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.initializer_list());
        Statement rhs = (Statement) nodeProperty.get(ctx.initializer());
        nodeProperty.put(ctx, new InitListDef(lhs, rhs));
    }

    @Override public void exitInitializer_list_to_initializer(
            MisakaParser.Initializer_list_to_initializerContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.initializer()));
    }



















    @Override public void exitCompilation_unit_to_translation_unit(
            MisakaParser.Compilation_unit_to_translation_unitContext ctx) {
        System.out.println("EOF");
    }

    @Override public void exitCompilation_unit_to_translation_unit2(
            MisakaParser.Compilation_unit_to_translation_unit2Context ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.translation_unit()));
        System.out.println("CU");
    }

    @Override public void exitTranslation_unit_to_ex_declaration(
            MisakaParser.Translation_unit_to_ex_declarationContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.external_declaration()));
    }

    @Override public void exitTranslation_unit_list(MisakaParser.Translation_unit_listContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.translation_unit());
        Statement rhs = (Statement) nodeProperty.get(ctx.external_declaration());
        nodeProperty.put(ctx, new InitListDef(lhs, rhs));
    }

    @Override public void exitEx_declaration_to_class(MisakaParser.Ex_declaration_to_classContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.class_def()));
    }

    @Override public void exitEx_declaration_to_func(MisakaParser.Ex_declaration_to_funcContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.function_def()));
    }

    @Override public void exitEx_declaration_to_declaration(
            MisakaParser.Ex_declaration_to_declarationContext ctx) {
        nodeProperty.put(ctx, nodeProperty.get(ctx.declaration()));
    }

    @Override public void exitEx_declaration_stray(MisakaParser.Ex_declaration_strayContext ctx) {
        //';'
    }

    @Override public void exitClass_deff(MisakaParser.Class_deffContext ctx) {
        Statement lhs = (Statement) nodeProperty.get(ctx.decl());
        Statement rhs = (Statement) nodeProperty.get(ctx.compound_stmt());
        nodeProperty.put(ctx, new InitListDef(lhs, rhs));
    }

    @Override public void exitFunc_def(MisakaParser.Func_defContext ctx) {
        /*
        Statement hs1 = (Statement) nodeProperty.get(ctx.expr());
        Statement hs2 = (Statement) nodeProperty.get(ctx.stmt());
        Statement hs3 = (Statement) nodeProperty.get(ctx.stmt());
        3 what if repeat?
        */
    }

    @Override public void exitEveryRule(ParserRuleContext ctx) { }

    @Override public void visitErrorNode(ErrorNode node) { }
}

