package io.github.froger.instamaterial.ui.activity.Publish;

import io.github.froger.instamaterial.ui.activity.Publish.Data.PublishRepository;

/**
 * Created by KiyoungLee on 2018-02-18.
 */

public class PublishPresenterImpl implements  PublishContract.Presenter{

    private PublishRepository repository;

    public PublishPresenterImpl(
            PublishRepository repository) {
        this.repository = repository;
    }
}
