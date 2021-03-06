package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

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

    @Test
    public void testArrWithoutThreeA() {
        Assert.assertEquals(arr1.arrWithoutThreeA(5), new int[]{1, 2, 4, 5, 7});
    }

    @Test
    public void testArr12() {
        Assert.assertEquals(arr1.arr12(7), new Integer[]{2, 3, 5, 7});
    }

    @Test
    public void testArr13() {
        Assert.assertEquals(arr1.arr13(7), new int[]{1, 2, 3, 4, 3, 2, 1});
    }

    int[] b = new int[]{1, 2, 3, 4, 5};

    @Test
    public void testArr14() {
        int[] a = new int[]{1, 2, 3};
        arr1.arr14(a);
        Assert.assertEquals(a, new int[]{-1, -2, -3});
    }

    @Test
    public void testArr15() {
        Assert.assertEquals(arr1.arr15(b, 4), true);
    }
}