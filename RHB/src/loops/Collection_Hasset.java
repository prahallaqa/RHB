package loops;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Hasset {
	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		names.add("prahalla");
		names.add("perumalla");
		names.add("perumalla");
		System.out.println(names);

		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		  
	}

}
