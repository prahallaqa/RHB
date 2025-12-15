package practicequestions;

// Parent class
class Vehicles {
	void sound() {
		System.out.println("vehicle sound");
	}
}

// Child class 1
class BMW extends Vehicles {
	void sound() {
		System.out.println("BMW sound");
	}
}

// Child class 2
class RacingCar extends Vehicles {
	void sound() {
		System.out.println("Racing car sound");
	}
}

public class RunTime_Polymorphism {
	public static void main(String[] args) {

		Vehicles v; // Parent class reference

		v = new BMW(); // child object
		v.sound(); // BMW sound

		v = new RacingCar(); // child object
		v.sound(); // Racing car sound
	}
}
