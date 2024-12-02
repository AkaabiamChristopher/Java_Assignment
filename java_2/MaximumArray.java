public class MaximumArray {
  public static void main(String[] args){
      int[] numbers = {1, 5, 2, 8, 3};
   
 int maximum = numbers[0];





for(int myArray : numbers){
   if(myArray > maximum ) {
      maximum = myArray;
}   
}
System.out.print(maximum);
}
}