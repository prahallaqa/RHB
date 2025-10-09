package practicequestions;

public class GlobalVariablesQ20 {
	
	static int a=10;
	static double b;
	String c;

	public static void main(String[] args) {
		System.out.println("Global Variable double ... " + b);
		System.out.println("Global Variable  ... " +a);
		GlobalVariablesQ20 a1= new GlobalVariablesQ20();
		System.out.println("instance Variable double ... "+a1.c);
	}
}
