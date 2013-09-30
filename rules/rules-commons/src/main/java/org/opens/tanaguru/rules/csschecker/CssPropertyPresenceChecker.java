/*
 *  Tanaguru - Automated webpage assessment
 *  Copyright (C) 2008-2013  Open-S Company
 * 
 *  This file is part of Tanaguru.
 * 
 *  Tanaguru is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 * 
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 *  Contact us by mail: open-s AT open-s DOT com
 */

package org.opens.tanaguru.rules.csschecker;

import com.phloc.css.decl.CascadingStyleSheet;
import java.util.Arrays;
import java.util.Collection;
import org.opens.tanaguru.processor.SSPHandler;
import org.opens.tanaguru.ruleimplementation.TestSolutionHandler;
import org.opens.tanaguru.rules.cssvisitor.CssPropertyPresenceCSSVisitor;

/**
 * This checker enables to control that some css properties are present among 
 * all the selectors of the page.
 * 
 * @author jkowalczyk
 */
public class CssPropertyPresenceChecker extends SimpleCssChecker {

    /**
     * 
     * @param cssVisitor 
     */
    public CssPropertyPresenceChecker (String propertyName) {
        setCssVisitor(new CssPropertyPresenceCSSVisitor(Arrays.asList(propertyName)));
    }
    
    /**
     * 
     * @param cssVisitor 
     */
    public CssPropertyPresenceChecker (Collection<String> propertyNameList) {
        setCssVisitor(new CssPropertyPresenceCSSVisitor(propertyNameList));
    }
    
    @Override
    public void check(
            SSPHandler sspHandler, 
            String styleSheetName, 
            CascadingStyleSheet cascadingStyleSheet, 
            TestSolutionHandler testSolutionHandler) {
        super.check(sspHandler, styleSheetName, cascadingStyleSheet, testSolutionHandler);
    }

}