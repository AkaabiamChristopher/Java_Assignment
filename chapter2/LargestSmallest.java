import java.util.Scanner;
public class LargestSmallest{
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
	int largest =0;
        int smallest =0;

 for (int count = 1; count<=5; count++){
   System.out.print("Enter number:");
    int number = input.nextInt();
    

    if (number > largest){
	largest = number;
	
	}
 	if(number < smallest){
	smallest = number;
	}
     }

  System.out.println("largest number is: " + largest);
  System.out.println("smallest number is : " + smallest);




  }


}
