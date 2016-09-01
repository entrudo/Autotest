package com.company.Lessons_home_Work.Lesson9_less_Work;

public class ConfigurationManager {
    private static ConfigurationManager instance = null;

    public static final String TEST_BROWSER = "testBrowser";
    public static final String TEST_ENVIRONMENT = "testEnvironment";

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        if(instance == null)
            return new ConfigurationManager();

        return instance;
    }

    public String getTestBrowser() {
        return getEnvironmentVariable(TEST_BROWSER, Browser.browser());
    }

    public String getTestEnvironment() {
        return getEnvironmentVariable(TEST_ENVIRONMENT, TestServer.server());
    }

    private String getEnvironmentVariable(String variable, String defaultValue) {
        return System.getenv(variable) != null? System.getenv(variable) : defaultValue;
    }
}
