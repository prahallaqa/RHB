package practicequestions;
import java.util.Arrays;
import java.util.Scanner;
public class String_Anagram_Q58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first array: ");
		String firstString = sc.nextLine();

		System.out.println("Enter the second array: ");
		String secondString = sc.nextLine();

		if (firstString.length() != secondString.length()) {
			System.out.println("Strings are not anagram  (different lengths)");
		} else {
			char[] arr1 = firstString.toCharArray();
			char[] arr2 = secondString.toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			if (Arrays.equals(arr1, arr2)) {
				System.out.println("both arrays are anagram ");
			} else {
				System.out.println("arrays are not anagram");
			}
			sc.close();
		}
	}
}







