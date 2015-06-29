package org.apache.sqlgeode;

import net.sf.jsqlparser.statement.SetStatement;
import net.sf.jsqlparser.statement.StatementVisitor;
import net.sf.jsqlparser.statement.Statements;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.create.index.CreateIndex;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.create.view.CreateView;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.drop.Drop;
import net.sf.jsqlparser.statement.execute.Execute;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.replace.Replace;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.truncate.Truncate;
import net.sf.jsqlparser.statement.update.Update;

/**
 * Created by posix4e on 6/28/15.
 */
public class Parser implements StatementVisitor {

  @Override
  public void visit(Select select) {

  }

  @Override
  public void visit(Delete delete) {

  }

  @Override
  public void visit(Update update) {

  }

  @Override
  public void visit(Insert insert) {

  }

  @Override
  public void visit(Replace replace) {

  }

  @Override
  public void visit(Drop drop) {

  }

  @Override
  public void visit(Truncate truncate) {

  }

  @Override
  public void visit(CreateIndex createIndex) {

  }

  @Override
  public void visit(CreateTable createTable) {

  }

  @Override
  public void visit(CreateView createView) {

  }

  @Override
  public void visit(Alter alter) {

  }

  @Override
  public void visit(Statements stmts) {

  }

  @Override
  public void visit(Execute execute) {

  }

  @Override
  public void visit(SetStatement set) {

  }
}
