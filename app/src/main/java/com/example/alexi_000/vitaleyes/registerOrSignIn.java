package com.example.alexi_000.vitaleyes;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widtget.button;

public class registerOrSignIn extends AppCompatActivity
{
    //Decleration and innitiation
    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;


    protected void onCreate(Bundle savedInstanceState)
    {
        //Firebase on create
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
        Button register = (Button)(FieldViewById(R.id.register));
        register.OnClickListener( new View.OnClickListener());
        @Override
        public void onClick(View v)
        {
            Log.i(TAG , "Somthing things");
        }


        super.onCreate(savedInstanceState);
        setContentView(R.layout.registerOrSignIn);

    }

}
