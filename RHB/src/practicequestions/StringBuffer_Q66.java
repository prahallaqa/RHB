package practicequestions;

public class StringBuffer_Q66 {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Prahalla");
		System.out.println("Original Stringbuffer: " + sb);
		sb.append(" Reddy");
		System.out.println("apended String: " + sb);

		sb.insert(0, "Miss. ");
		System.out.println("After insert: " + sb);

		sb.replace(15, 20, "perumalla");
		System.out.println("After replace: " + sb);

		sb.delete(0, 5);
		System.out.println("after delete: " + sb);

		System.out.println("after reversal " + sb.reverse());
		System.out.println("capacity :" + sb.capacity());
		System.out.println("length : " + sb.length());
	}

}


