package com.my.mvvm.di.module;


import com.my.mvvm.ui.MainActivity;
import com.my.mvvm.ui.MainFragmentBindingModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector(modules = {MainFragmentBindingModule.class})
    abstract MainActivity bindMainActivity();

}
