package ru.ssau.tk.way1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    @Test
    public void testNextInt() {
        IntGeneratorImpl first = new IntGeneratorImpl();
        assertEquals(first.nextInt(), 0);
        assertEquals(first.nextInt(), 1);
    }
}