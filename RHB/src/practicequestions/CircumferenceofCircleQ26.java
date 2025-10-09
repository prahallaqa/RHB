package practicequestions;

import java.util.Scanner;

public class CircumferenceofCircleQ26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radious");
		int r=sc.nextInt();
		
		double Circumferenceofcircle = 2*Math.PI*r;
		System.out.println("Circumference of Circle is: " +Circumferenceofcircle);
		sc.close();
		
	}
}
