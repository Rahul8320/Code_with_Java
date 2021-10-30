package car_project;

public class CarParkingDemo {

	public static void main(String[] args) {

		Car bmw = new Car(122457, "S.Satamurti", 253);
		CarParking obj = new CarParking();
		obj.showAvailability();
		obj.parkCar(bmw);
		System.out.println("Owner Name : " + bmw.get_ownerName());

		obj.showAvailability();
		Car audi = new Car(122487, "P.Agarwal", 121);
		obj.parkCar(audi);
		System.out.println("Owner name : " + audi.get_ownerName() + " RegNo : " + audi.get_regNo());

		obj.showAvailability();
		Car lamborgini = new Car();
		lamborgini.set_ownerName("P.K.");
		lamborgini.set_regNo(33625);
		lamborgini.set_tokenNo(145);
		obj.parkCar(lamborgini);
		System.out.println("Owner name : " + lamborgini.get_ownerName());

		obj.showAvailability();
		obj.getCar(audi);
		System.out.println("Get car Audi.");
		obj.showAvailability();
		obj.getCar(lamborgini);
		System.out.println("Get car Lamborgini.");
		obj.showAvailability();
		obj.getCar(lamborgini);
	}

}
