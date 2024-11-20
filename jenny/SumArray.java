public class SumArray{
  public static void main(String... args){
     int sum = 0;
   int[] number = {23,45,62,45,100,8};

  for(int myArray : number){
  sum += myArray;  
}

  System.out.print(sum);

}
}