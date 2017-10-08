package com.example.alexi_000.vitaleyes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
        private FirebaseAuth email;
        private FirebaseAuth password;


        public void createAccount(email, password) {
            mAuth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(EmailPasswordActivity.this, "Authentication failed.",
                                        Toast.LENGTH_SHORT).show();
                            }
                            String userName
                            //Register here
                        }
                    });
        }
    }

}
