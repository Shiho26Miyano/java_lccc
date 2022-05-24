package com.company;
import java.util.*;

public class lc_1344_Angle_Between_Hands_of_a_Clock {
    public static double angleClock(int hour, int minutes) {
        int oneMinAngle = 6;
        int oneHourAngle = 30;

        double minutesAngle = oneMinAngle * minutes;
        double hourAngle = (hour % 12 + minutes / 60.0) * oneHourAngle;

        double diff = Math.abs(hourAngle - minutesAngle);
        return Math.min(diff, 360 - diff);
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        String sh = "172.16.254.1";
        int h = 12;
        int s = 30;
        System.out.println (angleClock(h, s));
    }
}
