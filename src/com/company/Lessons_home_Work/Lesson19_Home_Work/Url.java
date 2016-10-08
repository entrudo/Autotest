package com.company.Lessons_home_Work.Lesson19_Home_Work;

import java.util.HashMap;

public class Url {
    private String protocol = "http://";
    private String subDomen = "";
    private String domen = "google.com.ua";
    private String port = "";
    private String path = "/search";
    private String param = "";
    private HashMap<String, String> map = new HashMap<>();

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

    public Url setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    public Url setSubDomen(String subDomen) {
        this.subDomen = subDomen;
        return this;
    }

    public Url setDomen(String domen) {
        this.domen = domen;
        return this;
    }

    public Url setPort(String port) {
        this.port = port;
        return this;
    }

    public Url setPath(String path) {
        if (!path.isEmpty()) {
            this.path = "/" + path;
        }
        return this;
    }

    public Url setParam(String str1, String str2) {
        if (!str1.isEmpty()){
            map.put(str1, str2);
        }
        return this;
    }

    public Url build(){
        if (!map.isEmpty()) {

            if (this.param.isEmpty()) {
                this.param = "?";
            }

            int count = 0;

            for (HashMap.Entry entry : map.entrySet()) {
                if (count > 0) {
                    this.param += "&";
                }

                if (String.valueOf(entry.getValue()).isEmpty()) {
                    this.param += String.valueOf(entry.getKey());
                } else {
                    this.param += String.valueOf(entry.getKey()) + "=" + String.valueOf(entry.getValue());
                }

                count++;
            }

            return Url.this;

        }else {
            this.path = "";
            return Url.this;
        }
    }

    @Override
    public String toString() {
        return protocol + domen + path + param;
    }

}
