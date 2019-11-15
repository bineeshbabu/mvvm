package com.my.mvvm.base;


import com.my.mvvm.di.component.ApplicationComponent;
import com.my.mvvm.di.component.DaggerApplicationComponent;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class BaseApplication extends DaggerApplication {


    private static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static synchronized BaseApplication getInstance() {
        if (instance == null)
            instance = new BaseApplication();
        return instance;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        ApplicationComponent component = DaggerApplicationComponent.builder().application(this).build();
        component.inject(this);
        return component;
    }

}
