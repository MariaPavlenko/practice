package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.*;
import static java.lang.Double.NaN;
import static org.testng.Assert.*;

public class TangentOperationTest {
    Operation number = new TangentOperation();

    @Test
    public void testApply() {
        Assert.assertEquals(number.apply(Math.PI / 4), 1, 0.01);
        Assert.assertEquals(number.apply(NaN), NaN);
        Assert.assertEquals(number.applyTriple(NaN), NaN);

    }
}