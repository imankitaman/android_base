package ankit.com.androidbase.dependencyinjection.component;


import javax.inject.Singleton;

import ankit.com.androidbase.BaseApplication;
import ankit.com.androidbase.dependencyinjection.module.AppModule;
import ankit.com.androidbase.dependencyinjection.module.NetworkModule;
import ankit.com.androidbase.network.manager.BaseManager;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface ApplicationComponent {

    void inject(BaseApplication application);

    void inject(BaseManager baseManager);

}
