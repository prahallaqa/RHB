package loops;

import java.util.HashSet; 
import java.util.Iterator;

import java.util.Set;

public class Collection_Set {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		set1.add("Prahalla");
		set1.add("Perumalla"); 
		// set1.add(null);
		System.out.println(set1);

		Iterator<String> it = set1.iterator();
		System.out.println("Iterator: ");
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
			if (value.equals("Prahalla")) {
				it.remove();
				System.out.println(set1); 
			}
		}

		Set<String> set2 = new HashSet<>();
		set2.add("Prahalla2");
		set2.add("Perumalla2");
		set2.add(null);
		set2.add(null);
		set2.add("prahalla2");
		System.out.println(set2);

	}

}
