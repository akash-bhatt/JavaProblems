package com.java.test;

import com.java.problems.StringOps;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StringOpsTest {

    @Test
    public void testSearchString1stVar() {

        //setup
        String testString = "bcfgagee";
        String expected = "g";

        //act
        String actual = StringOps.getFirstOccurrence1stVar(testString);


        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSearchString2ndVar() {

        //setup
        String testString = "bcfgagee";
        String expected = "g";

        //act
        String actual = StringOps.getFirstOccurrence2ndVar(testString);


        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortStringByFrequency() {

        //setup
        String testString = "geeksforgeeks";
        String expected = "forggkksseeee";

        //act
        String actual = StringOps.sortStringByFrequency(testString);


        //assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDuplicate() {

        //setup
        String testString = "bananas";
        String expected = "bans";

        //act
        String actual = StringOps.removeDuplicates(testString).trim();


        //assert
        Assertions.assertEquals(expected, actual);
    }
}
