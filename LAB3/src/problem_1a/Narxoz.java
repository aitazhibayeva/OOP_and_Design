package problem_1a;

public class Narxoz extends University {
	
	private int yearOfOpen;
	
	public int getYearOfOpen() {
		return yearOfOpen;
	}
	
	public Narxoz() {};
	
	public Narxoz(int yearOfOpen) {
		this.yearOfOpen = yearOfOpen;
	}
	
	public String getDiploma() {
		return "Yes";
	}

	public String haveRetake() {
		return "Yes";
	}

	public String toString() {
		return super.toString();
	}
}
