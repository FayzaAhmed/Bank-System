package com.company;
/* Client.java */
/**  Client Class :
 * A class to represent the clients of the bank
 * it has some attributes such as name, NID, address, phone, and account
 * @author Asmaa Refat
 * @version  1.6
 * @since 2021
 */

public class Client
{
    // State Attributes
    private String name;
    private int nationalID;
    private String address;
    private String phone;
    private Account account = new Account(); //aggregation

    //default constructor
    /**
     * Class Default Constructor
     */
    public Client() {
        name = " ";
        nationalID = 0;
        address = " ";
        phone = " ";
        account.setAccountNumber(0);
        account.setBalance(0.0);
    }

    //parametrized constructor
    /**
     * Class parametrized constructor
     * @param name the name of the client
     * @param nationalID the national ID of the client
     * @param address the address of the client
     * @param phone the phone of the client
     * @param account the account of the client
     */
    public Client(String name, int nationalID, String address, String phone, Account account)
    {
        this.name = name;
        this.nationalID = nationalID;
        this.address = address;
        this.phone = phone;
        this.account = account;
    }

    //function to set the name
    /** setting the name of the client
     * @param name of the client
     */
    public void setName(String name)
    {
        this.name = name;
    }

    //function to get the name
    /** getting the name of the client
     * @return the name
     */
    public String getName ()
    {
        return name;
    }

    //function to set the nationalID
    /** setting the national ID of the client
     * @param nationalID the national ID of the client
     */
    public void setNationalID(int nationalID)
    {
        this.nationalID = nationalID;
    }

    //function to get the National ID of the client
    /** getting the National ID of the client
     * @return the national id
     */
    public int getNationalID()
    {
        return nationalID;
    }

    //function to set the address of the client
    /** setting the address of the client
     * @param address of the client
     */
    public void setAddress(String address)
    {
        this.address = address;
    }

    //function to get the address of the client
    /** getting the address of the client
     * @return address
     */
    public String getAddress()
    {
        return address;
    }

    //function to set the phone of the client
    /** setting the phone of the client
     * @param phone the phone of the client
     */
    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    //function to get the phone of the client
    /** getting the phone of the client
     * @return phone
     */
    public String getPhone()
    {
        return phone;
    }

    // Function to set the account
    /** Setting the Account for the client
     * @param account the client's Account
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    // Function to get the account
    /** Getting the Account for the client
     * @return the client's Account
     */
    public Account getAccount()
    {
        return account;
    }

    // Override toString function to display the client information
    /**
     * Override the toString() Function.
     */
    @Override
    public String toString()
    {
        return "Client name = " + name + "\nClient national ID = " + nationalID + "\nClient address = " + address
                + "\nClient phone = " + phone + "\n" + getAccount().toString();
    }

}
