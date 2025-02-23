import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students do you have?: ");
        int numberOfStudents = scanner.nextInt();

        System.out.print("How many subjects do they offer?: ");
        int numberOfSubjects = scanner.nextInt();

        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");

        int[][] scores = new int[numberOfStudents][numberOfSubjects];

        for (int count = 0; count < numberOfStudents; count++) {
            System.out.println("Enter student score " + (count + 1) + ":");
            for (int i = 0; i < numberOfSubjects; i++) {
                while (true) {
                    System.out.print("Subject " + (i + 1) + ": ");
                    int score = scanner.nextInt();
                    if (score >= 0 && score <= 100) {
                        scores[count][i] = score;
                        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nsaved successfully");
                        break;
                    } else {
                        System.out.println("Scores must be between 0 and 100. Enter scores again.");
                    }
                }
            }
        }

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("student " + (i + 1) + ":");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("==========================================================");
        System.out.print("         ");
        for (int sub = 0; sub < numberOfSubjects; sub++) {
            System.out.print("SUB " + (sub + 1) + "   ");
        }
        System.out.print("TOT   AVE    POS");
        System.out.println();
        System.out.println("==========================================================");

        for (int i = 0; i < numberOfStudents; i++) {
            int totalScore = 0;
            System.out.print("student " + (i + 1) + ": ");
            for (int j = 0; j < numberOfSubjects; j++) {
                System.out.print(scores[i][j] + "     ");
                totalScore += scores[i][j];
            }
            double averageScore = (double) totalScore / numberOfSubjects;
            System.out.println("  " + totalScore + "   " + averageScore);
        }

        System.out.println("==========================================================");
        System.out.println("==========================================================");

        System.out.println("SUBJECT SUMMARY");
        for (int subject = 0; subject < numberOfSubjects; subject++) {
            int highestScore = -1;
            int lowestScore = 101;
            int highestScoringStudent = -1;
            int lowestScoringStudent = -1;

            for (int student = 0; student < numberOfStudents; student++) {
                if (scores[student][subject] > highestScore) {
                    highestScore = scores[student][subject];
                    highestScoringStudent = student;
                }
                if (scores[student][subject] < lowestScore) {
                    lowestScore = scores[student][subject];
                    lowestScoringStudent = student;
                }
            }

            System.out.println("Subject " + (subject + 1) + " Summary:");
            System.out.println("Highest scoring student is student " + (highestScoringStudent + 1) + " with a score of " + highestScore);
            System.out.println("Lowest scoring student is student " + (lowestScoringStudent + 1) + " with a score of " + lowestScore);
            System.out.println();
        }
    }
}
