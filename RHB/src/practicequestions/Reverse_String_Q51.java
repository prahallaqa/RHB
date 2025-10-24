package practicequestions;

import java.util.Scanner;

public class Reverse_String_Q51 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be reversed: ");
		String input = sc.nextLine();
		String reverse = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}

		System.out.println("reversed String is:" + reverse);
		sc.close();
	
	}
	
}






