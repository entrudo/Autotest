package com.company.Lessons_home_Work.Lesson15_Less_Work.Task2;

import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum.BrowserType;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum.RunOn;

public class Start{
    public static void main(String[] args) {
        DefaultBrowser defaultBrowser = new DefaultBrowser();
        System.out.println(defaultBrowser.getTestBrowser());
        defaultBrowser.destroyTestBrowser("testBrowser");

        System.out.println(BrowserType.getString("CHROME"));


    }
}
