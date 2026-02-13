package loops;

public class throw_and_Throws {

	static void login(String user, String pwd) throws IllegalAccessException {

		if (!user.equals("admin") || !pwd.equals("1234")) {
			throw new IllegalAccessException("Invalid credentials");
		}

		System.out.println("Login successful");
	}
}
