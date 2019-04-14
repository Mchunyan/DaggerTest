package com.chunyan.daggertest.person;

import android.content.Context;

import com.chunyan.daggertest.base.AbcSingleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PersonModule {
    private Context context;

    public PersonModule(Context context) {
        this.context = context;
    }

    @Provides
    Context providesContext() {
        return context;
    }

    @AbcSingleton
    @Provides
    Person providesPerson() {
        return new Person(context);
    }



}
