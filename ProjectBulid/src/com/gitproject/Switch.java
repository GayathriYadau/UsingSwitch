package com.gitproject;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		//System.out.println("hello world");
		 Scanner sc = new Scanner(System.in);

	        int choice;
	        int quantity;
	        double total = 0;

	        do {
	            System.out.println("\n===== 🍽️ Restaurant Menu =====");
	            System.out.println("1. Burger - ₹100");
	            System.out.println("2. Pizza - ₹200");
	            System.out.println("3. Pasta - ₹150");
	            System.out.println("4. Sandwich - ₹80");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter quantity: ");
	                    quantity = sc.nextInt();
	                    total += quantity * 100;
	                    System.out.println("Burger added to order!");
	                    break;

	                case 2:
	                    System.out.print("Enter quantity: ");
	                    quantity = sc.nextInt();
	                    total += quantity * 200;
	                    System.out.println("Pizza added to order!");
	                    break;

	                case 3:
	                    System.out.print("Enter quantity: ");
	                    quantity = sc.nextInt();
	                    total += quantity * 150;
	                    System.out.println("Pasta added to order!");
	                    break;

	                case 4:
	                    System.out.print("Enter quantity: ");
	                    quantity = sc.nextInt();
	                    total += quantity * 80;
	                    System.out.println("Sandwich added to order!");
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 5);

	        System.out.println("\n🧾 Total Bill: ₹" + total);
	        System.out.println("🙏 Thank you for visiting!");
	    }
	

	

  

	}


