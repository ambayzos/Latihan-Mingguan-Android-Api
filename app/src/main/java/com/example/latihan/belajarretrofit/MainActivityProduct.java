package com.example.latihan.belajarretrofit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.latihan.belajarretrofit.adapter.AdapterProduct;
import com.example.latihan.belajarretrofit.entity.EntityProduct;
import com.example.latihan.belajarretrofit.entity.ResponseProduct;
import com.example.latihan.belajarretrofit.service.ApiClientProduct;
import com.example.latihan.belajarretrofit.service.ProducrtInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivityProduct extends AppCompatActivity {

    private RecyclerView rtv_product;
    private AdapterProduct adapterProduct;
    private ArrayList<EntityProduct> listEntity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_product);

        rtv_product = findViewById(R.id.rtv_product);
        adapterProduct = new AdapterProduct(listEntity, getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivityProduct.this);
        rtv_product.setLayoutManager(layoutManager);
        rtv_product.setAdapter(adapterProduct);
        ProducrtInterface producrtInterface = ApiClientProduct.getRetrofit().create(ProducrtInterface.class);
        Call<ResponseProduct> call = producrtInterface.getAllProduct();
        call.enqueue(new Callback<ResponseProduct>() {
            @Override
            public void onResponse(Call<ResponseProduct> call, Response<ResponseProduct> response) {

                List<EntityProduct> data = response.body().getData();
                System.out.println(response.body());
            }
            @Override
            public void onFailure(Call<ResponseProduct> call, Throwable t) {
                System.out.println("Error Cuyyyyyyy");

            }
        });

    }




}