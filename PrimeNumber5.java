public class PrimeNumbers5 {

    public static void main(String[] args) {

        System.out.println("Prime numbers between 1 and 50:");
        for (int i = 2; i <= 50; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}

