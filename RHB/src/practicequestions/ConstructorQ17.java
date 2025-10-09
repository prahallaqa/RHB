package practicequestions;

public class ConstructorQ17 {
	ConstructorQ17()
	{
		System.out.println("Constructor without parameterized");
	}
	ConstructorQ17(int a, int b)
	{
		System.out.println("Constructor with parameterized");
	}
	
	
	public static void main(String[] args) {
		System.out.println("main method");
		new ConstructorQ17();
		new ConstructorQ17(10,20);
		
		
	}

}
