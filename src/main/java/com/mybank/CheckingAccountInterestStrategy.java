package com.mybank;

public class CheckingAccountInterestStrategy implements InterestCalculationBalance{


    public static final double InterestRate = 0.01;

    @Override
    public double calculateInterest(double balance) {
        // Exemple de taux d'intérêt pour un compte courant, généralement plus bas
        return balance * InterestRate; // 1% d'intérêt

    }

}
