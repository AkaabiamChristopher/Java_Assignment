import java.util.Scanner;

public class CalShapes{
   public static void main(String[] args){

   Scanner scanner = new Scanner(System.in);

  System.out.println("1. Circle\n2. Rectangle\n3. Triangle");
        int input = scanner.nextInt();
  switch(input){
           case 1:
                 System.out.print("Enter radius:");
                  double radius = scanner.nextDouble();
                  double area = (3.14) * Math.pow(radius,2); 
                 System.out.println(area);
                    break;
             case 2:
                 System.out.print("Enter lenght:");
                  double lenght = scanner.nextDouble();
                 System.out.print("Enter width(Breadth):");
                   double width = scanner.nextDouble();
                   double areas = lenght * width;
                 System.out.println(areas);
                  break;
            case 3:
                 System.out.print("Enter base:");
                   double base = scanner.nextDouble();
                 System.out.print("Enter height:");
                   double height = scanner.nextDouble();
                   double areaOfTriangle = 0.5 * base * height;
                 System.out.println(areaOfTriangle);

}







}





}
