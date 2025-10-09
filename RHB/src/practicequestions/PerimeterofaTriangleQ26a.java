package practicequestions;

import java.util.Scanner;

public class PerimeterofaTriangleQ26a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side A :");
		int SideA=sc.nextInt();
		System.out.println("Enter the side B :");
		int SideB=sc.nextInt();
		System.out.println("Enter the side C :");
		int SideC=sc.nextInt();
		int PerimeterofaTriangle = SideA+SideB+SideC;
		System.out.println("Perimeter of the triangle is " +PerimeterofaTriangle);
		sc.close();
		
	}
}
