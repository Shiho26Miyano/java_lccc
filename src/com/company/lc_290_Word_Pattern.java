package com.company;
import java.util.*;;

public class lc_290_Word_Pattern {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.trim().split(" ");
        if (pattern.length() != words.length) return false;
        Map<Character, String> map = new HashMap<>();
        int N = pattern.length();
        for (int i=0; i<N; i++) {
            String w = words[i];
            Character ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(w)) return false;
            } else if (map.values().contains(w)) return false;


            map.put(ch, w);
        }
        return true;
    }


    public static void main(String[] args){
        String[] strArray = new String[]{"gin", "zen", "gig", "msg"};
        int target = 5;
        String str1 = "abba";
        String str2 = "dog cat cat dog";
        boolean result =  wordPattern(str1, str2);
        System.out.println(result);
    }
}
