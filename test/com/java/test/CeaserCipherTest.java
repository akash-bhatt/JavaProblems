package com.java.test;


import com.java.problems.CeaserCipher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CeaserCipherTest {

    @Test
    void testGetWord(){
        //setup

        //act
        String finalStr = CeaserCipher.getWord("zebra",5);

        //assert
        Assertions.assertEquals("difve",finalStr);

    }
}
