package practiceudemy;

public class Class283_NestedLoops {

	public static void main(String[] args) {
		for (int i=1;i<=4;i++)//outer loop
		{
			System.out.println("outer loop started");
			for(int j=1; j<=4; j++)//inner loop
			{
				System.out.println("inner loop");
			}
			System.out.println("outer loop done");
		}
	}
}
