package practice1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		System.out.println("Enter the Last Login Time in HHMM Format");
		Scanner sc = new Scanner(System.in);
		String lastlogin = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
		LocalTime time = LocalTime.parse(lastlogin, formatter);
		LocalTime newtime = time.plusHours(8).plusMinutes(30);
		System.out.println("Enter Effective Hours in HHMM Format");
		String effectivehours = sc.nextLine();
		LocalTime correcttime = LocalTime.parse(effectivehours, formatter);	
    	LocalTime leavetime = newtime.minusHours(correcttime.getHour()).minusMinutes(correcttime.getMinute());
		System.out.println("You may leave at " + leavetime);
		LocalTime currenttime = LocalTime.now();
		String timeString = currenttime.format(formatter);
		LocalTime timenow = LocalTime.parse(timeString, formatter);
		LocalTime tillnow = timenow.minusHours(time.getHour()).minusMinutes(time.getMinute());
		LocalTime eff = tillnow.plusHours(correcttime.getHour()).plusMinutes(correcttime.getMinute());
		DateTimeFormatter hourformatter = DateTimeFormatter.ofPattern("HH:mm");
		String effective = eff.format(hourformatter);
		System.out.println("Effective Hours Till now is " + effective);
		sc.close();
	}

}
