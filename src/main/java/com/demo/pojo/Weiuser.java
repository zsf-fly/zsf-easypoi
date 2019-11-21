package com.demo.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

import java.io.Serializable;

public class Weiuser implements Serializable {
    @Excel(name = "id",orderNum = "1")
    private Integer id;

    @Excel(name = "openid",orderNum = "2")
    private String openid;

    @Excel(name = "nickname",orderNum = "3")
    private String nickname;

    @Excel(name = "sex",orderNum = "4")
    private Integer sex;

    @Excel(name = "city",orderNum = "5")
    private String city;

    @Excel(name = "country",orderNum = "6")
    private String country;

    @Excel(name = "province",orderNum = "7")
    private String province;

    @Excel(name = "headimgurl",orderNum = "8")
    private String headimgurl;

    @Excel(name = "subscribe",orderNum = "9")
    private String subscribe;

    @Excel(name = "language",orderNum = "10")
    private String language;

    @Excel(name = "remark",orderNum = "11")
    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getHeadimgurl() {
        return headimgurl;
    }

    public void setHeadimgurl(String headimgurl) {
        this.headimgurl = headimgurl == null ? null : headimgurl.trim();
    }

    public String getSubscribe() {
        return subscribe;
    }

    public void setSubscribe(String subscribe) {
        this.subscribe = subscribe == null ? null : subscribe.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}