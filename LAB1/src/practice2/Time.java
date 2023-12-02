package practice2;

public class Time implements Comparable <Time>
{
	int hour;
	int minute;
	int second;
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public String toUniversal() {
		return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second);
	}
	public String toStandart() {
		if(this.hour == 12) {
			return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " PM";
		}
		if(this.hour >= 12 && this.hour <= 23) {
			return String.format("%02d", Math.abs(this.hour - 12)) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " PM";
		}
		if(this.hour == 00) {
			return String.format("%02d", Math.abs(this.hour - 12)) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " AM";
		}
		if(this.hour >= 0 && this.hour < 12) {
			return String.format("%02d", this.hour) + ":" + String.format("%02d", this.minute) + ":" + String.format("%02d", this.second) + " AM";
		}
		return "";
	}
	
	public int compareTo(Time t) {
		if(this.hour > t.hour) return 1;
		if(this.hour < t.hour) return - 1;
		if(this.minute > t.minute) return 1;
		if(this.minute < t.minute) return -1;
		if(this.second > t.second) return 1;
		if(this.second < t.second) return -1;
		return 0;
	}
	
	public String toString() {
		return "Universal: " + toUniversal() + " | Standart: " + toStandart();
	}
}