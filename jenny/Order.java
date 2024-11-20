import java.util.Scanner;

  public class Order {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  System.out.println("Dessert\n1. ice cream\n2. Sundae\n3. shake");
   int icecream = input.nextInt();
    switch(icecream) {
 case 1:
   System.out.println("pick a flavor\n1. chocolate\n2. vanilla\n3. strawberry");
       int chocolate = input.nextInt();
     switch(chocolate){
 case 1:
       System.out.println("your chocolate flavor will be ready soon");
      break;
      case 2:
       System.out.println("your vanilla flavor will be ready soon");
      break;
      case 3:
       System.out.println("your strawberry flavor ill be soon ready");
      break;
      }break;
 case 2:
   System.out.println("pick a flavor\n1. chocolate\n2. vanilla\n3. strawberry");
       int sundae = input.nextInt();
     switch(sundae){
 case 1:
       System.out.println("your chocolate flavor will be ready soon");
      break;
      case 2:
       System.out.println("your vanilla flavor will be ready soon");
      break;
      case 3:
       System.out.println("your strawberry flavor ill be soon ready");
      break;
      }break;
      
 case 3:
   System.out.println("pick a flavor\n1. chocolate\n2. vanilla\n3. strawberry");
       int shake = input.nextInt();
     switch(shake){
 case 1:
       System.out.println("your chocolate flavor will be ready soon");
      break;
      case 2:
       System.out.println("your vanilla flavor will be ready soon");
      break;
      case 3:
       System.out.println("your strawberry flavor ill be soon ready");
      break;
      }break;

}
}
}