package io.github.froger.instamaterial.ui.activity.Photo;

import io.github.froger.instamaterial.ui.activity.Photo.Data.TakePhotoRepository;

/**
 * Created by KiyoungLee on 2018-02-20.
 */

public class TakePhotoPresenterImpl implements TakePhotoContract.Presenter {

    private TakePhotoRepository repository;

    public TakePhotoPresenterImpl(
            TakePhotoRepository repository) {
        this.repository = repository;
    }
}
