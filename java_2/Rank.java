import java.util.Scanner;
 
public class Rank{
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

System.out.print("1\n2\n3\n4: ");
  int rank = scanner.nextInt();

 switch(rank){

case 1:
  System.out.print("Wow it's a Gold Medal");
break;
case 2:
  System.out.print("Wow it's a Silver Medal");
break;
case 3:
  System.out.print("Wow it's Bronze Medal");
break;
case 4:
  System.out.print("Wow it's a Participant Ribbon");
break;
}

  }
}