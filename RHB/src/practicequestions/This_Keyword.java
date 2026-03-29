package practicequestions;

public class This_Keyword {

	String name;
	int id;

	This_Keyword() {
		System.out.println("Non parametrized constructor");
	}

	This_Keyword(String name, int id) {
		this.name = name;
		this.id = id;

		System.out.println("Parametrized constructor");
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		This_Keyword a = new This_Keyword("Prahalla", 1);
		System.out.println(a.name);
		System.out.println(a.id);

	}
}


