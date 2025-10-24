package practicequestions;
	
	class Parentclass1{
		Parentclass1(){
			System.out.println("Parent class constructor");}
	}
	
	class ChildClass1 extends Parentclass1{
		
		ChildClass1(){
			this("Pra");//Calls the parameterized constructor of the same class
			System.out.println("Child Class Constructor");
		}
		
		ChildClass1(String name){
			super(); // Calls ParentClass constructor
			System.out.println("Child parameterized constructor called with name: " + name);
		}
	}
	public class ThisCalling_Statement_Q35 {
	public static void main(String[] args) {
			new ChildClass1();
	        System.out.println("Main method");
	}
}

	
	