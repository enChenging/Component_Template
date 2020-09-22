package com.release.pay;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.release.annotation.BindPath;

@BindPath("pay/pay")
public class PayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }
}
