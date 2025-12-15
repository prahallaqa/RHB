package loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeNullFromList {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(null);
		list.add(30);
		list.add(null);
		System.out.println(list);
		Iterator i = list.iterator();
		while (i.hasNext()) {
			if (i.next() == null)
			i.remove();

		}
		System.out.println(list);

	}

}
