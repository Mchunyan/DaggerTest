package com.chunyan.daggertest.mvp.di;

import com.chunyan.daggertest.mvp.LoginPresenter;
import com.chunyan.daggertest.mvp.LoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by machunyan on 2019/4/22.
 */
@Module
public class LoginModule {

    private LoginView loginView;

    public LoginModule(LoginView loginView) {
        this.loginView=loginView;
    }

    @Provides
    LoginView providesLoginView(){
        return loginView;
    }

    @Provides
    LoginPresenter providesLoginPresenter(LoginView loginView){
        return new LoginPresenter(loginView);
    }

}
