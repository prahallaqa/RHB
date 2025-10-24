package practicequestions;
import java.util.Arrays;
import java.util.Scanner;

public class Two_arrays_are_equal_Q55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first array length: ");
		int Firstarraylength = sc.nextInt();

		int[] FirstArray = new int[Firstarraylength];
		for (int i = 0; i < Firstarraylength; i++) {
			System.out.print("Enter the value at the index " + i + ": ");
			FirstArray[i] = sc.nextInt();
		}

		System.out.println("Enter the second array length :");
		int Secondarraylength = sc.nextInt();

		int[] Secondarray = new int[Secondarraylength];
		for (int i = 0; i < Secondarraylength; i++) {
			System.out.print("Enter the value at the index " + i + ": ");
			Secondarray[i] = sc.nextInt();
		}

		if (Firstarraylength == Secondarraylength) {
			System.out.println("Array lengths are equal — proceeding to compare values");

			if (Arrays.equals(FirstArray, Secondarray)) {
				System.out.println("Both arrays values are equal");
			} else {
				System.out.println("Both arrrays values are not equal");
			}
		} else {
			System.out.println("Arrays length is not equal so both arrrays are not equal");
		}
		System.out.println("FirstArray is: " + Arrays.toString(FirstArray));
		System.out.println("Secondarray is: " + Arrays.toString(Secondarray));
		sc.close();
	}
}









