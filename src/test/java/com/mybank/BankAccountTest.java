package com.mybank;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;
    private Individual owner;

    @Before
    public void setUp() {
        owner = new Individual("John", 30);
        account = new BankAccount(owner);
    }

    @Test
    public void testConstructorWithBalance() {
        BankAccount account = new BankAccount(1000.0);
        assertEquals(1000.0, account.getBalance(), 0.001);
    }

    @Test
    public void testConstructorWithOwner() {
        assertEquals(owner, account.getOwner());
    }

    @Test
    public void testConstructorWithBalanceAndOwner() {
        BankAccount account = new BankAccount(2000.0, owner);
        assertEquals(2000.0, account.getBalance(), 0.001);
        assertEquals(owner, account.getOwner());
    }

    @Test
    public void testGetBalance() {
        assertEquals(0.0, account.getBalance(), 0.001);
    }

    @Test
    public void testSetBalance() {
        account.setBalance(500.0);
        assertEquals(500.0, account.getBalance(), 0.001);
    }

    @Test
    public void testGetOwner() {
        assertEquals(owner, account.getOwner());
    }

    @Test
    public void testSetOwner() {
        Individual newOwner = new Individual("Alice", 25);
        account.setOwner(newOwner);
        assertEquals(newOwner, account.getOwner());
    }

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
        BankAccount sender = new BankAccount(1000.0);
        BankAccount receiver = new BankAccount(0.0);
        account.wire(500.0, sender, receiver);
        assertEquals(500.0, sender.getBalance(), 0.001);
        assertEquals(500.0, receiver.getBalance(), 0.001);
    }


    @Test
    public void testAddInterest() {
        InterestCalculationBalance strategy = new CheckingAccountInterestStrategy();
        account = new BankAccount(1000.0, strategy);
        account.addInterest();
        assertEquals(1010, account.getBalance(), 0.001);
    }

    @Test
    public void testAddSavingInterest() {
        InterestCalculationBalance strategy = new SavingsAccountInterestStrategy();
        account = new BankAccount(1000.0, strategy);
        account.addInterest();
        assertEquals(1030, account.getBalance(), 0.001);
    }

}
