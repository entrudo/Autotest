package com.company.Lessons_home_Work.Lesson9_less_Work;

public class Browser {

    public static String browser(){
        TestLogger testLogger = new TestLogger();
        String browser = System.getenv("testBrowser");
        switch (browser){
            case ("Chrome"):
                testLogger.INFO("Google Chrome latest version");
                return browser = "Google Chrome";
            case ("IE"):
                testLogger.INFO("Internet Explorer version 8.0");
                return browser = "Internet Explorer";
            case ("FireFox"):
                testLogger.INFO("Mozilla Firefox latest version");
                return browser = "Mozilla Firefox";
            default:
                testLogger.INFO("We don't have any browsers");
                return browser = "Null";
        }
    }
}
