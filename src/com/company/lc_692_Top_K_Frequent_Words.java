package com.company;
import java.util.*;
public class lc_692_Top_K_Frequent_Words {
    //https://mkyong.com/java/java-how-to-get-keys-and-values-from-map/
    public static List<String> topKFrequent(String[] words, int k) {
        // create HashMap composite k:v pair
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++){
            map.put(words[i], map.getOrDefault(words[i], 0) + 1);
        }

        // create empty PriorityQueue, highest to lowest
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
                (a, b) -> a.getValue() == b.getValue() ? a.getKey().compareTo(b.getKey()): b.getValue() - a.getValue()
        );

        for (Map.Entry<String, Integer> entry: map.entrySet()){
            pq.add(entry);
        }



        // create LinkedList res
        // insert pq to LinkedList while res.size() < k
        List<String> res = new LinkedList<>();
        while(res.size() < k){
            res.add(pq.poll().getKey());
        }
        return res;

    }
    public static void main(String[] args){
        String[] strArray = new String[]{"i", "love", "leetcode", "hehe", "hehe", "hehe",  "i", "love", "coding"};
        int target = 3;
        List<String> result =  topKFrequent(strArray, target);
        System.out.println((result));
    }
}

// method 2
//        for(Map.Entry<String, Integer> entry: map.entrySet())
//        {
//        pq.offer(entry);
//        if(pq.size()>k)
//        pq.poll();
//        }

 //       while(!pq.isEmpty())
//        result.add(0, pq.poll().getKey());