package com.cruse.enjoylife.service;

import android.content.Context;

import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.bean.WXNewsBean;

import rx.Observable;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class DataManager {

    private String key;
    private String num;
    private RetrofitService mSocalService;
    private RetrofitService mWeiXinService;

    public DataManager(Context context){

        this.mSocalService = RetrofitHelper.getInstance(context).getSocalNews(key,num);

        this.mWeiXinService = RetrofitHelper.getInstance(context).getWeiXinNews(key,num);
    }

    public Observable<SocalNewsBean> getSocalNews(String key,String num){
        return mSocalService.getSocalNews(key,num);
    }

    public Observable<WXNewsBean> getWXNews(String key, String num){
        return mWeiXinService.getWeiXinNews(key,num);
    }

}
