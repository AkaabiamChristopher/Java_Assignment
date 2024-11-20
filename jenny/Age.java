import java.util.Scanner;
 
public class Age{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

System.out.print("Enter age: ");
  int age = scanner.nextInt();

if(age <= 12) {

System.out.print("child");
}
else if (age >= 13 && age <= 17){
System.out.print("Teens");
}
else if (age >= 18 && age <= 64){
System.out.print("Adults");
}
else if (age >= 65){
System.out.print("Senior");
}




}
}