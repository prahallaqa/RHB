package practiceudemy;

import java.util.Date;

public class DateTime {
	public static void main(String[] args) {
		Date d= new Date();
		System.out.println(d.getTime());
		
		String d2= d.toString();
		System.out.println(d2);
		 
		String day = d2.substring(8, 10);        // positions 8 and 9
        String month = d2.substring(4, 7);       // positions 4 to 6
        String hour = d2.substring(11, 13);      // 11 to 12
        String minute = d2.substring(14, 16);    // 14 to 15
        String second = d2.substring(17, 19);    // 17 to 18
        String year = d2.substring(d2.length() - 4); // last 4 chars
      
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Year: " + year);
        
        long millis = d.getTime() % 1000;
        System.out.println("Milliseconds part: " + millis);
        }
}
