package practicequestions;

import java.util.Scanner;

public class ScannerClassQ24 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter value of a is");
				int a=sc.nextInt();
				
				System.out.println("Enter value of b");
				int b=sc.nextInt();
				
				sc.close();	
				
				int c= a+b;
				System.out.println("Addition of a+b is "+c);
				
				int d= a-b;
				System.out.println("Subtraction of a-b is "+d);
				
				int e= a*b;
				System.out.println("Multiplication of a*b is "+e);
				
				if (b != 0) {
				int f= a/b;
				System.out.println("Division of a/b is "+f);
				
				int g= a%b;
				System.out.println("Modulus of a%b is "+g);
				}
				else
				{
				 System.out.println("Division and modulus by zero is not allowed");
				}
	}
	
}
