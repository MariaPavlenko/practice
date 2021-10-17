package ru.ssau.tk.way1.practice;

import com.sun.source.tree.AssertTree;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Double.*;
import static org.testng.Assert.*;

public class IdenticalOperationTest {
    Operation number = new IdenticalOperation();

    @Test
    public void testApply() {
        Assert.assertEquals(number.apply(5.), 5.);
        Assert.assertEquals(number.applyTriple(6.), 6.);
        Assert.assertEquals(number.apply(NaN), NaN);
        Assert.assertEquals(number.applyTriple(NaN), NaN);
        Assert.assertEquals(number.apply(POSITIVE_INFINITY), POSITIVE_INFINITY);
        Assert.assertEquals(number.applyTriple(POSITIVE_INFINITY), POSITIVE_INFINITY);

    }
}