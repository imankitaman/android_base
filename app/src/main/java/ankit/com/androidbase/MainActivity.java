package ankit.com.androidbase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import ankit.com.androidbase.network.manager.BaseManager;
import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

public class MainActivity extends AppCompatActivity {


    @Inject
    BaseManager baseManager;

    Subscription subscription;
    private CompositeSubscription compositeSubscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compositeSubscription = new CompositeSubscription();
        BaseApplication.getInstance().component().inject(this);
  /*      compositeSubscription.add(baseManager.userSignIn(new HashMap<String, String>()).subscribe(new Subscriber<Response>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Response response) {

            }
        }));*/
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (subscription != null && !subscription.isUnsubscribed())
            subscription.unsubscribe();
    }

}
