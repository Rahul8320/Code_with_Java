package testing;

import java.util.Scanner;

public class BankSystem {

	public static void main(String[] args) {
		System.out.println("Welcome to bank system.");
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Hello, " + name);
		int balance = 0;
		int key = 0;
		do {
			System.out.println("What do yout want? 1. Deposite 2. Withdrow 3. Check Balance");
			key = sc.nextInt();
			switch (key) {
			case 1:
				System.out.println("Enter Amount ");
				int amount = sc.nextInt();
				balance = deposite(amount, balance);
				break;
			case 2:
				System.out.println("Enter Amount ");
				amount = sc.nextInt();
				balance = withdrow(amount, balance);
				break;
			case 3:
				System.out.println("Current Balance : " + balance);
				break;

			default:
				break;
			}
		} while (key < 4);
		sc.close();

	}

	public static int deposite(int amount, int balance) {
		return (balance + amount);
	}

	public static int withdrow(int amount, int balance) {
		if (balance > amount) {
			return (balance - amount);
		} else {
			System.out.println("Insufficent balance.");
			return balance;
		}
	}
}
