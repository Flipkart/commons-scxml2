/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.scxml;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * Test suite for the SCXML package.
 *
 */
public class SCXMLTestSuite extends TestCase {
    
    /**
     * Construct a new instance.
     */
    public SCXMLTestSuite(String name) {
        super(name);
    }

    /**
     * Command-line interface.
     */
    public static void main(String[] args) {
        TestRunner.run(suite());
    }

    /**
     * Get the suite of tests
     */
    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.setName("Commons-SCXML Tests");
        suite.addTest(BuiltinTest.suite());
        suite.addTest(EventDataTest.suite());
        suite.addTest(NamespacePrefixedXPathsTest.suite());
        suite.addTest(SCInstanceTest.suite());
        suite.addTest(SCXMLExecutorTest.suite());
        suite.addTest(SCXMLHelperTest.suite());
        suite.addTest(StatusTest.suite());
        suite.addTest(TieBreakerTest.suite());
        suite.addTest(TriggerEventTest.suite());
        suite.addTest(WildcardTest.suite());
        suite.addTest(WizardsTest.suite());
        return suite;
    }
}