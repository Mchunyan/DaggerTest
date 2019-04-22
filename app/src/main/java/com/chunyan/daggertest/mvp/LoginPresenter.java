package com.chunyan.daggertest.mvp;

public class LoginPresenter {
    private LoginView loginView;
    private LoginModules loginModule;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModule = new LoginModules();
    }

    public void loginPresenter() {
        loginView.loginSuccess(loginModule.login(loginView.userName(), loginView.password()));
    }
}
