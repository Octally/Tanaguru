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

import java.util.LinkedHashSet;
import org.opens.tanaguru.entity.audit.ProcessResult;
import org.opens.tanaguru.entity.audit.SourceCodeRemark;
import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.rgaa30.test.Rgaa30RuleImplementationTestCase;
import org.opens.tanaguru.rules.keystore.EvidenceStore;
import org.opens.tanaguru.rules.keystore.HtmlElementStore;
import org.opens.tanaguru.rules.keystore.RemarkMessageStore;

/**
 *
 * @author jkowalczyk
 */
public class Rgaa30Rule090102Test extends Rgaa30RuleImplementationTestCase {

    public Rgaa30Rule090102Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName(
                "org.opens.tanaguru.rules.rgaa30.Rgaa30Rule090102");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-02.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-03.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-04.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-05.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-06",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-06.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-07",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-07.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-08",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-08.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-09",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-09.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-A01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-A01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-A02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-A02.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-1Passed-A03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-1Passed-A03.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-02.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-03.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-04.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-05.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-06",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-06.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-A01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-A01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-A02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-A02.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-2Failed-A03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-2Failed-A03.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-4NA-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-4NA-01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-4NA-A01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-4NA-A01.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-4NA-A02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-4NA-A02.html"));
        getWebResourceMap().put("Rgaa30.Test.09.01.02-4NA-A03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "rgaa30/Rgaa30Rule090102/Rgaa30.Test.09.01.02-4NA-A03.html"));
    }

    @Override
    protected void setProcess() {
        //----------------------------------------------------------------------
        //------------------------------1Passed-01------------------------------
        //----------------------------------------------------------------------
        ProcessResult processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-01");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-02------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-02");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-03------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-03");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-04------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-04");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(4, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-05------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-05");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(5, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-06------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-06");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(6, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-07------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-07");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(1, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-08------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-08");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(2, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-09------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-09");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(2, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-A01-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-A01");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-A02-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-A02");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(6, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------1Passed-A03-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-1Passed-A03");
        // check test result
        assertEquals(TestSolution.PASSED, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
        // check number of elements in the page
        assertEquals(8, processResult.getElementCounter());


        //----------------------------------------------------------------------
        //------------------------------2Failed-01------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-01");
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        SourceCodeRemark processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H3_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h1", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-02------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-02");
        // check number of elements in the page
        assertEquals(5, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H1_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h2", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.FIRST_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-03------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-03");
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H4_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h2", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-04------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-04");
        // check number of elements in the page
        assertEquals(4, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H5_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h3", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-05------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-05");
        // check number of elements in the page
        assertEquals(5, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H6_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h4", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-06------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-06");
        // check number of elements in the page
        assertEquals(10, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.H6_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h4", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-A01------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-A01");
        // check number of elements in the page
        assertEquals(3, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.DIV_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("h1", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-A02-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-A02");
        // check number of elements in the page
        assertEquals(10, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.DIV_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("div role=\"heading\" aria-level=\"4\"", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------2Failed-A03-----------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-2Failed-A03");
        // check number of elements in the page
        assertEquals(5, processResult.getElementCounter());
        // check test result
        assertEquals(TestSolution.FAILED, processResult.getValue());
        // check number of remarks and their value
        assertEquals(1, processResult.getRemarkSet().size());
        processRemark = ((SourceCodeRemark) ((LinkedHashSet) processResult.getRemarkSet()).iterator().next());
        assertEquals(RemarkMessageStore.HEADER_NOT_HIERARCHICALLY_WELL_DEFINED_MSG, processRemark.getMessageCode());
        assertEquals(TestSolution.FAILED, processRemark.getIssue());
        assertEquals(HtmlElementStore.DIV_ELEMENT, processRemark.getTarget());
        assertNotNull(processRemark.getSnippet());
        // check number of evidence elements and their value
        assertEquals(1, processRemark.getElementList().size());
        assertEquals("div role=\"heading\" aria-level=\"1\"", processRemark.getElementList().iterator().next().getValue());
        assertEquals(EvidenceStore.PREVIOUS_H_TAG_INDEX_EE, processRemark.getElementList().
                iterator().next().getEvidence().getCode());


        //----------------------------------------------------------------------
        //------------------------------4NA-01----------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-4NA-01");
        // check test result
        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());

        
        //----------------------------------------------------------------------
        //------------------------------4NA-A01---------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-4NA-A01");
        // check test result
        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());

        
        //----------------------------------------------------------------------
        //------------------------------4NA-A02---------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-4NA-A02");
        // check test result
        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());

        
        //----------------------------------------------------------------------
        //------------------------------4NA-A03---------------------------------
        //----------------------------------------------------------------------
        processResult = processPageTest("Rgaa30.Test.09.01.02-4NA-A03");
        // check test result
        assertEquals(TestSolution.NOT_APPLICABLE, processResult.getValue());
        // check test has no remark
        assertNull(processResult.getRemarkSet());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-02").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-03").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-04").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-05").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-06").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-07").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-08").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-09").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-A01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-A02").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("Rgaa30.Test.09.01.02-1Passed-A03").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-01").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-02").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-03").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-04").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-05").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-06").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-A01").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-A02").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("Rgaa30.Test.09.01.02-2Failed-A03").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Rgaa30.Test.09.01.02-4NA-01").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Rgaa30.Test.09.01.02-4NA-A01").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Rgaa30.Test.09.01.02-4NA-A02").getValue());
        assertEquals(TestSolution.NOT_APPLICABLE,
                consolidate("Rgaa30.Test.09.01.02-4NA-A03").getValue());
    }
}
