package practicequestions;

public class NonStaticInsideSameClassQ15 {
	 void add()
	{
		System.out.println("Non static method");
	}
	 
	public static void main(String[] args) {
		
		NonStaticInsideSameClassQ15 a1 = new NonStaticInsideSameClassQ15();
		a1.add();
		
	}

}
