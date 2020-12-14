package com.example.android.trafficsign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.android.trafficsign.model.SignModel;
import com.example.android.trafficsign.networking.ApiService;
import com.example.android.trafficsign.networking.RetrofitCall;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<SignModel> signModelList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        network();
    }

    public void network(){
        RetrofitCall.getAllSigns().getSigns().enqueue(new Callback<List<SignModel>>() {
            @Override
            public void onResponse(Call<List<SignModel>> call, Response<List<SignModel>> response) {
                signModelList = response.body();
                Log.d("sign name: ", signModelList.get(0).getName());
            }

            @Override
            public void onFailure(Call<List<SignModel>> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }
}