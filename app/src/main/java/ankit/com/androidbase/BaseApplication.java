package ankit.com.androidbase;

import android.app.Application;

import ankit.com.androidbase.dependencyinjection.component.ApplicationComponent;
import ankit.com.androidbase.dependencyinjection.module.AppModule;


public class BaseApplication extends Application {
    private ApplicationComponent component;
    private static BaseApplication application;
    @Override
    public void onCreate() {
        super.onCreate();
        application = this;
        component = DaggerApplicationComponent.builder()
                .appModule(new AppModule(this))
                .build();
        component().inject(this);

    }
    public static BaseApplication getInstance() {
        return application;
    }
    public ApplicationComponent component() {
        return component;
    }
}
