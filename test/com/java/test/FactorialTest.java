package com.java.test;

import com.java.problems.Factorial;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FactorialTest {

    @Test
    void testFactorial(){

        //setup


        // test
        int result = Factorial.factorial(7);


        // assert
        assertEquals(5040,result);
    }
}
