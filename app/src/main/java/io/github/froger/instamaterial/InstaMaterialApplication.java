package io.github.froger.instamaterial;

import android.app.Application;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import timber.log.Timber;

/**
 * Created by froger_mcs on 05.11.14.
 */
public class InstaMaterialApplication extends DaggerApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }
}
