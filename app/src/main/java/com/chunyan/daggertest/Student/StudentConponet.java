package com.chunyan.daggertest.Student;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface StudentConponet {
    Student getStudent();
}
