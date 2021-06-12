package com.bankaccount;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int userChoice;

		boolean quit = false;

		String name = "Vaibhav";
		System.out.println("Account holder name- " + name);
		float balance = 10000f;
		System.out.println("Account Balance " + balance);

		do {
			System.out.println("1. Add money");
			System.out.println("2. Remove money");
			System.out.println("3. Show balance");
			System.out.println("4. Exit ");

			System.out.println("Enter choice:");
			userChoice = in.nextInt();
			switch (userChoice) {

			case 1:

				float amount;
				System.out.print("Amount to deposit: ");
				amount = in.nextFloat();
				if (amount <= 0)
					System.out.println("Can't deposit nonpositive amount.");

				else {
					balance += amount;
					System.out.println(amount + " has been deposited.");
				}
				break;

			case 2:
				System.out.print("Amount to withdraw: ");
				amount = in.nextFloat();
				if (amount > 2000 || amount > balance)
					System.out.println("Withdrawal can't be completed.");
				else {
					balance -= amount;
					System.out.println( amount + " has been withdrawn.");
				}
				break;

			case 3:
				System.out.println("Your balance: " + balance);
				break;
				
			case 4:
				quit = true;
				break;

			default:
				System.out.println("Wrong choice.");
				break;
			}
			System.out.println();

		} while (!quit);

		System.out.println("Bye!");

	}

}