package com.company.Lessons_home_Work.Lesson14_Home_Work;

public class Url {
    private String protocol;
    private String domen;
    private String path;
    private String param;

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public void setDomen(String domen) {
        this.domen = domen;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setParam(String param) {
        this.param = param;
    }

    @Override
    public String toString() {
        return protocol + domen + path + param;
    }
}
