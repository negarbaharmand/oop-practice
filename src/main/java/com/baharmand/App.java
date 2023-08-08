package com.baharmand;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Negar", "negar@gmail.com", "042356467");
        BankAccount bankAccount1 = new BankAccount(customer1);
        bankAccount1.setBalance(100);
        bankAccount1.printAccount();
        bankAccount1.deposit(200);
        bankAccount1.withdraw(150);

    }
}
