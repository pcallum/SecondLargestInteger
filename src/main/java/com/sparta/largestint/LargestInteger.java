package com.sparta.largestint;

public class LargestInteger {
    public static int getSecondLargestInt(int[] intArr) {

        /*if (intArr.length == 0) {

        }*/

        int max = intArr[0]; int secondMax = intArr[0];

        for(int i : intArr) {
            max = (i > max) ? i : max;
        }

        for(int i : intArr) {
            secondMax = (i > secondMax && i < max) ? i : secondMax;
        }

        return secondMax;
    }

}
