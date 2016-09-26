package com.company.Lessons_home_Work.Lesson16_Home_Work.Environment;

import com.company.Lessons_home_Work.Lesson16_Home_Work.Enum.BrowserType;
import com.company.Lessons_home_Work.Lesson16_Home_Work.TestLogger.TestLogger;

public class Browser {

    public static String browser(){
        BrowserType browserType = BrowserType.getBrowser(System.getenv("testBrowser").toUpperCase());
        TestLogger testLogger = new TestLogger();
        switch (browserType){
            case CHROME:
                testLogger.INFO("Google Chrome latest version");
                return browserType.getNameBrowser();
            case SAFARI:
                testLogger.INFO("Safari browser latest version");
                return browserType.getNameBrowser();
            case FIREFOX:
                testLogger.INFO("Mozilla Firefox latest version");
                return browserType.getNameBrowser();
            default:
                testLogger.INFO("We don't have any browsers");
                return "We don't have any browser";
        }
    }
}
