package testing;

public class Pattern {

	public static void main(String[] args) {

		// Rectangle Pattern
		for (int i = 0; i < 4; i++) { // outer loop
			for (int j = 0; j < 5; j++) { // inner loop
				System.out.print("* ");
			}
			System.out.println();
		}

		// Hollow Rectangle
		System.out.println("\nHollow Rectangle -->");
		int n = 4;
		int m = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		// half pyramid
		System.out.println("\nHalf Pyrmid -->");
		n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Inverted Half Pyramid
		System.out.println(" \nInverted Half Pyramid -->");
		n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// Inverted Half Pyramid 180 degree
		System.out.println(" \nInverted Half Pyramid 180 degree -->");
		n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = n - i; k >= 1; k--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// half pyramid with numbers
		System.out.println("\nHalf Pyrmid with numbers -->");
		n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Inverted Half Pyramid with numbers
		System.out.println(" \nInverted Half Pyramid with numbers -->");
		n = 5;
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// Floyd's Triangle
		System.out.println("\nFloyd's Triangle -->");
		n = 5;
		int key = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(key + " ");
				key++;
			}
			System.out.println();
		}

		// 0-1 Triangle
		System.out.println("\n0-1 Triangle --> ");
		n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if ((i + j) % 2 == 0)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}

		System.out.println("\n0-1 Triangle --> ");
		n = 5;
		boolean flag = false;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				flag = !flag;
				if (flag)
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}

		// number pyramid
		System.out.println("\nNumber Pyramid --> ");
		n = 5;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// palindromic number pyramid
		System.out.println("\nPalindromic Number Pyramid --> ");
		n = 5;
		for (int i = 1; i <= n; i++) {
			key = i;
			for (int k = 1; k <= (n - i); k++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= ((i * 2) - 1); j++) {
				if (j < i) {
					System.out.print(key + " ");
					key--;
				} else {
					System.out.print(key + " ");
					key++;
				}
			}
			System.out.println();
		}

		// solid rhombus
		System.out.println("\nSolid Rhombus --> ");
		n = 10;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= (n - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}