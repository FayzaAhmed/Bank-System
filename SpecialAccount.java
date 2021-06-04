package com.company;
/* SpecialAccount.java */
/** Special Account Class :
 * A bank account with an account number and a balance that
 * can be changed by deposits and withdrawals with extra 1000$.
 * @author Fayza Ahmed
 * @version  1.6
 * @since 2021
 */


public class SpecialAccount extends Account {

    // Default Constructor
    /**Class constructor.
     */
    public SpecialAccount()
    {
        super();
    }

    // Override method that withdraw for a special account
    /** Overriding the Withdraw function.
     *  Withdraws money from the special bank account.
     * @param withdrawAmount the amount of money to withdraw
     */
    @Override
    public void withdraw(double withdrawAmount)
    {
        if (getBalance() + 1000 >= withdrawAmount && withdrawAmount >= 0)
        {
            setBalance(getBalance() - withdrawAmount);
        }
        else
        {
            System.out.println("You can not withdraw more than " + (getBalance() + 1000));
        }
    }

}

