package problem_1a;

public class Kbtu extends University {
	
	private int yearOfOpen;
	
	public int getYearOfOpen() {
		return yearOfOpen;
	}
	
	public Kbtu() {};
	
	public Kbtu(int yearOfOpen) {
		this.yearOfOpen = yearOfOpen;
	}
	
	public String getDiploma() {
		return "Yes";
	}

	public String haveRetake() {
		return "No";
	}

	public String toString() {
		return super.toString();
	}
}
