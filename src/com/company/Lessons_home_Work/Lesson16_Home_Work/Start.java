package com.company.Lessons_home_Work.Lesson16_Home_Work;

import com.company.Lessons_home_Work.Lesson16_Home_Work.TestLogger.TestLogger;

public class Start {
    public static void main(String[] args) {

        TestLogger testLogger = new TestLogger();
        ConfigurationManager conf = ConfigurationManager.getInstance();
        testLogger.log("Setup environment");
        conf.getTestBrowser();
        conf.getTestEnvironment();
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Cleaning");
        testLogger.INFO("Cleared up everything");

    }



}
