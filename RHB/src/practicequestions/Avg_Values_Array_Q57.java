package practicequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Avg_Values_Array_Q57 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the array length: ");
		int length = sc.nextInt();

		int[] array = new int[length];
		double sum = 0;
		for (int i = 0; i < length; i++) {

			System.out.print("Enter the value at the index " + i + ": ");
			array[i] = sc.nextInt();

			sum = sum + array[i];

		}
		double avg = sum / length;
		System.out.println("Array is: " + Arrays.toString(array));
		System.out.println("sum of the arrray is :" + sum);
		System.out.println("avg of the array is: " + avg);
		sc.close();
	}

}





