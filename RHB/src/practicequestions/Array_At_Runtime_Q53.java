package practicequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Array_At_Runtime_Q53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lengh of array:");
		int length = sc.nextInt();

		int[] a = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print("Enter value for index " + i + ": ");
			int input = sc.nextInt();
			a[i] = input;
		}
		sc.close();

		System.out.println(Arrays.toString(a));
	}
}



