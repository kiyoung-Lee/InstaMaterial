package io.github.froger.instamaterial.ui.activity.Publish;

import dagger.Binds;
import dagger.Module;
import io.github.froger.instamaterial.di.ActivityScope;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public abstract class PublishModule {

    @ActivityScope
    @Binds
    abstract PublishContract.Presenter publishPresenter(PublishPresenterImpl presenter);
}
