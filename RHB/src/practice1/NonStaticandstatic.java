package practice1;

public class NonStaticandstatic {
  
	static void staticcalling ()
	{
		System.out.println("static method");
	}
	 void nonstaticcalling ()
	{
		
		System.out.println("Non Static method");
	}
	 void nonstaticcalling2 ()
		{
			
			System.out.println("Non Static method 2");
		}
	public static void main(String[] args) {
		
		staticcalling();
		NonStaticandstatic a = new NonStaticandstatic();
		a.nonstaticcalling();
		a.nonstaticcalling2();
		
	}
}
