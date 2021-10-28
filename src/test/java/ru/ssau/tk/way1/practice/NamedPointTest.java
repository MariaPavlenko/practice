package ru.ssau.tk.way1.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {
    NamedPoint name = new NamedPoint(4, 5, 6);
    NamedPoint pointOne = new NamedPoint(5.6, 4, 7, "B");
    NamedPoint pointTwo = new NamedPoint();

    @Test
    public void testGetName() {
        name.setName("A");
        Assert.assertEquals(name.getName(), "A");
        Assert.assertEquals(pointOne.getName(), "B");
        Assert.assertEquals(pointTwo.getName(), "Origin");
    }
}