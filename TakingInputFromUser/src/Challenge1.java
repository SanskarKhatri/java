import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int count = 1;
        do {
            System.out.println("Enter number #" + count + ":");
            String number = scanner.nextLine();
            try {
                int num = Integer.parseInt(number);
                count++;
                res += num;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid Value");
            }
        } while (count <= 5);
        System.out.println("Sum of 5 numbers is : " + res);
    }
}
