package com.chunyan.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.chunyan.daggertest.Student.Student;
import com.chunyan.daggertest.base.MyApplication;
import com.chunyan.daggertest.person.DaggerPersonConponent;
import com.chunyan.daggertest.person.Person;
import com.chunyan.daggertest.person.PersonModule;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    Person person1;
    @Inject
    Person person2;
    @Inject
    Student student1;
    @Inject
    Student student2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        DaggerPersonConponent.builder()
                .personModule(new PersonModule(this))
                .baseConponent(((MyApplication) getApplication()).getBaseConponent())
                .build()
                .join(this);
        Log.e("SecondActivity", person1.toString());
        Log.e("SecondActivity", person2.toString());
        Log.e("SecondActivity", student1.toString());
        Log.e("SecondActivity", student2.toString());


    }
}
