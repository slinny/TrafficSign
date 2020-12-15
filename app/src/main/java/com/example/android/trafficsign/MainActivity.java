package com.example.android.trafficsign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.android.trafficsign.model.SignModel;
import com.example.android.trafficsign.networking.RetrofitCall;
import com.example.android.trafficsign.recyclerview.SignAdapter;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private List<SignModel> signModelList;
    private RecyclerView recyclerView;
    private SignAdapter signAdapter;
    private LinearLayoutManager linearLayoutManager;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        button = findViewById(R.id.refresh_button);

        network();
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                network();
            }
        });

        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
    }

    public void network(){
        RetrofitCall.getAllSigns().getSigns().enqueue(new Callback<List<SignModel>>() {
            @Override
            public void onResponse(Call<List<SignModel>> call, Response<List<SignModel>> response) {
                signModelList = response.body();
                Collections.sort(signModelList, new Comparator<SignModel>() {
                    @Override
                    public int compare(SignModel signModel1, SignModel signModel2) {
                        if(signModel1.getLastUpdated() > signModel2.getLastUpdated()){
                            return -1;
                        }else if(signModel1.getLastUpdated() < signModel2.getLastUpdated()){
                            return 1;
                        }else{
                            return 0;
                        }
                    }
                });
                signAdapter = new SignAdapter(signModelList);
                recyclerView.setAdapter(signAdapter);
            }

            @Override
            public void onFailure(Call<List<SignModel>> call, Throwable t) {
                Toast.makeText(getApplicationContext(),"Data Request Failed!",Toast.LENGTH_LONG).show();
                t.printStackTrace();
            }
        });
    }
}