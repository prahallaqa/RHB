package practice1;

public class Prhallla_ch_Count {
	public static void main(String[] args) {

		String name = "prahalla";

		for (int i = 0; i < name.length(); i++) { // Picks one character at a time
			char ch = name.charAt(i); //
			int count = 1;

			if (name.indexOf(ch) < i) { // 0<0, 1<1, 2<2, 3<3, 2<4,
				continue; // already counted // If this character appeared before, skip it.
			}

			for (int j = i + 1; j < name.length(); j++) { // j=1;j<9;j++
				if (ch == name.charAt(j)) { // p==r--> p=1
											// r==a --> r==1,
											// a==h --> 1, a==a--> 2, a==l , a==l, a==a --> a==3
											// h==a -->1
											// l==l -->2
					count++;
				}
			}

			System.out.println(ch + " = " + count);
		}
	}
}
