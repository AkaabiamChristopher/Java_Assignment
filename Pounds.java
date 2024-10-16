import java.util.Scanner;


public class Pounds {
 public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number in kilograme to pounds: ");
  double kilogramNumber = input.nextDouble();
   double poundsConvert = kilogramNumber * 0.305;
   System.out.printf("%.2f kilogram is %.2f pounds", kilogramNumber, poundsConvert);




}


  }
 
