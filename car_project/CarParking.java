package car_project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarParking {
	// default car capacity floor wise 1,2,3,4,5
	private int[] available_car = { 5, 4, 3, 2, 1 };
	List<ArrayList<Car>> carlist = new ArrayList<ArrayList<Car>>();

	// method show availability
	public void showAvailability() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Available car in " + i + " floor is " + available_car[i]);
		}
	}

	// method park Car
	public void parkCar(Car car) {
		boolean flag = true;
		for (int i = 0; i < 5; i++) {
			if (available_car[i] > 0) {
				ArrayList<Car> temp = new ArrayList<>();
				temp.add(car);
				carlist.add(temp);
				available_car[i]--;
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("No Parking Available!");
		}
	}

	// method get car
	public void getCar(Car car) {
		boolean flag = true;
		for (int k = 0; k < carlist.size(); k++) {
			ArrayList<Car> temp = new ArrayList<>();
			temp = carlist.get(k);
			for (int j = 0; j < temp.size(); j++) {
				if (temp.get(j).equals(car)) {
					available_car[k - 1]++;
					temp.removeAll(Collections.singleton(car));
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("No Car Available in parking!");
		}
	}
}
