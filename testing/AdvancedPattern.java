package testing;

public class AdvancedPattern {
	public static int factorial(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		int f = 1;
		for (int i = 2; i <= num; i++) {
			f = f * i;
		}
		return f;
	}

	public static void main(String[] args) {
		// ------- Butterfly ---------------
		System.out.println("Butterfly ----");
		int n = 7;
		// upper half
		for (int i = 1; i <= n; i++) {
			// 1st part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// 2nd part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// lower half
		for (int i = n; i >= 1; i--) {
			// 1st part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// 2nd part
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ------------- Solid Rhombus --------
		System.out.println("\nSolid Rhombus ----");
		n = 7;
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int k = 1; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ----------Number Pyramid---------------
		System.out.println("\nNumber Pyramid ----");
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// numbers
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// =========== Palindromic Pattern =============
		System.out.println("\nPalindromic Pattern ----");
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print("  ");
			}
			// 1st half numbers
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			// 2nd half number
			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// ================ Diamond Pattern =============
		System.out.println("\nDiamond Pattern ---- ");
		// upper half
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Lower half
		for (int i = n; i >= 1; i--) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// half number pyramid
		System.out.println("\nNumber half pyramid -----");
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// numbers
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// inverted half pyramid
		System.out.println("\nInverted half pyramid ---");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i + 1); j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// pascal triangle
		System.out.println("\nPascal Triangle ----");
		for (int i = 0; i < n; i++) {
			// spaces
			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			// numbers
			for (int j = 0; j <= i; j++) {
				int k = (factorial(i) / (factorial(j) * factorial(i - j)));
				System.out.print(k + " ");
			}
			System.out.println();
		}

		// Hollow Rhombus
		System.out.println("\nHollow Rhombus ----");
		n = 7;
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			// stars
			for (int k = 1; k <= n; k++) {
				if (i == 1 || i == n || k == 1 || k == n)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		// =-=-=-=-=-=-=-=-=-= Hollow Butterfly ---------------
		System.out.println("\n Hollow Butterfly .....");
		n = 7;
		// upper half
		for (int i = 1; i <= n; i++) {
			// 1st part
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// 2nd part
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		// lower half
		for (int i = n; i >= 1; i--) {
			// 1st part
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// spaces
			for (int k = 1; k <= (2 * (n - i)); k++) {
				System.out.print(" ");
			}
			// 2nd part
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}