package project.security;

import java.lang.System;

/**
 * Created by Daniel on 8/14/2015.
 */
public class MotionSensor  extends Sensor{
    public MotionSensor(int sensorID, int roomID) {
        super(sensorID, roomID);
    }
    public void raiseAlarm() {
        System.out.println("Motion detected in room: " + roomID);
        if(MainSystem.phone1IsEnabled())
            System.out.println("Call: " + MainSystem.getPhone1());
        if(MainSystem.phone2IsEnabled())
            System.out.println("Call: " + MainSystem.getPhone2());

    }
}
