package problem_1a;

public abstract class University {
	 
	public University() {};
	
	public abstract String getDiploma();
	public abstract String haveRetake();
	
	public String toString() {
		return " Diploma: " + getDiploma() + ", retake: " + haveRetake();
	}
}
