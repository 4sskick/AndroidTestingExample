package com.niteroomcreation.exampletest.di;

import android.content.Context;

import com.niteroomcreation.exampletest.CustomApplication;
import com.niteroomcreation.exampletest.service.UserService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Septian Adi Wijaya on 04/12/18
 */
@Module
public class AppModule {

    private final CustomApplication application;

    public AppModule(CustomApplication application){
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideAppContext(){
        return application;
    }

    @Provides
    @Singleton
    UserService provideUserService(Context context){
        return new UserService(context);
    }

}
