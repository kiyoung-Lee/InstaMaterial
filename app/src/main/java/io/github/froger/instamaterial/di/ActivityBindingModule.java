package io.github.froger.instamaterial.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import io.github.froger.instamaterial.ui.activity.Comment.CommentModule;
import io.github.froger.instamaterial.ui.activity.Comment.CommentsActivity;
import io.github.froger.instamaterial.ui.activity.Main.MainActivity;
import io.github.froger.instamaterial.ui.activity.Main.MainModule;
import io.github.froger.instamaterial.ui.activity.Photo.TakePhotoActivity;
import io.github.froger.instamaterial.ui.activity.Photo.TakePhotoModule;
import io.github.froger.instamaterial.ui.activity.Profile.UserProfileActivity;
import io.github.froger.instamaterial.ui.activity.Profile.UserProfileModule;
import io.github.froger.instamaterial.ui.activity.Publish.PublishActivity;
import io.github.froger.instamaterial.ui.activity.Publish.PublishModule;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Module
public abstract class ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = CommentModule.class)
    abstract CommentsActivity commentsActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = TakePhotoModule.class)
    abstract TakePhotoActivity takeActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = UserProfileModule.class)
    abstract UserProfileActivity userProfileActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = PublishModule.class)
    abstract PublishActivity publishActivity();

}
