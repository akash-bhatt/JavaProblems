package com.java.test;

import com.java.problems.StringReversal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringReversalTest {

    @Test
    void testReverse(){

    //setup


    //act

        String result = StringReversal.reverse("Deepa Akash");

    //assert
        String expected = "hsakA apeeD";
        Assertions.assertEquals(expected,result);

    }

}
