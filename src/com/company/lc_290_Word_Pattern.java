package com.company;
import java.util.*;;

public class lc_290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map_index.containsKey(c))
                map_index.put(c, i);

            if (!map_index.containsKey(w))
                map_index.put(w, i);

            if (map_index.get(c) != map_index.get(w))
                return false;
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
