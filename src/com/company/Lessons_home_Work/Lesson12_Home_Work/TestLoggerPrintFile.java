package com.company.Lessons_home_Work.Lesson12_Home_Work;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestLoggerPrintFile implements TestLogger {

    private int step = 0;

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

    @Override
    public void printFile(String str) throws IOException {
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
}
