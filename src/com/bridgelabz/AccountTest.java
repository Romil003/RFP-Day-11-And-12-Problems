package com.bridgelabz;

import java.util.Scanner;

class Account {
    int balanceAmount = 50000  ;

    public void debitMoney(int amount) {
//        if(amount <= balanceAmount){
            balanceAmount = balanceAmount-amount;
            System.out.println("Remaining balance amount : Rs." + balanceAmount);
            System.out.println("Withdrawing amount : Rs." + amount);
//        }
//        else{
//            System.out.println("Debit amount exceeded account balance");
//        }
    }
}



public class AccountTest extends Account {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AccountTest user1 = new AccountTest();
        System.out.println(user1.balanceAmount);

        do {
            System.out.print("Enter amount to debit : ");
            int amount = input.nextInt();
            if(amount <= user1.balanceAmount){
                user1.debitMoney(amount);
                break;
            }
            else {
                System.out.println("Debit amount exceeded account balance");
                System.out.println("Please Re-enter the correct amount : ");
                int amount1 = input.nextInt();
                if (amount1 <= user1.balanceAmount){
                    user1.debitMoney(amount1);
                    break;
                }
            }
        }while (user1.balanceAmount != 0);
    }
}
