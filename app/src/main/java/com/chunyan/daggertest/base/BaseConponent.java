package com.chunyan.daggertest.base;

import com.chunyan.daggertest.Student.Student;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = BaseModule.class)
public interface BaseConponent {
    void join(MyApplication application);

    Student get();
}
