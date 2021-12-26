public class Array {
    public static void main(String[] args) {
        System.out.println("Program running ..");
        // dataType[] arrayName = new dataType[n];
        int[] arr1 = new int[5];
        for (int i=0;i<5;i++){
            arr1[i] = i +1;
        }
        // printArray(arr1, 5);
        // double marks[] = {97.5,98.2,90,92.3,99.9,70.45};
        // printArray(marks);

        // 2-D array
        int arr2[][] = new int[5][3];
        int k =1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                arr2[i][j] = k;
                k++;
            }
        }
        print2dArray(arr2, 5, 3);
        int arr3[][] = {{3,4,5,6},
                        {7,8,4,10},
                        {1,2,6,7}};
        print2dArray(arr3, 3, 4);
    }

    public static void printArray(double[] arr){
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" , ");
        }
        System.out.println();
    }

    public static void print2dArray(int[][] arr, int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 