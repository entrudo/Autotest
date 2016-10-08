package com.company.Lessons_home_Work.Lesson18_Less_Work;

import java.io.IOException;
import java.util.ArrayList;

public interface TestLogger {
    public void printStb(String str)  throws IOException;
    public void printFile(String str) throws IOException;
    public void writeFile() throws IOException;
    public void log(String str) throws IOException;
}
