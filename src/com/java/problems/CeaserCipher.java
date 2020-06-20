package com.java.problems;

public class CeaserCipher {

    public static String getWord(String str, int n){

        char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        char[] inpStr = str.toCharArray();

        int count = 0;

        char[] finalStr = new char[str.length()];

        int i = 0;
                for(char a: inpStr){
                    count = 0;
                    while(count < alphabets.length)
                    {
                        if(alphabets[count]==a){
                            break;
                        }
                        count++;
                    }
                    int finalind = (count -1 )+ n;
                    if(finalind > alphabets.length){
                        finalind = finalind - alphabets.length;
                    }
                    finalStr[i++]= alphabets[finalind];
                }
                return new String(finalStr);
    }
}
