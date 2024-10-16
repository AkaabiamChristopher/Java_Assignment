import java.util.Scanner;
 public class Multiple {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);

 System.out.print("Enter integer");
 int number1 = input.nextInt();
 System.out.print("Enter integer");
 int number2 = input.nextInt();
 int result1 = number1 * number1 * number1;
 int result2 = number2 * number2;
 
 
 if (result2 % result1 == 0) {
    System.out.println("Yes it is a multiple");
 }
 



 }

}