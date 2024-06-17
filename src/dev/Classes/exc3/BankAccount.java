package dev.Classes.exc3;

public class BankAccount {
    private static int counter = 0;
    private int id;
    private double balance;
    private static double interestRate = 0.02;

    public BankAccount(double balance) {
        this.id = ++counter;
        this.balance = balance;

    }

    public BankAccount(){
        this(0);
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterest(int years) {
        return interestRate * years * this.balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public void deposid(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }

    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", interestDate=" + interestRate +
                '}';
    }
}
