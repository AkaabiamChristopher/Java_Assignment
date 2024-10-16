import java.util.Scanner;
import java.lang.Math;
 
public class Triangle{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
 
	System.out.println("Enter length" );
 	double size = input.nextDouble();

double result1 = Math.sqrt(3)/4; 
double area = result1 * (size * size);
double volume = area * size;
System.out.println(area);
System.out.println(volume);

  



      }


}