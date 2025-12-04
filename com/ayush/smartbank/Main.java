
// This must be with the corresponding directory heirarchy
// Declaration of the file to be the part of this package (to avoid name conflict) 
package com.ayush.smartbank;

import com.ayush.smartbank.bank.Bank;
import com.ayush.smartbank.bank.Account;
import com.ayush.smartbank.bank.Transaction;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SmartBank Booting up ==="); // may be : initiating the control flow
    
        // // Constructor Bank(size) ; size : limit of Bank accounts
        // Bank mybank = new Bank(5); // we have a custom constructor function in Bank class
    
        // Account a1 = new Account("Ayush", 5000);
        // Account a2 = new Account("Verma", 2500);

        // myBank.addAccount(a1);
        // myBank.addAccount(a2);

        // System.out.println(myBank.getAccount(0).getBalance());
        // System.out.println(myBank.getAccount(1).getBalance());
    



        //create an account
        Account a = new Account("ACC101", "Neha", 5000);

        //perform actions
        a.deposit(2000);
        a.withdraw(1500);
        a.deposit(300);

        //check balance
        System.out.println("Final Balance: " + a.getBalance());

        //print all transactions
        System.out.println("\nTransaction History: ");
        for (Transaction t : a.getTransactions()) {
            System.out.println(t);
        }
    }
}

