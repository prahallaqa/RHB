package practicequestions;

public class NestedIfQ11 {
	public static void main(String[] args) {
		int seatsavailable=11;
		int requiredseats=2;
		if (requiredseats > 0)
		{
			if(seatsavailable>=requiredseats)
			{
				System.out.println("Please enter user credentials");
			}
			else
			{
			System.out.println("Not enough seats available,Please reduce the number of requested seats");
			}
		}
		else
		{
			System.out.println("Invalid input, Required seats must be greater than 0");
		}
		
	}

}
