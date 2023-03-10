package com.example.model;

import java.io.Serializable;

public class Merchant implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant.sid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    private Integer sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant.sname
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant.spasswd
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    private String spasswd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant.sphone
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    private String sphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column merchant.saddressid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    private Integer saddressid;

    private Area area;

    private String oldName;

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant.sid
     *
     * @return the value of merchant.sid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Merchant withSid(Integer sid) {
        this.setSid(sid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant.sid
     *
     * @param sid the value for merchant.sid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant.sname
     *
     * @return the value of merchant.sname
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Merchant withSname(String sname) {
        this.setSname(sname);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant.sname
     *
     * @param sname the value for merchant.sname
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant.spasswd
     *
     * @return the value of merchant.spasswd
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public String getSpasswd() {
        return spasswd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Merchant withSpasswd(String spasswd) {
        this.setSpasswd(spasswd);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant.spasswd
     *
     * @param spasswd the value for merchant.spasswd
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public void setSpasswd(String spasswd) {
        this.spasswd = spasswd == null ? null : spasswd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant.sphone
     *
     * @return the value of merchant.sphone
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public String getSphone() {
        return sphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Merchant withSphone(String sphone) {
        this.setSphone(sphone);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant.sphone
     *
     * @param sphone the value for merchant.sphone
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public void setSphone(String sphone) {
        this.sphone = sphone == null ? null : sphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column merchant.saddressid
     *
     * @return the value of merchant.saddressid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Integer getSaddressid() {
        return saddressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table merchant
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public Merchant withSaddressid(Integer saddressid) {
        this.setSaddressid(saddressid);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column merchant.saddressid
     *
     * @param saddressid the value for merchant.saddressid
     *
     * @mbg.generated Fri Jan 06 22:29:42 CST 2023
     */
    public void setSaddressid(Integer saddressid) {
        this.saddressid = saddressid;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", spasswd='" + spasswd + '\'' +
                ", sphone='" + sphone + '\'' +
                ", saddressid=" + saddressid +
                ", area=" + area +
                ", oldName='" + oldName + '\'' +
                '}';
    }
}