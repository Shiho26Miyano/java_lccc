package com.company;
import java.util.*;
public class lc_720_Longest_Word_in_Dictionary {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> built = new HashSet<String>();
        String res = "";
        for (String w : words) {
            System.out.println(built);
            if (w.length() == 1 || built.contains(w.substring(0, w.length() - 1))) {
                res = w.length() <= res.length() ? res : w;
                built.add(w);
            }
        }
        return res;
    }

}
