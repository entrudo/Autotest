package com.company.Lessons_home_Work.Lesson9_less_Work;

public class Task1 {
    public static void main(String[] args) {

        TestLogger testLogger = new TestLogger();
        ConfigurationManager conf = ConfigurationManager.getInstance();
        testLogger.log("Setup environment");
        ConfigurationManager.getInstance().getTestBrowser();
        ConfigurationManager.getInstance().getTestEnvironment();
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Do smth");
        testLogger.log("Cleaning");
        testLogger.INFO("Cleared up everything");

    }



}
