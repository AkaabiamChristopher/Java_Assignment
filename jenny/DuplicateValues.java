public class DuplicateValues {

public static void main (String[] args) {

int [] numbers = {1,2,3,4,5,2,3,4,5,3,5,6,7,};

  for (int count = 0; count < numbers.length; count++) {
     for (int value = count + 1; value < numbers.length; value++) {

	if (numbers[count] == numbers[value])
	System.out.print(numbers[count] + " ");
			}
		}
	}
}


