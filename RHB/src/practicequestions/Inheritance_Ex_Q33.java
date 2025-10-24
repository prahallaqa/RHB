package practicequestions;

class Vehicle
	{
		public void Start()
		{
			System.out.println("Vehicle is starting");
		}
		
		void Stop()
		{
		System.out.println("Vehicle is Stopping");
		}
	}

class Car extends Vehicle
	{
		public void Colour()
		{
			System.out.println("Colour can be customised");
		}
		}

public class Inheritance_Ex_Q33  {
	 public static void main(String[] args) {
		 Car c=new Car();
		 c.Start();
		 c.Colour();
		 c.Stop();
		 }
	}



