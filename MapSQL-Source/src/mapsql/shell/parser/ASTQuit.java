/* Generated By:JJTree: Do not edit this line. ASTQuit.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package mapsql.shell.parser;

public
class ASTQuit extends SimpleNode {
  public ASTQuit(int id) {
    super(id);
  }

  public ASTQuit(MapSQL p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MapSQLVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=aeb062f058d4dbe5a1f50c52399f206d (do not edit this line) */