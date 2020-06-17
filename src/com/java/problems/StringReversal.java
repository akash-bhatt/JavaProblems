package com.java.problems;

public class StringReversal {

    public static String reverse(String str){

        char[] strChar = str.toCharArray();
        char[] finalChar = new char[str.length()];
        int ind = str.length()-1;

        for (char a: strChar){
            finalChar[ind--] = a;
        }

        return new String(finalChar);
    }


}
