package com.company;
import java.util.ArrayList;
/* Account.java */

/** Account Class :
 * A class to represent a bank account with an account number and a balance that
 * can be changed by deposits and withdrawals.
 * @author Fayza Ahmed
 * @version  1.6
 * @since 2021
 */

public class Account {
    // State variables
    private double balance;
    private int accountNumber;
    /** Static counter*/
    public static int counter = 0; //Static counter

    // Default Constructor
    /**
     * Class constructor.
     */
    public Account ()
    {
        balance = 0.0;
        accountNumber = 0;
    }

    // Method sets the balance
    /** Sets the balance of the account.
     * @param balance the balance
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    // Method return the balance
    /** Gets the current balance of the account in dollars.
     * @return the balance
     */
    public double getBalance()
    {
        return balance;
    }

    // Method sets the AccountNumber
    /** Sets the number of the account.
     * @param accountNumber the account number
     */
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    // Method return the AccountNumber
    /** Gets the number of the account.
     * @return the account number
     */
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // Override toString function to display the account information
    /** Override the toString() Function.
     */
    @Override
    public String toString() {
        return "Account balance = " + balance + "\nAccount Number = " + accountNumber ;
    }

    // method that withdraw only a available amount of money.
    /** Withdraws money from the bank account.
     * @param withdrawAmount the amount of money to withdraw
     */
    public void withdraw(double withdrawAmount)
    {
        if (withdrawAmount <= balance) // if there are enough money
        {
            balance = balance - withdrawAmount; //withdraw the money
        }
        else // if there are not enough money
        {
            System.out.println("No enough money to withdraw ): ");
        }
    }

    // method that deposits (adds) only a valid amount to the balance
    /** Deposits money in the account.
     * @param depositAmount The amount of money to deposit.
     */
    public void deposit(double depositAmount)
    {
        if (depositAmount > 0.0) // if the depositAmount is valid
        {
            balance = balance + depositAmount; // add it to the balance
        }
        else
        {
            System.out.println("value must be greater than 0");
        }
    }
}