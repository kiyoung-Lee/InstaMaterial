package io.github.froger.instamaterial.di;

import android.app.Application;

import org.w3c.dom.Comment;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import io.github.froger.instamaterial.InstaMaterialApplication;
import io.github.froger.instamaterial.ui.activity.Comment.Data.CommentRepository;

/**
 * Created by KiyoungLee on 2018-02-12.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<InstaMaterialApplication> {

    CommentRepository getCommentRepository();

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
