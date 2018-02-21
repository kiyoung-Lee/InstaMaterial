package io.github.froger.instamaterial.ui.activity.Comment;

import android.view.LayoutInflater;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.github.froger.instamaterial.di.ActivityScope;
import io.github.froger.instamaterial.ui.adapter.CommentsAdapter;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public class CommentModule {

    @ActivityScope
    @Inject
    CommentContract.Presenter commentPresenter(){
        return new CommentPresenterImpl();
    }
}
