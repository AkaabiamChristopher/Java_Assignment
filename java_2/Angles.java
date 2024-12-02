import java.util.Scanner;

public class Angles{
public static void main(String[] args){

  Scanner input = new Scanner(System.in);

 System.out.print("Enter length1: ");
  int length1 = input.nextInt();

 System.out.print("Enter length2: ");
 int length2 = input.nextInt();

 System.out.print("Enter length3: ");
 int length3 = input.nextInt();

 if(length1 == length2 && length1 == length3){
 System.out.print("Equilateral Triangle");
}
	
 if(length1 == length2 && length1 != length3){
 System.out.print("Isosceles Triangle");
}
		
 if(length1 != length2 && length2 != length3){
 System.out.print("Isosceles Triangle");
}

    }

}