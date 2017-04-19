package ankit.com.androidbase.network.service;

import java.util.Map;

import retrofit2.Response;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import rx.Observable;


public interface ApiService {

    @POST("api/users")
    Observable<Response> userSignIn (@QueryMap Map<String, String> user);


}
