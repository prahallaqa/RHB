package practicequestions;

import java.time.LocalTime;

public class Hours_Min_Sec {

	public static void main(String[] args) {

		LocalTime  time = LocalTime.now();
		int hours =time.getHour();
		int minutes = time.getMinute();
		int seconds = time.getSecond();
		System.out.println("Current Time is: " + hours + " hour(s) " + minutes + " minute(s) " + seconds + " second(s)");
		
		
	}

}
