
// This must be with the corresponding directory heirarchy
// Declaration of the file to be the part of this package (to avoid name conflict) 
package com.ayush.smartbank;

import com.ayush.smartbank.bank.Bank;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SmartBank Booting up ==="); // may be : initiating the control flow
    
        // Constructor Bank(size) ; size : limit of Bank accounts
        Bank mybank = new Bank(5); // we have a custom constructor function in Bank class
    
        Account a1 = new Account("Ayush", 5000);
        Account a2 = new Account("Verma", 2500);

        myBank.addAccount(a1);
        myBank.addAccount(a2);

        System.out.println(myBank.getAccount(0).getBalance());
        System.out.println(myBank.getAccount(1).getBalance());
    
    }
}

