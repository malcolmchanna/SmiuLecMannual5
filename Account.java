package com.company;
import java.util.Scanner;

public class Account {

         double balance;
         public void setDeposit(double deposit){
               balance =  balance +  deposit;
           }
         public void setWithdraw(double neg){
               balance = balance - neg;
           }
         public void setInterest(double percent){
              double now =((balance/100)*percent);
             balance = balance + now;
         }

         public double getBalance(){
               return  balance ;
          }

         public void desplay() {
              System.out.println("Your Balance: " + getBalance());
          }

    public static void main(String[] args) {
         Account account  = new Account();
         Scanner input = new Scanner(System.in );

        System.out.println("MUZAMIL JAMIL CHANNA");
         System.out.println("Enter amount for deposit");
        double deposit = input.nextDouble();
        account.setDeposit(deposit); account.desplay();

        System.out.println("\nEnter amount for Withdraw");
        double neg = input.nextDouble();
        account.setWithdraw(neg); account.desplay();

        System.out.println("\nEnter amount for interest ");
        double per = input.nextDouble();
        account.setInterest(per); account.desplay();

    }
}

