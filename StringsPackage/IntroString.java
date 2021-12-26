package StringsPackage;

public class IntroString {
    public static void main(String[] args) {
        System.out.println("We are in main!");
        String name = "Rahul Dey";
        System.out.println(name.charAt(1));
        System.out.println(name.length());
        System.out.println(name.substring(4));
        System.out.println(name.substring(2,7));
        System.out.println(name.contains("Dey"));
        String s1 = "Name";
        String s2 = new String("Name");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1.isEmpty());
        System.out.println(s1.concat(" : "+name));
        System.out.println(name.replace('a', 'A'));
        String cars = "BMW,Audi,Ferrari,Lamborghini";
        String car[] = cars.split(",");
        for(String item:car){
            System.out.println(item + " ");
        }
        System.out.println(cars.toLowerCase());
        System.out.println(cars.toUpperCase());
        String fruit = "             Mango             ";
        System.out.println(fruit);
        System.out.println(fruit.trim());
    }
}
