import java.util.Scanner;

public class Calculator{
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    double num1 = scanner.nextDouble();

    System.out.print("Enter an operator +, -, *, / ");
    char operator = scanner.next().charAt(0);

    System.out.print("Enter second number: ");
    double num2 = scanner.nextDouble();

    double result;  

    switch (operator) {
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result = num1 * num2;
            break;
        case '/':
            result = num1 / num2;p--0i98uy7t6r10:58 PM 11/6/20245
            break;
    }

    if (num2 != 0) {
        result = num1 / num2;
    } else {
        System.out.print("Error! Division by zero.");
        return;
    }
    break;
    default:
        System.out.print("Error! Invalid operator."); 
        return;
    }
    System.out.println("The result is: " + result);
}
}
}