package com.niteroomcreation.exampletest.di;

import com.niteroomcreation.exampletest.CustomApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Septian Adi Wijaya on 04/12/18
 */

@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBuilder.class})
@Singleton
public interface AppComponent {

    @Component.Builder
    interface Builder {
        Builder appModule(AppModule appModule);

        AppComponent build();
    }


    void inject(CustomApplication application);
}
