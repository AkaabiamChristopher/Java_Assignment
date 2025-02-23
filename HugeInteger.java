public class HugeInteger{
	public static void main(String[] args){

	int[] digit1 = new int[40] ;
	int[] digit2 = new int[40];

	String input1 = "1234567890123456789012345678901234567890"; 
	String input2 = "9876543210987654321098765432109876543210";
	for(int count = 0;count < input1.length();count++){
	digit1[40 - input1.length() + count] = input1.charAt(count);

	}

	for(int count = 0;count < input2.length();count++){
	digit2[40 - input2.length() + count] = input2.charAt(count);
	}


	int[] sum = new int[40];
	for (int i = 0; i < 40; i++) {
 	sum[i] = digit1[i] + digit2[i]; 
	} 
	 System.out.println("Sum: ");
 	for (int digit : sum) {
	 System.out.println(digit);
	 }
	 System.out.println();





	}

}