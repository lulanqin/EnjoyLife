package com.cruse.enjoylife.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cruse.enjoylife.R;
import com.cruse.enjoylife.adapter.RvSocalNewsAdapter;
import com.cruse.enjoylife.adapter.WeiXinNewsAdapter;
import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.bean.WXNewsBean;
import com.cruse.enjoylife.presenter.SocalNewsPresenter;
import com.cruse.enjoylife.presenter.WXNewsPresenter;
import com.cruse.enjoylife.view.SocalNewsView;
import com.cruse.enjoylife.view.WXNewsView;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class WXNewsActivity extends Activity {

    RecyclerView rv_socal;
    WeiXinNewsAdapter adapter;
    WXNewsPresenter mPresenter;

    private WXNewsView mView = new WXNewsView() {
        @Override
        public void onSuccess(WXNewsBean bean) {
            adapter.addAllData(bean);

/*            iv_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });*/
        }

        @Override
        public void onError(String result) {

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initUI();

        mPresenter = new WXNewsPresenter(this);
        mPresenter.onCreate();
        mPresenter.getDataFromNet();
        mPresenter.attachView(mView);

    }

    private void initUI() {
        rv_socal = (RecyclerView) findViewById(R.id.rv_socal);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv_socal.setLayoutManager(mLayoutManager);
        rv_socal.setHasFixedSize(true);

        adapter = new WeiXinNewsAdapter(this);
        rv_socal.setAdapter(adapter);


    }
}
