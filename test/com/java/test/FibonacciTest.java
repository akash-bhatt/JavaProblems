package com.java.test;

import com.java.problems.Fibonacci;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testGetFibonnaciNum(){

        //setup

        //act
        int result = Fibonacci.getFibonacciNum(11);

        //assert
        Assertions.assertEquals(55,result);

    }
}
