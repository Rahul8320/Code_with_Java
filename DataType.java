import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        System.out.println("Program running...........");
        // int age = 10;
        // System.out.println("Your Age : " + age);

        // // Type Casting
        // byte x = 4;
        // int y = x;
        // System.out.println(y);

        // double myDouble = 3.144;
        // int myInt = (int)myDouble;
        // System.out.println(myDouble);
        // System.out.println(myInt);
        
        // // Taking User input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Your Name : ");
        // String name = sc.next(); // nextLine(), nextInt(), nextDouble()
        // sc.close();
        // System.out.println("Your Name : "+name);

        // Simple interest
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        float rate = 12.5f;
        int year = sc.nextInt();
        sc.close();

        float simpleInterest = (principal * rate * year ) / 100;
        System.out.println("Simple Interest : "+simpleInterest);
    }
}
