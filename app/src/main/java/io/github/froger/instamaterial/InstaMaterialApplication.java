package io.github.froger.instamaterial;

import android.app.Application;


import io.github.froger.instamaterial.di.AppComponent;
import io.github.froger.instamaterial.di.ApplicationModule;
import io.github.froger.instamaterial.di.DaggerAppComponent;
import timber.log.Timber;

/**
 * Created by froger_mcs on 05.11.14.
 */
public class InstaMaterialApplication extends Application {

    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        appComponent = DaggerAppComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        Timber.plant(new Timber.DebugTree());
    }
}
