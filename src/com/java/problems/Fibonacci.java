package com.java.problems;

public class Fibonacci {

    public static int getFibonacciNum(int n){

        int f1 = 0;

        int f2 = 1;

        if(n==0){
            return -1;
        }
        if(n==1)
        {
            return f1;
        }
        if(n==2){
            return f2;
        }


        int fb = f2;

        for(int i=3; i<n;i++)
        {
           f1 = f2;
           f2 = fb;
           fb = f1 + f2;
        }

        return fb;
    }


}
