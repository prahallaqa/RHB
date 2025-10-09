package practice1;
public class SavingsAccount extends BankAccount{

		static double balance =2000;
		
		void InterestCalculation()
		{
			 double i=20.00;
			 System.out.println("balance in your acc is: "+ balance);
			 System.out.println("Intrest is added "+i);
			 double totalbalance=i + balance;
			 System.out.println("This os Total bal :" + totalbalance);
		}
	
		public static void main(String[] args) {
			
			SavingsAccount a= new SavingsAccount();
			a.InterestCalculation();
		
			deposit(1000.000);
			withdraw(10.00);
	}
}