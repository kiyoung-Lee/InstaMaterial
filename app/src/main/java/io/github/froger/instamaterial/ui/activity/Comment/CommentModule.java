package io.github.froger.instamaterial.ui.activity.Comment;

import android.view.LayoutInflater;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.github.froger.instamaterial.di.ActivityScope;
import io.github.froger.instamaterial.ui.adapter.CommentsAdapter;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public abstract class CommentModule {

    private final CommentsActivity activity;

    public CommentModule(CommentsActivity activity) {
        this.activity = activity;
    }

    @ActivityScope
    @Binds
    abstract CommentsAdapter provideCatalogAdapter(CommentsAdapter adapter);

}
