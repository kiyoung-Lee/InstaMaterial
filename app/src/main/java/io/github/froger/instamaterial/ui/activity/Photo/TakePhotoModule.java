package io.github.froger.instamaterial.ui.activity.Photo;

import dagger.Binds;
import dagger.Module;
import io.github.froger.instamaterial.di.ActivityScope;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public abstract class TakePhotoModule {

    @ActivityScope
    @Binds
    abstract TakePhotoContract.Presenter takePhotoPresenter(TakePhotoPresenterImpl presenter);
}
