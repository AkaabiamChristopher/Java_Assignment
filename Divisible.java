import java.util.Scanner;

public class Divisible{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

     System.out.print("Enter  numbers: ");
         int number = scanner.nextInt();
	if (number % 3 == 0 ){  
        System.out.println(number + " is  divisible by 3 ");
   }  else {
        System.out.println(number + " is not divisible by 3");
   }    
   

	




      }

}
