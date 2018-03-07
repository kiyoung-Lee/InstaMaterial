package io.github.froger.instamaterial.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Module
public final class ApplicationModule {

    private final Context context;

    public ApplicationModule(Context context) {
        this.context = context;
    }

    @Provides
    @Named("application")
    @Singleton
    Context provideApplicationContext() {
        return context;
    }
}
