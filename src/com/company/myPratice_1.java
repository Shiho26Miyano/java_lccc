package com.company;

public class myPratice_1 {

    public static int recurSum(int k){
        if (k > 0){
            return k + recurSum(k - 1);

        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        int result = recurSum(5);
        System.out.println((result));
    }
}

