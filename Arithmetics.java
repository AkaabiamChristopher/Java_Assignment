import java.util.Scanner;
 
public class Arithmetics{
public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
  System.out.print("Enter first integer");
  int number1 = input.nextInt();
  System.out.println("Enter second intger");
  int number2 = input.nextInt();
  int squareOfNumber1 = number1 * number1;
   int squareOfNumber2 = number2 * number2;
   int additionsOfSquareNumber = squareOfNumber1 + squareOfNumber2;
int subtractionOfSquareNumber = squareOfNumber1 - squareOfNumber2;

  System.out.println("the square of number is  "+ squareOfNumber1);
System.out.print("the square of number is "+ squareOfNumber2);
System.out.print("the addition of square number is "+ additionsOfSquareNumber);
System.out.println("the subtraction of square number is "+ subtractionOfSquareNumber);








  }
  
}
