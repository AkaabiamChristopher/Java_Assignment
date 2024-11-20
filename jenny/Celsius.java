import java.util.Scanner;
 
public class Celsius{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
 
System.out.print("Enter Temperature in Celsius:");
int Temperature = scanner.nextInt();
 
if(Temperature <= 10){
System.out.print("Cold");
}
else if(Temperature >= 11 && Temperature <=25){
System.out.print("Warm");
}
else if(Temperature > 25){
System.out.print("Hot");
}

}
}