package practice1;

public class Sringbufferex {

	public static void main(String[] args) {
		StringBuffer s1= new StringBuffer("prahalla");
		s1.append('p');
		System.out.println(s1);
		s1.deleteCharAt(8);
		System.out.println(s1);
		
		String a= "Perumalla";
		String b=a.concat(" reddy");
		System.out.println(a);
		System.out.println(b);
	}
}
