package com.company;
/* CommercialClient.java */
/** CommercialClient Class :
 * A class to represent the company clients of the bank
 * @author Asmaa Refat
 * @version  1.6
 * @since 2021
 */


public class CommercialClient extends Client
{
    //state attribute
    private int commercialID;

    //default constructor
    /**
     * Class Default Constructor
     */
    public CommercialClient ()
    {
        super();
        commercialID = 0;
    }

    //class constructor
    /**
     * class Parametrized constructor
     * @param name the name of the Commercial client
     * @param commercialID the national ID of the Commercial client
     * @param address the address of the Commercial client
     * @param phone the phone of the Commercial client
     * @param account the account of the Commercial client
     * @param nationalID the national ID set to be 00000000000000
     */
    public CommercialClient(String name, int nationalID, String address, String phone, Account account, int commercialID)
    {
        super(name, nationalID, address, phone, account);
        super.setNationalID(00000000000000);
        this.commercialID = commercialID;
    }

    //function for setting the commercial id for the company
    /** setting the commercial id for the company
     * @param commercialID the commercial ID for the company
     */
    public void setCommercialID(int commercialID )
    {
        this.commercialID = commercialID;
    }

    //function for getting the commercial id
    /** getting the commercial id
     * @return  the commercial id
     */
    public int getCommercialID()
    {
        return commercialID;
    }

    // Override toString function to display the commercial client information
    /**
     * Override the toString() Function to print the commercial client details
     */
    @Override
    public String toString()
    {
        return "Commercial name = " + super.getName() + "\nCommercial id = " + commercialID +
                "\nCommercial address = " + super.getAddress() + " \nCommercial phone = " + super.getPhone()
                +"\nCommercial balance = " + getAccount().getBalance() + "\nCommercial account number = "
                + getAccount().getAccountNumber();
    }

}

