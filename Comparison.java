import java.util.Scanner;

public class Comparison{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Enter first integer");
int number1 = input.nextInt();
System.out.print("Enter second integer");
int number2 = input.nextInt();
System.out.print("Enter third integer");
int number3 = input.nextInt();
int sumOfNumbers = number1 + number2 + number3;
int averageOfNumbers = number2 + number2 + number3 / 3; 
int productOfNumbers = number1 * number2 * number3;
System.out.println("result of the sum: " + sumOfNumbers);
System.out.println("result of average: "+ averageOfNumbers);
System.out.println("result of product: "+ productOfNumbers);

  
}

}