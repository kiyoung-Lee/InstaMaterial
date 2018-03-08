package io.github.froger.instamaterial.ui.activity.Main;

/**
 * Created by KiyoungLee on 2018-03-08.
 */

import dagger.Component;
import io.github.froger.instamaterial.di.ActivityScope;

@ActivityScope
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);
}
