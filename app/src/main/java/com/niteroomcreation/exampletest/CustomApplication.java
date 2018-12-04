package com.niteroomcreation.exampletest;

import android.app.Activity;
import android.app.Application;

import com.niteroomcreation.exampletest.di.AppComponent;
import com.niteroomcreation.exampletest.di.AppModule;
import com.niteroomcreation.exampletest.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * Created by Septian Adi Wijaya on 04/12/18
 */
public class CustomApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        initAppComponent().inject(this);
    }

    public AppComponent initAppComponent() {
        return DaggerAppComponent
                .builder().appModule(new AppModule(this))
                .build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
