package com.company;

public class lc_415_Add_strings {
    public static String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();

        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        while (p1 >= 0 || p2 >= 0) {
            int x1 = p1 >= 0 ? num1.charAt(p1) - '0' : 0;
            int x2 = p2 >= 0 ? num2.charAt(p2) - '0' : 0;
            System.out.println(x1);
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            res.append(value);
            p1--;
            p2--;
        }

        if (carry != 0)
            res.append(carry);
        System.out.println(res);
        return res.reverse().toString();
    }


    public static void main(String[] args){
        String x = "12345";
        String y = "2345";
        System.out.println(addStrings(x, y));

    }
}
