package practice1;

public class Operators {

	// Method to perform addition
	static void add() {
		int a = 100;
		int b = 200;
		int c = a + b;
		System.out.println("Addition of " + a + " and " + b + " = " + c);
	}

	// Method to perform subtraction
	static void sub() {
		int a = 100;
		int b = 200;
		int c = b - a;
		System.out.println("Subtraction of " + b + " and " + a + " = " + c);
	}

	// Method to perform multiplication
	static void mul() {
		int a = 100;
		int b = 200;
		int c = a * b;
		System.out.println("Multiplication of " + a + " and " + b + " = " + c);
	}

	// Method to perform division
	static void div() {
		int a = 10;
		int b = 200;
		int c = b / a;
		System.out.println("Division of " + b + " by " + a + " = " + c);
	}

	// Method to perform modulus
	static void mod() {
		int a = 10;
		int b = 29;
		int c = b % a;
		System.out.println("Modulus of " + b + " and " + a + " = " + c);
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("===== Arithmetic Operators in Java =====\n");

		add();
		sub();
		mul();
		div();
		mod();

		System.out.println("\n===== Program Execution Completed =====");
	}
}
