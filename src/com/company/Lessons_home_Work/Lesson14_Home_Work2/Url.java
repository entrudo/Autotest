package com.company.Lessons_home_Work.Lesson14_Home_Work2;

public class Url {
    private String protocol;
    private String domen;
    private String path;
    private String param;

    private Url(){    }

    public String getProtocol() {
        return protocol;
    }

    public String getDomen() {
        return domen;
    }

    public String getPath() {
        return path;
    }

    public String getParam() {
        return param;
    }

    @Override
    public String toString() {
        return protocol + domen + path + param;
    }

    public static builderUrl newBuilder() {
        return new Url().new builderUrl();
    }

    public class builderUrl{
        private builderUrl(){}

        public builderUrl setProtocol(String protocol){
            Url.this.protocol = protocol;
            return this;
        }

        public builderUrl setdomen(String domen){
            Url.this.domen = domen;
            return this;
        }

        public builderUrl setpath(String path){
            Url.this.path = path;
            return this;
        }

        public builderUrl setparam(String param){
            Url.this.param = param;
            return this;
        }

        public Url build(){
            return Url.this;
        }
    }
}
