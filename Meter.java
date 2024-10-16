import java.util.Scanner;


public class Meter{
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number in feet to convert it to meter: ");
  double feetNumber = input.nextDouble();
   double meterConvert =feetNumber * 0.305;
   System.out.printf("%.2f feet is %.2f meters", feetNumber, meterConvert);




}


  }
 
