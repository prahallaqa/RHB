package practice1;

public class Divisibleby5and11 {

	public static void main(String[] args) {
		int a=110;
		
		
	if(a%5==0)
	{
		
		if(a%11==0)
		{
			System.out.println("a is divisable by both 5 and 11");
		}
		else
		{
			 System.out.println("a is divisible by 5 but not by 11");
		}
	
	}
	else
	{
		System.out.println("not divisable by 5");
	}
	}

}
