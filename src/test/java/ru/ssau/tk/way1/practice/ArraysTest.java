package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraysTest {
    Arrays arr1 = new Arrays();
    int[] first = arr1.arr(5);

    @Test
    public void testArr() {
        Assert.assertEquals(first.length, 5);
    }

    @Test
    public void testArrOneTwo() {
        Assert.assertEquals(arr1.arrOneTwo(5), new int[]{2, 1, 1, 1, 2});
    }
}