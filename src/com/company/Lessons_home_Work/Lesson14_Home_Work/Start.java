package com.company.Lessons_home_Work.Lesson14_Home_Work;

public class Start {
    public static void main(String[] args) {
        Director director = new Director();
        UrlBuilder urlBuilder = new FinalUrlBuilder();
        director.setUrlBuilder(urlBuilder);
        director.constructUrl();

        Url Url  = director.getUrl();
        String url = Url.toString();
        System.out.println(url);
    }
}
