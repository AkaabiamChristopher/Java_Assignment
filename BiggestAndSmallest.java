import java.util.Scanner;

public class BiggestAndSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

 	System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

	 System.out.print("Enter the first number: ");
        int number3 = input.nextInt();

	
        if (number1 > number2 && number2 > number3) {
		System.out.println();

           }else if( number1 < number2 && number2 < number3){
		System.out.println();		
	   }

            if (number2 < number1 && number1 < number3) {
                System.out.println();   
            }else if(number2 < number1 && number1 < number3){
	     	System.out.println();
	    }
	
	    if (number3 > number2 && number2 > number1) {
                System.out.println();   
            }else if(number3 < number2 && number2 < number1){
	     	System.out.println();
	    }
	
		int sum = number1 + number2 + number3;


        System.out.println("The sum is: " + sum);
    }
}
