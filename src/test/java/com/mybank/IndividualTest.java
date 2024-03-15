package com.mybank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IndividualTest {

    Individual individual = new Individual("Manel", 18);

    @Test
    public void testSetAge() {
        individual.setAge(20);
        assertEquals(20, individual.getAge());

    }
}
