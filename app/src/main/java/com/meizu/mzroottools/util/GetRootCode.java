package com.meizu.mzroottools.util;

import android.util.Log;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by shidongming on 18-1-31.
 */

public class GetRootCode {

    //网络请求获取root码

    public static String getRootCodeFromNetwork(String url) {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                //请求root码失败
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Log.d("onResponse: ", response.body().string());
            }
        });
        return null;
    }
}
