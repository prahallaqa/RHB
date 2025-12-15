package practicequestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_Methods_Q75 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("pra-0");
		list.add("pra-1");
		list.add("pra-2");
		list.add("pra-3");
		list.add("pra-0");
		Collections.reverse(list);
		System.out.println(list);
		List<String> unmodilist = Collections.unmodifiableList(list);
		System.out.println("unmodilist:" + unmodilist);
		int frequency = Collections.frequency(list, "pra-0");
		System.out.println("frequency pra-0 is : " + frequency);
		Collections.sort(list);
		System.out.println(list);
		System.out.println("binarySearch  pra-2 : " + Collections.binarySearch(list, "pra-2"));
		Collections.shuffle(list);
		System.out.println("shuffle: " + list);
		Collections.rotate(list, 2);
		System.out.println("rotate : " + list);

	}
}


