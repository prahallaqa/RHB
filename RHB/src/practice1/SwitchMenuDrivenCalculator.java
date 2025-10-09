package practice1;

public class SwitchMenuDrivenCalculator {

	public static void main(String[] args) {
		
		int a = 20, b = 10;
		int choice = 2;

		switch (choice) {
		    case 1:
		        System.out.println("Sum: " + (a + b));
		        break;
		    case 2:
		        System.out.println("Difference: " + (a - b));
		        break;
		    case 3:
		        System.out.println("Product: " + (a * b));
		        break;
		    case 4:
		        if (b != 0) {
		            System.out.println("Quotient: " + (a / b));
		        } else {
		            System.out.println("Cannot divide by zero");
		        }
		        break;
		    default:
		        System.out.println("Invalid choice");
		}


	}

}
