package com.java.test;

import com.java.problems.BubbleSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    void testBubbleSort(){

        //setup
        int [] i = new int[] {5,4,3,2,1};
        int [] exp = new int [] {1,2,3,4,5};

        //act
        int [] result = BubbleSort.bubbleSort(i);

        //assert
        Assertions.assertArrayEquals(result, exp);


    }
}
