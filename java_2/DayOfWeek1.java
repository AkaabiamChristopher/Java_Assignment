import java.util.Scanner;

public class DayOfWeek1 {
   public static void main (String[] args) {
   Scanner input = new Scanner(System.in);

   
   System.out.print("Please enter number from 1 to 7: ");
   
   int date = input.nextInt();

   switch(date) {
   
   case 1:
   System.out.println("Monday");
   break;
 
   case 2:
   	System.out.println("Tuesday");
   break;
   
   case 3:
 	  System.out.println("Wednesday");
   break;

   case 4:
 	  System.out.println("Thursday");
   break;

   case 5:
 	  System.out.println("Friday");
   break;
	
   case 6:
	  System.out.println("Saturday");
   break;

   case 7:
  	 System.out.println("Sunday");
   break;
   default:
         System.out.println("invalid input");
	
    }

}


}