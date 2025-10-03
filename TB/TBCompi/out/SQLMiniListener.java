// Generated from SQLMini.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLMiniParser}.
 */
public interface SQLMiniListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SQLMiniParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SQLMiniParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLMiniParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLMiniParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(SQLMiniParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(SQLMiniParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(SQLMiniParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(SQLMiniParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SQLMiniParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SQLMiniParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void enterTipoDato(SQLMiniParser.TipoDatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#tipoDato}.
	 * @param ctx the parse tree
	 */
	void exitTipoDato(SQLMiniParser.TipoDatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#dato}.
	 * @param ctx the parse tree
	 */
	void enterDato(SQLMiniParser.DatoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#dato}.
	 * @param ctx the parse tree
	 */
	void exitDato(SQLMiniParser.DatoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMiniParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(SQLMiniParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMiniParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(SQLMiniParser.BoolContext ctx);
}