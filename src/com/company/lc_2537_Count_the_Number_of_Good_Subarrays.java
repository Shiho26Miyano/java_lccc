package com.company;
import java.util.*;
public class lc_2537_Count_the_Number_of_Good_Subarrays {
    public long countGood(int[] A, int k) {
        long res = 0;
        int pair = 0;
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0, j = 0; j < A.length; ++j){
            pair += count.getOrDefault(A[j],0);
            count.put(A[j],count.getOrDefault(A[j],0)+1);
            while(pair >= k){
                count.put(A[i],count.get(A[i])-1);
                pair = pair - count.get(A[i++]);
            }
            res += i;
        }
        return res;
    }
    public long countGoodMethod2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap();

        long ans = 0;
        int count = 0;
        for (int i=0, j = 0; j<nums.length; j++) {
            count += map.getOrDefault(nums[j], 0);
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
            while (count >= k) {
                ans+= nums.length - j;
                map.put(nums[i],map.get(nums[i])-1);

                count -= map.get(nums[i++]);
            }
        }
        return ans;
    }
}
