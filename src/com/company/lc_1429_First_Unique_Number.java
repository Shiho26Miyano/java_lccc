package com.company;
import java.util.*;;

public class lc_1429_First_Unique_Number {
    HashMap<Integer, Integer> map = new HashMap<>();
    Queue<Integer> data = new LinkedList();

    public void FirstUnique(int[] nums) {
        for (int num: nums){
            add(num);
        }

    }

    public int showFirstUnique() {
        while(!data.isEmpty()){
            int ans = data.peek();
            if (map.get(ans) == 1) return ans;
            data.poll();
        }
        return -1;

    }

    public void add(int value) {
        map.put(value, map.getOrDefault(value, 0) + 1);
        data.add(value);

    }



}
