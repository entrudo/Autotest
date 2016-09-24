package com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum;

/**
 * Created by Ent on 22.09.2016.
 */
public enum BrowserType {
    CHROME,
    FIREFOX,
    IE,
    SAFARI;

    public static BrowserType getString (String str){
        return BrowserType.valueOf(str);
    }
}
