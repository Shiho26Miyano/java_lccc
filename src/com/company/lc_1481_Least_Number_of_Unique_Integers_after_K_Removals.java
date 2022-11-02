package com.company;
import java.util.*;;
public class lc_1481_Least_Number_of_Unique_Integers_after_K_Removals {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr) map.put(a,map.getOrDefault(a,0)+1);
        List<Integer>[] bucket = new List[arr.length+1];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(bucket[entry.getValue()] == null) bucket[entry.getValue()]=new ArrayList<>();
            bucket[entry.getValue()].add(entry.getKey());
        }
        int count=map.size();
        for(int i=0;i<bucket.length && k>0;i++){
            if(bucket[i]==null) continue;
            if(k - bucket[i].size()*i >=0){
                k -= bucket[i].size()*i;
                count -= bucket[i].size();
            }
            else{
                count -= k / i;
                break;
            }
        }
        return count;
    }
}
