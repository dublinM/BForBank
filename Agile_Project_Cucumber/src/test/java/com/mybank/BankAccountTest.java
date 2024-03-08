package com.mybank;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testIsOverdrawn() {
        BankAccount account = new BankAccount(100);
        assertFalse(account.isOverdrawn());

    }

    @Test
    public void testIsOverdrawn2() {
        BankAccount account = new BankAccount(-50);
        assertTrue(account.isOverdrawn());

    }

    @Test
    public void testIsOwnerMajor() {
        Individual owner = new Individual("Manel", 24);
        BankAccount account = new BankAccount(13000);
        account.setOwner(owner);
        assertTrue(account.isOwnerMajor());
    }

    @Test
    public void testIsOwnerMajor2() {
        Individual owner = new Individual("Kamelia", 15);
        BankAccount account = new BankAccount(0);
        account.setOwner(owner);
        assertFalse(account.isOwnerMajor());
    }



}
