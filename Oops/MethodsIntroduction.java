package Oops;

public class MethodsIntroduction {
    public static void main(String[] args) {
        Print(sum(4,5));
        Print(sum(4,5,6));
        Print(sum(3.4,5.6));
        Print(max(5,6));
        Print(max(4.5f,6.7f));
    }

    static void Print(int value){
        System.out.println(value);
    }

    static void Print(double value){
        System.out.println(value);
    }

    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int sum(int num1, int num2, int num3) {
        return (num1+num2+num3);
    }

    public static double sum(double num1, double num2) {
        return (num1+num2);
    }

    public static int max(int a, int b) {
        if(a>b) return a;
        else return b;
    }

    public static float max(float a, float b) {
        if(a>b) return a;
        else return b;
    }
}
