package practicequestions;

public class NestedIfQ11copy {
	public static void main(String[] args) {
		int atmbalance=10000;
		int requiredamount=1000;
		if (requiredamount>0)
		{
			System.out.println("Enter amount you want to withdraw");
			if(atmbalance>=requiredamount)
			{
				System.out.println("Please collect your cash "+requiredamount );
			}
			else
			{
				System.out.println("Required amount u is higher than the available balance");
			}

		}
		else
		{
			System.out.println("please enter positive amount");
		}
		
	}

}
