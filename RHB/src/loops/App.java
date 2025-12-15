package loops;

public class App {


	  public static void main(String[] args) {

	        try {
	        	throw_and_Throws.login("admin", "1111");
	        } catch (IllegalAccessException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}


