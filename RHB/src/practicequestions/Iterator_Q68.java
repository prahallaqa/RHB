package practicequestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterator_Q68 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Prahalla-0");
		list.add("Prahalla-1");
		list.add("Prahalla-2");
		list.add(null);
		System.out.println("öriginal list: " + list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
			// Example: remove null value using iterator
			if (value == null) {
				itr.remove();
			}
		}
		System.out.println("\nList after removing null using Iterator.remove():");
		System.out.println(list);
	}

}
