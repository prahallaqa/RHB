package practice1;

public class Methodoverloading {

	void add()
	{
		System.out.println("add");
	}
	void add(int a, int b)
	{
		System.out.println("addint");
	}
	public static void main(String[] args) {
		
		Methodoverloading a1=new Methodoverloading();
		a1.add();
		a1.add(10, 20);
		
	}
}
