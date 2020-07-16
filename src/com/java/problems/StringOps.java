package com.java.problems;

public class StringOps {

    public static String getFirstOccurrence1stVar(String str){

        char[] inputArr = str.toCharArray();

        String retStr = null;

        for(int i = 0; i < inputArr.length;i++)  // this means to go over the full array a,g,h,i,k,l
        {
            for(int j = 0; j< i ; j++)   // this means go to the elememt of outside loop a| a,g | a,g,h |
            {
                if(i == j)continue;
                if(inputArr[i] == inputArr [j]){

                    retStr = Character.toString(inputArr[j]);
                    break;
                }
            }
            if(retStr!=null)break;
        }

        return retStr;
    }

    public static String getFirstOccurrence2ndVar(String str){

        char[] inputArr = str.toCharArray();

        String retStr = null;

        for(int i = 0; i < inputArr.length;i++) //,ab,c d,e,f,g
        {
            for(int j = 0; j< inputArr.length ; j++)  // start with outer loop element a|b|c -- end of array
            {
                if(i == j)continue;
                if(inputArr[i] == inputArr [j]){

                    retStr = Character.toString(inputArr[j]);
                    break;
                }
            }
            if(retStr!=null)break;
        }

        return retStr;
    }

    public static String sortStringByFrequency(String str){

        char[] inputArr = str.toCharArray();

        char[] charArr = new char[str.length()];

        int [] freqArr = new int[str.length()];

        String retStr = null;
        int location = 0;

        for(int i = 0; i < inputArr.length;i++)
        {
            for(int j = 0; j< inputArr.length ; j++)
            {
                if(inputArr[i] == inputArr [j])
                {
                    charArr[location] = inputArr[j];
                    int count = freqArr[location];
                    count++;
                    freqArr[location] = count;
                }
            }
            if(retStr!=null) break;
        }

        return "";
    }

    public static String removeDuplicates(String str){

        char[] inputArr = str.toCharArray();

        char [] resultArr = new char[str.length()];

        int index = 0;

        for(int i = 0; i < inputArr.length;i++)
        {
            boolean found = false;
            for(int j = 0; j < resultArr.length; j++)
            {
                if(inputArr[i] == resultArr[j]) { // if i find the element i'll break
                    found = true;
                    break;
                }
            }
            if (!found) // checked in the entire array but count not fine
            {
                resultArr[index++] = inputArr[i];
            }
        }

        return new String(resultArr);
    }

}
