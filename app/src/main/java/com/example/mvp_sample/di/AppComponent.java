package com.example.mvp_sample.di;

import com.example.mvp_sample.Common.SampleApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

/**
 * Created by KiyoungLee on 2018-02-11.
 */

@Singleton
@Component(modules = {ApplicationModule.class

})
public interface AppComponent extends AndroidInjector<SampleApplication> {
}
