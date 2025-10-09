package practicequestions;

public class IfElseifElseQ10 {

	public static void main(String[] args) {
		int creditscore=655;
		System.out.println("given creditscore is ="+ creditscore);
		if(creditscore>=750)
		{
			System.out.println("Eligible for higher loan");
		}
		else if(creditscore>=650) 
		{
			System.out.println("Eligible for a loan with limited amount");
		}
		else
		{
			System.out.println("Not eligible for the loan");
		}	
	}
}
