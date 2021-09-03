package com.demo.mvp.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.demo.mvp.HomeActivity;
import com.demo.mvp.R;
import com.demo.mvp.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity implements LoginView, View.OnClickListener {

    private EditText edtUsername;
    private EditText edtPassword;
    private Button btnLogin;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);
        loginPresenter = new LoginPresenter(this);
        initView();
        initClick();
    }

    public void initView() {
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
    }

    public void initClick() {
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void loginSuccessful() {
        Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFail() {
        Toast.makeText(this, "Login Fail!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goHome() {
        startActivity(new Intent(this, HomeActivity.class));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnLogin) {
            String username = edtUsername.getText().toString();
            String password = edtPassword.getText().toString();
            loginPresenter.login(username, password);
        }
    }
}