package com.company.Lessons_home_Work.Lesson14_Home_Work;

public class FinalUrlBuilder extends UrlBuilder {
    @Override
    public void buildProtocol() {
        url.setProtocol("https://");
    }

    @Override
    public void buildDomen() {
        url.setDomen("google.com.ua");
    }

    @Override
    public void buildPath() {
        url.setPath("/search");
    }

    @Override
    public void buildParam() {
        url.setParam("?q=java");
    }
}
