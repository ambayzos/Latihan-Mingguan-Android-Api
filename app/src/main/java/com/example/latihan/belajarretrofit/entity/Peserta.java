package com.example.latihan.belajarretrofit.entity;

import com.google.gson.annotations.SerializedName;
public class Peserta {

    @SerializedName("id")
    private long id;
    @SerializedName("namaPeserta")
    private String namaPerserta;
    @SerializedName("batch")
    private String batch;
    @SerializedName("alamat")
    private String alamat;
    @SerializedName("nohp")
    private String nohp;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaPerserta() {
        return namaPerserta;
    }

    public void setNamaPerserta(String namaPerserta) {
        this.namaPerserta = namaPerserta;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNohp() {
        return nohp;
    }

    public void setNohp(String nohp) {
        this.nohp = nohp;
    }
}
