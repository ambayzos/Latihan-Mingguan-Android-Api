package com.example.latihan.belajarretrofit.service;

import com.example.latihan.belajarretrofit.entity.Responses;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PesertaInterface {
    @GET("/perserta/")
    Call<Responses> getAllPerserta();
}
