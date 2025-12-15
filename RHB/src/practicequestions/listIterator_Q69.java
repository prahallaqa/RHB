package practicequestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listIterator_Q69 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Prahalla-0");
		list.add("Prahalla-1");
		list.add("Prahalla-2");
		list.add(null);
		System.out.println("öriginal list: " + list);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		List<String> list2 = new ArrayList<>();
		list2.add("shiva");
		list2.add("honey");
		list2.addAll(list);
		System.out.println(list2);
		System.out.println("forward direction:");

		
		
		ListIterator<String> itr2 = list2.listIterator();

		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		System.out.println("backward direction:");
		while (itr2.hasPrevious()) {
			System.out.println(itr2.previous());
		}

	}

}
