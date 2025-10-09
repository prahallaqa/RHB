package practicequestions;

public class MethodOverloadingSandNSQ18 {
	static void sub(int a, int b)
	{
		System.out.println("parameterized method oveloading");
	}
	
	 void add()
	{
		System.out.println("non parameterized methodoverloading");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("main method");
		sub(10,20);
		MethodOverloadingSandNSQ18 a1= new MethodOverloadingSandNSQ18();
		a1.add();
		
	
	}

}
