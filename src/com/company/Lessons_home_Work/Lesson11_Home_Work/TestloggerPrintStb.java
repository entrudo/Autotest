package com.company.Lessons_home_Work.Lesson11_Home_Work;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestloggerPrintStb extends TestLogger {
    private int step = 0;

    @Override
    void printStb(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = simpleDateFormat.format(new Date());
        step ++;
        str = step + ") " + time + " [" + Thread.currentThread().getName() + "] " + str;
        System.out.println(str);
    }

    @Override
    void printFile(String str) {}
}
