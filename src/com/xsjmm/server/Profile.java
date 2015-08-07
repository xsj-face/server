package com.xsjmm.server;

/**
 * Created by chengbin on 15/8/7.
 */
public class Profile {
    private int id;
    private String name;
    private int gender;
    private String picUrl;

    public Profile(int id) {
        this.id = id;
    }

    public Profile(int id, String name, int gender, String picUrl) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.picUrl = picUrl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }
}
