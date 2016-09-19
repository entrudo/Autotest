package com.company.Lessons_home_Work.Lesson14_Home_Work2;

public class Url {
    private String protocol = "http://";
    private String subDomen = "";
    private String domen = "google.com.ua";
    private String port = "";
    private String path = "/search";
    private String param = "";

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

        public builderUrl setSubDomen(String subDomen){
            Url.this.subDomen = subDomen;
            return this;
        }

        public builderUrl setDomen(String domen){
            Url.this.domen = domen;
            return this;
        }

        public builderUrl setPort(String protocol){
            Url.this.port = port;
            return this;
        }

        public builderUrl setPath(String path){
            Url.this.path = path;
            return this;
        }

        public builderUrl setParam(String param){
            Url.this.param += param;
            return this;
        }

        public Url build(){
            return Url.this;
        }
    }
}
