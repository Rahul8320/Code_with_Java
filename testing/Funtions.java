package testing;

import java.util.Scanner;

public class Funtions {

	public static void printMyName(String name) {
		System.out.println("Your Name : " + name);
		return;
	}

	public static int calculateSum(int a, int b) {
		return (a + b);
	}

	public static int calculateProduct(int a, int b) {
		return (a * b);
	}

	public static int factorial(int num) {
		if (num < 0) {
			return -1;
		}
		if (num == 0 || num == 10) {
			return 1;
		}
		int f = 1;
		for (int i = 2; i <= num; i++) {
			f = f * i;
		}
		return f;
	}

	public static int oddSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static int printGreater(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void avarage(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("Avarage : " + sum / 3);
	}

	public static void powerOfn(int x, int n) {
		int temp = n;
		int ans = 1;
		while (n > 0) {
			ans = ans * x;
			n--;
		}
		System.out.println(x + " Power of " + temp + " : " + ans);
	}

	public static void countNumbers() {
		Scanner sc = new Scanner(System.in);
		int positive = 0, negetive = 0, zero = 0;
		while (true) {
			System.out.println("Press 1.Continue 2.Stop");
			int input = sc.nextInt();
			if (input != 1) {
				break;
			} else {
				System.out.print("Enter your Number : ");
				int num = sc.nextInt();
				if (num > 0)
					positive++;
				else if (num < 0)
					negetive++;
				else
					zero++;
			}
		}
		System.out.println("Positive : " + positive + ", Negetive : " + negetive + ", Zero : " + zero);
		sc.close();
		return;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String name = sc.nextLine();
//		printMyName(name);
//		int firstNum = sc.nextInt();
//		int secondNum = sc.nextInt();
//		System.out.println("Sum : " + calculateSum(firstNum, secondNum));
//		System.out.println("Product : " + calculateProduct(firstNum, secondNum));
//		System.out.println("Factorial : " + factorial(firstNum));
//		int thirdNum = sc.nextInt();
//		avarage(firstNum, thirdNum, secondNum);
//		int n = sc.nextInt();
//		System.out.println("Odd Sum Till " + n + " : " + oddSum(n));
//		System.out.println("Greater of two : " + printGreater(firstNum, secondNum));
//		powerOfn(firstNum, secondNum);
		countNumbers();
		sc.close();
		return;
	}

}
