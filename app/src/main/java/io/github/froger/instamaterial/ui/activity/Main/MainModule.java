package io.github.froger.instamaterial.ui.activity.Main;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Named;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import io.github.froger.instamaterial.di.ActivityScope;
import io.github.froger.instamaterial.ui.activity.Main.Data.MainRepositoryImpl;
import io.github.froger.instamaterial.ui.adapter.FeedAdapter;

/**
 * Created by KiyoungLee on 2018-02-13.
 */

@Module
public class MainModule {

    private final AppCompatActivity activity;

    public MainModule(AppCompatActivity activity) {
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
    MainContract.Presenter mainPresenter(){
        return new MainPresenterImpl(new MainRepositoryImpl());
    }

    @ActivityScope
    @Provides
    FeedAdapter feedAdapter(){
        return new FeedAdapter(activity);
    }
}
