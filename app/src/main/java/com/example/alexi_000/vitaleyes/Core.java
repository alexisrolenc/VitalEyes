package com.example.alexi_000.vitaleyes;

import com.google.firebase.auth.FirebaseUser;

import java.util.ArrayList;

/**
 * Created by alexi_000 on 10/7/2017.
 */

public class Core
{
        static Room selectedRoom = null;
        //static MyQuestion selectedMyQuestion = null;
        static ArrayList<Room> theRooms = new ArrayList<Room>();
        //static ArrayList<Answer> theAnswers = new ArrayList<Answer>();
        //static ArrayList<MyQuestion> theMyQuestions = new ArrayList<MyQuestion>();
        static FirebaseUser currentUser;
}
