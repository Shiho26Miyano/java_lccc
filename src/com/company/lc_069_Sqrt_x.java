package com.company;
import java.util.*;

public class lc_069_Sqrt_x {

    public static int mySqrt(int x) {

        if(x==0 || x==1)
            return x;

        int start=1;
        int end=x/2;
        int ans=0;



        while(start<=end)
        {
            int mid=start+(end-start)/2;

            if(mid<=x/mid)          //To escape the INT OVERFLOW
            {ans=mid;
                start=mid+1;}
            else
                end=mid-1;
        }
        return ans;

    }


    public static void main(String[] args){
        //int[] intArray = new int[]{2,7,11,15};
        int target = 7;
        int result = mySqrt(target);
        System.out.println(result);
    }
}
