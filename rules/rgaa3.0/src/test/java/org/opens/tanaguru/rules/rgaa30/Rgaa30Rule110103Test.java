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
package org.opens.tanaguru.rules.rgaa30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.opens.tanaguru.entity.audit.ProcessRemark;
import org.opens.tanaguru.entity.audit.ProcessResult;
import org.opens.tanaguru.entity.audit.SourceCodeRemark;
import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.rgaa30.test.Rgaa30RuleImplementationTestCase;
import org.opens.tanaguru.rules.keystore.HtmlElementStore;
import org.opens.tanaguru.rules.keystore.RemarkMessageStore;

/**
 * Unit test class for the implementation of the rule 11.01.03 of the
 * referential Rgaa 3.0.
 */
public class Rgaa30Rule110103Test extends Rgaa30RuleImplementationTestCase {

    public Rgaa30Rule110103Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName("org.opens.tanaguru.rules.rgaa30.Rgaa30Rule110103");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A01",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A01.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A02",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A02.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A03",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A03.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A04",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A04.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A05",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A05.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A06",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A06.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-1Passed-A07",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-1Passed-A07.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-2Failed-A01",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-2Failed-A01.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-2Failed-A02",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-2Failed-A02.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-2Failed-A03",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-2Failed-A03.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-2Failed-A04",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-2Failed-A04.html"));
        getWebResourceMap().put("Rgaa30.Test.11.01.03-4NA-A01",
                getWebResourceFactory().createPage(
                        getTestcasesFilePath() + "rgaa30/Rgaa30Rule110103/Rgaa30.Test.11.01.03-4NA-A01.html"));
    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------1Passed-A01-----------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A01");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A02-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A02");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A03-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A03");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A04-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A04");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A05-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A05");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A06-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A06");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------1Passed-A07-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-1Passed-A07");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());

        //----------------------------------------------------------------------
        //------------------------------2Failed-A01-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-2Failed-A01");
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        SourceCodeRemark processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.INPUT_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertNull(processRemark.getElementList());

        //----------------------------------------------------------------------
        //------------------------------2Failed-A02-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-2Failed-A02");
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.INPUT_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertNull(processRemark.getElementList());

        //----------------------------------------------------------------------
        //------------------------------2Failed-A03-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-2Failed-A03");
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(3, processResult.getRemarkSet().size());
        Collection<ProcessRemark> remarkSet = processResult.getRemarkSet();
        Iterator it = remarkSet.iterator();
        processRemark = ((SourceCodeRemark) it.next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.INPUT_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        processRemark = ((SourceCodeRemark) it.next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.SPAN_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        processRemark = ((SourceCodeRemark) it.next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITH_NOT_UNIQUE_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.SPAN_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertNull(processRemark.getElementList());

        //----------------------------------------------------------------------
        //------------------------------2Failed-A04-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-2Failed-A04");
        // check number of elements in the page
        assertEquals(2, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.FORM_ELEMENT_WITHOUT_LABEL_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.INPUT_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertNull(processRemark.getElementList());

        //----------------------------------------------------------------------
        //------------------------------4NA-A01---------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.11.01.03-4NA-A01");
        // check test result
        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());

    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A02").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A03").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A04").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A05").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A06").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.11.01.03-1Passed-A07").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.11.01.03-2Failed-A01").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.11.01.03-2Failed-A02").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.11.01.03-2Failed-A03").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.11.01.03-2Failed-A04").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Rgaa30.Test.11.01.03-4NA-A01").getValue());

    }

}
