package com.example.alexi_000.vitaleyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class AddAPatient extends AppCompatActivity {

    private ListView vacantRoomList;
    private AddAPatient vList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Core.theRooms.clear();
        this.vList = this;
        setContentView(R.layout.activity_add_a_patient);

        this.vacantRoomList = (ListView)this.findViewById(R.id.vacantRoomList);
        this.vacantRoomList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(vList, NewPatientForm.class);
                Core.selectedRoom = Core.theRooms.get(position);
                vList.startActivity(i);
             //l
            }
        });
    }
}
