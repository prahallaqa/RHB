package practice1;

public class RandomInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int min = 1;
	        int max = 6;

	        System.out.println(java.lang.Math.random());
	        
	        int random = min + (int)(java.lang.Math.random() * ((max - min) + 1));
	        // 1+ 0.3*((6-1)+1)
	        //1+0.3*6
	        //1*3=3
	        System.out.println("Random number between " + min + " and " + max + ": " + random);
	}

}
