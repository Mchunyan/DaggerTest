package com.chunyan.daggertest.base;

import com.chunyan.daggertest.Student.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BaseModule {

    @Singleton
    @Provides
    Student provideStu() {
        return new Student();
    }
}
