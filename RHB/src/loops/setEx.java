package loops;

import java.util.HashSet;
import java.util.Set;

public class setEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("prahalla-0");
		set.add("prahalla-1");
		set.add("prahalla-2");
		set.add(null);
		set.add(null);
		set.add("prahalla-2");
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set.contains("prahalla-0"));
		System.out.println(set.remove("prahalla-1"));
		System.out.println(set);
		System.out.println(set.isEmpty());
		
	}

}
