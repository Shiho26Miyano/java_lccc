package com.company;
import java.util.*;

public class lc_739_Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int currDay = 0; currDay < n; currDay++) {
            int currentTemp = temperatures[currDay];
            // Pop until the current day's temperature is not
            // warmer than the temperature at the top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < currentTemp) {
                int prevDay = stack.pop();
                answer[prevDay] = currDay - prevDay;
                System.out.println("now" + (currDay));
                System.out.println((prevDay));
            }
            stack.push(currDay);
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