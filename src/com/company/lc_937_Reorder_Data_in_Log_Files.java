package com.company;
import java.util.*;

public class lc_937_Reorder_Data_in_Log_Files {
    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComp = new Comparator<String>() {
            //Arrays.sort(logs, (a,b)->{
            @Override
            public int compare(String a, String b) {
                // split each log into two parts: <identifier, content>
                int identA = a.indexOf(" ") + 1;
                int identB = b.indexOf(" ") + 1;

                boolean isLetterA = Character.isLetter(a.charAt(identA));
                boolean isLetterB = Character.isLetter(b.charAt(identB));
                if(isLetterA && isLetterB){
                    int cmp = a.substring(identA).compareTo(b.substring(identB));
                    if(cmp != 0) return cmp;

                    return a.compareTo(b);
                }else if(isLetterA && !isLetterB){
                    return -1;
                }else if(!isLetterA && isLetterB){
                    return 1;
                }else return 0;

            }
        };

        Arrays.sort(logs, myComp);
        return logs;
    }
}
