package practicequestions;

public class ArithmeticoperatorsQ6 {

	static void add()
	{
		int a=200; int b=100; 
		int c=a+b;
		System.out.println("a value is " +a);
		System.out.println("b value is " +b);
		System.out.println("Addition of a+b is = "+c);
	}
	static void sub()
	{
		int a=200; int b=100; 
		int c=a-b;
		System.out.println("Subtraction of a-b is = "+c);
	}
	static void mul()
	{
		int a=200; int b=100; 
		int c=a*b;
		System.out.println("Multiplication of a*b is = "+c);
	}
	static void div()
	{
		int a=200; int b=100; 
		int c=a/b;
		System.out.println("Division of a/b is = "+c);
	}
	
	
	
	
	static void modulus()
	{
		int a=200; int b=100; 
		int c=a%b;
		System.out.println("Modulus of a%b is = "+c);
	}


	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
		modulus();
	}

}
