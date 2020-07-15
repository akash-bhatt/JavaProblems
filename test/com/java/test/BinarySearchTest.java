package com.java.test;

import com.java.problems.BinarySearch;
import com.java.problems.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BinarySearchTest {

    @Test
    void testBinarySearch(){

        //setup
        int [] i = new int[] {11,17,23,34,39,45,67,78,83,89,90};

        //act
        int result = BinarySearch.binarySearch(i,89);

        //assert
        Assertions.assertEquals(9, result);


    }
}
