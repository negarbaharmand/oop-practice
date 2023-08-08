package com.baharmand;

public class Customer {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(String customerName, String email, String phoneNumber) {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getCustomerName() {
        if (customerName == null) throw new IllegalArgumentException("Name was null.");
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        if (email == null) throw new IllegalArgumentException("Email was null.");
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        if (phoneNumber == null) throw new IllegalArgumentException("PhoneNumber was null.");
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
