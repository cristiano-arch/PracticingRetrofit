package com.andcris.practicingretrofit.view.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.andcris.practicingretrofit.databinding.ActivityMainBinding;
import com.andcris.practicingretrofit.models.GorestCatalog;
import com.andcris.practicingretrofit.retrofit.RetrofitConfig;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.mainActivityBtGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Call<GorestCatalog> call = new RetrofitConfig().getGorestService().findAll();
                call.enqueue(new Callback<GorestCatalog>() {
                    @Override
                    public void onResponse(Call<GorestCatalog> call, Response<GorestCatalog> response) {
                        if (!response.isSuccessful()) {
                            Log.e(TAG, "Response error: " + response.code());
                        } else {
                            GorestCatalog catalog = response.body();
                            Log.i(TAG, catalog.toString());
                        }
                    }

                    @Override
                    public void onFailure(Call<GorestCatalog> call, Throwable t) {
                        Log.e(TAG, "Failure error: " + t.getMessage());
                    }
                });
            }
        });
    }
}