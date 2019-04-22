package com.chunyan.daggertest.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.chunyan.daggertest.R;

public class LoginActivity extends AppCompatActivity implements LoginView {


    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public String userName() {
        return "admin";
    }

    @Override
    public String password() {
        return "123456";
    }

    @Override
    public void loginSuccess(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
