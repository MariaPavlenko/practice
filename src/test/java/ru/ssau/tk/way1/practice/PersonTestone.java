package ru.ssau.tk.way1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTestone {

    @Test
    public void testGetFirstName() {
        Person bob = new Person();
        bob.setFirstName("Bob");
        assertEquals(bob.getFirstName(),"Bob");
    }

    @Test
    public void testGetLastName() {
        Person bob= new Person();
        assertEquals(bob.getLastName(),"Bob");
        bob.setLastName("Bob");
    }

    @Test
    public void testGetPassportId() {
        Person bob= new Person();
        bob.setPassportId(676);
        assertEquals(bob.getPassportId(), 676);
    }
}