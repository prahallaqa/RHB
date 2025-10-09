package practicequestions;

import java.util.Scanner;

public class AreaofSquareQ25B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side");
		int side=sc.nextInt();
		
		
		int area = side*side;
		System.out.println("area of the square is " +area);
		sc.close();
		
	}
}
