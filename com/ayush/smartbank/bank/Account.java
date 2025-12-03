package com.ayush.smartbank.bank;

public class Account {

    private String holderName;
    private double balance;

    public Account(String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() {
        return balance; 
    }

    public void deposit(double amount) {
        balance += amount;
    }




}