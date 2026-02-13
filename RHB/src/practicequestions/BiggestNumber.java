package practice1;

public class BiggestNumber {

	public static void main(String[] args) {
		
		int a=100;
		int b=500;
		int c=300;
		if(a>b && a>c)
		{
			System.out.println("highest number is "+ a );
		}
		else if (b>a && b>c)
		{
			System.out.println("highest number is "+b);
		}
		else 
		{
			System.out.println("highest number is "+c );
		}
		
		
	}
}
