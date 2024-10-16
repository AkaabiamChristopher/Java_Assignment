import java.util.Scanner;
 
public class Sum {
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter first integer");
 int  number = input.nextInt();
 int result1 = number / 100;
 int remainderOfNumber = number % 100;
 int result2 = remainderOfNumber / 10;
 int result3 = remainderOfNumber % 10;
 int sum = result1 + result2 + result3;
 System.out.print("result of sum: "+ sum);


  }
 
}