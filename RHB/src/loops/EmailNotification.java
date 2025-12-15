package loops;

public class EmailNotification extends Notification {
	void send() {
		System.out.println("Sending EMAIL notification");
	}

	void emailConfig() {
		System.out.println("Email configuration done");
	}

	public static void main(String[] args) {
		EmailNotification e = new EmailNotification();
		System.out.println("without any casting");
		e.send();
		e.emailConfig();

		System.out.println();
		System.out.println("Up casting");
		Notification n = new EmailNotification(); // UPCASTING
		n.send();

		System.out.println();
		System.out.println("down Casting");
		EmailNotification e1 = (EmailNotification) n; // DOWNCASTING
		e1.emailConfig();
	}
}



