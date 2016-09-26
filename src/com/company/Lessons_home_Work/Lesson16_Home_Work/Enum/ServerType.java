package com.company.Lessons_home_Work.Lesson16_Home_Work.Enum;

public enum ServerType {
    LOCAL("Testing local serer #1"),
    REMOTE("Testing remote serer"),
    PRODACTION("Production server");

    private String serverName;

    ServerType(String s) {
        this.serverName = s;
    }

    public String getServerName() {
        return serverName;
    }

    public static ServerType getServer (String str){
        return ServerType.valueOf(str);
    }
}
