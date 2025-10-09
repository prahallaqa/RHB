package practicequestions;

import java.util.Scanner;

public class AreaofRectangleQ25C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int length=sc.nextInt();
		
		System.out.println("Enter the width");
		int width=sc.nextInt();
		
		int area = length*width;
		System.out.println("area of the Rectangle is " +area);
		sc.close();
		
	}
}
