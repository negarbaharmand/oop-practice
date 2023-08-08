package com.baharmand;

public class AccountNumberGenerator {
    private static int accountCounter = 100; // Starting account number
    public static int generateNextAccountNumber () {
      return ++accountCounter;
    }
}
