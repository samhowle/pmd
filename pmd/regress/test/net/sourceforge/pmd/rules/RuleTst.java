package test.net.sourceforge.pmd.rules;

/**
 * RuleTst
 *
 * Extend your Rule TestCases from here to get some
 * juicy code sharing.
 */

import java.io.InputStream;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.ArrayList;

import junit.framework.TestCase;

import net.sourceforge.pmd.*;
import net.sourceforge.pmd.rules.UnusedLocalVariableRule;
import net.sourceforge.pmd.ast.*;

public class RuleTst
    extends TestCase
{
    public RuleTst( String name ) {
	super( name );
    }

    public Report process( String fileName,
			   Rule rule )
	throws Throwable
    {
        PMD p = new PMD();
        RuleContext ctx = new RuleContext();
        ctx.setReport(new Report("xml", fileName));
        p.processFile(fileName, getClass().getClassLoader().getResourceAsStream(fileName), rule, ctx);
        return ctx.getReport();

    }
}
