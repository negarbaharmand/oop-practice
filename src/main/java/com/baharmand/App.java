package com.baharmand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BankAccount negarsAccount = new BankAccount("Negar", "NegarA@gmail.com", "0722915323");
        System.out.println("Account Number: " + negarsAccount.getAccountNumber());
        negarsAccount.deposit(1000);
        negarsAccount.withdraw(400);
        negarsAccount.withdraw(700);
    }
}
