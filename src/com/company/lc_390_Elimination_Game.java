package com.company;
//left(2n)=2 right(n)
///As after 1 round , half of elements get eliminated .
//right(n) denotes elimination will start from end

//right(n)=n-left(n)+1

//Since same priciple is followed in left(n) and right(n) only the element will be from end
//for eg:
//from left => 1 2 3 4 5 ans= 2
//from right => 1 2 3 4 5 ans=(5-2+1)= 4

//We then combine the above eqn :

//left(2n)=2(n-left(n)+1)
//left(n)=2(n/2 -left(n/2)+1)

public class lc_390_Elimination_Game {



    public int lastRemaining(int n) {
        if(n==1)
            return n;
        return 2*(1+n/2-lastRemaining(n/2));

    }
}
