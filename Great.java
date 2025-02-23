import java.util.Scanner;
public class Great{
  public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
System.out.println("Enter number 10 times:");

 int number = scanner.nextInt();

 
 int largest = number;
 int smallest = number;

 for(int count = 1;count <= 10;count++){
  number = scanner.nextInt();


   if (number > largest) {
       largest = number;
       }

   if (number < smallest) {
       smallest = number;
    }
}        

System.out.println("The largest number is:" + largest);
System.out.println("The smallest number is:" + smallest);


   }
}