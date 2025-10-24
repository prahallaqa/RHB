package practicequestions;

class ParentClass{
	ParentClass()
	{
	System.out.println("Parent constructor called");}
	}

class ChildClass extends ParentClass{
	ChildClass() {
		super();
		System.out.println("Child constructor called");
	}
	}

public class SuperCallingStatement_Q34 {

	public static void main(String[] args) {
		 new ChildClass();
		System.out.println("main method");	
	}
}

