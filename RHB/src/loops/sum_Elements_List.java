package loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class sum_Elements_List {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// 1 Using enhanced for-loop
		int sum2 = 0;
		for (int num : list) {
			sum2 = sum2 + num;
		}
		System.out.println("Sum using for-each loop: " + sum2);

		// 2️ Using Iterator
		int sum = 0;
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {

			sum = sum + it.next();
		}
		System.out.println("Sum using Iterator: " + sum);
	}
}
