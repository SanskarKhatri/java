import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> myArrList = new ArrayList<>();
        boolean contd = true;
        while(contd) {
            myArrList.sort(Comparator.naturalOrder());
            System.out.println(myArrList);
            System.out.println("Available actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.println("Enter a number for which action you want to do:");
            String option = s.nextLine();
            switch (option) {
                case "0" -> {
                    contd = false;
                }
                case "1" -> {
                    System.out.println("Enter the item(s):");
                    String itemsInput = s.nextLine();
                    String[] items = itemsInput.split(",");
                    myArrList.addAll(List.of(items));
                }
                case "2" -> {
                    System.out.println("Enter the item(s):");
                    String itemsInput = s.nextLine();
                    String[] items = itemsInput.split(",");
                    myArrList.removeAll(List.of(items));
                }
            }
        }
    }
}