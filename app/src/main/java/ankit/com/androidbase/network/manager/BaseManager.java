package ankit.com.androidbase.network.manager;

import javax.inject.Inject;

import ankit.com.androidbase.BaseApplication;
import ankit.com.androidbase.network.service.ApiService;

/**
 * Created by ankit on 20/04/17.
 */

public class BaseManager {
    @Inject
    ApiService service;

    public BaseManager(){
        BaseApplication.getInstance().component().inject(this);
    }


    //dummy
  /*  public Observable<ServerResponse<User>> signInUser(@NonNull User user, @NonNull NetworkViewModel.NetworkState networkState) {

        Map<String, String> userData = new HashMap<>();
        userData.put("primaryContact", user.getPrimaryContact());
        userData.put("passwd", user.getPassword());
        Observable<Response<ServerResponse<User>>> user1 = profileService.userSignIn(userData);
        return handleApiObservable(user1, networkState).doOnNext(new Action1<ServerResponse<User>>() {
            @Override
            public void call(ServerResponse<User> userServerResponse) {
                User user = userServerResponse.getResult().get(0);
                saveUserDetails(user);
            }
        });
    }*/
}


