package com.mybank;

public class BankAccount {
    private double balance;
    private Individual owner;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Individual getOwner() {
        return owner;
    }

    public void setOwner(Individual owner) {
        this.owner = owner;
    }

    public boolean isOverdrawn() {
        return balance < 0;
    }

    public boolean isOwnerMajor() {
        return owner.getAge() >= 18;
    }
}
