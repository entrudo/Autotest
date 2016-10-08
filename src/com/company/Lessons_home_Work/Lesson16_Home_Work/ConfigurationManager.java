package com.company.Lessons_home_Work.Lesson16_Home_Work;

import com.company.Lessons_home_Work.Lesson16_Home_Work.Environment.Browser;
import com.company.Lessons_home_Work.Lesson16_Home_Work.Environment.TestServer;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if(instance == null)
            return new ConfigurationManager();
        return instance;
    }

    public String getTestBrowser() {
        return Browser.browser();
    }

    public String getTestEnvironment() {
        return TestServer.server();
    }
}
