package practicequestions;
public class UpdateLocalGlobalVaiablesQ21 {
	static int a=10;
	static double b;
	String c;
		public static void main(String[] args) {
		int a=20;
		System.out.println("Local variable a is.. "+a);
		a=30;
		System.out.println("Updated local variable value of a is "+a);
		
		System.out.println("Global Variable int  ... "+UpdateLocalGlobalVaiablesQ21.a);
		UpdateLocalGlobalVaiablesQ21.a=20;
		System.out.println("Updated global variable value of int a is "+UpdateLocalGlobalVaiablesQ21.a);
		
		System.out.println("Global Variable double ... " + b);
		GlobalVariablesQ20 a1= new GlobalVariablesQ20();
		System.out.println("instance Variable String ... "+a1.c);
		a1.c="prahalla";
		System.out.println("instance updated Variable String ... "+a1.c);
	}
}
