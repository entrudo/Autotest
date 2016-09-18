package com.company.Lessons_home_Work.Lesson14_Home_Work;

abstract class UrlBuilder {
    protected Url url;

    public Url getUrl() {
        return url;
    }

    public void createUrl() {
        url = new Url();
    }

    public abstract void buildProtocol();
    public abstract void buildDomen();
    public abstract void buildPath();
    public abstract void buildParam();

}
