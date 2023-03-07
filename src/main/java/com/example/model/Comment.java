package com.example.model;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Integer pid;

    private Integer uid;

    private Integer cid;

    private String content;

    private Date ptime;

    private Consumer consumer;

    private static final long serialVersionUID = 1L;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPtime() {
        return ptime;
    }

    public void setPtime(Date ptime) {
        this.ptime = ptime;
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

    @Override
    public String toString() {
        return "Comment{" +
                "pid=" + pid +
                ", uid=" + uid +
                ", cid=" + cid +
                ", content='" + content + '\'' +
                ", ptime=" + ptime +
                ", consumer=" + consumer +
                '}';
    }
}