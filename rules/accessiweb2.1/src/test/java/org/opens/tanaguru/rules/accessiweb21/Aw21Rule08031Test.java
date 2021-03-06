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

import org.opens.tanaguru.entity.audit.EvidenceElement;
import org.opens.tanaguru.entity.audit.ProcessRemark;
import org.opens.tanaguru.entity.audit.ProcessResult;
import org.opens.tanaguru.entity.audit.TestSolution;
import org.opens.tanaguru.rules.accessiweb21.handler.lang.LangRulesHandler;
import org.opens.tanaguru.rules.accessiweb21.test.Aw21RuleImplementationTestCase;

/**
 *
 * @author jkowalczyk
 */
public class Aw21Rule08031Test extends Aw21RuleImplementationTestCase {

    public Aw21Rule08031Test(String testName) {
        super(testName);
    }

    @Override
    protected void setUpRuleImplementationClassName() {
        setRuleImplementationClassName( "org.opens.tanaguru.rules.accessiweb21.Aw21Rule08031");
    }

    @Override
    protected void setUpWebResourceMap() {
        getWebResourceMap().put("AW21.Test.08.03.01-1Passed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-1Passed-01.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-1Passed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-1Passed-02.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-1Passed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-1Passed-03.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-1Passed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-1Passed-04.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-01",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-01.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-02",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-02.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-03",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-03.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-04",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-04.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-05",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-05.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-06",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-06.html"));
        getWebResourceMap().put("AW21.Test.08.03.01-2Failed-07",
                getWebResourceFactory().createPage(
                getTestcasesFilePath() + "AW21/Aw21Rule08031/AW21.Test.08.03.01-2Failed-07.html"));
    }

    @Override
    protected void setProcess() {
        ProcessResult processResult =
                processPageTest("AW21.Test.08.03.01-1Passed-01");
        assertEquals(TestSolution.PASSED, processResult.getValue());
        assertNull(processResult.getRemarkSet());

        processResult = processPageTest("AW21.Test.08.03.01-1Passed-02");
        assertEquals(TestSolution.PASSED, processResult.getValue());
        assertNull(processResult.getRemarkSet());

        processResult = processPageTest("AW21.Test.08.03.01-1Passed-03");
        assertEquals(TestSolution.PASSED, processResult.getValue());
        assertNull(processResult.getRemarkSet());

        processResult = processPageTest("AW21.Test.08.03.01-1Passed-04");
        assertEquals(TestSolution.PASSED, processResult.getValue());
        assertNull(processResult.getRemarkSet());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-01");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_WHOLE_PAGE_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-02");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-03");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-04");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-06");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-05");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());

        processResult = processPageTest("AW21.Test.08.03.01-2Failed-07");
        assertEquals(TestSolution.FAILED,processResult.getValue());
        assertEquals(LangRulesHandler.LANG_ATTRIBUTE_MISSING_ON_HTML_TAG_MSG_CODE,
                ((ProcessRemark)processResult.getRemarkSet().toArray()[0]).getMessageCode());
        assertEquals(1, processResult.getRemarkSet().size());
    }

    @Override
    protected void setConsolidate() {
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.08.03.01-1Passed-01").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.08.03.01-1Passed-02").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.08.03.01-1Passed-03").getValue());
        assertEquals(TestSolution.PASSED,
                consolidate("AW21.Test.08.03.01-1Passed-04").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-01").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-02").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-03").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-04").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-06").getValue());
        assertEquals(TestSolution.FAILED,
                consolidate("AW21.Test.08.03.01-2Failed-05").getValue());
    }

}