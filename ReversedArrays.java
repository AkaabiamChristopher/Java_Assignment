import java.util.Arrays;

public class ReversedArrays {
    public static void main(String[] args) {

  int[] arrays = {4, 10, 3, 4, 5, 6, 7, 8, 9};
  int[] reversedArray = new int[arrays.length];

 for (int index = arrays.length-1; index >= 0;index--) {
      
     reversedArray[arrays.length - 1 -index] = arrays[index];       
    }
		
       System.out.print(Arrays.toString(reversedArray));
}
}

         
