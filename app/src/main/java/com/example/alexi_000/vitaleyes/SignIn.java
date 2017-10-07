package com.example.alexi_000.vitaleyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;

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


        //Sign in button
        Button loginIn = (Button)(findViewById(r.id.loginIn));
        loginIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(this, new OnCompleteListener<AuthResult>(){
                            @Override
                            public void onComplete(@NonNull Tast<AuthResult> Tast) {
                                if (!task.isSuccessfull()) {
                                    Toast.makeText(EmailPasswordActivity.this, "Not logged in",
                                            Toast.LENGTH_SHORT).show();
                                }

                            }
                        });
            }
        });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signIn);
    }
}
