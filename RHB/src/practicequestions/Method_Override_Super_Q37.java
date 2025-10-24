package practicequestions;
class Animal1 {
	void sound() {
		System.out.println("Sound");
	}
}

class Dog1 extends Animal1 {
	void display() {
		System.out.println("its a dog");
	}

	// @Override
	void sound() {
		super.sound();
		System.out.println("Sound of a dog is overding the sound of animal");
	}
}

public class Method_Override_Super_Q37 {

	public static void main(String[] args) {
		Dog1 c2 = new Dog1();
		c2.display();
		c2.sound();
	}
}






