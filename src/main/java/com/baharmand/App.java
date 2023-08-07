package com.baharmand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        BankAccount negarAccount = new BankAccount("Negar", "NegarA@gmail.com", "0722915323");
        negarAccount.printAccount();
        negarAccount.deposit(1000);
        negarAccount.withdraw(400);
        negarAccount.withdraw(700);

        BankAccount erikAccount = new BankAccount("Erik", "Erik@hotmail.com", "0745663325");
        erikAccount.printAccount();

        BankAccount jointAccount = new BankAccount("Erik & Hannah", "Erik@hotmail.com", "0745663325");
        jointAccount.printAccount();
    }
}
