import java.util.Scanner;

  public class Department {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
System.out.println("Department\n1. IT:\n2. HR:\n3. Finance:");
 int department = input.nextInt();
 switch(department) {
  case 1:
   System.out.println("1. Manager\n2. Analyst\n3. Internet");
    int manager = input.nextInt();
    switch(manager) {
      case 1:
     System.out.println("You are doing great manager");
     break;
      case 2:
     System.out.println("You are doing great Analyst");
     break;
      case 3:
     System.out.println("You are doing great Internet");
     break; 
    }break;
      case 2:
      System.out.println("\n1. Manager\n2. Analyst\n3. Internet");
       int analyist = input.nextInt();
       switch(analyist) {
             case 1:
     System.out.println("You are doing great manager");
     break;
      case 2:
     System.out.println("You are doing great Analyst");
     break;
      case 3:
     System.out.println("You are doing great Internet");
     break; 
      }break;
     case 3: 
 System.out.println("\n1. Manager\n2. Analyst\n3. Internet");
       int internet = input.nextInt();
       switch(internet) {
     case 1:
     System.out.println("You are doing great manager");
     break;
      case 2:
     System.out.println("You are doing great Analyst");
     break;
      case 3:
     System.out.println("You are doing great Internnet");
     break;
}
}
}
}