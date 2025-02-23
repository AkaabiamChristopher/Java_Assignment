import java.util.Scanner;

public class CompoundInterest{
   public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);

  System.out.print("Enter initial investment amount:  ");
  double investAmount = scanner.nextDouble();

  System.out.print("Enter monthly contribution amount:  ");
  double monthlyContribution = scanner.nextDouble();

  System.out.print("Enter length of time or year:  ");
  int lengthOfTime = scanner.nextInt();

  System.out.print("Enter estimated interest rate:  ");
  double estimatedInterestRate = scanner.nextDouble();

  System.out.print("Enter interest rate variance range:  ");
  double interestRate = scanner.nextDouble();

 System.out.print("Enter compound  frequency:  ");
 double compoundFrequency = scanner.nextDouble();

double minimumRate = estimatedInterestRate - interestRate;

double maximumRate = estimatedInterestRate + interestRate;


System.out.printf("The amount after %d years with minimum interestRate %.2f%% is: %.2f%n", lengthOfTime, minimumRate * 100, minimumRate);
System.out.printf("The amount after %d years with maximum interestRate %.2f%% is: %.2f%n", lengthOfTime, maximumRate * 100, maximumRate);



     }

}