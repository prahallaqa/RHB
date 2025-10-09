package practicequestions;

import java.util.Scanner;

public class PerimeterofRectangleQ26C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length");
		int length=sc.nextInt();
		
		System.out.println("Enter the width");
		int width=sc.nextInt();
		
		int Perimeterofarectangle = 2*(length+width);
		System.out.println("Perimeter of a Rectangle is " +Perimeterofarectangle);
		sc.close();
		
	}
}
