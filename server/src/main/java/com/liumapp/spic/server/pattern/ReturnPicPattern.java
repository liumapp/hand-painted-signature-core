package com.liumapp.spic.server.pattern;

/**
 * file ReturnPicPattern.java
 * author liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/8/20
 */
public class ReturnPicPattern {

    //手绘签名图片的base64
    private String base64Pic;

    //图片picNo
    private String picNo;

    public ReturnPicPattern() {
    }

    public ReturnPicPattern(String base64Pic, String picNo) {
        this.base64Pic = base64Pic;
        this.picNo = picNo;
    }

    public String getBase64Pic() {
        return base64Pic;
    }

    public ReturnPicPattern setBase64Pic(String base64Pic) {
        this.base64Pic = base64Pic;
        return this;
    }

    public String getPicNo() {
        return picNo;
    }

    public ReturnPicPattern setPicNo(String picNo) {
        this.picNo = picNo;
        return this;
    }

    @Override
    public String toString() {
        return "ReturnPicPattern{" +
                "base64Pic='" + base64Pic + '\'' +
                ", picNo='" + picNo + '\'' +
                '}';
    }
}

