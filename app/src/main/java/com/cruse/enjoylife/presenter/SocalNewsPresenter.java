package com.cruse.enjoylife.presenter;

import android.content.Context;
import android.content.Intent;

import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.service.DataManager;
import com.cruse.enjoylife.utils.Constants;
import com.cruse.enjoylife.view.SocalNewsView;
import com.cruse.enjoylife.view.View;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class SocalNewsPresenter implements Presenter{


    private DataManager manager;
    private CompositeSubscription mCompositeSubscription;
    private Context mContext;

    private SocalNewsView mView;
    private SocalNewsBean mBean;

    public SocalNewsPresenter(Context mContext) {
        this.mContext = mContext;
    }


    @Override
    public void onCreate() {
        manager = new DataManager(mContext);
        mCompositeSubscription = new CompositeSubscription();

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onStop() {
        if (mCompositeSubscription.hasSubscriptions()){
            mCompositeSubscription.unsubscribe();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void attachView(View view) {
        mView = (SocalNewsView) view;
    }

    @Override
    public void attachIncomingIntent(Intent intent) {

    }

    public void getDataFromNet(){
        mCompositeSubscription.add(manager.getSocalNews(Constants.KEY,Constants.NUM)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SocalNewsBean>() {
                    @Override
                    public void onCompleted() {
                        if (mBean != null){
                            mView.onSuccess(mBean);
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        mView.onError("请求失败！！");
                    }

                    @Override
                    public void onNext(SocalNewsBean bean) {
                        mBean = bean;
                        //mFoodTypeListBean.getTngou().get(0).getName();
                    }
                })
        );
    }
}
