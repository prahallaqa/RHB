package practice1;

import java.util.HashMap;

public class Duplicate_Count {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 6, 6, 6 };

		HashMap<Integer, Integer> map = new HashMap<>();

		// Count frequency
		for (int num : arr) {
			map.put(num, map.getOrDefault(num, 0) + 1);// 1,
		}

		// Print only duplicates
		for (int key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " is " + map.get(key) + " times repeated");
			}
		}
	}
}