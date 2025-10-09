package practicequestions;
public class MethodOverloadingSandNSQ18Ex {
	static void registration()
	{
		System.out.println("registrations are started");
	}
	  void registration(String name)
	{
		System.out.println("name of the person is "+ name);
	}
	 void registration(String name, String email)
		{
			System.out.println("name of the person is "+ name  +"and email is: "+ email);
		}
	 void registration(String name, String email, int Phoneno)
		{
			System.out.println("name of the person is "+ name  +"and email is: "+ email + "phoneno: "+Phoneno);
		}
	public static void main(String[] args) {
		System.out.println("main method");
		registration();
		MethodOverloadingSandNSQ18Ex a1= new MethodOverloadingSandNSQ18Ex();
		a1.registration("prahalla");
		a1.registration("Laysa", "lasya@gmail.com");
		a1.registration("pra", "abc@gmail.com", 12345);} }
