package com.my.mvvm.data.db;


public class PreferencesHelperContract {

    public interface setUserPrefs {


        void setApiToken(String apiToken);


        void setLogin(Boolean apiToken);



    }

    public interface getUserPrefs {

        String getApiToken();

        Boolean getLogin();

    }
}
