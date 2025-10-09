package practicequestions;

public class ConstructorQ17example {
	ConstructorQ17example()
	{
		System.out.println("admissions started");
	}
	ConstructorQ17example(String name, int admissionNumber)
	{
		
		System.out.println("name of the candidate is: "+name+ ", and admission no: "+ admissionNumber );
	}
	
	
	public static void main(String[] args) {
		
		new ConstructorQ17example();
		new ConstructorQ17example("Prahalla",1);
		new ConstructorQ17example("Anu",2);
		
		
		
	}

}
