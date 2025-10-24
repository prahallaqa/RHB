package practicequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Reversal_Of_String_Q56 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length: ");
		int length = sc.nextInt();

		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value at the index " + i + ": ");
			array[i] = sc.nextInt();
		}
		System.out.println("FirstArray is: " + Arrays.toString(array));
		sc.close();
	}
}





