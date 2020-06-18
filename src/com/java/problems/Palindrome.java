package com.java.problems;

public class Palindrome {

    public static boolean checkPalindrome(String str){

        char [] string = str.toCharArray();

        int count = 0;

        boolean result = false;

        while(count < str.length()){

            if(string[count]==string[str.length()-(count+1)]) {

                count++;
                continue;
            }else{
                break;
            }
        }
        if(count==str.length()){
            result = true;
        }
        return result;
    }
}
