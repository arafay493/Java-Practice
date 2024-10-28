package com.example.bank;

public class Bank {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public Bank(long accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + " to account " + accountNumber + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public double withDraw(double amount) {
        if (amount < 0) {
            System.out.println("Invalid withdrawal amount.");
            return 0;
        } else if (amount < balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account " + accountNumber + ". New balance: " + balance);
            return amount;
        } else {
            System.out.println("Insufficient funds for withdrawal.");
            return 0;
        }
    }
}
