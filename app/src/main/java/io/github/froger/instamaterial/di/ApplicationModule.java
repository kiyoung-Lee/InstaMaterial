package io.github.froger.instamaterial.di;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Module
public abstract class ApplicationModule {

    @Binds
    abstract Context bindContext(Application application);
}
