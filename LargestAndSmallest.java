import java.util.Scanner;
public class LargestAndSmallest{

  public static void main(String[] args){
    int largest =0;
    int smallest=0;
    Scanner inputCollector = new Scanner(System.in);
    for (int counter = 1; counter<=4; counter++){
	System.out.println("Enter a number");
	int number = inputCollector.nextInt();
	smallest = number;
	if (number > largest)largest = number;
	if(number < smallest)smallest = number;
    }
	System.out.println(smallest);
	System.out.println(largest);

  }


}