package com.example.latihan.belajarretrofit.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseProduct {

    @SerializedName("statusCode")
    private int statusCode;
    @SerializedName("pesan")
    private String pesan;
    @SerializedName("data")
    private List<EntityProduct> data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<EntityProduct> getData() {
        return data;
    }

    public void setData(List<EntityProduct> data) {
        this.data = data;
    }
}
