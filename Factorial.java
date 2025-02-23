import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number of your choice to calculate factorial:  ");
        int number = scanner.nextInt();
        
        int result = 1;
        for (int count = 1; count <= number; count++) {
            result = result * count;
        }
        
        System.out.println("The factorial of " + number + " is " + result);
    }
}