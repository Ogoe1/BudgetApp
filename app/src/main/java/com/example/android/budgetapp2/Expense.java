package com.example.android.budgetapp2;

/**
 * Created by Ekow Bentsi-Enchill on 8/22/2017.
 */
public class Expense{
    private String itemName;
    private double maxAmount;
    private double moneySpent;
    private double cashRemaining;

    public Expense(){}

    public Expense(String itemName, double maxAmount, double moneySpent){
        this.itemName = itemName;
        this.maxAmount = maxAmount;
        this.moneySpent = moneySpent;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName = itemName;
    }

    public double getMaxAmount(){
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount){
        this.maxAmount = maxAmount;
    }

    public double getMoneySpent(){
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent){
        this.moneySpent = moneySpent;
    }

    public double getCashRemaining(){
        cashRemaining = maxAmount - moneySpent;
        return cashRemaining;
    }

    public void setCashRemaining(double cashRemaining){
        this.cashRemaining = cashRemaining;
    }
}
