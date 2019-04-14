package com.chunyan.daggertest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.chunyan.daggertest.Student.Student;
import com.chunyan.daggertest.base.MyApplication;
import com.chunyan.daggertest.person.DaggerPersonConponent;
import com.chunyan.daggertest.person.Person;
import com.chunyan.daggertest.person.PersonModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Person person1;
    @Inject
    Person person2;
    @Inject
    Student student1;
    @Inject
    Student student2;


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        DaggerPersonConponent.builder()
                .personModule(new PersonModule(this))
                //   ①    .studentConponet(DaggerStudentConponet.create())
                .baseConponent(((MyApplication) getApplication()).getBaseConponent())
                .build()
                .join(this);

        textView.setText(person1.toString() + "\n" + person2.toString() + "\n"
                + student1.toString() + "\n" + student2.toString());

        Log.e("MainActivity", person1.toString());
        Log.e("MainActivity", person2.toString());
        Log.e("MainActivity", student1.toString());
        Log.e("MainActivity", student2.toString());

    }

    public void 跳转(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
