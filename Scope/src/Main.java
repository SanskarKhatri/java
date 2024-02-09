import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        X x = new X(s.nextInt());
        x.x();

    }
}