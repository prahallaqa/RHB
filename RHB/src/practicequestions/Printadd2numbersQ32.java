package practicequestions;

import java.util.Scanner;

public class Printadd2numbersQ32 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=1; i<=10; i++)
		{
			System.out.println("student " + i + " Enter the value of A :");
			int a=sc.nextInt();
			
			System.out.println("student " + i + " Enter the value of B :");
			int b=sc.nextInt();
			
			int c=a+b;
			
			System.out.println("Addition of a and b is: "+c);
			System.out.println( );
			
		}
		sc.close();
	}
}
