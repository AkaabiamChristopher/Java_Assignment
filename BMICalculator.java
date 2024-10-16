import java.util.Scanner;

 public class BmiCalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

     System.out.println("Chooseunit:");
     
     System.out.println("1. Pounds and Inches");
  
     System.out.println("2. Kilograms amd Meters");
      int choice = input.nextInt();
       double weight,height,bmi;
       if (choice == 1) {System.out.print("Enter weight (pounds): ");
       Weght = input.nextDouble();
        System.out.print("Enter height (in inches):");
                height = input.nextDouble();
        bmi = (weight * 730) / (height * height);
        }else if (choice == 2) {
        System.out.print("Enter height (in meters): ");
        height = input.nextDouble();
        bmi = weight / (height * height);
                } else {
        System.out.printf("Your BMI is %.2f%n", bmi);
        System.out.printf("BMI Categories: ");
         System.out.printf("Underweight: < BMI 18.5");
          System.out.printf("Normalweight: BMI = 18.5-24.9");
          System.out.printf("Overweight: BMI = 25-29.9");
          System.out.printf("Obese: BMI > 30");



   }     


      } 




 }