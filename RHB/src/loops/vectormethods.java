package loops;

import java.util.Vector;

public class vectormethods { 
	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<Integer>();
		v1.addElement(10);
		v1.addElement(20);
		v1.addElement(30);
		System.out.println(v1); 
		System.out.println("capacity is : " + v1.capacity());
		System.out.println("firstElement is : " + v1.firstElement());
		System.out.println("lastElement is: " + v1.lastElement());
		v1.removeElementAt(0);
		System.out.println("after removed at 0th index is: " + v1);
		v1.removeElement(20);
		System.out.println("after removeElement 20 is: " + v1);
		v1.removeAllElements();
		System.out.println(v1);

	}

}
