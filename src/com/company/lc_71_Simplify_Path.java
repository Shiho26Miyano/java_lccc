package com.company;
import java.util.*;

public class lc_71_Simplify_Path {
    public static String simplifyPath(String path) {

        // Initialize a stack
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");


        // Split the input string on "/" as the delimiter
        // and process each portion one by one
        for (String directory : components) {
            System.out.println(stack);
            System.out.println(directory);
            // A no-op for a "." or an empty string
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } else if (directory.equals("..")) {

                // If the current component is a "..", then
                // we pop an entry from the stack if it's non-empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {

                // Finally, a legitimate directory name, so we add it
                // to our stack
                stack.push(directory);

            }
        }
        System.out.println(stack);

        // Stich together all the directory names together
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/" ;
    }

    public static void main(String[] args){
        String s =  "/a/./b/../../c/";
        //int[] nums2 = new int[]{2,2,3};
        //int target = 7;
        String result = simplifyPath(s);
        System.out.println(result);
    }


}
