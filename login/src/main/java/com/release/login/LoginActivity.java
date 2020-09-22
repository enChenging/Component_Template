package com.release.login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import com.release.annotation.BindPath;
import com.release.basic.BaseAppication;
import com.release.common.LiveDataBus;
import com.release.router.Router;

@BindPath("login/login")
public class LoginActivity extends AppCompatActivity {

    private LiveDataBus.BusMutableLiveData<String> mLiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLiveData = LiveDataBus.getInstance().with("main", String.class);
        mLiveData.postValue("login的数据");
    }

    public void jumpClick(View view) {
        if (BaseAppication.is_application)
            startActivity(new Intent(this, LoginActivity2.class));
        else
            Router.getInstance().jumpActivity("login/login2", null);
    }
}
