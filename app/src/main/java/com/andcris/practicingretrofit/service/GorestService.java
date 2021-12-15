package com.andcris.practicingretrofit.service;

import com.andcris.practicingretrofit.models.GorestCatalog;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GorestService {

    @GET("users")
    Call<GorestCatalog> findAll();
}
