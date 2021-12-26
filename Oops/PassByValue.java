package Oops;

class Person {
    String name;
    int roll;

    public void details() {
        System.out.println("Name : "+this.name + ", Roll : "+this.roll);
    }
}

public class PassByValue {
    public static void main(String[] args) {
        System.out.println("JAVA is always pass by value.");
        // int a = 45;
        // int b = 67;
        // System.out.println("Before swap : a = "+a+", b = "+b);
        // swap(a, b);
        // System.out.println("After swap : a = "+a+", b = "+b);

        Person p1 = new Person();
        p1.name = "Raj";
        p1.roll = 25;
        p1.details();
        Person p3 = changedMe(p1);
        p1.details();
        p3.details();

        Person p2 = new Person();
        p2.name = "Rahul";
        p2.roll = 45;
        p2.details();

        // System.out.println("Before swap : name1 = "+p1.name+", name2 = "+p2.name);
        // swap(p1, p2);
        // System.out.println("After swap : name1 = "+p1.name+", name2 = "+p2.name);

        
    }

    public static void swap(Person p1, Person p2) {
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        System.out.println("In swap Function : name1 = "+p1.name+", name2 = "+p2.name);
    }

    public static Person changedMe(Person p) {
        Person pr = new Person();
        // pr = p;
        pr.name = "Mili";
        pr.roll = 109;
        return pr;
    }

    public static void swap(int c,int d) {
        int temp = c;
        c = d;
        d = temp;
        System.out.println("In swap Function : a = "+c+", b = "+d);
    }
}
