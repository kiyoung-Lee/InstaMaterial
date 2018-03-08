package io.github.froger.instamaterial.ui.activity.Profile;

import io.github.froger.instamaterial.ui.activity.Profile.Data.UserProfileRepository;

/**
 * Created by KiyoungLee on 2018-02-18.
 */

public class UserProfilePresenterImpl implements  UserProfileContract.Presenter{

    private UserProfileRepository repository;

    public UserProfilePresenterImpl(
            UserProfileRepository repository) {
        this.repository = repository;
    }
}
