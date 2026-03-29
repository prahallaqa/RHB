package practicequestions;

public class sib_iib_constructer {

	static {
		System.out.println("static block");
	}
	{
		System.out.println("Non static block");
	}

	sib_iib_constructer() {
		System.out.println("constructor");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		sib_iib_constructer n = new sib_iib_constructer();
		System.out.println("main method ended");

	}

}



