package com.mybank;

public class BankAccount {
    private double balance;
    private Individual owner;
    private InterestCalculationBalance interestCalculationStrategy;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public BankAccount(Individual owner) {
        this.owner = owner;
    }

    public BankAccount(double balance, Individual owner) {
        this.balance = balance;
        this.owner = owner;
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

    public double credit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double debit(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    public void wire (double amount, BankAccount sender, BankAccount receiver) {
        sender.debit(amount);
        receiver.credit(amount);
    }
}
