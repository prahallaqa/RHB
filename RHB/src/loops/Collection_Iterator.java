package loops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_Iterator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Prahalla");
		list.add("perumalla");
		list.add("honey"); 
		System.out.println(list);

		Iterator<String> listit = list.iterator();
		while (listit.hasNext()) {
			
			String name=listit.next();
			System.out.println(name);
			
			if(name.equals("Prahalla"))
			{
				listit.remove();
			}
		}
	
		System.out.println(list);
	}
}
