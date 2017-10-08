package com.example.alexi_000.vitaleyes;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignIn extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;


    protected void onCreate(Bundle savedInstanceState)
    {
        //Firebase
        mAuthListener = new FirebaseAuth.AuthStateListener()
        {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    //Sign in user
                    Log.d(TAG, "onAuthStateChanged:signed_in:" + usergetUid());
                } else {
                    //Sign out user
                    Log.d(TAG, "onAuthStateChanged:Signed_out");
                }

            }
            @Override
            public void onStart() {
                super.onStart();
                mAuth.addAuthStateListener(mAuthListener);
            }
            @Override
            public void onStop() {
                super.onStop();
                if (mAuthListener != null) {
                    mAuth.removeAuthStateListener(mAuthListener);
                }
            }
        };
        //Register button
        mAuth.createUserWithEmailAndPassword(Email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {

                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        
                    }
                });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerOrSignIn);

    public void registerBtnPressed (View v)
    {
        System.out.println("here*****");

        Intent i = new Intent(this, Register.class);
        this.startActivity(i);
    }
    }
}
