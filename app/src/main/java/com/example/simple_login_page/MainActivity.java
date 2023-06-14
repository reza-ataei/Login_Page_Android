package com.example.simple_login_page;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        Login login = new Login();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout , login)
                .commit();

        // your code

    }
}