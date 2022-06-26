package com.company;
import java.util.*;
public class lc_692_Top_K_Frequent_Words {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> res = new LinkedList<>(); // add front from min heap
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.put(words[i],map.getOrDefault(words[i], 0) + 1);
        }

        // max heap
        PriorityQueue<Map.Entry<String, Integer>>pq = new PriorityQueue<>(
                (a,b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) :a.getValue() - b.getValue()

        );

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            pq.offer(entry);
            if(pq.size()> k) pq.poll();
        }

        System.out.print(Arrays.asList(pq));

        while(!pq.isEmpty()){
            res.add(0, pq.poll().getKey()); // only record the name
        }

        return res;
    }
    public static void main(String[] args){
        String[] strArray = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int target = 2;
        List<String> result =  topKFrequent(strArray, target);
        System.out.println((result));
    }
}
