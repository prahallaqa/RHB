package practice1;



public class Math {

	public static void main(String[] args) {
	java.lang.Math.random();
		
		double pi = java.lang.Math.PI;
		System.out.println(pi);
		System.out.println("addExact " + java.lang.Math.addExact(10 +10,20));
		System.out.println("addExact " + java.lang.Math.addExact(20l, 10l));
		System.out.println("subtractExact " +java.lang.Math.subtractExact(20, 10));
		System.out.println("subtractExact " +java.lang.Math.subtractExact(20l, 10l));
		System.out.println("multiplyExact " +java.lang.Math.multiplyExact(10, 2));
		System.out.println("multiplyExact " +java.lang.Math.multiplyExact(10l, 2l));
		System.out.println("abs " + java.lang.Math.abs(-23));
		System.out.println("abs " + java.lang.Math.abs(-10.22));
		System.out.println("abs " + java.lang.Math.abs(-10l));
		System.out.println("abs " + java.lang.Math.abs(-10.22));
		//System.out.println(java.lang.Math.absExact(-12345));
		System.out.println("sqrt "+java.lang.Math.sqrt(100));
		System.out.println("min "+java.lang.Math.min(10, 100));
		System.out.println("min "+java.lang.Math.min(1000l, 200L));
		System.out.println("max "+java.lang.Math.max(100, 3000));
		System.out.println("max "+java.lang.Math.max(1000l, 200l));
		System.out.println("pow "+java.lang.Math.pow(2, 3));
		System.out.println("round "+java.lang.Math.round(pi));
		System.out.println(java.lang.Math.random());
		
		
		
		
	}
}
