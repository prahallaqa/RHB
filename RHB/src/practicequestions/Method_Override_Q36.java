package practicequestions;

class Animal {
	void sound() {
		System.out.println("Sound");
	}
}

class Dog extends Animal {
	void display() {
		System.out.println("its a dog");
	}

	// @Override
	void sound() {
		System.out.println("Sound of a dog is overding the sound of animal");
	}
}

public class Method_Override_Q36 {

	public static void main(String[] args) {
		Dog c2 = new Dog();
		c2.display();
		c2.sound();
	}
}

