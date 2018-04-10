package com.soccerfield.entity;

public class User {
    private Integer userid;

    private String upassword;

    private String username;

    private String utelphone;

    private String upersonid;

    private String uicon;

    private Integer uaccess;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUtelphone() {
        return utelphone;
    }

    public void setUtelphone(String utelphone) {
        this.utelphone = utelphone == null ? null : utelphone.trim();
    }

    public String getUpersonid() {
        return upersonid;
    }

    public void setUpersonid(String upersonid) {
        this.upersonid = upersonid == null ? null : upersonid.trim();
    }

    public String getUicon() {
        return uicon;
    }

    public void setUicon(String uicon) {
        this.uicon = uicon == null ? null : uicon.trim();
    }

    public Integer getUaccess() {
        return uaccess;
    }

    public void setUaccess(Integer uaccess) {
        this.uaccess = uaccess;
    }
}