package com.example.alexi_000.vitaleyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void registerButtonPressed (View v)
    {
        System.out.println("here*****");

        Intent i = new Intent(this, Register.class);
        this.startActivity(i);
    }
}
