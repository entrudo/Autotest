package com.company.Lessons_home_Work.Lesson18_Less_Work;


import java.io.IOException;

public class Start {
    public static void main(String[] args) throws IOException {
        TestloggerPrintStb testlogger = new TestloggerPrintStb();
        TestLoggerPrintFile testLoggerPrintFile = new TestLoggerPrintFile();

        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");
        testlogger.printStb("Do smth");

        testLoggerPrintFile.printFile("-------- TEST START -----");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("Do smth");
        testLoggerPrintFile.printFile("------ TEST END --------");


        testLoggerPrintFile.log("-------- TEST START -----");
        testLoggerPrintFile.log("Do smth");
        testLoggerPrintFile.log("Do smth");
        testLoggerPrintFile.log("Do smth");
        testLoggerPrintFile.log("Do smth");
        testLoggerPrintFile.log("------ TEST END --------");
        testLoggerPrintFile.writeFile();

    }
}
