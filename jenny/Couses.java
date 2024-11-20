import java.util.Scanner;

  public class Couses {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Course\n1. Math\n2. Science\n3. History");
   int course = input.nextInt();
    switch(course) {
 case 1:
   System.out.println("grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
    int case1 = input.nextInt();
     switch(case1) {
      case 1:
       System.out.println("How are you doing freshman in math course");
      break;
      case 2:
       System.out.println("How are you doing sophomore in math course");
      break;
      case 3:
       System.out.println("How are you doing junior in math course");
      break;
      case 4:
       System.out.println("How are you doing Senior in math course");
      break;
     }
      break;
 case 2:
      System.out.println("grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
    int case2 = input.nextInt();
     switch(case2) {
      case 1:
       System.out.println("How are you doing freshman in science course");
      break;
      case 2:
       System.out.println("How are you doing sophomore in science course");
      break;
      case 3:
       System.out.println("How are you doing junior in science course");
      break;
      case 4:
       System.out.println("How are you doing Senior in science course");
      break;
     }
      break;
 case 3:
  System.out.println("grade level\n1. Freshman\n2. Sophomore\n3. Junior\n4. Senior");
    int case3 = input.nextInt();
     switch(case3) {
      case 1:
       System.out.println("How are you doing freshman in history course");
      break;
      case 2:
       System.out.println("How are you doing sophomore in history course");
      break;
      case 3:
       System.out.println("How are you doing junior in history course");
      break;
      case 4:
       System.out.println("How are you doing Senior in history course");
      break;
     }break;
}
}
}
