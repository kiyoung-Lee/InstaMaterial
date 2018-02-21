package io.github.froger.instamaterial.ui.activity.Main;

import dagger.Binds;
import dagger.Module;
import io.github.froger.instamaterial.di.ActivityScope;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public abstract class MainModule {

    @ActivityScope
    @Binds
    abstract MainContract.Presenter mainPresenter(MainPresenterImpl presenter);
}
