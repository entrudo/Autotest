package com.company.Lessons_home_Work.Lesson16_Home_Work.Environment;

import com.company.Lessons_home_Work.Lesson16_Home_Work.Enum.ServerType;
import com.company.Lessons_home_Work.Lesson16_Home_Work.TestLogger.TestLogger;

public class TestServer {
    public static String server(){
        ServerType serverType = ServerType.getServer(System.getenv("testEnvironment").toUpperCase());
        TestLogger testLogger = new TestLogger();
        switch (serverType){
            case LOCAL:
                testLogger.INFO("Testing local serer #1");
                return serverType.getServerName();
            case REMOTE:
                testLogger.INFO("Testing remote serer");
                return serverType.getServerName();
            case PRODACTION:
                testLogger.INFO("Production server");
                return serverType.getServerName();
            default:
                testLogger.INFO("We don't have any test server");
                return "We don't have any test server";
        }
    }
}
