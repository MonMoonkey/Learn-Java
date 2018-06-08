package priv.monkey.learn.java.okhttp;

import okhttp3.*;
import retrofit2.Retrofit;

import java.io.IOException;

/**
 * @author:Monkey
 * @time: Create on 2018/6/8
 */
public class Main {
       static OkHttpClient client = new OkHttpClient();

    public static void main(String[] args) {

//        get();
//        post();
//        asynGet();

        String BASE_URL = "http://api.myservice.com";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://publicobject.com")
                .build();

        IEndPoint iEndPoint = retrofit.create(IEndPoint.class);
        retrofit2.Call<ResponseBody> call = iEndPoint.getText();
call.enqueue(new retrofit2.Callback<ResponseBody>() {
    @Override
    public void onResponse(retrofit2.Call<ResponseBody> call, retrofit2.Response<ResponseBody> response) {
        Headers responseHeaders = response.headers();
        for (int i = 0, size = responseHeaders.size(); i < size; i++) {
            System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
        }

        try {
            System.out.println(response.body().string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFailure(retrofit2.Call<ResponseBody> call, Throwable t) {

    }
});


        }

    private static void asynGet() {
        Request request = new Request.Builder()
                .url("http://publicobject.com/helloworld.txt")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override public void onFailure(Call call, IOException e) {
                e.printStackTrace();
            }

            @Override public void onResponse(Call call, Response response) throws IOException {
                if (!response.isSuccessful()) {throw new IOException("Unexpected code " + response);}

                Headers responseHeaders = response.headers();
                for (int i = 0, size = responseHeaders.size(); i < size; i++) {
                    System.out.println(responseHeaders.name(i) + ": " + responseHeaders.value(i));
                }

                System.out.println(response.body().string());
            }
        });
    }

    private static void post() {
        MediaType JSON
                = MediaType.parse("application/json; charset=utf-8");

        RequestBody body = RequestBody.create(JSON, "");
        Request request = new Request.Builder()
                .url("http://www.wooyun.org/")
                .post(body)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(123);

            if (response.isSuccessful()) {
                System.out.println(response.body().string());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void get() {
        Request request = new Request.Builder().url("http://www.wooyun.org").build();
        try {
            Response response = client.newCall(request).execute();
            if (response.isSuccessful()) {
                System.out.println(response.body().string());
            } else {
                throw new IOException("Unexpected code " + response);
            }
        } catch (Exception e) {
        }
    }

}
