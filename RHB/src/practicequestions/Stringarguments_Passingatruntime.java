package practicequestions;

public class Stringarguments_Passingatruntime {
	public static void main(String[] args) {
		System.out.println("enter the array length: " +args.length);
		System.out.println("Values passed at run time: ");
		
		for(String s: args)
		{
			System.out.println(s);
		}
	}

}
