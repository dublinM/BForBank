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

    @Test
    public void testCredit() {
        BankAccount account = new BankAccount(2000);
        assertEquals(2100, account.credit(100), 0.01);

    }

    @Test
    public void testDebit() {
        BankAccount account = new BankAccount(2000);
        assertEquals(1900, account.debit(100), 0.01);

    }

    @Test
    public void testWire() {
        Individual sender = new Individual("Manel");
        Individual receiver = new Individual("Kamelia");
        BankAccount accountSender = new BankAccount(2000, sender);
        BankAccount accountReceiver = new BankAccount(0, receiver);
        accountSender.wire(1000, accountSender, accountReceiver);
//        assertEquals(1000, accountSender.getBalance(), 0.01);
        assertEquals(1000, accountReceiver.getBalance(), 0.01);

    }

}
