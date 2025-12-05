package com.ayush.smartbank.bank;

public class SavingsAccount extends Account {
    private double interestRate;
    private double initialBalance;

    public SavingsAccount(String accountNumber, String holderName, double interestRate) {
        super(accountNumber, holderName, 0.0);
        this.interestRate = interestRate;
    }


    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); //users parent class deposit
    }



}