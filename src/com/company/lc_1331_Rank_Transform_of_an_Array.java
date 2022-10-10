package com.company;
import java.util.*;

public class lc_1331_Rank_Transform_of_an_Array {
    public int[] arrayRankTransform(int[] arr) {
        int[] copyArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copyArray);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : copyArray){
            map.putIfAbsent(x, map.size() + 1);
        }
        for (int i = 0; i < arr.length; i++){
            copyArray[i] = map.get(arr[i]);
        }
        return copyArray;

    }
}
