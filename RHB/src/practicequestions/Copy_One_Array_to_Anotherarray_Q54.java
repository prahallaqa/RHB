package practicequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Copy_One_Array_to_Anotherarray_Q54 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length: "); // input array length
		int length = sc.nextInt();

		int[] original = new int[length]; // Declare and initialize the original array
		int[] copy = new int[length];// Create a new array of same size

		for (int i = 0; i < length; i++) {
			System.out.print("Enter the value at the index " + i + ": ");
			original[i] = sc.nextInt();
			copy[i] = original[i];
		}
// 		int[] copy = new int[length];// Create a new array of same size
//		for (int i = 0; i < length; i++) {
//			copy[i] = original[i];
//		}
		System.out.println("original array is: " + Arrays.toString(original));
		System.out.println("Copied array is: " + Arrays.toString(copy));
		sc.close();
	}
}








