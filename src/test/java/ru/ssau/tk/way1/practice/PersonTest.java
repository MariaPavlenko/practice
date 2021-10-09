package ru.ssau.tk.way1.practice;

import static org.testng.Assert.*;

public class PersonTest {
    @org.testng.annotations.Test
    public  void test(){
        Person bob = new Person();
        Person oleg = new Person();
        bob.setPassportId(575);
        bob.setFirstName("Bob");
        bob.setLastName("Kot");
        assertEquals(bob.getPassportId(),575);
        assertEquals(bob.getFirstName(), "Bob");
        assertEquals(bob.getLastName(), "Kot");
        oleg.setPassportId(626);
        oleg.setFirstName("Oleg");
        oleg.setLastName("Losik");
        assertEquals(oleg.getPassportId(),626);
        assertEquals(oleg.getFirstName(), "Oleg");
        assertEquals(oleg.getLastName(), "Losik");
    }

}