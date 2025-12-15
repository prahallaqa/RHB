package practicequestions;

import java.util.ArrayList;
import java.util.List;

public class ListInterface_Q72 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Prahalla");
		list.add("Shiva");
		list.add("Honey");
		list.add(null); // List allows null values
		System.out.println("Initial List: " + list);

		list.add(1, "Inserted-Value"); 
		System.out.println("After add at index 1: " + list);

		System.out.println("Element at index 2: " + list.get(2));

		list.set(2, "Updated-Value");
		System.out.println("After set at index 2: " + list);

		list.remove(3);
		System.out.println("After removing index 3: " + list);
 
		System.out.println("Size of List: " + list.size());

		System.out.println("Contains Prahalla " + list.contains("Prahalla"));

		System.out.println("Index of prahalla: " + list.indexOf("Prahalla"));

		System.out.println("Is list empty? " + list.isEmpty());

		list.clear();
		System.out.println("List after clear(): " + list);
	}
}



