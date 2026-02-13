package loops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class convertionofListtoSet {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(74);
		list.add(14);
		list.add(24);
		list.add(34);
		list.add(74);
		list.add(54);
		System.out.println(list);
		
		Set set = new HashSet(list);
		System.out.println(set);

	}

}
