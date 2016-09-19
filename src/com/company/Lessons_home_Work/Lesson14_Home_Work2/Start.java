package com.company.Lessons_home_Work.Lesson14_Home_Work2;

public class Start {



    public static void main(String[] args) {
        Url url = Url.newBuilder()
                .setProtocol("https://")
                .setDomen("google.com.ua")
                .setPath("/search")
                .setParam("?q=java")
                .setParam("+builder")
                .build();

        System.out.println(url);

        Url url2 = Url.newBuilder()
                .setParam("?q=java")
                .build();
        System.out.println(url2);
    }
}
