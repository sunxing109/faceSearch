package com.face.face;

import org.springframework.stereotype.Component;

public class User {
    private String name;

    private String sex;

    private double faceFeature;

    private  String picturePath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getFaceFeature() {
        return faceFeature;
    }

    public void setFaceFeature(double faceFeature) {
        this.faceFeature = faceFeature;
    }

    public String getPicturePath() {
        return picturePath;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }
}
