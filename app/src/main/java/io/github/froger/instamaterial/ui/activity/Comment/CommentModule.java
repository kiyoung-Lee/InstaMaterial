package io.github.froger.instamaterial.ui.activity.Comment;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.github.froger.instamaterial.di.ActivityScope;
import io.github.froger.instamaterial.ui.activity.Comment.Data.CommentRepository;
import io.github.froger.instamaterial.ui.activity.Comment.Data.CommentRepositoryImpl;
import io.github.froger.instamaterial.ui.adapter.CommentsAdapter;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public class CommentModule {

    private final AppCompatActivity activity;

    public CommentModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @Named("activity")
    @ActivityScope
    Context provideActivityContext() {
        return activity;
    }

    @ActivityScope
    @Provides
    CommentContract.Presenter commentPresenter(){
        return new CommentPresenterImpl(new CommentRepositoryImpl());
    }

}
