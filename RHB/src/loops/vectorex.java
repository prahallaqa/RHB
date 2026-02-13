package loops;
 
import java.util.Enumeration;
import java.util.Vector;

public class vectorex {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(20);
		v1.add(30);
		v1.add(40);
		System.out.println(v1);// follows index
		Enumeration<Integer> v = v1.elements();
		while (v.hasMoreElements()) {
			System.out.println(v.nextElement());
		} 
	}
}
