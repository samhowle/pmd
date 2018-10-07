/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
/* Generated By:JJTree: Do not edit this line. ASTReferenceType.java */

package net.sourceforge.pmd.lang.java.ast;

/**
 * Represents a reference type, i.e. a {@linkplain ASTClassOrInterfaceType class or interface type},
 * or an array type.
 *
 * <pre>
 *
 *  ReferenceType ::= {@linkplain ASTPrimitiveType PrimitiveType} {@linkplain ASTAnnotation Annotation}* ( "[" "]" )+
 *                  | {@linkplain ASTClassOrInterfaceType ClassOrInterfaceType} {@linkplain ASTAnnotation Annotation}* ( "[" "]" )*
 *
 * </pre>
 *
 */
public class ASTReferenceType extends AbstractJavaTypeNode implements Dimensionable {

    private int arrayDepth;

    public ASTReferenceType(int id) {
        super(id);
    }

    public ASTReferenceType(JavaParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    @Override
    public Object jjtAccept(JavaParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }

    public void bumpArrayDepth() {
        arrayDepth++;
    }

    @Override
    public int getArrayDepth() {
        return arrayDepth;
    }

    @Override
    public boolean isArray() {
        return arrayDepth > 0;
    }

}