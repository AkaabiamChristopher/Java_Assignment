public class MinimumArray {
  public static void main(String[] args){
      int[] numbers = {4, 2, 9, 1, 6};
   
 int minimum = numbers[0];

for(int myArray : numbers){
   if(myArray < minimum ) {
      minimum = myArray;
}   
}
System.out.print(minimum);
}
}