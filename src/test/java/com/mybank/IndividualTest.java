package com.mybank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndividualTest {

    private Individual individual;

    @Before
    public void setUp() {
        individual = new Individual("Manel", 30);
    }

    @Test
    public void testConstructorWithName() {
        Individual individual = new Individual("Ali");
        assertEquals("Ali", individual.getName());
        assertEquals(0, individual.getAge());
    }

    @Test
    public void testConstructorWithNameAndAge() {
        Individual individual = new Individual("Kamelia", 12);
        assertEquals("Kamelia", individual.getName());
        assertEquals(12, individual.getAge());
    }

    @Test
    public void testGetName() {
        assertEquals("Manel", individual.getName());
    }

    @Test
    public void testSetName() {
        individual.setName("Alice");
        assertEquals("Alice", individual.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(30, individual.getAge());
    }

    @Test
    public void testSetAge() {
        individual.setAge(25);
        assertEquals(25, individual.getAge());
    }
}
