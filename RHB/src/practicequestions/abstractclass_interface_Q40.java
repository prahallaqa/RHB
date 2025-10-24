package practicequestions;

abstract class car {
	abstract void cars();

	void maintance() {
		System.out.println("maintance");
	}
}
public class abstractclass_interface_Q40 extends car implements Q40 {
	public static void main(String[] args) {
		System.out.println("main");
		abstractclass_interface_Q40 n = new abstractclass_interface_Q40();
		n.start();
		n.stop();
		n.cars();
		n.maintance();
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
	void cars() {
		System.out.println("name can be own");
	}
}



