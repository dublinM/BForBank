package com.mybank;

public class SavingsAccountInterestStrategy implements InterestCalculationBalance{

    public static final double InterestRate = 0.03;

    @Override
    public double calculateInterest(double balance) {
        return balance * InterestRate; // 3% d'intérêt
    }
}
