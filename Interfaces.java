package oops;

public class Interfaces{
    public static void main(String[] args) {

        Anonymous p1 = new Anonymous("Rahul Dey",728,"HP",485000);
        p1.details();
        p1.profile();

    }
}

class Anonymous implements Laptop,Hacker{
    public String brand ;
    public int price ;
    public String name ;
    public int score ;

    Anonymous(String name,int score,String brand,int price){
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.score = score;
    }
    @Override
    public void details() {
        System.out.println("Brand : "+this.brand+"\nPrice : "+this.price);
    }

    @Override
    public void profile() {
        System.out.println("Name : "+this.name+"\nScore : "+this.score);
    }
}

interface Laptop{
    public void details();
}

interface Hacker{
    public void profile();
}