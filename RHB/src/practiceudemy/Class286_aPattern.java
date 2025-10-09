package practiceudemy;

public class Class286_aPattern {

	public static void main(String[] args) {
		int k=1;
		for (int i=1; i<=3; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(3*k + " ");	
				k++;
			}
			System.out.println();
		}
	}
}
