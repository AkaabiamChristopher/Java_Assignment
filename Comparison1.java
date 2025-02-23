import java.util.Scanner;

public class Comparison1 {
	public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter an integer:");
   int number = scanner.nextInt();
   int square = number * number;
  
if(number > 100){
	 System.out.println("The number " + number + " is greater than 100."); 
}else if(number < 100){
 System.out.println("The number " + number + " is less than 100.");

 } else {
 	System.out.println("The number " + number + " is equal to 100.");

 } if (square > 100) { 
	System.out.println("The square of " + number + " (" + square + ") is greater than 100."); 

} else if (square < 100) { 
	System.out.println("The square of " + number + " (" + square + ") is less than 100."); 

} else { 
	System.out.println("The square of " + number + " (" + square + ") is equal to 100.");

 }  if (number != 100) {
 	System.out.println("The number " + number + " is not equal to 100.");
 } if (square != 100) {
	 System.out.println("The square of " + number + " (" + square + ") is not equal to 100.");

}

     }
}