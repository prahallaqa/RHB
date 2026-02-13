package loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class mapEx {
	public static void main(String[] args) {

		// -----------------------------
		// Creating Map and Adding Data
		// -----------------------------
		Map<Integer, String> map = new HashMap<>();
		map.put(0, "pra-0");
		map.put(1, "pra-1");
		map.put(2, "pra-2");
		map.put(3, "pra-3");
		map.put(4, "pra-4");
		map.put(5, "pra-5");
		map.put(6, null);

		Map<Integer, String> map2 = new HashMap<>();

		System.out.println(map);

		map2.put(10, "pra-10");
		map2.put(11, "pra-11");
		map2.put(12, "pra-12");

		// equals()
		System.out.println("Equals maps? : " + map.equals(map2));

		// putAll()
		map.putAll(map2);
		System.out.println("After adding 2 maps: " + map);

		// get()
		System.out.println("get(1): " + map.get(1));

		// remove(key)
		System.out.println("remove(2) : " + map.remove(2));
		System.out.println(map);

		// remove(key, value)
		map.remove(10, "pra-10");
		System.out.println("remove 10: " + map);

		// containsKey(), containsValue()
		System.out.println("containsKey(3)? : " + map.containsKey(3));
		System.out.println("containsValue('pra-3')? : " + map.containsValue("pra-3"));

		// keySet(), values()
		System.out.println("keySet(): " + map.keySet());
		System.out.println("values(): " + map.values());

		// isEmpty()
		System.out.println("is empty? : " + map.isEmpty());

		// size()
		System.out.println("size(): " + map.size());

		// -----------------------------
		// Extra important Map methods
		// -----------------------------

		// putIfAbsent()
		map.putIfAbsent(5, "new-value"); // will NOT add because key 5 already exists
		map.putIfAbsent(20, "pra-20"); // will add
		System.out.println("After putIfAbsent: " + map);

		// getOrDefault()
		System.out.println(map.get(10));

		System.out.println("getOrDefault(50, 'default') : " + map.getOrDefault(50, "default"));

		// replace()
		map.replace(3, "pra-3-modified");
		System.out.println("After replace: " + map);

		// replace(key, oldVal, newVal)
		map.replace(3, "wrong", "new-value"); // will NOT replace
		map.replace(3, "pra-3-modified", "pra-3-replaced"); // replace successfully
		System.out.println("After conditional replace: " + map);

		// replaceAll()
		map.replaceAll((k, v) -> v == null ? "NULL" : v.toUpperCase());
		System.out.println("After replaceAll() (uppercase): " + map);

		// entrySet() — iterate Map entries
		System.out.println("Using entrySet():");
		
		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " --> " + entry.getValue());
		}

		System.out.println("Using keyset():");

		for (Integer i : map.keySet()) {
			System.out.println(i);
		}
		System.out.println("Using values():");

		for (String s : map.values()) {
			System.out.println(s);
		}

		map.clear();
		System.out.println("After clear(): " + map);
		System.out.println("isEmpty()? : " + map.isEmpty());
	}
}
