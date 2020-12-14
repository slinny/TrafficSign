package com.example.android.trafficsign.networking;

import com.example.android.trafficsign.model.SignModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    public static final String BASE_URL = "https://iatg.carsprogram.org";

    @GET("/signs_v1/api/signs")
    Call<List<SignModel>> getSigns();
}
