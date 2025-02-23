public class TwoTriangle{

public static void main(String... args){

	
	printStars(1);
	printNewLine();
	printStars(2);
	printNewLine();
	printStars(3);
	printNewLine();
	printStars(4);
	printNewLine();

	printStars(4);
	printNewLine();
	printStars(3);
	printNewLine();
	printStars(2);
	printNewLine();
	printStars(1);
	printNewLine();

    }

public static void printStars(){
	System.out.print("* ");
    }
public static void printNewLine(){
	System.out.println();
    }

public static void printStars(int y){
	for(int i = 1;i <= y; i++){
	printStars();
   }


}






}
