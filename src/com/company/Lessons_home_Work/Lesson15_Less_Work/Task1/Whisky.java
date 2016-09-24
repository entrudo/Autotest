package com.company.Lessons_home_Work.Lesson15_Less_Work.Task1;

public enum Whisky {
    HankeyBannister("HankeyBannister", 5, true),
    GlenmorangirOrigin("GlenmorangirOrigin", 10, false),
    GlenFiddieh("GlenFiddieh", 12, false),
    Macallan("Macallan", 5, false),
    ChivasRegal("ChivasRegal", 17, true);

    private String name;
    private int age;
    private boolean solod;


    Whisky(String glenFiddieh, int i, boolean b) {
        this.name = glenFiddieh;
        this.age = i;
        this.solod = b;
    }

    public Whisky ret(){
        return this;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSolod() {
        return solod;
    }
}
