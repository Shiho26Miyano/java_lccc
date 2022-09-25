package com.company;
import java.util.*;

//https://leetcode.com/problems/fruit-into-baskets/discuss/170740/JavaC%2B%2BPython-Sliding-Window-for-K-Elements
//difference between while and if is, if size > 2, left+1 only; wile size > 2, left++ until size = 2
public class lc_904_Fruit_Into_Baskets {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> count = new HashMap<>();
        int l = 0, r;

        for (r = 0; r < fruits.length; r++){
            count.put(fruits[r], count.getOrDefault(fruits[r], 0) + 1);

            if (count.size() > 2){
                count.put(fruits[l], count.get(fruits[l]) - 1);
                count.remove(fruits[l], 0);
                l++;
            }
        }
        return r - l;

    }
}
