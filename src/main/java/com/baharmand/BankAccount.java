package com.baharmand;

public class BankAccount {

    private final Integer accountNumber;
    private double balance;
    private Customer customer;


    public BankAccount(Customer customer) {
        this.accountNumber = AccountNumberGenerator.generateNextAccountNumber();
        this.balance = 0.0;
        this.customer = customer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void printAccount() {
        System.out.println("Account Number: " + this.getAccountNumber());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public void deposit(double amount) {
        if (amount < 0) throw new IllegalArgumentException("Cannot deposit a negative amount.");
        balance += amount;
        System.out.println("Your balance is " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) throw new IllegalArgumentException("Withdrawal denied: insufficient founds.");
        if (amount < 0) throw new IllegalArgumentException("Cannot withdraw a negative amount.");
        balance -= amount;
        System.out.println("Your balance is " + balance);
    }


}
