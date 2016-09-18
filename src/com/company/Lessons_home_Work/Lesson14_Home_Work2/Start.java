package com.company.Lessons_home_Work.Lesson14_Home_Work2;

public class Start {
    public static void main(String[] args) {
        Url url = Url.newBuilder()
                .setProtocol("https://")
                .setdomen("google.com.ua")
                .setpath("/search")
                .setparam("?q=java+builder")
                .build();

        System.out.println(url);
    }
}
