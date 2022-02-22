package com.company;
import java.util.*;

public class lc_1762_Buliding_With_an_Ocean_View {
    public static int[] findBuildings(int[] heights) {
        int n = heights.length;
        List<Integer> list = new ArrayList<>();
        Deque<Integer> pre_stack = new ArrayDeque<>();

        for (int currIndex = n - 1; currIndex >= 0; currIndex--) {
            int currHeight = heights[currIndex];
            while (!pre_stack.isEmpty() && heights[pre_stack.peek()] < currHeight) {
                pre_stack.pop();
            }
            if (pre_stack.isEmpty()) list.add(currIndex);
            pre_stack.push(currIndex);

        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            answer[i] = list.get(list.size() - 1 - i);
        }
        return answer;
    }

    public static void main(String[] args){
        //String s = "weeaaaaaek";
        int[] t = new int[]{5,2,1,3,4,2};
        int k = 4;
        int[] result = findBuildings(t);
        System.out.println(Arrays.toString(result));
    }

}
