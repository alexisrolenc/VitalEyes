package com.example.alexi_000.vitaleyes;

/**
 * Created by alexi_000 on 10/7/2017.
 */

class Room
{
    private String room;
    private String key;
    private String patientName;

    public Room(){}
    public Room(String room)
    {
        this.room = room;
        this.patientName = patientName;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getKey()
    {
        return key;
    }

    public String getRoom()
    {
        return room;
    }

    public void setRoom(String room)
    {
        this.room = room;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}
