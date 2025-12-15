package practicequestions;
// Superclass
class Animalnew {
	public void sound() {
		System.out.println("Animal makes a sound");
	}

	public void eat() {
		System.out.println("Animal is eating");
	}
}
// Subclass
class Dognew extends Animalnew {
	public void sound() {
		System.out.println("Dog barks");
	}

	public void play() {
		System.out.println("Dog plays with the ball");
	}
}
public class upcasting_Q70 {
	public static void main(String[] args) {
		Animalnew a = new Dognew();
		a.sound(); // Output: Dog barks
		a.eat(); // Output: Animal is eating
		Dognew d = (Dognew) a;
		d.play(); // Output: Dog fetches the ball
	}
}


