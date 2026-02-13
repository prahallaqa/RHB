package practice1;

class Amazon_GParent
{
	Amazon_GParent()
	{
		System.out.println("Statement 3");
	}
}
class Amazon_Parent extends Amazon_GParent
{
	Amazon_Parent()
	{
		super();
		System.out.println("Statement 1");
	}
}
public class Amazon_Child extends Amazon_Parent
{
	Amazon_Child()
	{
		super();
		System.out.println("Statement 2");
	}
	public static void main(String[] args) 
	{
			new Amazon_Child();
	}
}
//super calling statement}
