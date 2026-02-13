package practice1;

public class Constructor {
	Constructor ()
	{
		System.out.println("Constructor");
	}
	Constructor (int a)
	{
		System.out.println("Constructor int type");
	}
public static void main(String[] args) {
	new  Constructor();
	new Constructor(10);
	
}
}
