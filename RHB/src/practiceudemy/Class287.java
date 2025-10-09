package practiceudemy;

public class Class287 implements Classtrafficsignals287 {

	public static void main(String[] args) {
		
		System.out.println("main method");
		Classtrafficsignals287 a= new Class287();
	
		a.greenGo();
		a.redStop();
		a.yellow();
		
		Class287 aa = new Class287();
		aa.walk();
		
		
	}
	public void walk()
	{
		System.out.println("walk");
	}

	@Override
	public void greenGo() {
		System.out.println("green--go");
	}

	@Override
	public void redStop() {
		System.out.println("red--stop");
		
	}

	@Override
	public void yellow() {
		System.out.println("yellow--wait");
		
	}

	
}
