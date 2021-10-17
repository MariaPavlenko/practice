package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.*;
import static org.testng.Assert.*;

public class SqrtOperationTest {
    Operation number = new SqrtOperation();

    @Test
    public void testApply() {
        Assert.assertEquals(number.apply(16.), 4.);
        Assert.assertEquals(number.applyTriple(256.), 2.);
        Assert.assertEquals(number.apply(NaN), NaN);
        Assert.assertEquals(number.applyTriple(NaN), NaN);
        Assert.assertEquals(number.apply(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(number.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(number.apply(NEGATIVE_INFINITY), NaN);
        Assert.assertEquals(number.applyTriple(NEGATIVE_INFINITY), NaN);
    }
}