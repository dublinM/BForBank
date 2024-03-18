package com.mybank;

public class BankAccount {
    private double balance;
    private Individual owner;
    private InterestCalculationBalance interestCalculationStrategy;



    public BankAccount(double balance) {
        this.balance = balance;
        // Définir une stratégie par défaut si nécessaire
        this.interestCalculationStrategy = new CheckingAccountInterestStrategy();
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

    public InterestCalculationBalance getInterestCalculationStrategy() {
        return interestCalculationStrategy;
    }

    public void setInterestCalculationStrategy(InterestCalculationBalance strategy) {
        this.interestCalculationStrategy = strategy;
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

    public void addInterest() {
        double interest = interestCalculationStrategy.calculateInterest(balance);
        balance += interest;
    }

}
