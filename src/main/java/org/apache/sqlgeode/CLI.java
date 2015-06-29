package org.apache.sqlgeode;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.Statements;
import net.sf.jsqlparser.util.deparser.ExpressionDeParser;

import java.util.List;
import java.util.Stack;

public class CLI {

  public static void main(String[] args) throws JSQLParserException {
    evaluate(args[0]);
  }

  public static void evaluate(String expr) throws JSQLParserException {
    final Stack<Long> stack = new Stack<Long>();
    Statements statements = CCJSqlParserUtil.parseStatements(expr);
    Parser parser = new Parser();
    StringBuilder b = new StringBuilder();
    statements.accept(parser);
    List<Statement> grr = statements.getStatements();

    System.out.println(expr + " = " + grr.size() );
  }
}
