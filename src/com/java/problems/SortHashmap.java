package com.java.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortHashmap {

    public static HashMap<String, Integer> sortMapWithKey(HashMap<String, Integer> theMap){

   //     printMap(theMap);

        TreeMap<String, Integer> sortedMap = new TreeMap();
        sortedMap.putAll(theMap);

//        printMap(sortedMap);

        HashMap<String, Integer> returnMap = new HashMap<String, Integer>();
        returnMap.putAll(sortedMap);

        return returnMap;

    }


    private static void printMap(Map<String, Integer> args){
        // iterate using for loop
        for(String entry: args.keySet()){
            System.out.println(entry + ":"+args.get(entry));
        }

//        // iterate using iterator
//        Iterator<Map.Entry<String,Integer>> it = args.entrySet().iterator();
//        while(it.hasNext()){
//            String key = it.next().getKey();
//            System.out.print( key+";"+args.get(key));
//        }

    }



}
