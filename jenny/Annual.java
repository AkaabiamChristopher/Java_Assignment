import java.util.Scanner;
 
public class Annual {
   public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);

System.out.print("Enter Annual income:");
int Annual = scanner.nextInt();

if(Annual <= 9675 ){
System.out.print("yur tax rate is 10%");
}
else if(Annual >= 9876 && Annual <=40125){
System.out.print("yur tax rate is 12%");
}
else if(Annual >= 40125 && Annual <=8552){
System.out.print("yur tax rate is 22%");
}
else if(Annual > 85526){
System.out.print("yur tax rate is 24% Above");
}



}
}