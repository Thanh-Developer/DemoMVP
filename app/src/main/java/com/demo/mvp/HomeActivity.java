package com.demo.mvp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.demo.mvp.presenter.LoginPresenter;

public class HomeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
