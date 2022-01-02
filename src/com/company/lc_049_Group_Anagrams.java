package com.company;
import java.util.*;

public class lc_049_Group_Anagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            //System.out.println(s);
            //System.out.println(ca);
            //for (char c : ca) {
            //    System.out.println(c);
            // }

            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }

        return new ArrayList(ans.values());
    }
    public static void main(String[] args){
        //List<MyType> myList = new ArrayList<>();
        //List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));

    }
}
// Approach: Categorize by Sorted String
// Maintain a map ans : {String -> List} where each key \text{K}K is a sorted string,
// and each value is the list of strings from the initial input that when sorted,
// are equal to \text{K}K.