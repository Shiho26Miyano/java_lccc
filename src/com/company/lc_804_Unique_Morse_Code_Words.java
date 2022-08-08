package com.company;
import java.util.*;
public class lc_804_Unique_Morse_Code_Words {
    public static int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            System.out.println(code);
            seen.add(code.toString());
        }

        return seen.size();
    }
    public static void main(String[] args){
        String[] strArray = new String[]{"gin", "zen", "gig", "msg"};
        int target = 5;
        int result = uniqueMorseRepresentations(strArray);
        System.out.println((result));
    }
}
