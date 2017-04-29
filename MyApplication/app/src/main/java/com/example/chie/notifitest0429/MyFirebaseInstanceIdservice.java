package com.example.chie.notifitest0429;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by chie on 2017/04/29.
 */

public class MyFirebaseInstanceIdservice extends FirebaseInstanceIdService {
    private static final String TAG = "MyFirebaseIdservice";

    @Override
    public void onTokenRefresh() {
        //super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "RefreshedToken = " + refreshedToken);

        //トークンの値をサーバーへ送信
        sendRegistrationToServer(refreshedToken);
    }

    private void sendRegistrationToServer(String refreshedToken) {
    }
    //サーバーへの送信部分

}
