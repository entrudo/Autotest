package com.company.Lessons_home_Work.Lesson11_Home_Work;

import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        TestloggerPrintStb testlogger = new TestloggerPrintStb();
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");

        TestLoggerPrintFile testLoggerPrintFile = new TestLoggerPrintFile();
        testLoggerPrintFile.printFile("-------- TEST START -----");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("------ TEST END --------");


    }
}
