package practicequestions;

import java.util.Scanner;

public class AreaofcircleQ25 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radious value r ");
		int r =sc.nextInt();
		
		double areaofcircle = Math.PI*r*r;
		System.out.println("areaofcircle is :" +areaofcircle);
		
		sc.close();
		
	}

}
