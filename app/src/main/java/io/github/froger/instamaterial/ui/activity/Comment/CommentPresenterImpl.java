package io.github.froger.instamaterial.ui.activity.Comment;

import javax.inject.Inject;

import io.github.froger.instamaterial.ui.activity.Comment.Data.CommentRepository;

/**
 * Created by KiyoungLee on 2018-02-18.
 */

public class CommentPresenterImpl implements CommentContract.Presenter{

    @Inject
    CommentRepository repository;
}
