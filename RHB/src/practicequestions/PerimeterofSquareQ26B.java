package practicequestions;

import java.util.Scanner;

public class PerimeterofSquareQ26B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the side");
		int side=sc.nextInt();
		
		
		int PerimeterofSquare = 4*side;
		System.out.println("Perimeter of the square is " +PerimeterofSquare);
		sc.close();
		
	}
}
