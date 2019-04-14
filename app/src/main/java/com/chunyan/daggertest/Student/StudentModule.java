package com.chunyan.daggertest.Student;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {

    @Provides
    Student providesPerson() {
        return new Student();
    }

}
