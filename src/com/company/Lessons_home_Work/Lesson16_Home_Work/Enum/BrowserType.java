package com.company.Lessons_home_Work.Lesson16_Home_Work.Enum;

public enum BrowserType {
    CHROME("Google Chrome"),
    FIREFOX("Mozila FireFox"),
    SAFARI("Safari browser");

    private String browser;

    BrowserType(String browser) {
        this.browser = browser;
    }

    public String getNameBrowser() {
        return browser;
    }

    public static BrowserType getBrowser (String str){
        return BrowserType.valueOf(str);
    }
}
