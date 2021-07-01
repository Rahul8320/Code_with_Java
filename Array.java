import java.util.Scanner;

public class Array
{
    public static void main(String[] args)
    {
        // * Array Declaration
        // int[] arr = new int[5];
        // int arr[] = new int[5];
        // ! all elements by defaults 0
        // double marks[] = {12.3, 45.6, 4.3, 89.2,72.5};
        // marks[2] = 54.3; // * change value latter
        // arr[2] = 109;
        // System.out.println(arr[2]);
        // System.out.println(marks[2]);
        // for(int i=0;i<marks.length;i++)
        // {
        //     System.out.println(marks[i]);
        // }

        // // for take input
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int n = sc.nextInt(); // ? for double nextDouble();
        double marks[] = new double[n];
        System.out.println("Enter marks of students : ");
        for(int i=0;i<n;i++)
        {
            marks[i] = sc.nextDouble();
        }
        sc.close();
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum += marks[i];
        }
        System.out.println("Average marks of Students is : "+(sum/n));
        // TODO  
    }
}