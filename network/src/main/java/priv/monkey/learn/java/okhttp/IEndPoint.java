package priv.monkey.learn.java.okhttp;

import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author:Monkey
 * @time: Create on 2018/6/8
 */
public interface IEndPoint {
    @GET("/helloworld.txt")
    Call<ResponseBody> getText();
}
