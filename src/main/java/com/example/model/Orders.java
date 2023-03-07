package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class Orders implements Serializable {
    private Integer did;

    private Integer cid;

    private Integer uid;

    private Integer sid;

    private Date dtime;

    private Integer dstateid;

    private Integer status;

    private Integer number;

    private Goods goods;

    private Merchant merchant;

    private Consumer consumer;

    private  Integer value;

    private  String name;


    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getDtime() {
        return dtime;
    }

    public void setDtime(Date dtime) {
        this.dtime = dtime;
    }

    public Integer getDstateid() {
        return dstateid;
    }

    public void setDstateid(Integer dstateid) {
        this.dstateid = dstateid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @Override
//    public String toString() {
//        return "Orders{" +
//                "did=" + did +
//                ", cid=" + cid +
//                ", uid=" + uid +
//                ", sid=" + sid +
//                ", dtime=" + dtime +
//                ", dstateid=" + dstateid +
//                ", status=" + status +
//                ", number=" + number +
//                ", goods=" + goods +
//                ", merchant=" + merchant +
//                ", consumer=" + consumer +
//                '}';
//    }


    @Override
    public String toString() {
        return "Orders{" +
                "did=" + did +
                ", cid=" + cid +
                ", uid=" + uid +
                ", sid=" + sid +
                ", dtime=" + dtime +
                ", dstateid=" + dstateid +
                ", status=" + status +
                ", number=" + number +
                ", goods=" + goods +
                ", merchant=" + merchant +
                ", consumer=" + consumer +
                ", value=" + value +
                ", name=" + name +
                '}';
    }
}