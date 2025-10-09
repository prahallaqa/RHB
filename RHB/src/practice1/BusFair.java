package practice1;

public class BusFair {

	public static void main(String[] args) {
		int age=5;
		if(age<15)
		{
			System.out.println("half ticket");
		}
		else if (age>=15 && age <=60)
		{
			System.out.println("full ticket");
		}
		else if(age>60)
		{
			System.out.println("senio sitizen ticket");
		}
		
	}
}
