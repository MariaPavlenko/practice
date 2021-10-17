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
}