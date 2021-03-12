package com.example.capstone_36;

public class Data_room1 {
    private int iv_profile;
    private String name;
    private String space;

    public Data_room1(int iv_profile, String name, String space) {
        this.iv_profile = iv_profile;
        this.name = name;
        this.space = space;
    }

    public int getIv_profile() {
        return iv_profile;
    }

    public void setIv_profile(int iv_profile) {
        this.iv_profile = iv_profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }
}
