package com.company.Lessons_home_Work.Lesson19_Home_Work;

public class Start {

    public static void main(String[] args) {
        Url url = new Url()
                .setProtocol("https://")
                .setDomen("google.com.ua")
                .setPath("search")
                .setParam("q", "java")
                .setParam("", "jre")
                .setParam("et", "")
                .setParam("test", "yep")
                .build();

        System.out.println(url.toString());

        Url url2 = new Url()
//                .setParam("q", "java")
                .build();
        System.out.println(url2);
    }



}
