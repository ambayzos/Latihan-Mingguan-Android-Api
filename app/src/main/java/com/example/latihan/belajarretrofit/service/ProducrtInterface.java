package com.example.latihan.belajarretrofit.service;

import com.example.latihan.belajarretrofit.entity.ResponseProduct;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ProducrtInterface {
    @GET("/variant/")
    Call<ResponseProduct> getAllProduct();
}
