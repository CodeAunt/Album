package com.example.x280.album.application;

import android.Manifest;
import android.app.Application;
import android.content.pm.PackageManager;

import com.baidu.mapapi.SDKInitializer;
import com.example.x280.album.MapActivity;

public class MyApplication extends Application {

    private static final int BAIDU_READ_PHONE_STATE =100;

    @Override
    public void onCreate() {
        super.onCreate();

        SDKInitializer.initialize(this);

//        if(this.checkSelfPermission(Manifest.permission.READ_PHONE_STATE)!=PackageManager.PERMISSION_GRANTED) {
//            // 申请一个（或多个）权限，并提供用于回调返回的获取码（用户定义）
//            requestPermissions( new String[]{ Manifest.permission.READ_PHONE_STATE },BAIDU_READ_PHONE_STATE );
//        }

//        SDKInitializer.initialize(MyApplication.this);
    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode,String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions,grantResults);
//        switch(requestCode) {
//            //requestCode即所声明的权限获取码，在checkSelfPermission时传入
//            case 1:
//                BAIDU_READ_PHONE_STATE:
//                if(grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    //获取到权限，做相应处理
//                    //调用定位SDK应确保相关权限均被授权，否则会引起定位失败
//                } else{
//                    //没有获取到权限，做特殊处理
//                }
//                break;
//            default:
//                break;
//        }
//    }
}
