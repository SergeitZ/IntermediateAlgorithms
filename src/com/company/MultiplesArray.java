package com.company;
import java.util.*;

public class MultiplesArray {

//    public static void arrayOfMultiples(int num, int length) {
//        List<Integer> arrayOfMultiples = new ArrayList<>();
//        for (int i = 1; i < length + 1; i++) {
//            arrayOfMultiples.add(num * i);
//        }
//        System.out.println(arrayOfMultiples);
//    }

    public static String arrayOfMultiples(int num, int length) {

        int[] solutionArray = new int[length];

        for (int i = 0; i < length; i++) {
            solutionArray[i] = num * (i + 1);
        }
        return Arrays.toString(solutionArray);
    }

}
