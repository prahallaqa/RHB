package practicequestions;

import java.util.Scanner;

public class Pallendrome_Q52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input String : ");
		String input = sc.nextLine();
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		System.out.println("reversed String is:" + reverse);
		sc.close();

		if (input.equals(reverse)) {
			System.out.println("Given string is palindrome");
		} else
			System.out.println("Given string is not palindrome");
	}
}





