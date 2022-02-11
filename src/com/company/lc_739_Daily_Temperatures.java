package com.company;
import java.util.*;

public class lc_739_Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        for (int day = 0; day < n; day++) {
            for (int futureDay = day + 1; futureDay < n; futureDay++) {
                if (temperatures[futureDay] > temperatures[day]) {
                    answer[day] = futureDay - day;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        //String s = "weeaaaaaek";
        int[] t = new int[]{73,74,75,71,69,72,76,73};
        int k = 4;
        int[] result = dailyTemperatures(t);
        System.out.println(Arrays.toString(result));
    }


}