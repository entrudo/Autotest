package com.company.Lessons_home_Work.Lesson15_Less_Work.Task2;

import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.API.TestBrowserCreator;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.API.TestBrowserManger;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum.RunOn;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Factory.BuildServerTestBrowser;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Factory.LocalTestBrowser;
import com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Factory.RemoteTestBrowser;

public class DefaultBrowser implements TestBrowserManger {

    private TestBrowserCreator browserCreator = null;
    RunOn runOn = RunOn.getString("BUILDSERVER");

    @Override
    public String getTestBrowser() {
        System.out.println(runOn);
        switch (runOn){
            case BUILDSERVER:
                browserCreator = new BuildServerTestBrowser();
                System.out.println("TEST");
                break;
            case LOCAL:
                browserCreator = new LocalTestBrowser();
                break;
            case REMONE:
                browserCreator = new RemoteTestBrowser();
                break;
            default:
                System.out.println("Sorry");
                break;
        }
        return null;
    }

    @Override
    public void destroyTestBrowser(String testBrowser) {
        System.out.println("delete");
    }
}
