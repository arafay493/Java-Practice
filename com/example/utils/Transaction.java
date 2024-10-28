package com.example.utils;

import com.example.bank.Bank;

public class Transaction {

    public static void main(String[] args) {
        Bank hbl = new Bank(12345, "Rafay", 20000.60);
        // System.out.println("Balance : " + hbl.getBalance());
        // hbl.withDraw(200);
        // hbl.deposit(1000);
        hbl.withDraw(-200);

    }

}
