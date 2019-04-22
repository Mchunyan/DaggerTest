package com.chunyan.daggertest.mvp;

public interface LoginView {

    String userName();

    String password();

    void loginSuccess(String msg);
}
