package practicequestions;

public class Interface_Interface_Q41 implements Q41 {

	public static void main(String[] args) {
		Interface_Interface_Q41 c = new Interface_Interface_Q41();
		c.start();
		c.drive();
		c.stop();
	}
	@Override
	public void start() {
		System.out.println("start the vehicle");
	}
	@Override
	public void stop() {
		System.out.println("stop the vehicle");
	}
	@Override
	public void drive() {
		System.out.println("drive it");
	}
}




