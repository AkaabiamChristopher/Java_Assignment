public class PrimeNumber5{
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 50:");
        for (int i = 2; i <= 50; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }
}


