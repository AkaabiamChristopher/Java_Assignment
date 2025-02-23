import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class MensturationApp{

	public static void main(String[] args){

	
		Scanner input = new Scanner(System.in);

System.out.print("Enter started date of menstration:  ");
	String Datestarted = input.nextLine();
		
System.out.print("Enter the date menstration ended : ");
	String Endeddate = input.nextLine();

System.out.print("Enter your mensturation cycle:  ");
	int days = input.nextInt();

		
DateTimeFormatter date = DateTimeFormatter.ofPattern("date/Month/year");
	
	LocalDate periodStartTime = LocalDate.parse(Datestarted,date);	
	LocalDate periodEndTime = LocalDate.parse(Endeddate,date);
		Period period = Period.between(periodStartTime,periodEndTime);

System.out.println("Your mensturation duration: " + period);

	LocalDate ovulationPeriod = periodEndTime.plusDays(days/2);
	System.out.println("Your ovulation period starts: " + ovulationPeriod);

	LocalDate ovulationPeriodEnd = ovulationPeriod.plusDays(2);
System.out.println("Your ovulation period ends: " + ovulationPeriodEnd);

	LocalDate freePeriod = periodEndTime.plusDays(1);
System.out.println("Your safe period starts: " + freePeriod);	

	LocalDate endFreePeriod = periodEndTime.plusDays(6);
System.out.println("Your safe period ends: " + endFreePeriod);
 
	
	LocalDate nextPeriodStart = periodEndTime.plusDays(days);
System.out.println("Your next period starts: " + nextPeriodStart);

	}	
}
