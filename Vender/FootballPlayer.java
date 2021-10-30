package Vender;

import java.util.Scanner;

public class FootballPlayer extends Player {
	int total_goals = 0;

	Scanner sc = new Scanner(System.in);

	public void setDetails() {
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter country : ");
		country = sc.next();
		System.out.println("Enter total goals : ");
		total_goals = sc.nextInt();
		sc.close();
	}

	public void getDetails() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Country : " + country);
		System.out.println("Total Goals : " + total_goals);
	}
}