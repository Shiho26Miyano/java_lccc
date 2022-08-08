package com.company;
import java.util.*;;

public class lc_290_Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap <Character, String> map_char = new HashMap();
        HashMap <String, Character> map_word = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!map_char.containsKey(c)) {
                if (map_word.containsKey(w)) {
                    return false;
                } else {
                    map_char.put(c, w);
                    map_word.put(w, c);
                }

            } else {
                String mapped_word = map_char.get(c);
                if (!mapped_word.equals(w))
                    return false;
            }
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
