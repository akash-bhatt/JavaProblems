package com.java.test;

import com.java.problems.SortHashmap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class SortHashMapTest {

    @Test
    void testSortedMapWithKey(){

        //setup
        HashMap<String, Integer> testMap = new HashMap<>();
        testMap.put("deepa",31);
        testMap.put("akash",36);
        testMap.put("badri",37);
        testMap.put("pradeep",32);
        testMap.put("harshita",29);

        HashMap<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("akash",36);
        expectedMap.put("badri",37);
        expectedMap.put("deepa",31);
        expectedMap.put("harshita",29);
        expectedMap.put("pradeep",32);
        //act
        HashMap<String, Integer> actualMap = SortHashmap.sortMapWithKey(testMap);

        //assert
        Assertions.assertEquals(expectedMap,actualMap);

    }
}
