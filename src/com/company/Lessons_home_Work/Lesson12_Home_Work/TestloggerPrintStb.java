package com.company.Lessons_home_Work.Lesson12_Home_Work;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestloggerPrintStb implements TestLogger {
    private int step = 0;

    @Override
    public void printStb(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = simpleDateFormat.format(new Date());
        step ++;
        str = step + ") " + time + " [" + Thread.currentThread().getName() + "] " + str;
        System.out.println(str);
    }


    @Override
    public void printFile(String str) throws IOException {
    }
}
