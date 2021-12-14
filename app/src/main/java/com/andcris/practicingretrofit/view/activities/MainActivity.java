package com.andcris.practicingretrofit.view.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.andcris.practicingretrofit.R;
import com.andcris.practicingretrofit.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.mainActivityTvMainActivity.setText("MainActivity");

        System.out.println("This is my MainAcivity class");
    }
}