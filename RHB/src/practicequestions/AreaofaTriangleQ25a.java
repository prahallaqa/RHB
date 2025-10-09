package practicequestions;

import java.util.Scanner;

public class AreaofaTriangleQ25a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height");
		int height=sc.nextInt();
		System.out.println("Enter the base");
		int base =sc.nextInt();
		double area = 0.5*height*base;
		System.out.println("area of the traingle is " +area);
		sc.close();
		
	}
}
