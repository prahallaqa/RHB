package practice1;

import java.util.HashMap;
import java.util.Map;

public class New {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(201274, "Raju");
		m1.put(201264, "Sheela");
		m1.put(207274, "Mangala");
		m1.put(206274, "Adnan");
		m1.put(291274, "Mohammed");
		System.out.println(m1);
		Map<Integer, String> m2 = new HashMap<Integer, String>();
		m2.put(201466, "Annu");
		m2.putAll(m1);
		System.out.println(m2);
	}
}
