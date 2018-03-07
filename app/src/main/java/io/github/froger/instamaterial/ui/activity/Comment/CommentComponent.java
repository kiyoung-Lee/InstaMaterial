package io.github.froger.instamaterial.ui.activity.Comment;

import dagger.Component;
import io.github.froger.instamaterial.di.ActivityScope;

/**
 * Created by KiyoungLee on 2018-03-07.
 */

@ActivityScope
@Component(modules = {CommentModule.class})
public interface CommentComponent {
    void inject(CommentsActivity activity);
}
