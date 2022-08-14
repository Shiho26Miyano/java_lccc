package com.company;
import java.util.*;;

public class lc_1429_First_Unique_Number {
    HashMap<Integer, Integer> recorder = new HashMap<Integer, Integer>();
    Queue<Integer> data = new LinkedList();
    public void FirstUnique(int[] nums) {
        for(int num : nums){
            add(num);
        }
    }

    public int showFirstUnique() {
        while(!data.isEmpty()){
            int cur = data.peek();
            if(recorder.get(cur) == 1){
                return cur;
            }
            data.poll();
        }
        return -1;
    }

    public void add(int value) {
        int f = recorder.getOrDefault(value, 0);
        recorder.put(value, f + 1);
        data.offer(value);
    }


}
