package com.company.Lessons_home_Work.Lesson9_less_Work;


public class TestServer {
    public static String server(){
        TestLogger testLogger = new TestLogger();
        String server = System.getenv("testEnvironment");
        switch (server){
            case ("test1"):
                testLogger.INFO("Testing serer #1");
                return server = "Testing serer #1";
            case ("test2"):
                testLogger.INFO("Testing serer #2");
                return server = "Testing serer #2";
            case ("production"):
                testLogger.INFO("Production server");
                return server = "Production server";
            default:
                testLogger.INFO("We don't have any test server");
                return server = "Null";
        }
    }
}
