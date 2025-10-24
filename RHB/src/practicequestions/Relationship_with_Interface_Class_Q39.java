package practicequestions;

public class Relationship_with_Interface_Class_Q39 implements Relationshipinterface {

	public static void main(String[] args) {
		Relationship_with_Interface_Class_Q39 c = new Relationship_with_Interface_Class_Q39();
		c.method1();
		c.method2();

	}

	@Override
	public void method1() {
		System.out.println("Abstract method 1 from interface");

	}

	@Override
	public void method2() {
		System.out.println("Abstract method 2 from interface");

	}

}



