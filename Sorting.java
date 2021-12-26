import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Babble sort : ");
        babbleSort(arr);
        System.out.println("Selection sort : ");
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minInd = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[minInd] > arr[j]){
                    minInd = j;
                }
            }
            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    public static void babbleSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    flag = false;
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            if(flag) break;
        }
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int item:arr) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
