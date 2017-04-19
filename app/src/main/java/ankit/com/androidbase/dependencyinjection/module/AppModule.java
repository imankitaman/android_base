package ankit.com.androidbase.dependencyinjection.module;

import javax.inject.Inject;

import ankit.com.androidbase.BaseApplication;
import ankit.com.androidbase.network.ApiCallHandler;

public class AppModule  extends ApiCallHandler{

    private BaseApplication baseApplication;

    public AppModule(BaseApplication baseApplication) {
        this.baseApplication = baseApplication;
    }


}
