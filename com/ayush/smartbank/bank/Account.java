package com.ayush.smartbank.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Account {

    private String accountNumber;
    private String holderName;
    private double balance;

    // New: a timeline of all events that ever happened
    private List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double balance) {
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;

        //record transaction
        Transaction t = new Transaction(UUID.randomUUID().toString(),amount,"Deposit");
        transactions.add(t);
    }


    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance.");
            return;
        }

        balance -= amount;
        //record transaction
        Transaction t = new Transaction(UUID.randomUUID().toString(),amount,"Withdrawal");
        transactions.add(t);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }


    public double getBalance() {
        return balance; 
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

}

// will use overriding model
