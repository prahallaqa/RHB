package loops;

import java.util.ArrayList;
import java.util.List;

public class listEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("prahalla-0");
		list.add("prahalla-1");
		list.add("prahalla-2");

		list.add(null);
		System.out.println(list);

		list.add(3, "prahalla-3");
		System.out.println(list);
		System.out.println(list.get(3));

		list.set(4, "prahalla-4");
		System.out.println(list);

		list.remove(4);
		System.out.println(list);

		System.out.println(list.size());
		System.out.println(list.contains("prahalla-0"));
		System.out.println(list.isEmpty());

		list.clear();
		System.out.println(list);
	}

}
