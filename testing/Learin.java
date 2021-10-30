package testing;

import java.util.Scanner;

public class Learin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.print("Hello I am Learing Java \nfrom Apni Khaskha\n");
//		System.out.println("I am Next Line.");
//
//		System.out.println("*\n**\n***\n****");
//		System.out.println("**");
//		System.out.println("***");
//		System.out.println("****");
//
//		int a = 10;
//		int b = 5;
//		System.out.println(a + b);
//		System.out.println(a * b / a - b);
//		System.out.println((a * b) / (a - b));
//
//		// Input
//		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		System.out.println(name);

		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if (age > 18) {
//			System.out.println("Adult");
//		} else {
//			System.out.println("Not Adult!");
//		}

//		int num = sc.nextInt();
//		if (num % 2 == 0) {
//			System.out.println("Even");
//		} else {
//			System.out.println("ODD");
//		}

//		int b = sc.nextInt();
//		if (num == b) {
//			System.out.println("Equal");
//		} else if (num > b) {
//			System.out.println(num + " IS Greater.");
//		} else {
//			System.out.println(num + " IS Lesser.");
//		}

//		System.out.println("Press? 1. 2. 3.");
//		int button = sc.nextInt();
//		switch (button) {
//		case 1:
//			System.out.println("Hello");
//			break;
//		case 2:
//			System.out.println("Namasthe");
//			break;
//		case 3:
//			System.out.println("Banjaro");
//			break;
//		default:
//			System.out.println("Invalid Button");
//			break;
//		}
//		System.out.println("Thank You.");
		int num = sc.nextInt();
//		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " * " + num + " = " + i * num);
		}
//		System.out.println(sum);
		sc.close();
	}

}