package com.chunyan.daggertest.mvp.di;

import com.chunyan.daggertest.mvp.LoginActivity;

import dagger.Component;

/**
 * Created by machunyan on 2019/4/22.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {

    void inject(LoginActivity loginActivity);

}
