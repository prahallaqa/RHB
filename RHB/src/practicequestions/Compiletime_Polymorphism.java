package practicequestions;

public class Compiletime_Polymorphism {
	void add() {
		System.out.println("non parameterized method");
	}

	void add(String name) {
		System.out.println("parameterized method");
	}

	void add(String name, int age) {
		System.out.println("string and int");
	}

	public static void main(String[] args) {
		Compiletime_Polymorphism n = new Compiletime_Polymorphism();
		n.add();
		n.add(null);
		n.add(null, 0);
	}
}



