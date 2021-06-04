package com.company;
import java.util.Scanner;
import java.util.ArrayList;
/** Main Function
 * Run the program
 * @author Fayza Ahmed
 * @version  1.6
 * @since 2021
 */


public class Main {
    /** Main function
     * contains the Main Menu
     * user can choose from three choices: add client, display clients, exist
     * @param args the String main args
     */
    public static void main(String[] args) {
        //public Main Function
        int choice;
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank("Misr", "Egypt", "11223344");
        do{
            System.out.println("Choose What You want to do :");
            System.out.println("1- Add Client.");
            System.out.println("2- Display the Clients and their accounts information.");
            //System.out.println("3- Withdraw.");
            //System.out.println("4- Deposit.");
            System.out.println("3- Exist.");

            choice = input.nextInt() ;
            switch (choice)
            {
                case 1:
                {
                    System.out.println("Commercial (1) or client (2) ?");
                    int answer = input.nextInt();
                    if (answer == 1)
                    {
                        CommercialClient commercial = new CommercialClient();
                        System.out.println("Enter information in this order :\nName Address Phone CommercialID " );
                        commercial.setName(input.next());
                        commercial.setAddress(input.next());
                        commercial.setPhone(input.next());
                        commercial.setCommercialID(input.nextInt());
                        System.out.println("Is it SpecialAccount? (Yes/No)");
                        String bool = input.next();
                        if (bool.equalsIgnoreCase("yes"))
                        {
                            SpecialAccount account = new SpecialAccount();
                            System.out.println("Enter the balance :");
                            account.setBalance(input.nextDouble());
                            commercial.setAccount(account);
                            System.out.println("Deposit (1) or Withdraw (2) ?");
                            int operation = input.nextInt();
                            if (operation == 1)
                            {
                                System.out.println("Enter the Amount of money to add : ");
                                double money = input.nextDouble();
                                account.deposit(money);
                            }
                            else if (operation == 2)
                            {
                                System.out.println("Enter the Amount of money to Withdraw : ");
                                double money = input.nextDouble();
                                account.withdraw(money);
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                        else
                        {
                            Account account = new Account();
                            System.out.println("Enter the balance :");
                            account.setBalance(input.nextDouble());
                            commercial.setAccount(account);
                            System.out.println("Deposit (1) or Withdraw (2) ?");
                            int operation = input.nextInt();
                            if (operation == 1)
                            {
                                System.out.println("Enter the Amount of money to add : ");
                                double money = input.nextDouble();
                                account.deposit(money);
                            }
                            else if (operation == 2)
                            {
                                System.out.println("Enter the Amount of money to Withdraw : ");
                                double money = input.nextDouble();
                                account.withdraw(money);
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                        bank.addClient(commercial);
                        System.out.println("Your Account Number : " + commercial.getAccount().getAccountNumber());
                    }
                    else if (answer == 2)
                    {
                        Client client = new Client();
                        System.out.println("Enter information in this order :\nName Address Phone NationalID " );
                        client.setName(input.next());
                        client.setAddress(input.next());
                        client.setPhone(input.next());
                        client.setNationalID(input.nextInt());
                        System.out.println("Is it SpecialAccount? (Yes/No)");
                        String bool = input.next();
                        if (bool.equalsIgnoreCase("yes"))
                        {
                            SpecialAccount account = new SpecialAccount();
                            System.out.println("Enter the balance :");
                            account.setBalance(input.nextDouble());
                            client.setAccount(account);
                            System.out.println("Deposit (1) or Withdraw (2) ?");
                            int operation = input.nextInt();
                            if (operation == 1)
                            {
                                System.out.println("Enter the Amount of money to add : ");
                                double money = input.nextDouble();
                                account.deposit(money);
                            }
                            else if (operation == 2)
                            {
                                System.out.println("Enter the Amount of money to Withdraw : ");
                                double money = input.nextDouble();
                                account.withdraw(money);
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                        else
                        {
                            Account account = new Account();
                            System.out.println("Enter the balance :");
                            account.setBalance(input.nextDouble());
                            client.setAccount(account);
                            System.out.println("Deposit (1) or Withdraw (2) ?");
                            int operation = input.nextInt();
                            if (operation == 1)
                            {
                                System.out.println("Enter the Amount of money to add : ");
                                double money = input.nextDouble();
                                account.deposit(money);
                            }
                            else if (operation == 2)
                            {
                                System.out.println("Enter the Amount of money to Withdraw : ");
                                double money = input.nextDouble();
                                account.withdraw(money);
                            }
                            else
                            {
                                System.out.println("Invalid Input.");
                            }
                        }
                        bank.addClient(client);
                        System.out.println("Your Account Number : " + client.getAccount().getAccountNumber());
                    }
                    else
                    {
                        System.out.println("Invalid answer.");
                    }
                    break;
                }
                case 2:
                {
                    bank.display();
                    break;
                }
                case 3:
                {
                    System.out.println("Existing...");
                    break;
                }
                default: System.out.println("Not 1, 2 or 3");
            }//switch bracket

        }while (choice != 3);
    }
}
