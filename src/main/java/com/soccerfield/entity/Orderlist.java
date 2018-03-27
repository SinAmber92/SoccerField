package com.soccerfield.entity;

import java.util.Date;

public class Orderlist {
    private Integer orderid;

    private Integer areaid;

    private Integer staid;

    private Date ordertime;

    private String orestarttime;

    private Integer userid;

    private String oname;

    private String otelphone;

    private Integer ototal;

    private Integer ocashpledge;

    private Integer ostatus;

    private Integer deletesign;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrestarttime() {
        return orestarttime;
    }

    public void setOrestarttime(String orestarttime) {
        this.orestarttime = orestarttime == null ? null : orestarttime.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getOtelphone() {
        return otelphone;
    }

    public void setOtelphone(String otelphone) {
        this.otelphone = otelphone == null ? null : otelphone.trim();
    }

    public Integer getOtotal() {
        return ototal;
    }

    public void setOtotal(Integer ototal) {
        this.ototal = ototal;
    }

    public Integer getOcashpledge() {
        return ocashpledge;
    }

    public void setOcashpledge(Integer ocashpledge) {
        this.ocashpledge = ocashpledge;
    }

    public Integer getOstatus() {
        return ostatus;
    }

    public void setOstatus(Integer ostatus) {
        this.ostatus = ostatus;
    }

    public Integer getDeletesign() {
        return deletesign;
    }

    public void setDeletesign(Integer deletesign) {
        this.deletesign = deletesign;
    }
}