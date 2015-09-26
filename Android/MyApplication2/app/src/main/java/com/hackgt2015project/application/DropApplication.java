package com.hackgt2015project.application;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.parse.Parse;
import com.parse.ParseFacebookUtils;

/**
 * Created by ZkHaider on 9/25/15.
 */
public class DropApplication extends Application {

    private static DropApplication sDropApplication;

    public static DropApplication getInstance() {
        return sDropApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        FacebookSdk.sdkInitialize(getApplicationContext());
        Parse.initialize(this, "WDxhZjVJSBXeBudlLDLU5RutPQnNU1gifhcD4Zuq", "8kg3SvqXKnnfo0PqabwLdv8Nv0iCOgEJ564qlknN");
        ParseFacebookUtils.initialize(getApplicationContext());
    }
}
