public class Main {
    public static void main(String[] args) {
        countPrime(10, 50);
    }

    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber<=2) {
            return (wholeNumber==2);
        }
        for (int divisor=2; divisor <= wholeNumber/2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
    public static void countPrime (int min, int max) {
        int count = 0;
        for (int i = min; i <= max; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i);
                if(count == 3) {
                    break;
                }
            }
        }
    }
}