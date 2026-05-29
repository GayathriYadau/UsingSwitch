package com.gitproject;

import java.util.Scanner;

public class ATMsumulation {

	public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int balance = 1000;
		        int choice;

		        while (true) {

		            System.out.println("\n===== ATM MENU =====");
		            System.out.println("1. Check Balance");
		            System.out.println("2. Deposit");
		            System.out.println("3. Withdraw");
		            System.out.println("4. Exit");
		            System.out.print("Enter your choice: ");

		            choice = sc.nextInt();

		            switch (choice) {

		                case 1:
		                    System.out.println("Your Balance: " + balance);
		                    break;

		                case 2:
		                    System.out.print("Enter deposit amount: ");
		                    int deposit = sc.nextInt();
		                    balance = balance + deposit;
		                    System.out.println("Money Deposited Successfully!");
		                    break;

		                case 3:
		                    System.out.print("Enter withdraw amount: ");
		                    int withdraw = sc.nextInt();

		                    if (withdraw <= balance) {
		                        balance = balance - withdraw;
		                        System.out.println("Withdraw Successful!");
		                    } else {
		                        System.out.println("Insufficient Balance!");
		                    }
		                    break;

		                case 4:
		                    System.out.println("Thank you for using ATM!");
		                    sc.close();
		                    System.exit(0);

		                default:
		                    System.out.println("Invalid choice! Try again.");
		            }
		        }
		    }

}
