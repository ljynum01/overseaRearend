package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class Invoice implements Serializable {

    private Integer pid;
    private Integer sid;
    private String cname;
    private String buyprice;
    private Integer inventory;
    private String paysum;
    private Date buytime;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getBuyprice() {
        return buyprice;
    }

    public void setBuyprice(String buyprice) {
        this.buyprice = buyprice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getPaysum() {
        return paysum;
    }

    public void setPaysum(String paysum) {
        this.paysum = paysum;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "pid=" + pid +
                ", sid=" + sid +
                ", cname='" + cname + '\'' +
                ", buyprice='" + buyprice + '\'' +
                ", inventory=" + inventory +
                ", paysum='" + paysum + '\'' +
                ", buytime=" + buytime +
                '}';
    }
}