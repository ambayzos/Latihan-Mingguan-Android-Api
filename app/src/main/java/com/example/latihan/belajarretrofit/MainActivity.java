package com.example.latihan.belajarretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.latihan.belajarretrofit.entity.Responses;
import com.example.latihan.belajarretrofit.service.ApiClient;
import com.example.latihan.belajarretrofit.service.PesertaInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PesertaInterface persertaInterface = ApiClient.getRetrofit().create(PesertaInterface.class);
        Call<Responses> call = persertaInterface.getAllPerserta();
        call.enqueue(new Callback<Responses>() {
            @Override
            public void onResponse(Call<Responses> call, Response<Responses> response) {
                System.out.println(response.body());
            }

            @Override
            public void onFailure(Call<Responses> call, Throwable t) {
                System.out.println("Erorr cuy");
            }
        });
    }
}