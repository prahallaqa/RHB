package practicequestions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Map_interface_Q74 {

		public static void main(String[] args) {
			Map<Integer, String> m1 = new HashMap<Integer, String>();
			m1.put(201274, "dad");
			m1.put(201264, "mom");
			m1.put(201279, "sun");
			m1.put(201275, "daughter");
			System.out.println("M1 key pair values: " + m1);

			Map<Integer, String> m2 = new HashMap<Integer, String>();
			m2.put(201276, "grandfather");
			m2.put(201264, "grandmother");
			m2.put(201274, "nani");
			System.out.println("M2key pair values: " + m2);

			boolean b1 = m1.equals(m2);
			System.out.println("is m1 equals to m2: " + b1);

			// List to collect keys to remove

			List<Integer> keysToRemove = new ArrayList<>();

			for (Entry<Integer, String> En : m1.entrySet()) {
				if (En.getValue().equals("sun")) {
					keysToRemove.add(En.getKey());
				}
			}
			System.out.println("Keys to remove (value = sun):  " + keysToRemove);

			// Removing the matching key
			for (Integer key : keysToRemove) {
				m1.remove(key);
			}
			System.out.println("M1 after removing 'sun': " + m1);

			for (Integer key : m1.keySet()) {
				System.out.println(key);
			}

			for (String Values : m1.values()) {
				System.out.println(Values);

			}

		}
	}

