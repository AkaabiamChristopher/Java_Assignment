import java.util.Scanner;
 
public class Drive{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

System.out.print("Enter age: ");
  int age = scanner.nextInt();

if(age >=16 && age <=17) {

System.out.print("You can only Drive Boss!!!");
}
else if (age >=18  && age <= 20){
System.out.print("1.You can Vote!!!\n2.You can Drive!!!");
}
else if (age > 21){
System.out.print("You are the Boss now!!!\n1.You can Vote!!!\n2.You can Drive!!!\n3.You can Drink!!!\nHehehehehehe!!!!!");
}




}
}