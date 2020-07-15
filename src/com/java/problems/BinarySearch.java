package com.java.problems;

public class BinarySearch {

    public static int binarySearch(int [] arr, int num){

        return binarySearch(arr,0,arr.length-1,num);
    }

    private static int binarySearch(int [] input, int leftIndex, int rightInd, int num){
        int returnVal = 0;
        int midInd = Math.round((rightInd + leftIndex)/2);
        if (num == input[midInd]) returnVal = midInd;
        else if (num < input[midInd]){
            returnVal = binarySearch(input,leftIndex,midInd,num); // left side
        }else {
            returnVal = binarySearch(input, midInd + 1, rightInd, num); // right side
        }
        return returnVal;
    }
}
