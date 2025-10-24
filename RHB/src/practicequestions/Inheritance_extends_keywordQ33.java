package practicequestions;

class Father
{
	public void property1()
	{
		System.out.println("Father property");
	}
	}

class Child extends Father
{
	public void child()
	{
		System.out.println("Child property");
	}
	}

public class Inheritance_extends_keywordQ33  {
 public static void main(String[] args) {
	 Child c=new Child();
	 c.child();
	 c.property1(); 
}
}

