package com.example.colorlist;

public class ColorNameModel {

    public String hexCode;
    public String nameColor;

    public ColorNameModel(String hexCode, String nameColor){
        this.hexCode=hexCode;
        this.nameColor=nameColor;
    }

    public String getHexCode() {
        return hexCode;
    }

    public String getNameColor() {
        return nameColor;
    }
}
