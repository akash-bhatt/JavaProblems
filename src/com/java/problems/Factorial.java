package com.java.problems;

public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static int factorial(int i){
        int f = 1;

        while(i > 0){
            f= f*(i--);
        }
        return f;
    }
}
