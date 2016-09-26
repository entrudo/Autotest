package com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Factory;

import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.API.TestBrowserCreator;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum.BrowserType;

public class RemoteTestBrowser implements TestBrowserCreator {
    @Override
    public String createBrowser() {
        BrowserType browserT = BrowserType.getString("SAFARI");
        String browser = "";

        switch (browserT){
            case CHROME :
                browser = "Google Chrome";
                break;
            case FIREFOX:
                browser = "Mozilla FieFox";
                break;
            case IE:
                browser = "Internet Explorer";
                break;
            case SAFARI:
                browser = "Safari";
                break;
            default:
                return "Sorry";
        }

        return browser;
    }
}
