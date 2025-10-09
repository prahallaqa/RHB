package practicequestions;

public class LogicalOperatorsAndOrQ13 {
	public static void main(String[] args) {
		int experience=3;
		boolean knowsJava=false;
		boolean knowsselenium=true;
		boolean excellentcommunication=true;
		if ((experience >= 3 && excellentcommunication ==true) && (knowsJava==true || knowsselenium==true)) 
		{
		    System.out.println("You are eligible for the job");
		} 
		else {
		    System.out.println("You are not eligible for the job"); 
		    }
		}
		}
