/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atm_system;

/**
 *
 * @author hp
 */
public class Transaction1 {
    private  double amount;
    private  double thenewbalance;
    private  String transactiontype;

    public Transaction1(double amount, double thenewbalance, String transactiontype) {
        this.amount = amount;
        this.thenewbalance = thenewbalance;
        this.transactiontype = transactiontype;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public double getThenewbalance() {
        return thenewbalance;
    }
    
    
}

    
