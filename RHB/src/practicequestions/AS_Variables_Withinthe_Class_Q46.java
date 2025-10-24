package practicequestions;

public class AS_Variables_Withinthe_Class_Q46 {

	private int privateVar = 10;
	int defaultVar = 20; // default access (no modifier)
	protected int protectedVar = 30;
	public int publicVar = 40;

	public static void main(String[] args) {
		AS_Variables_Withinthe_Class_Q46 obj = new AS_Variables_Withinthe_Class_Q46();
		System.out.println("Direct access inside main method:");
		System.out.println("Private variable: " + obj.privateVar);
		System.out.println("Default variable: " + obj.defaultVar);
		System.out.println("Protected variable: " + obj.protectedVar);
		System.out.println("Public variable: " + obj.publicVar);
	}
}







