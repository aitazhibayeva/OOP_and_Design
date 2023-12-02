package problem_1;

public class Data {
	private static double sum = 0;
	private static double max = -99999;
	private static int cnt = 0; 
	
	public Data () {
		
	}
	
	public double SumOfAllNumbers(int number) {
		sum += number;
		return sum;
	}
	
	public void addValue(int number) {
		sum += number;
		cnt += 1;
		if ( max < number)
			max = number;
	}
	
	public double averageValue() {
		if(cnt == 0)
			return 0;
		return sum/cnt;
	}
	
	public int setCounter() {
		cnt += 1;
		return cnt;
	}
	public int getCounter() {
		return cnt;
	}
	
	public double getMax() {
		return max;
	}
	
	public double setMax(int number) {
		if(max < number ) {
			max = number;
			return max;
		}
		else return max;
	}
	
}