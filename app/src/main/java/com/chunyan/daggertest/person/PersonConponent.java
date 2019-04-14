package com.chunyan.daggertest.person;

import com.chunyan.daggertest.base.AbcSingleton;
import com.chunyan.daggertest.base.BaseConponent;
import com.chunyan.daggertest.MainActivity;
import com.chunyan.daggertest.SecondActivity;

import dagger.Component;


//@Singleton
//   ①   @Component(modules = {PersonModule.class},dependencies = StudentConponet.class)
//   ②   @Component(modules = {PersonModule.class, StudentModule.class})

@AbcSingleton
@Component(modules = {PersonModule.class}, dependencies = BaseConponent.class)
public interface PersonConponent {
    void join(MainActivity activity);

    void join(SecondActivity secondActivity);
}
