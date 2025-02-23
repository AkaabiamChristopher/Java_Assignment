import java.util.Scanner;
public class SumSquare{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter first integer:");
	int number1 = scanner.nextInt();
	int numSquare1 = number1 * number1;

System.out.print("Enter second integer:");
	int number2 = scanner.nextInt();
	int numSquare2 = number2 * number2;
 
int sum = numSquare1 + numSquare2;
System.out.printf("Sum of ther square %d%n", sum);




	}

}