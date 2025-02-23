
import java.util.Arrays;

public class Mains {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversedArray = new int[arrays.length];
	int counter = 0;

        for (int index = arrays.length-1; index >= 0 ; index--) {
      
	 reversedArray[index] = arrays[index];
         counter++;
        }

        System.out.print(Arrays.toString(arrays));
}
}