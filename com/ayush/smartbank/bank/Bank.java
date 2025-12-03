// declaring it as the part of the package 

package com.ayush.smartbank.bank;

public class Bank {

      private Account[] accounts; //an array to store the datatype Account object
    private int accountCount; 

    public Bank(int size) {
        System.out.println("Bank System Ready");

        // Now the accounts identifier points to a new array of Account
        accounts = new Account[size];
        
        accountCount = 0;
    }

    public void addAccount(Account acc) {
        // only if the limit of account adding is available
        if (accountCount < accounts.length) {
            accounts[accountCount] = acc; //storing at 0,1,2....accountCount, always adding
            accountCount++;
        }
    }
  
    // a method of return type Account which returns account at required index (may be the account number)
    public Account getAccount(int index) {
        return accounts[index];
    }


    // summary - 
    // starts : Creates an array of Account, accountCount set to 0
    // addAccount : Adds account, increases the counts
    // getAccount : returns the Account data type at requied index.

}