package practice1;
public class Vehicle {


	static void speed(){
	System.out.println("Speed should be 70 to 100");
	}
	static void fuel()
	{
		System.out.println("fuel tank should be there");
	}

}


class Car extends Vehicle {
	 void model()
	{
		System.out.println("car model name should be display");
	}
	 void brand()
	{
		System.out.println("brand : Honda");
	}
	public static void main(String[] args) {
		Car c= new Car();
		c.brand();
		c.model();
		speed();
		fuel();
	
	
	
}

}

