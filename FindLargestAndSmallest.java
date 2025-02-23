
import java.util.Scanner;

public class FindLargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number = scanner.nextInt();
        int largest = number;
        int smallest = number;

               for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            number = scanner.nextInt();

            if (number > largest) {
                largest = number;
            }

            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);

          }
}