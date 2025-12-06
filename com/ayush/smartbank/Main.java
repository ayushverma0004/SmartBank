
// This must be with the corresponding directory heirarchy
// Declaration of the file to be the part of this package (to avoid name conflict) 
package com.ayush.smartbank;

import com.ayush.smartbank.ui.MainUI;
import javafx.application.Application;

import com.ayush.smartbank.bank.Bank;
import com.ayush.smartbank.bank.Account;
import com.ayush.smartbank.bank.Transaction;
import com.ayush.smartbank.bank.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        
        //optional backend initializaton
        System.out.println("Booting backend system...");

        //Launch the UI tool
        Application.launch(MainUI.class, args);

        }
    }

