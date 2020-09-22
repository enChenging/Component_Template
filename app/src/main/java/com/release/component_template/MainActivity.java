package com.release.component_template;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.release.annotation.BindPath;
import com.release.common.LiveDataBus;
import com.release.router.Router;

@BindPath("main/main")
public class MainActivity extends AppCompatActivity {

    private LiveDataBus.BusMutableLiveData<String> mLiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLiveData = LiveDataBus.getInstance().with("main", String.class);
        mLiveData.observe(this, true,new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.i("cyc", "login -- >" + s);
            }
        });
    }

    public void jumpClick(View view) {
        //setValue只能在主线程下被调用
        //postValue可以在任意线程下被调用
//        mLiveData.setValue("");
        Router.getInstance().jumpActivity("login/login",null);
    }
}