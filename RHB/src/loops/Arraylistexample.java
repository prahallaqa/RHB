package loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistexample {
	public static void main(String[] args) {

		// ------------------------------------
		// ArrayList of Strings
		// ------------------------------------
		ArrayList<String> array = new ArrayList<>();
		array.add("Prahalla");
		array.add("Reddy");
		array.add("Perumalla");
		array.add("Perumalla"); // accepts duplicates
		array.add(null); // accepts nulls
		array.add(null);
		System.out.println("array: " + array);

		// ------------------------------------
		// ArrayList of Integers
		// ------------------------------------
		ArrayList<Integer> array2 = new ArrayList<>();
		array2.add(10);
		array2.add(60);
		array2.add(30);
		array2.add(20);
		System.out.println("array2: " + array2);

		// ------------------------------------
		// Iterator (Forward only)
		// ------------------------------------
		System.out.println("Iteration using Iterator:");
		Iterator<Integer> itr = array2.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// ------------------------------------
		// ListIterator (Forward + Backward)
		// ------------------------------------
		System.out.println("Forward using ListIterator:");
		ListIterator<Integer> itr2 = array2.listIterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("Backward using ListIterator:");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

		// ------------------------------------
		// Sorting & Reversing
		// ------------------------------------
		Collections.sort(array2);
		System.out.println("After sorting: " + array2);

		Collections.reverse(array2);
		System.out.println("After reversing: " + array2);

		// ------------------------------------
		// Merging two ArrayLists
		// ------------------------------------
		ArrayList<Integer> array3 = new ArrayList<>();
		array3.add(600);
		array3.add(100);

		System.out.println("array3: " + array3);

		array3.addAll(array2); // add at end
		System.out.println("array3 + array2: " + array3);

		array3.addAll(0, array2); // add at index 0
		System.out.println("array3 after adding array2 at index 0: " + array3);

		// ------------------------------------
		// Checking empty, size
		// ------------------------------------
		System.out.println("is empty? " + array3.isEmpty());
		System.out.println("size: " + array3.size());

		// ------------------------------------
		// Removing by index (safe)
		// ------------------------------------
		if (array3.size() > 9) {
			System.out.println("Removed 9th index: " + array3.remove(9));
		} else {
			System.out.println("Index 9 does not exist!");
		}

		System.out.println(array3);

		// ------------------------------------
		// contains()
		// ------------------------------------
		System.out.println("contains 6000? " + array3.contains(6000));

		// ------------------------------------
		// Removing first occurrence of 60
		// ------------------------------------
		array3.remove(Integer.valueOf(60));
		System.out.println("Removed the first value 60: " + array3);

		// ------------------------------------
		// Removing all 60's
		// ------------------------------------
		array3.removeIf(n -> n == 60);
		System.out.println("Removed all 60 values: " + array3);

		System.out.println("is array3 equals to array2: " + array3.equals(array2));
		System.out.println("get the index at 2 is : " + array3.get(2));

		// ------------------------------------
		// Removing all elements
		// ------------------------------------
		array3.clear();
		System.out.println("After clear(): " + array3);

	}
}
