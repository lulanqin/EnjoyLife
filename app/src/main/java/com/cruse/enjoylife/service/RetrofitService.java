package com.cruse.enjoylife.service;

import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.bean.WXNewsBean;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lulanqin on 2017/5/13.
 */
public interface RetrofitService {

    //https://api.tianapi.com/social/?key=APIKEY&num=10
    @GET("social")
    Observable<SocalNewsBean> getSocalNews(@Query("key") String key,@Query("num") String num);

    //微信新闻 https://api.tianapi.com/wxnew/?key=60cadf1955f380734064aa89271c4919&num=10
    @GET("wxnew")
    Observable<WXNewsBean> getWeiXinNews(@Query("key") String key, @Query("num") String num);

}
