package com.example.android.trafficsign.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitCall {

    private static Retrofit retrofit = null;

    public static ApiService getAllSigns() {
        return getRetrofitClient(ApiService.BASE_URL).create(ApiService.class);
    }

    public static Retrofit getRetrofitClient(String url) {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}