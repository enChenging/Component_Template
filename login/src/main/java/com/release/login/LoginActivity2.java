package com.release.login;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.release.annotation.BindPath;
import com.release.basic.BaseAppication;
import com.release.router.Router;

@BindPath("login/login2")
public class LoginActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        if (BaseAppication.is_application)
            findViewById(R.id.btn).setVisibility(View.GONE);
    }

    public void jumpClick(View view) {
        Router.getInstance().jumpActivity("pay/pay",null);
    }
}
