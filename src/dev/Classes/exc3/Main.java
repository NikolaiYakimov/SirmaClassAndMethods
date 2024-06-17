package dev.Classes.exc3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BankAccount acc1 = new BankAccount(250.2);
//        BankAccount acc2 = new BankAccount(250.5);
//        System.out.println(acc1.toString());
//        System.out.println(acc2);
        List<BankAccount> accounts = new ArrayList<>();

        while (true) {
            String[] input = scanner.nextLine().split(" ");
            String comand = input[0];
            switch (comand) {
                case "Create": {
                    BankAccount account = new BankAccount();
                    accounts.add(account);
                    System.out.println("Account ID" + account.getId() + " created");
                    break;
                }
                case "Deposit": {
                    int id = Integer.parseInt(input[1]);
                    double amount = Double.parseDouble(input[2]);
                    BankAccount accountTrue = null;
                    for (BankAccount account : accounts) {
                        if (account.getId() == id) {
                            accountTrue = account;
                        }
                    }

                    if (accountTrue != null) {
                        accountTrue.deposid(amount);
                        System.out.println("Deposited " + amount + " to " + id);
                    } else {
                        System.out.println("Account does not exist");
                    }

                    break;
                }
                case "SetInterest": {
                    double interestRate = Double.parseDouble(input[1]);
                    BankAccount.setInterestRate(interestRate);
                    break;
                }
                case "GetInterest": {
                    int id = Integer.parseInt(input[1]);
                    int years = Integer.parseInt(input[2]);
                    BankAccount trueAccount=null;
                    for (BankAccount account : accounts) {
                        if (account.getId() == id) {
                            trueAccount=account;
                        }
                    }
                    if(trueAccount!=null){
                    double interestAmount = trueAccount.getInterest(years);
                    System.out.println("Interest for " + id + " for " + years + " years is " + interestAmount);
                } else {
                    System.out.println("Account does not exist");
                }
                    break;
                }
                case "End":
                    return;
            }

        }
    }
}
