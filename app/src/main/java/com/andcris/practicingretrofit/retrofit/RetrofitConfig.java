package com.andcris.practicingretrofit.retrofit;

import com.andcris.practicingretrofit.service.GorestService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;
    public static final String BASE_URL = "https://gorest.co.in/public/v1/";

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public GorestService getGorestService() {
        return this.retrofit.create(GorestService.class);
    }

}
