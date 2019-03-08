package com.bigfoot.bigfoot;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

<<<<<<< HEAD
    public class SplashActivity extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent i = new Intent(this, InstructionActivity.class);
            startActivity(i);
            finish();
        }

    }


=======
public class SplashActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent(this, InstructionActivity.class);
        startActivity(i);
        finish();
    }
}
>>>>>>> 4951d8383fccc27db86c09f5cb8ec1027d6504ae
