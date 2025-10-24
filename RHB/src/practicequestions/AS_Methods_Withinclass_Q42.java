package practicequestions;

public class AS_Methods_Withinclass_Q42 {

	private void privateMethod() {
		
		System.out.println("Private method" );
	}

	void defaultMethod() {
		
		System.out.println("Default method  ");
	}

	protected void protectedMethod() {
		
		System.out.println("Protected method ");
	}

	public void publicMethod() {
	
		System.out.println("Public method ");
	}

	public static void main(String[] args) {
		AS_Methods_Withinclass_Q42 obj = new AS_Methods_Withinclass_Q42();

		obj.privateMethod();
		obj.defaultMethod();
		obj.protectedMethod();
		obj.publicMethod();
	}

}









