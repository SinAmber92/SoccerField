package com.soccerfield.entity;

public class Stadium {
    private Integer staid;

    private String staname;

    private String staaddr;

    private String staintro;

    private String stapic;

    private String statel;

    private String staopentime;

    private String staclosetime;

    private String staunittime;

    private Integer sdelsign;

    public Integer getStaid() {
        return staid;
    }

    public void setStaid(Integer staid) {
        this.staid = staid;
    }

    public String getStaname() {
        return staname;
    }

    public void setStaname(String staname) {
        this.staname = staname == null ? null : staname.trim();
    }

    public String getStaaddr() {
        return staaddr;
    }

    public void setStaaddr(String staaddr) {
        this.staaddr = staaddr == null ? null : staaddr.trim();
    }

    public String getStaintro() {
        return staintro;
    }

    public void setStaintro(String staintro) {
        this.staintro = staintro == null ? null : staintro.trim();
    }

    public String getStapic() {
        return stapic;
    }

    public void setStapic(String stapic) {
        this.stapic = stapic == null ? null : stapic.trim();
    }

    public String getStatel() {
        return statel;
    }

    public void setStatel(String statel) {
        this.statel = statel == null ? null : statel.trim();
    }

    public String getStaopentime() {
        return staopentime;
    }

    public void setStaopentime(String staopentime) {
        this.staopentime = staopentime == null ? null : staopentime.trim();
    }

    public String getStaclosetime() {
        return staclosetime;
    }

    public void setStaclosetime(String staclosetime) {
        this.staclosetime = staclosetime == null ? null : staclosetime.trim();
    }

    public String getStaunittime() {
        return staunittime;
    }

    public void setStaunittime(String staunittime) {
        this.staunittime = staunittime == null ? null : staunittime.trim();
    }

    public Integer getSdelsign() {
        return sdelsign;
    }

    public void setSdelsign(Integer sdelsign) {
        this.sdelsign = sdelsign;
    }
}