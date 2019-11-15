package com.my.mvvm.data.db;

import android.content.Context;
import android.content.SharedPreferences;

import com.my.mvvm.base.BaseApplication;

public class PreferencesHelperImpl implements PreferencesHelperContract.getUserPrefs, PreferencesHelperContract.setUserPrefs {

    private SharedPreferences mAppPrefs = BaseApplication.getInstance().getSharedPreferences("CurrentUserInfo", Context.MODE_PRIVATE);



    @Override
    public void setApiToken(String apiToken) {
        SharedPreferences.Editor editor = mAppPrefs.edit();
        editor.putString("token", apiToken);
        editor.apply();
    }



    @Override
    public void setLogin(Boolean apiToken) {
        SharedPreferences.Editor editor = mAppPrefs.edit();
        editor.putBoolean("isLogin", apiToken);
        editor.apply();
    }


    @Override
    public String getApiToken() {
        return mAppPrefs.getString("token", "nil");
    }


    @Override
    public Boolean getLogin() {
        return mAppPrefs.getBoolean("isLogin", false);
    }
}
