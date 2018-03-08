package io.github.froger.instamaterial.ui.activity.Main;

import io.github.froger.instamaterial.ui.activity.Main.Data.MainRepository;

/**
 * Created by KiyoungLee on 2018-02-18.
 */

public class MainPresenterImpl implements MainContract.Presenter{

    private MainRepository repository;

    public MainPresenterImpl(
            MainRepository repository) {
        this.repository = repository;
    }
}
