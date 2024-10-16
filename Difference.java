import java.util.Scanner;

public class Difference{
public static void main(String[] args) {

 Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds");
double weightinpounds = input.nextDouble();

System.out.print("Enter height in inches");
double heightininches = input.nextDouble();

double bmi = ( weightinpounds * 703 ) / ( heightininches * heightininches );
System.out.print("your body mass index  " + bmi);
System.out.print("")


}

  }