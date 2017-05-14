package com.cruse.enjoylife.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.cruse.enjoylife.R;
import com.cruse.enjoylife.adapter.RvSocalNewsAdapter;
import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.presenter.SocalNewsPresenter;
import com.cruse.enjoylife.view.SocalNewsView;
import com.wuxiaolong.pullloadmorerecyclerview.PullLoadMoreRecyclerView;

/**
 * Created by lulanqin on 2017/5/13.
 */
public class SocalNewsActivity extends Activity {

    RecyclerView rv_socal;
    RvSocalNewsAdapter adapter;
    SocalNewsPresenter mPresenter;

    private SocalNewsView mView = new SocalNewsView() {
        @Override
        public void onSuccess(SocalNewsBean bean) {
            //adapter = new RvSocalNewsAdapter(getApplicationContext());
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

        mPresenter = new SocalNewsPresenter(this);
        mPresenter.onCreate();
        mPresenter.getDataFromNet();
        mPresenter.attachView(mView);

    }

    private void initUI() {
        rv_socal = (RecyclerView) findViewById(R.id.rv_socal);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        rv_socal.setLayoutManager(mLayoutManager);
        rv_socal.setHasFixedSize(true);

        adapter = new RvSocalNewsAdapter(this);
        rv_socal.setAdapter(adapter);

/*        rv_socal.setRefreshing(true);
        //禁止下拉刷新
        rv_socal.setPullRefreshEnable(false);*/


    }
}
