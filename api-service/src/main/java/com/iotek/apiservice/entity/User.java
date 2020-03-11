package com.iotek.apiservice.entity;



import java.io.Serializable;
import java.util.Date;


public class User implements Serializable {
    /**
     * 
     */
    private Integer uid;

    /**
     * 
     */
    private String uname;

    /**
     * 
     */
    private String pwd;

    /**
     * 手机
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 0学员  1教师 2管理员
     */
    private Integer type;

    /**
     * 所在班级
     */
    private Integer cid;

    /**
     * 入学时间
     */
    private Date timee;

    /**
     * 图片地址
     */
    private String imgurl;

    /**
     * 
     * @return uid 
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 
     * @param uid 
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 
     * @return uname 
     */
    public String getUname() {
        return uname;
    }

    /**
     * 
     * @param uname 
     */
    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    /**
     * 
     * @return pwd 
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 
     * @param pwd 
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * 手机
     * @return phone 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机
     * @param phone 手机
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 地址
     * @return address 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 0学员  1教师 2管理员
     * @return type 0学员  1教师 2管理员
     */
    public Integer getType() {
        return type;
    }

    /**
     * 0学员  1教师 2管理员
     * @param type 0学员  1教师 2管理员
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 所在班级
     * @return cid 所在班级
     */
    public Integer getCid() {
        return cid;
    }

    /**
     * 所在班级
     * @param cid 所在班级
     */
    public void setCid(Integer cid) {
        this.cid = cid;
    }

    /**
     * 入学时间
     * @return timee 入学时间
     */
    public Date getTimee() {
        return timee;
    }

    /**
     * 入学时间
     * @param timee 入学时间
     */
    public void setTimee(Date timee) {
        this.timee = timee;
    }

    /**
     * 图片地址
     * @return imgurl 图片地址
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 图片地址
     * @param imgurl 图片地址
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }
}