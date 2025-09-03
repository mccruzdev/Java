package com.learning;

import java.util.*;
import java.util.Arrays;


public class convertion {
    public static void main(String[] args) {

        //array
        String[] array = {"Alex", "Nayu", "Okata"};

        //arraylist
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList);

        //set
        var hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);

        //maps
        var hashMap = new HashMap<Integer, String>();
        int i=0;
        for (String name: hashSet){
            hashMap.put(i, name);
            i++;
        }
        System.out.println(hashMap);




    }
}
