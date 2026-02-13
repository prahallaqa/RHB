package loops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetintoList {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(40);
		System.out.println(set);
		
		List list = new ArrayList(set);
		list.add(40);
		System.out.println(list);

	}
}
