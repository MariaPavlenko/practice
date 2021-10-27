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

    @Test
    public void testArrEven() {
        Assert.assertEquals(arr1.arrEven(5), new int[]{10, 8, 6, 4, 2});
    }

    @Test
    public void testArrSqr() {
        Assert.assertEquals(arr1.arrSqr(5), new int[]{0, 1, 4, 9, 16});
    }

    @Test
    public void testArrQuadraticEquation() {
        Assert.assertEquals(arr1.arrQuadraticEquation(1, 2, 1), new double[]{-1});
    }
}