package com.cruse.enjoylife.service;

import android.content.Context;

import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class RetrofitHelper {

    private Context c;
    OkHttpClient client = new OkHttpClient();
    GsonConverterFactory factory = GsonConverterFactory.create(new GsonBuilder().create());
    private static RetrofitHelper instance = null;

    private Retrofit mNews = null;
    private Retrofit mWX = null;

    String Url = "https://api.tianapi.com/";

    String wxUrl = "https://api.tianapi.com/weixin/";


    public static RetrofitHelper getInstance(Context context){
        if (instance == null){
            instance = new RetrofitHelper(context);
        }
        return instance;
    }

    private RetrofitHelper(Context mContext){
        c = mContext;
        init();
    }

    private void init() {
        resetApp();
    }

    private void resetApp() {

        mNews = new Retrofit.Builder()
                .baseUrl(Url)
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        mWX = new Retrofit.Builder()
                .baseUrl(wxUrl)
                .client(client)
                .addConverterFactory(factory)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }

    public RetrofitService getSocalNews(String key,String num){
        return mNews.create(RetrofitService.class);
    }

    public RetrofitService getWeiXinNews(String key,String num){
        return mNews.create(RetrofitService.class);
    }

}
