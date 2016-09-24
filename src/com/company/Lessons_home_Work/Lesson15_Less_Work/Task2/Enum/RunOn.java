package com.company.Lessons_home_Work.Lesson15_Less_Work.Task2.Enum;

public enum RunOn {
    LOCAL,
    BUILDSERVER,
    REMONE;

    public static RunOn getString (String str){
        return RunOn.valueOf(str);
    }
}
