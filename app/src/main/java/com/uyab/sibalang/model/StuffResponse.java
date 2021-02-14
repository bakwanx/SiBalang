package com.uyab.sibalang.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class StuffResponse {
    @SerializedName("errCode")
    private String errCode;
    @SerializedName("message")
    private String message;
    @SerializedName("stuffs")
    private ArrayList<Stuff> stuff;

    public StuffResponse(String errCode, String message, ArrayList<Stuff> stuff) {
        this.errCode = errCode;
        this.message = message;
        this.stuff = stuff;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<Stuff> getStuff() {
        return stuff;
    }

    public void setStuff(ArrayList<Stuff> stuff) {
        this.stuff = stuff;
    }
}
