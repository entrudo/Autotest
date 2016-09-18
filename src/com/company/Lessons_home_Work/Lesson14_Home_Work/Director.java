package com.company.Lessons_home_Work.Lesson14_Home_Work;

public class Director {
    private UrlBuilder urlBuilder;

    public void setUrlBuilder(UrlBuilder urlBuilder){
        this.urlBuilder = urlBuilder;
    }

    public Url getUrl(){
        return urlBuilder.getUrl();
    }

    public void constructUrl() {
        urlBuilder.createUrl();
        urlBuilder.buildProtocol();
        urlBuilder.buildDomen();
        urlBuilder.buildDomen();
        urlBuilder.buildPath();
        urlBuilder.buildParam();
    }
}
