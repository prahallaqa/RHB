package practicequestions;
import java.util.Scanner;
public class Noofspaces_Specialchr_Numerics_Q59 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		int isalphabet = 0;
		int isspace = 0;
		int specialchars = 0;
		int numbers = 0;

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				isalphabet++;
			} else if (Character.isDigit(ch)) {
				numbers++;
			} else if (Character.isSpaceChar(ch)) {
				isspace++;
			} else {
				specialchars++;
			}
		}
		System.out.println("spaces are " + isspace);
		System.out.println("chaacters are " + isalphabet);
		System.out.println("numbers are " + numbers);
		System.out.println("special char are " + specialchars);
		sc.close();
	}
}




