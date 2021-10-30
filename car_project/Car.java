package car_project;

public class Car {
	private int regNo = 0;
	private String ownerName = "";
	private int tokenNo = 0;

//	parameterized constructor
	Car(int reg, String name, int token) {
		this.regNo = reg;
		this.ownerName = name;
		this.tokenNo = token;
	}

//	default constructor
	Car() {
	}

//	getter methods
	public int get_regNo() {
		return this.regNo;
	}

	public String get_ownerName() {
		return this.ownerName;
	}

	public int get_tokenNo() {
		return this.tokenNo;
	}

//	setter methods
	public void set_regNo(int reg) {
		this.regNo = reg;
	}

	public void set_ownerName(String name) {
		this.ownerName = name;
	}

	public void set_tokenNo(int token) {
		this.tokenNo = token;
	}
}
