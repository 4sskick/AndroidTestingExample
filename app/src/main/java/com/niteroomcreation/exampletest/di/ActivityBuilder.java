package com.niteroomcreation.exampletest.di;

import com.niteroomcreation.exampletest.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Septian Adi Wijaya on 04/12/18
 */

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();
}
