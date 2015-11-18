package com.dev.kiuby88.sunshine.app;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by Jose on 18/11/15.
 */
public class SunshineTestSuite extends TestSuite {

    public static Test suite() {
        return new TestSuiteBuilder(SunshineTestSuite.class)
                .includeAllPackagesUnderHere().build();
    }

    public SunshineTestSuite() {
        super();
    }

}
