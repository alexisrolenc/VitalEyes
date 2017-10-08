package com.example.alexi_000.vitaleyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PartientRoomsMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partient_rooms_main);

        Button AddPatientBtn = (Button)(findViewById(R.id.AddPatientBtn));
        AddPatientBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button AddRoomBtn = (Button)(findViewById(R.id.AddRoomBtn));
        AddRoomBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button AllBtn = (Button)(findViewById(R.id.AllBtn));
        AllBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button OccBtn = (Button)(findViewById(R.id.OccBtn));
        OccBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        Button VacBtn = (Button)(findViewById(R.id.VacBtn));
        VacBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
