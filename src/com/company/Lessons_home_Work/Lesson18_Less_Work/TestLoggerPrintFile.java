package com.company.Lessons_home_Work.Lesson18_Less_Work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TestLoggerPrintFile implements TestLogger {

    private int step = 0;
    private ArrayList<String> list = new ArrayList<>();

    File file;
    FileWriter writer;

    public TestLoggerPrintFile() throws IOException {
        this.file = new File(Thread.currentThread().getName() + "_" + System.currentTimeMillis()+ ".txt");
        if (!file.exists()){
            file.createNewFile();
        }
    }

    @Override
    public void printStb(String str) {    }

    //old implements
    @Override
    public void printFile(String str) throws IOException {
        step = 0;
        if (str.equals("-------- TEST START -----") || str.equals("------ TEST END --------")){
            this.writer = new FileWriter(this.file.getName(), true);
            writer.write(str);
            writer.append('\n');
            writer.close();
        } else {
            step++;
            this.writer = new FileWriter(this.file.getName(), true);
            writer.write(step + ") " + "--> " + str);
            writer.append("\n");
            writer.close();
        }
    }

    @Override
    public void writeFile() throws IOException {
        step = 0;
        for (String s : list){
            if (s.equals("-------- TEST START -----") || s.equals("------ TEST END --------")){
            this.writer = new FileWriter(this.file.getName(), true);
            writer.write(s);
            writer.append('\n');
            writer.close();
        } else {
            step++;
            this.writer = new FileWriter(this.file.getName(), true);
            writer.write(step + ") " + "--> " + s);
            writer.append("\n");
            writer.close();
        }
        }

    }

    @Override
    public void log(String str) throws IOException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        String time = simpleDateFormat.format(new Date());
        step ++;
        str = step + ") " + time + " [" + Thread.currentThread().getName() + "] " + str;
        System.out.println(str);
        list.add(str);
    }
}
