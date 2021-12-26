package Oops;

class Person {
    String name;
    int age;
    int height;
    Person(String name,int age,int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
    public void sleep() {
        System.out.println(this.name + " is sleeping.");
    }
}

class Phone {
    String model;
    String display;
    int ram;
    int rom;
    Phone(String model,String display,int ram,int rom) {
        this.model = model;
        this.display = display;
        this.ram = ram;
        this.rom = rom;
    }
    public void charge() {
        System.out.println(this.model + " is charging.");
    }
    public void call() {
        System.out.println(this.model + " is calling.");
    }
    public void details() {
        System.out.println("Model : "+this.model+"\nDisplay : "+this.display+"\nRam : "+this.ram+"gb\nRom: "+this.rom+"gb");
    }
}

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person("Rahul Dey",21,5);
        p1.eat();

        Phone ph1 = new Phone("Redmi note 4","lcd",4,64);
        ph1.charge();
        ph1.details();
    }
}
