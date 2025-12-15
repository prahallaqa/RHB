package practicequestions;

public class Encapsulation_Q77 {

	private String username;
	private int age;

	public void setname(String username) {
		this.username = username;
	}

	public String getusername() {
		return username;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Encapsulation_Q77 e = new Encapsulation_Q77();
		e.setAge(10);
		e.setname("prahalla");
		System.out.println("get the age : " + e.getAge());
		System.out.println("get the name : " + e.getusername());
	}
}



