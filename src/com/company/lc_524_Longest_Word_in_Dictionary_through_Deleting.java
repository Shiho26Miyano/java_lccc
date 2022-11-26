package com.company;
import java.util.*;

public class lc_524_Longest_Word_in_Dictionary_through_Deleting {
    public String findLongestWord(String s, List<String> d) {
        String res="";
        for (String c: d)
            if ((c.length()>res.length() || c.length()==res.length() && c.compareTo(res)<0) && isSubseq(c, s)) res=c;
        return res;
    }
    public boolean isSubseq(String a, String b){
        int i=-1, j=-1;
        while (++i<a.length()) if ((j=b.indexOf(a.charAt(i), j+1))==-1) return false;
        return true;
    }
}
