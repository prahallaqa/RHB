package loops;
import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class newaEffectiveHoursCalculatortendace {

	public static void main(String[] args) {
	

	
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Entry Time (HH:mm): ");
		        LocalTime entry = LocalTime.parse(sc.nextLine());

		        System.out.print("Enter Effective Hours Worked (HH:mm): ");
		        String[] eff = sc.nextLine().split(":");

		        // Convert effective hours to minutes
		        int effHours = Integer.parseInt(eff[0]);
		        int effMinutes = Integer.parseInt(eff[1]);
		        long effTotalMin = effHours * 60 + effMinutes;

		        // Required effective time = 8h 30m
		        long requiredMin = 8 * 60 + 30;

		        System.out.println("\n===========================");
		        System.out.println("      WORK SUMMARY");
		        System.out.println("===========================");

		        System.out.println("Effective Hours : " + effHours + "h " + effMinutes + "m");

		        if (effTotalMin >= requiredMin) {
		            System.out.println("✔ You already completed 8:30 hours.");
		        } else {
		            long remaining = requiredMin - effTotalMin;
		            long remH = remaining / 60;
		            long remM = remaining % 60;

		            System.out.println("✘ Remaining Effective Time : " + remH + "h " + remM + "m");

		            // Calculate required exit time
		            LocalTime requiredExit = entry.plusMinutes(requiredMin);
		            System.out.println("➡ Required Exit Time       : " + requiredExit);
		        }

		        sc.close();
		    }
		

	}

