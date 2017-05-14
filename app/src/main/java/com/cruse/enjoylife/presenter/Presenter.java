package com.cruse.enjoylife.presenter;

import android.content.Intent;

import com.cruse.enjoylife.view.View;

public interface Presenter {
    void onCreate();

    void onStart();

    void onStop();

    void pause();

    void attachView(View view);

    void attachIncomingIntent(Intent intent);
}