package com.example.mvp_sample.di;

import android.app.Application;

import com.example.mvp_sample.Common.SampleApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Singleton
@Component(modules = {ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class
})
public interface AppComponent extends AndroidInjector<SampleApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }
}
