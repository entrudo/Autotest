package com.company.Lessons_home_Work.Lesson7_less_Work;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {
    private int step = 0;

    public void log(String str){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = simpleDateFormat.format(new Date());
        step ++;
        str = step + ") " + time + " [" + Thread.currentThread().getName() + "] " + str;
        System.out.println(str);

    }
}
