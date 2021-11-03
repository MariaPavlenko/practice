package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {
    ResettableIntGenerator first = new ResettableIntGenerator();

    @Test
    public void testReset() {
        Assert.assertEquals(first.nextInt(), 0);
        Assert.assertEquals(first.nextInt(), 1);
        first.reset();
        Assert.assertEquals(first.nextInt(), 0);
    }
}