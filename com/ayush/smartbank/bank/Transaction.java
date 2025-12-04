package com.ayush.smartbank.bank;

import java.time.LocalDateTime;

public class Transaction {
    private final String transactionId;
    private final double amount;
    private final String type; //DEPOSIT OR WITHDRAWAL
    private final LocalDateTime timestamp;

    public Transaction(String transactionId, double amount, String type) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.timestamp = LocalDateTime.now(); // auto-stamp creation time
    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return type + " of Rs" + amount + " at" + timestamp;
    }
 

}