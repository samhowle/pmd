/*
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.ecmascript.ast;

import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.XmlPropRef;

import net.sourceforge.pmd.annotation.InternalApi;

public class ASTXmlPropRef extends AbstractEcmascriptNode<XmlPropRef> {
    @Deprecated
    @InternalApi
    public ASTXmlPropRef(XmlPropRef xmlPropRef) {
        super(xmlPropRef);

        Name propName = xmlPropRef.getPropName();
        if (propName != null) {
            super.setImage(propName.getIdentifier());
        }
    }

    @Override
    public Object jjtAccept(EcmascriptParserVisitor visitor, Object data) {
        return visitor.visit(this, data);
    }
}
