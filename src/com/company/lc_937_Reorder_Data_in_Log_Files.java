package com.company;
import java.util.*;

public class lc_937_Reorder_Data_in_Log_Files {
    public String[] reorderLogFiles(String[] logs) {
        Comparator<String> customComp = new Comparator<String>(){
            //Arrays.sort(logs, (a,b)->{
            public int compare(String a, String b){
                int identA = a.indexOf(" ") + 1;
                int identB = b.indexOf(" ") + 1;

                boolean isLetterA = Character.isLetter(a.charAt(identA));
                boolean isLetterB = Character.isLetter(b.charAt(identB));

                if(isLetterA && isLetterB){
                    // first compare the content
                    int cmp = a.substring(identA).compareTo(b.substring(identB));
                    if(cmp != 0) return cmp;
                    // logs of same content, compare the identifiers
                    return a.compareTo(b);
                }else if (isLetterA && !isLetterB){
                    return -1;
                }else if(!isLetterA && isLetterB){
                    return 1;
                }else return 0;
            }

        };
        Arrays.sort(logs, customComp);
        return logs;

    }
}
