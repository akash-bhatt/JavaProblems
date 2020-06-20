package com.java.problems;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] inputArr){

        int swap = 0;

        for(int count=0;count<inputArr.length;count++) {
            for (int i = 0; i < inputArr.length - 1; i++) {
                if (inputArr[i] > inputArr[i + 1]) {
                    swap = inputArr[i + 1];
                    inputArr[i + 1] = inputArr[i];
                    inputArr[i] = swap;
                }
            }
        }
        Arrays.stream(inputArr).forEach(System.out::print);
        return inputArr;
    }


}
