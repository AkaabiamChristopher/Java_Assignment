import java.util.Scanner;
public class Biggie{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	    
	System.out.println("Enter number:");
	   int number = scanner.nextInt(); 
 	     int largest = number;
	     int smallest = number;

	    while (true) {
 	      number = scanner.nextInt(); 
	    if (number == 2) {
		 break;
 	    }
if (number > largest) {
       largest = number;
       }

   if (number < smallest) {
       smallest = number;5
    }
}        
    System.out.println("The largest number is: " + largest); 
    System.out.println("The smallest number is: " + smallest);


}
}