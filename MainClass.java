package oops;

public class MainClass {
    public static void main(String[] args) {

//        System.out.println("Hello World");
//
//        Person p2 = new Person();
//        p2.name = "Soumili Kar";
//        p2.age = 21;
//        p2.gender = 'F';
//
//        p2.details();
//        p2.eat();


        Person p1 = new Person("Rahul Dey",21,'M');

        p1.details();
        p1.eat();
        p1.walk();
        p1.walk(4);

        Developer d1 = new Developer("Anu Sharma",24,'M',"Software Engineer","Freshers","Flipkart pvt. ltd.");
        d1.jobProfile();
        d1.walk();
        d1.doWork();

//        System.out.println(Person.count + " objects created.");
    }
}

//   inheritance
class Developer extends Person{

    String jobRoll;
    String workExperience;
    String companyName;

    public Developer (String name,int age,char gender,String jobRoll,String workExperience,String companyName){
        super(name, age, gender);
        this.jobRoll = jobRoll;
        this.workExperience = workExperience;
        this.companyName = companyName;
    }

    public void jobProfile(){
        details();
        System.out.println("Job Roll : "+this.jobRoll+"\nWork Experience : "+this.workExperience+"\nCompany Name : "+this.companyName);
    }

    //   run time Polymorphism [ at run time it is decides which walk() called.]
    public void walk(){
        System.out.println(this.name +" ("+ this.jobRoll+" at "+this.companyName + ") is walking.");
    }
    public void doWork(){
        System.out.println(this.name + " is working at the position "+ this.jobRoll + " at "+this.companyName);
    }
}

class Person {
    String name;
    int age;
    char gender;

    static int count = 0;

    // default Constructor
//    public Person(){
//        count++;
//        System.out.println("Object created.");
//    }

    // Constructor
    public Person(String name,int age,char gender){
//        this(); // call previous constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void details(){
        System.out.println("Name : "+this.name+"\nAge : "+this.age+"\nGender : "+this.gender);
    }

    void eat(){
        System.out.println(this.name + " is eating.");
    }
    void walk(){
        System.out.println(this.name + " is walking.");
    }
    // compile time Polymorphism [we can use walk or walk(steps) both for same task , the compiler decides at the time of compilation which is used.]
    void walk(int Steps){
        System.out.println(this.name + " walked " + Steps +" steps.");
    }

}