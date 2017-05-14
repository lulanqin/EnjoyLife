package com.cruse.enjoylife.view;

import com.cruse.enjoylife.bean.SocalNewsBean;

/**
 * Created by lulanqin on 2017/5/13.
 */
public  interface SocalNewsView extends View  {

    void onSuccess(SocalNewsBean bean);

    void onError(String result);
}
