import java.util.Scanner;
 
public class Weekdays{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

System.out.print("1\n2\n3\n4\n5\n6\n7\n: ");
  int days = scanner.nextInt();

 switch(days){

case 1:
  System.out.print("Wow it's Monday");
break;
case 2:
  System.out.print("Wow it's Tuesday");
break;
case 3:
  System.out.print("Wow it's Wednesday");
break;
case 4:
  System.out.print("Wow it's Thursday");
break;
case 5:
  System.out.print("Wow it's Friday");
break;
case 6:
   System.out.print("Wow it's Saturday");
break;
case 7:
   System.out.print("Wow it's Sunday");
}

  }
}