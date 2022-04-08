package com.sparta.largestint.test;

import com.sparta.largestint.LargestInteger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LargestIntegerTest {
    private static LargestInteger largeInt;

    @BeforeAll
    public static void setUp(){
        largeInt = new LargestInteger();
    }

    @Test
    public void testNormalArray() {
        int result = largeInt.getSecondLargestInt(new int[]{-2, -10, 10, 10, 12, 13, 6});
        int expected = 12;
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testSmallArray() {
        int result = largeInt.getSecondLargestInt(new int[]{2});
        int expected = 2;
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testNegativeArray() {
        int result = largeInt.getSecondLargestInt(new int[]{-10, -5, -10, -5, -2, -2, -3});
        int expected = -3;
        Assertions.assertEquals(result, expected);
    }
}
