package io.github.froger.instamaterial.di;

import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import io.github.froger.instamaterial.InstaMaterialApplication;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<InstaMaterialApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
