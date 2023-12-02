package problem_3;

public class Temperature {
	private double temperatureValue;
	private String scale;

	public Temperature() {
		temperatureValue = 0;
		scale = "C";
	}
	
	public Temperature(String scale) {
		this.scale = scale;
		temperatureValue = 0; 
	}
	
	public Temperature(double temperatureValue) {
		this.temperatureValue = temperatureValue;
		scale = "C";
	}
	
	public Temperature(double temperatureValue, String scale ) {
		this.temperatureValue = temperatureValue;
		this.scale=scale;
	}
	
	public void setTemperatureValue(double temperatureValue) {
		this.temperatureValue = temperatureValue;
	}
	
	public void setScale(String scale) {
		this.scale = scale;
	}
	
	public void setTempScale(double temperatureValue, String scale) {
		this.temperatureValue = temperatureValue;
		this.scale = scale;
	}
	
	public double conversionC() {
		if(scale == "C") {
			return temperatureValue;
		}
		return (9*(temperatureValue/5))+32;
	}
	
	public double conversionF() {
		if(scale == "F") {
			return temperatureValue;
		}
		return 5*(temperatureValue - 32)/9;
	}
	
	public String toString() {
		if(scale == "C") {
			return "temperature= " + temperatureValue + scale + "-> conversion to F: "+ conversionF()+"F"; 
		}
		return "temperature= " + temperatureValue + scale +"-> conversion to C: "+ conversionC()+"C";
	}
	
	
}
