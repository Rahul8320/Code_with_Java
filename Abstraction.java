package oops;

public class Abstraction {
    public static void main(String[] args) {

        BMW b1 = new BMW();
        Audi a1 = new Audi();

        b1.price = 70;
        a1.price = 65;

        b1.getPrice();
        a1.getPrice();

        b1.start();
        a1.start();
        b1.stop();
        a1.stop();
    }
}

class BMW extends Car{

    @Override
    void getPrice() {
        System.out.println("Price of BMW Car : "+this.price);
    }

    @Override
    void start() {
        System.out.println("BMW is starting ....");
    }
}

class Audi extends Car{

    @Override
    void getPrice() {
        System.out.println("Price of Audi Car : "+this.price);
    }

    @Override
    void start() {
        System.out.println("Audi is starting .....");
    }
}

abstract class Car{

    public int price;
    abstract void getPrice();
    abstract void start();

    void stop(){
        System.out.println("Car is stopped now.");
    }
}