package com.cruse.enjoylife.view;

import com.cruse.enjoylife.bean.SocalNewsBean;
import com.cruse.enjoylife.bean.WXNewsBean;

/**
 * Created by lulanqin on 2017/5/13.
 */
public  interface WXNewsView extends View  {

    void onSuccess(WXNewsBean bean);

    void onError(String result);
}
