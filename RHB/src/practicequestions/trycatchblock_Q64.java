package practicequestions;

import java.util.Scanner;

public class trycatchblock_Q64 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numbers = { 10, 20, 30 };

		System.out.println("Array has 3 elements: [10, 20, 30]");
		System.out.print("Enter the index you want to access: ");
		int index = sc.nextInt(); // user input at runtime

		try {
			System.out.println("Element at index" + index + "is:" + numbers[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error:Invalid index, Array index is out of bound");
		} 

		System.out.println("Program continues after exception handling.");
		sc.close();
	}
}
