/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2015  Tanaguru.org
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: tanaguru AT tanaguru DOT org
 */
package org.opens.tanaguru.rules.accessiweb21;

import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.accessiweb21.test.Aw21RuleImplementationTestCase;

/**
 *
 * @author jkowalczyk
 */
public class Aw21Rule09011Test extends Aw21RuleImplementationTestCase {
    
    public Aw21Rule09011Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.opens.tanaguru.rules.accessiweb21.Aw21Rule09011");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("AW21.Test.09.01.01-1Passed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule09011/AW21.Test.09.01.01-1Passed-01.html"));
        getWebResourceMap().put("AW21.Test.09.01.01-1Passed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule09011/AW21.Test.09.01.01-1Passed-02.html"));
        getWebResourceMap().put("AW21.Test.09.01.01-2Failed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule09011/AW21.Test.09.01.01-2Failed-01.html"));
        getWebResourceMap().put("AW21.Test.09.01.01-2Failed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule09011/AW21.Test.09.01.01-2Failed-02.html"));
    }

    @Override
    protected void setProcess() {
        assertEquals(TestSolution.PASSED,
                processPageTest("AW21.Test.09.01.01-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                processPageTest("AW21.Test.09.01.01-1Passed-02").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW21.Test.09.01.01-2Failed-01").getValue());
        assertEquals(TestSolution.FAILED,
                processPageTest("AW21.Test.09.01.01-2Failed-02").getValue());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.09.01.01-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.09.01.01-1Passed-02").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.09.01.01-2Failed-01").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.09.01.01-2Failed-02").getValue());
    }

}
