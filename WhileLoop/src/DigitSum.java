public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(54321));
    }
    public static int sumDigits (int number) {
        if (number < 0) {
            return -1;
        }
        int n = number;
        int digit = 0;
        int res = 0;
        while (n != 0) {
            digit = n % 10;
            n /= 10;
            res += digit;
        }
        return res;
    }
}
