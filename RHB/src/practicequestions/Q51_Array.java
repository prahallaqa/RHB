package practicequestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q51_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the length of the array is :");
		int length = sc.nextInt();

		int[] a = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.println("Enter the Value at the position " + i + " :");
			a[i] = sc.nextInt();

		}

		System.out.println(Arrays.toString(a));
		sc.close();

	}
}
