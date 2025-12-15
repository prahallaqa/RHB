package practicequestions;

import java.util.HashSet;
import java.util.Set;

public class setinterface_Q71 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		set.add("Prahalla");
		set.add("Shiva");
		set.add("Honey");
		set.add(null); // set allows null values
		System.out.println("Initial set: " + set);

		System.out.println("After removing honey : " + set.remove("Honey"));

		System.out.println("Size of set: " + set.size());

		System.out.println("Contains Prahalla " + set.contains("Prahalla"));

		System.out.println("Is set empty? " + set.isEmpty());

		set.clear();
		System.out.println("set after clear(): " + set);
	}
}
