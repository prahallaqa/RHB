package practicequestions;

public class assert_keyword {
	static void age(int age) {
		assert age >= 0 : "Age cannot be negative";
		System.out.println("Age entered is : " + age);
	}

	public static void main(String[] args) {

		age(25);
		age(-1);

	}

}


