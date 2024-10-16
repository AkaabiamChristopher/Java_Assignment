import java.util.Scanner;

public class Interest{
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter annual percentage interest rate: ");
  double annualRate = input.nextDouble();
  System.out.print("Enter the balance: ");
  double balance = input.nextDouble(); 

  double result = balance * annualRate / 1200;
  System.out.printf("the interest is %.2f", result);

  





}

   }