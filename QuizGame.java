import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

        for (int i = 0; i < 10; i++) {
            int num1 = random.nextInt(20) + 1;
            int num2 = random.nextInt(20) + 1;
            char[] operators = {'+', '-', '*', '/'};
            char operator = operators[random.nextInt(operators.length)];
            String question = "What is " + num1 + " " + operator + " " + num2 + "?";

            double correctAnswer = 0;
            switch (operator) {
                case '+':
                    correctAnswer = num1 + num2;
                    break;
                case '-':
                    correctAnswer = num1 - num2;
                    break;
                case '*':
                    correctAnswer = num1 * num2;
                    break;
                case '/':
                    correctAnswer = (double) num1 / num2;
                    break;
            }

            System.out.println(question);
            System.out.print("Answer: ");
            double playerAnswer = scanner.nextDouble();

            if (playerAnswer == correctAnswer) {
                System.out.println("Correct");
                correctAnswers += 1;
            } else {
                System.out.println("Incorrect. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("You got " + correctAnswers + " out of 10 questions correct.");
        System.out.println("Your score: " + correctAnswers + "/10");
        scanner.close();
    }
}
 