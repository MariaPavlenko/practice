package ru.ssau.tk.way1.practice;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PersonTestone {
    Person tom = new Person(434);
    Person oleg = new Person("Oleg", "Somov", Person.Gender.MALE);
    Person sara = new Person("Sara", "Kotova", 6468, Person.Gender.FEMALE);

    @Test
    public void testGetFirstName() {
        Person bob = new Person();
        bob.setFirstName("Bob");
        assertEquals(bob.getFirstName(), "Bob");
        assertEquals(sara.getFirstName(), "Sara");
        assertEquals(oleg.getFirstName(), "Oleg");
    }

    @Test
    public void testGetLastName() {
        Person bob = new Person();
        bob.setLastName("Bob");
        assertEquals(bob.getLastName(), "Bob");
        assertEquals(sara.getLastName(), "Kotova");
        assertEquals(oleg.getLastName(), "Somov");
    }

    @Test
    public void testGetPassportId() {
        Person bob = new Person();
        bob.setPassportId(676);
        assertEquals(bob.getPassportId(), 676);
        assertEquals(tom.getPassportId(), 434);
        assertEquals(sara.getPassportId(), 6468);
    }

    @Test
    public void testGetGender() {
        Person bob = new Person();
        bob.setGender(Person.Gender.MALE);
        assertEquals(bob.getGender(), Person.Gender.MALE);
        assertEquals(oleg.getGender(), Person.Gender.MALE);
        assertEquals(sara.getGender(), Person.Gender.FEMALE);
    }
}