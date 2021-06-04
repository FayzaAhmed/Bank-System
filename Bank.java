package com.company;
import java.util.ArrayList;
/* Bank.java */
/** Class Bank :
 * A class to represent a bank Accounts and Clients
 * @author Fayza Ahmed
 * @version  1.6
 * @since 2021
 */

public class Bank {
    // State variables
    private String name;
    private String address;
    private String phone;
    private ArrayList<Client> arrayListClient = new ArrayList<Client>();
    private ArrayList<Account> arrayListAccount = new ArrayList<Account>();

    //default constructor
    /**
     * Class Default Constructor
     */
    public Bank() {
        name = " ";
        address = " ";
        phone = " ";
    }

    //parametrized constructor
    /**
     * Class parametrized constructor
     * @param name the name of the client
     * @param address the address of the client
     * @param phone the phone of the client
     */
    public Bank(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //function to set the name
    /** setting the name of the Bank
     * @param name of the Bank
     */
    public void setName(String name) {
        this.name = name;
    }

    //function to get the name
    /** getting the name of the Bank
     * @return the name
     */
    public String getName() {
        return name;
    }

    //function to set the address of the client
    /** setting the address of the Bank
     * @param address of the Bank
     */
    public void setAddress(String address) {
        this.address = address;
    }

    //function to get the address of the client
    /** getting the address of the Bank
     * @return address
     */
    public String getAddress() {
        return address;
    }

    //function to set the phone of the client
    /** setting the phone of the Bank
     * @param phone the phone of the Bank
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //function to get the phone of the client
    /** getting the phone of the Bank
     * @return phone
     */
    public String getPhone() {
        return phone;
    }


    //function to add the client to the arraylist
    /** Add the client to the arraylist
     * @param client to be added to the list
     */
    public void addClient(Client client)
    {
        arrayListClient.add(client);
        client.getAccount().setAccountNumber(Account.counter+1);
        Account.counter++;
        arrayListAccount.add(client.getAccount());
    }

    // display the clients
    /** Display all the clients in the arraylist
     */
    public void display()
    {
        for (Client c : arrayListClient)
        {
            System.out.println(c);
            System.out.println("****************************************");
        }
    }

}
