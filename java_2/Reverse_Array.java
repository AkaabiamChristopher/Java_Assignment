import java.util.Scanner;
public class Reverse_Array{
 public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

  System.out.print("Enter number from 1 to 5: ");    
   int num = scanner.nextInt();
       	
int[] arrays = {1, 2, 3, 4, 5};
   for(int number = arrays.length; number > 0; number--){
	System.out.print(number);
	}

    }
}