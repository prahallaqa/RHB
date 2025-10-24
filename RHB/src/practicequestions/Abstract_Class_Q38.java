package practicequestions;

abstract class Animals {
	void sound() {
		System.out.println("Animal makes a sound");
	}

	abstract void sleep();
}

class Cat extends Animals {
	@Override
	void sleep() {
		System.out.println("abstract body is here- for cat sleep method");
	}
}

class Lion extends Animals {
	@Override
	void sleep() {
		System.out.println("abstract body is here- for meow for Lion method ");
	}
}

public class Abstract_Class_Q38 {
	public static void main(String[] args) {
		System.out.println("main method");
		Lion m = new Lion();
		m.sleep();
		m.sound();
		Cat d = new Cat();
		d.sleep();
		d.sound();
	}
}


