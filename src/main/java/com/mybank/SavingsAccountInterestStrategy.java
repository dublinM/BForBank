package com.mybank;

public class SavingsAccountInterestStrategy implements InterestCalculationBalance{

    public static final double INTEREST_RATE = 0.03;

    @Override
    public double calculateInterest(double balance) {
        return balance * INTEREST_RATE; // 3% d'intérêt
    }
}
