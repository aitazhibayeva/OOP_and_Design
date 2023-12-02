package week2;


import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TimeTest 
{
	public static void main(String args[]) 
	{
		Time t = new Time(21, 15, 33);
		Time t1 = new Time(10, 58, 3);
		Time t2 = new Time(4, 24, 11);
		Time t3 = new Time(21, 15, 13);
		
		Vector <Time> times = new Vector <Time>();
		times.add(t);
		times.add(t1);
		times.add(t2);
		times.add(t3);
		
		for(Time ti: times) {
			System.out.println(ti);
		}
		
		Collections.sort( times);
		System.out.println();
		
		for(Time ti: times) {
			System.out.println(ti);
		}
	}
}