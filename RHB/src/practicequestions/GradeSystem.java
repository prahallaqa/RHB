package practice1;

public class GradeSystem {

	public static void main(String[] args) {
		int a=40;

		if(a<=100 && a>=90)
		{
			System.out.println("A grade");
		}
		
		else if(a<=89 && a>=75)
		{
			System.out.println("b grade");
		}
		else if(a<=74 && a>=60)
		{
			System.out.println("c grade");
		}
		else if(a<=59 && a>=45)
		{
		System.out.println("d grade");
		}
		else {
			System.err.println("fail");
		}
		
	}

}
