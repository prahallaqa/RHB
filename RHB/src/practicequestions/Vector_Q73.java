package practicequestions;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_Q73 {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("Prahalla");
		vector.add("Shiva");
		vector.add("Honey");
		vector.add(null); // Vector allows null
		System.out.println("Initial Vector: " + vector);

		vector.add(1, "Inserted-Value");
		System.out.println("After adding at index 1: " + vector);

		System.out.println("Element at index 2: " + vector.get(2));

		vector.set(2, "Updated-Value");
		System.out.println("After updating index 2: " + vector);

		vector.remove(3);
		System.out.println("After removing element at index 3: " + vector);

		System.out.println("Size of vector: " + vector.size());

		System.out.println("Contains 'Prahalla'? " + vector.contains("Prahalla"));

		System.out.println("Is vector empty? " + vector.isEmpty());

		// Iterate using Enumeration
		System.out.println("Iteration using Enumeration:");
		Enumeration<String> e = vector.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		vector.clear();
		System.out.println("Vector after clear(): " + vector);
	}
}



