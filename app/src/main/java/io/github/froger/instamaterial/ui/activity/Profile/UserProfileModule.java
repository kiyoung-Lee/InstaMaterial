package io.github.froger.instamaterial.ui.activity.Profile;

import dagger.Binds;
import dagger.Module;
import io.github.froger.instamaterial.di.ActivityScope;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public abstract class UserProfileModule {

    @ActivityScope
    @Binds
    abstract UserProfileContract.Presenter userProfilePresenter(UserProfilePresenterImpl presenter);
}
