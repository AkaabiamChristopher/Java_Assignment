public class MaximumArray {
  public static void main(String... args){
      int[] number = {1, 5, 2, 8, 3};
   
 int maximum = number[0];
 

for(int myArray : number){
   	if(myArray > maximum ) {
     	maximum = myArray;
} 


System.out.println(maximum);
   
     }
}